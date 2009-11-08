package opencgd.server;

import java.io.UnsupportedEncodingException;

public class FrameReader extends Frame {
	
	public FrameReader(Frame frame){
		super(frame);
	}
	
	public byte readByte(){
		return data[index++];
	}
	
	public byte[] readBytes(int length){
		final byte[] ba = new byte[length];
		System.arraycopy(data, index, ba, 0, length);
		index += length;
		return ba;
	}
	
	public short readShort(){
		return (short) ((short) ((readByte() & 0xff) << 8) | (short) (readByte() & 0xff));
	}
	
	public int readInt(){
		return ((readByte() & 0xff) << 24) | ((readByte() & 0xff) << 16) | ((readByte() & 0xff) << 8) | (readByte() & 0xff);
	}
	
	public long readLong(){
		return ((long) (readByte() & 0xff) << 56) | ((long) (readByte() & 0xff) << 48) | ((long) (readByte() & 0xff) << 40) | ((long) (readByte() & 0xff) << 32) | ((long) (readByte() & 0xff) << 24) | ((long) (readByte() & 0xff) << 16) | ((long) (readByte() & 0xff) << 8) | ((readByte() & 0xff));
	}
	
	public String readString() throws UnsupportedEncodingException {
		//TODO Read a length int instead... this is too risky
		
		final int start = index;
		
		while (data[index++] != 10);
		
		return new String(data, start, index - start - 1, "UTF-8");
	}
}