package opencgd.server.io;

public interface ISession {

	String getName();
	void onConnect();
	void onFrame(Frame frame, FrameReader reader);
	void onDisconnect();
	void sendFrame(FrameWriter writer);
	boolean isLoggedIn();
}