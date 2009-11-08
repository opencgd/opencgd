package opencgd.server.io.frames;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.FrameWriter;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;
import opencgd.server.util.MiscUtil;

import org.grlea.log.SimpleLogger;

class EnterGame implements IFrameHandler {
	
	private static final SimpleLogger LOGGER = new SimpleLogger(EnterGame.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getID(){
		return 15;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void process(Frame frame, FrameReader reader, Player context){
		LOGGER.debug(context.getName()+" entered game");
		
		//Send waiting list
		final FrameWriter response = new FrameWriter(5);
		response.addShort(4); //number of players
		response.addShort(3); //current player's ID
		
		for(int i = 0; i < 4; i++){
			response.addShort(i); //index
			response.addShort(0); //rating
			response.addShort(0); //score
			response.addBytes(MiscUtil.encodeUsername("bob"+i));
		}
		
		context.sendFrame(response);
		
		//Send hiscores list
		final FrameWriter hiscores = new FrameWriter(7);
		hiscores.addInt(400); //My score
		
		for(int i = 0; i < 50; i++){
			hiscores.addBytes(MiscUtil.encodeUsername("test"+i));
			hiscores.addInt(i*20); //score of user
			hiscores.addShort(i*3); //# games played
			hiscores.addShort(i); //# games won
		}
		
		context.sendFrame(hiscores);
	}
}