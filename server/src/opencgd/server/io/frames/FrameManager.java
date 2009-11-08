package opencgd.server.io.frames;

import java.util.ArrayList;
import java.util.List;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.IFrameHandler;
import opencgd.server.model.Player;

import org.grlea.log.SimpleLogger;

public class FrameManager {

	private static final FrameManager INSTANCE = new FrameManager();
	private static final SimpleLogger LOGGER = new SimpleLogger(FrameManager.class);
	private final List<IFrameHandler> frameHandlers = new ArrayList<IFrameHandler>();
	
	private FrameManager(){
		frameHandlers.add(new Ping()); //0
		frameHandlers.add(new Disconnect()); //1
		frameHandlers.add(new ChatMessage()); //3
		frameHandlers.add(new SetMatchOptions()); //5
		frameHandlers.add(new ChallengePlayer()); //6
		frameHandlers.add(new EnterGame()); //15
		frameHandlers.add(new ChangeGame()); //16
	}
	
	public void process(Frame frame, FrameReader reader, Player context){
		for(IFrameHandler handler : frameHandlers){
			if(handler.getID() == frame.getID()){
				handler.process(frame, reader, context);
				return;
			}
		}
		
		//No frame handler installed for this ID
		LOGGER.warn("Unhandled frame: ID="+frame.getID()+", Size="+frame.getSize());
	}

	public static FrameManager getInstance(){
		return INSTANCE;
	}

	public List<IFrameHandler> getFrameHandlers(){
		return frameHandlers;
	}
}