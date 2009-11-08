package opencgd.server;

public class RoomManager {

	private static final RoomManager INSTANCE = new RoomManager();
	
	private RoomManager(){
		
	}
	
	

	public static RoomManager getInstance(){
		return INSTANCE;
	}
}