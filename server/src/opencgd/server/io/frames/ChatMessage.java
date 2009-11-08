package opencgd.server.io.frames;

import opencgd.server.SessionManager;
import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.FrameWriter;
import opencgd.server.io.IFrameHandler;
import opencgd.server.io.ISession;
import opencgd.server.model.Player;

import org.grlea.log.SimpleLogger;

class ChatMessage implements IFrameHandler {
	
	private static final SimpleLogger LOGGER = new SimpleLogger(ChatMessage.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		final String message = new String(reader.getData());
		LOGGER.info("Chat message ("+context.getName()+"): "+message);
		
		/*
		 * if lobby -> put in lobby chat
		 * else -> put in room chat (wherever the context is located at)
		 */
		
		if(message.charAt(0) == '/'){ //Command handle
			final String command = message.substring(1);
			
			if(command.equals("chreq")){
				final FrameWriter response = new FrameWriter(9);
				response.addShort(2); //Index of waitingList
				response.addShort(4); //Time per move l[o];
				response.addShort(1); //Nonrated(0)/Rated(1)
				context.sendFrame(response);
			}
		} else {
			//XXX For now (testing) just assume it's global (which it wont ever be)
			final FrameWriter chatMsg = new FrameWriter(8);
			final String formatted = context.getName()+": "+message;
			chatMsg.addBytes(formatted.getBytes());
			
			for(ISession session : SessionManager.getInstance().getSessions()){
				if(session.isLoggedIn()){
					session.sendFrame(chatMsg);
				}
			}
		}
	}
}