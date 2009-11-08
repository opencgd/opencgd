package opencgd.server.io;

import opencgd.server.model.Player;

public interface IFrameHandler {

	int getID();
	void process(Frame frame, FrameReader reader, Player context);
}