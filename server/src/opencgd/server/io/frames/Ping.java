package opencgd.server.io.frames;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;

class Ping implements IFrameHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		
	}
}