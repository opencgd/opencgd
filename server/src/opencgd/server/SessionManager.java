package opencgd.server;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.jboss.netty.channel.Channel;

import opencgd.server.io.ISession;
import opencgd.server.model.Player;

public class SessionManager {

	private static final SessionManager INSTANCE = new SessionManager();
	private final List<ISession> sessions = new CopyOnWriteArrayList<ISession>();
	
	private SessionManager(){
		
	}
	
	public Player create(Channel channel){
		final Player player = new Player(channel);
		this.sessions.add(player);
		player.onConnect();
		return player;
	}
	
	public void remove(ISession session){
		sessions.remove(session);
	}

	public static SessionManager getInstance(){
		return INSTANCE;
	}

	public List<ISession> getSessions(){
		return sessions;
	}
}