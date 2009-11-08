package opencgd.server.model;

import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;

import opencgd.server.Server;
import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.FrameWriter;
import opencgd.server.io.ISession;
import opencgd.server.io.frames.FrameManager;
import opencgd.server.util.ILoginValidator;

import org.grlea.log.SimpleLogger;
import org.jboss.netty.channel.Channel;

public class Player implements ISession {

	private static final SimpleLogger LOGGER = new SimpleLogger(Player.class);
	private static final int LOGIN = 0;
	private static final int CONFIRM = 2;
	private final Channel channel;
	private final String hostname;
	private final AtomicBoolean loggedIn = new AtomicBoolean(false);
	private String name;
	private int score;
	private int rank;
	private final boolean[] filter = new boolean[8];
	
	public Player(Channel channel){
		this.channel = channel;
		this.hostname = ((InetSocketAddress) channel.getRemoteAddress()).getHostName();
	}
	
	@Override
	public void onConnect(){
		LOGGER.info("Connection established with "+hostname);
	}
	
	@Override
	public void onFrame(Frame frame, FrameReader reader){
		if(loggedIn.get()){
			//Pass off to a frame handler
			FrameManager.getInstance().process(frame, reader, this);
		} else {
			if(frame.getID() == LOGIN){
				try {
					final ILoginValidator validator = Server.getLoginValidator();
					final String compound = new String(frame.getData());
					final String username = compound.substring(0, 12).trim();
					final String password = compound.substring(12, compound.length()).trim();
					
					if(validator.doesAccountExist(username)){
						//Check and see if the password matches the username
						if(validator.isLoginCorrect(username, password)){ //TODO Load score/rating
							LOGGER.debug("Login successful");
							this.name = username;
							this.loggedIn.set(true);
							sendLoginResponse(LoginResponse.OK);
						} else {
							//Wrong password
							LOGGER.debug("Invalid password");
							sendLoginResponse(LoginResponse.BAD_LOGIN);
						}
					} else {
						//Account does not exist, see if the user entered their name correct
						LOGGER.debug("Asking user for confirmation");
						this.name = username;
						sendLoginResponse(LoginResponse.CONFIRM_CREATION);
					}
				} catch(Exception e){
					LOGGER.debug("Login error");
					LOGGER.errorException(e);
					sendLoginResponse(LoginResponse.BAD_LOGIN);
				}
			} else if(frame.getID() == CONFIRM){
				//Is this name correct? -> Yes
				
				LOGGER.debug("Creating account: "+name);
				Server.getLoginValidator().createAccount(name, "err..");
				
				loggedIn.set(true);
				
				sendLoginResponse(LoginResponse.OK);
			}
		}
	}

	@Override
	public void onDisconnect(){
		LOGGER.info((name == null ? "[unknown]" : name)+" disconnecting");
	}
	
	private void sendLoginResponse(final LoginResponse response){
		sendFrame(new FrameWriter(response.ordinal()));
	}
	
	@Override
	public void sendFrame(FrameWriter writer){
		channel.write(writer.createFrame());
	}

	public Channel getChannel(){
		return channel;
	}

	public String getHostname(){
		return hostname;
	}

	@Override
	public boolean isLoggedIn(){
		return loggedIn.get();
	}

	public int getScore(){
		return score;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getRank(){
		return rank;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	@Override
	public String getName(){
		return name;
	}

	public boolean[] getFilter(){
		return filter;
	}
}