package opencgd.server;

public class Frame {
	
	private int id;
	private byte[] data = new byte[0];
	
	public int getID(){
		return id;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public byte[] getData(){
		return data;
	}
	
	public void setData(byte[] data){
		this.data = data;
	}
	
	public int getSize(){
		return data.length+1;
	}
}