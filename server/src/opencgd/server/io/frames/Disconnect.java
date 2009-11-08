package opencgd.server.io.frames;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;

class Disconnect implements IFrameHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		//Just close the channel, since it's going to disconnect
		//This will call the onDisconnect() eventually, so all will be good.
		context.getChannel().close();
	}
}