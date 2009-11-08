package opencgd.server.io.frames;

import org.grlea.log.SimpleLogger;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;

class ChangeGame implements IFrameHandler {

	private final static SimpleLogger LOGGER = new SimpleLogger(ChangeGame.class);
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 16;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		int game = reader.readByte();
		
		if(game == 0){
			//Close interface
			LOGGER.debug(context.getName()+": Entering lobby");
		} else {
			//Entering in a new game
			LOGGER.debugObject("gameID", game-1);
		}
	}
}