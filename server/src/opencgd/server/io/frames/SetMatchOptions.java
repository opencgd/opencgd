package opencgd.server.io.frames;

import org.grlea.log.SimpleLogger;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;

class SetMatchOptions implements IFrameHandler {
	
	private static final SimpleLogger LOGGER = new SimpleLogger(SetMatchOptions.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 5;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		final int timeSetting = reader.readShort();
		final boolean isRated = reader.readShort() == 1;
		final int filter = reader.readShort();
		LOGGER.debug("Set match options");
		LOGGER.debugObject("timeSetting", timeSetting);
		LOGGER.debugObject("isRated", isRated);
		LOGGER.debugObject("filterInt", filter);
	}
}