package opencgd.server.model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Room {

	private final List<Player> players = new CopyOnWriteArrayList<Player>();
	
	

	public List<Player> getPlayers(){
		return players;
	}
}