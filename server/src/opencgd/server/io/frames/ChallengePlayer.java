package opencgd.server.io.frames;

import org.grlea.log.SimpleLogger;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.FrameWriter;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;

class ChallengePlayer implements IFrameHandler {
	
	private static final SimpleLogger LOGGER = new SimpleLogger(ChallengePlayer.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 6;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		LOGGER.debug("Challenging");
		
		//Show the challenge request screen				
		final FrameWriter response = new FrameWriter(10);
		response.addShort(2);
		response.addShort(4);
		response.addShort(1);
		context.sendFrame(response);
	}
}