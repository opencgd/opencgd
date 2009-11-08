package opencgd.server;

public class Frame {

	protected int ID;
	protected byte[] data;
	protected int index = 0;
	
	public Frame(int ID, byte[] data){
		this.ID = ID;
		this.data = data;
	}
	
	protected Frame(){
		
	}
	
	protected Frame(Frame that){
		this.ID = that.ID;
		this.data = that.data;
	}

	public int getID(){
		return ID;
	}

	public void setID(int id){
		ID = id;
	}

	public byte[] getData(){
		return data;
	}

	public void setData(byte[] data){
		this.data = data;
	}
	
	public int getIndex(){
		return index;
	}
	
	public int getSize(){
		return data.length;
	}
	
	public int getRemaining(){
		return data.length-index;
	}
}