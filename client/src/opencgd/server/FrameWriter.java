package opencgd.server;

public class FrameWriter extends Frame  {
	
	public FrameWriter(){
		this(0);
	}

	public FrameWriter(int ID){
		super.ID = ID;
		super.data = new byte[32];
	}
	
	public void addByte(final int i){
		checkCapacity(1);
		data[index++] = (byte) i;
	}
	
	public void addBytes(final byte[] data){
		checkCapacity(data.length);
		System.arraycopy(data, 0, this.data, index, data.length);
		index += data.length;
	}
	
	public void addShort(final int i){
		addByte((byte) (i >> 8));
		addByte((byte) i);
	}
	
	public void addInt(final int i){
		addByte((byte) (i >> 24));
		addByte((byte) (i >> 16));
		addByte((byte) (i >> 8));
		addByte((byte) i);
	}
	
	public void addString(final String s){
		this.addBytes(s.getBytes());
	}
	
	void checkCapacity(final int count){
		if(index+count >= data.length){
			expand(count << 1);
		}
	}
	
	void expand(final int count){
		int expandedSize = (data.length + 1) * 2;
		
		if(expandedSize < 0){
			expandedSize = Integer.MAX_VALUE;
		} else if (count > expandedSize){
			expandedSize = count;
		}
		
		final byte[] expandedData = new byte[expandedSize];
		System.arraycopy(data, 0, expandedData, 0, index);
		
		data = expandedData;
	}
	
	public Frame createFrame(){
		byte[] packetData = new byte[index];
		System.arraycopy(data, 0, packetData, 0, index);
		return new Frame(this.ID, packetData);
	}
}