package opencgd.library;

import java.io.*;
import java.net.Socket;

// Referenced classes of package jagex:
//            d

public class Buffer implements Runnable {
	
	private byte data[];
	private int offset;
	private boolean e;
	private Thread a;
	private int b;
	private int c;
	private byte d[];
	private String j;
	private boolean k;
	private static int openco;
	private static int closeco;
	private static String p = "";
	protected byte i[];
	private boolean m;
	private Socket f;
	private OutputStream h;
	private InputStream l;
	final int n = 8192;
	private static char cmap[];
	private static int quotes = 34;
	public static int bar = 124;
	public static int space = 32;
	public static int bslash = 92;
	public static int slash = 47;
	public static int fullstop = 46;
	private static int minus = 45;
	private static int comma = 44;
	public static int plus = 43;
	public static int star = 42;
	private static int semi = 59;
	private static int equals = 61;
	
	public void sendPacket(){
		data[0] = (byte) ((offset - 2) / 256);
		data[1] = (byte) (offset - 2 & 0xff);
		try{
			a(data, 0, offset, true);
			return;
		} catch(IOException _ex){
			return;
		}
	}
	
	public void b() throws IOException{
		data[0] = (byte) ((offset - 2) / 256);
		data[1] = (byte) (offset - 2 & 0xff);
		a(data, 0, offset, false);
	}
	
	public void c() throws IOException{
		data[0] = (byte) ((offset - 2) / 256);
		data[1] = (byte) (offset - 2 & 0xff);
		a(data, 0, offset, true);
	}
	
	//FIXME Deprecation
	@SuppressWarnings("deprecation")
	public void addString(String s1){
		s1.getBytes(0, s1.length(), data, offset);
		offset += s1.length();
	}
	
	public void addInt(int i1){
		data[offset++] = (byte) (i1 / 0x1000000);
		data[offset++] = (byte) (i1 / 0x10000);
		data[offset++] = (byte) (i1 / 256);
		data[offset++] = (byte) i1;
	}
	
	public void addShort(int i1){
		data[offset++] = (byte) (i1 / 256);
		data[offset++] = (byte) (i1 & 0xff);
	}
	
	public void addByte(int i1){
		data[offset++] = (byte) i1;
	}
	
	public void setPacketID(int i1){
		if(data == null){
			data = new byte[1000];
		}
		data[2] = (byte) i1;
		offset = 3;
	}
	
	static int a(byte abyte0[], byte abyte1[], int i1){
		int j1 = i1 + 300;
		if(j1 > 8192){
			j1 = 8192;
		}
		byte abyte2[][] = new byte[j1][];
		int ai[] = new int[j1];
		short aword0[][] = new short[256][j1];
		short aword1[] = new short[256];
		int ai1[] = new int[8];
		int k1 = 0;
		int l1 = 0;
		int i2 = 256;
		for(int j2 = 0; j2 < 256; j2++){
			ai[j2] = 1;
			abyte2[j2] = new byte[1];
			abyte2[j2][0] = (byte) j2;
			aword1[j2] = 1;
			aword0[j2][0] = (short) j2;
		}
		
		for(int k2 = 0; k2 < i1;){
			int l3 = 0;
			short word1 = 0;
			int k5 = abyte0[k2] & 0xff;
			for(int l2 = 0; l2 < aword1[k5]; l2++){
				short word0 = aword0[k5][l2];
				boolean flag2 = false;
				if(ai[word0] > l3 && ai[word0] <= i1 - k2){
					for(int i4 = 0; i4 < ai[word0]; i4++){
						if(abyte2[word0][i4] == abyte0[k2 + i4]){
							continue;
						}
						flag2 = true;
						break;
					}
					
					if(!flag2){
						l3 = ai[word0];
						word1 = word0;
					}
				}
			}
			
			int j5 = 8;
			for(int i5 = i2; i5 >= 256;){
				i5 >>= 1;
				j5++;
			}
			
			for(int j4 = j5 - 1; j4 >= 0; j4--){
				ai1[k1++] = word1 >> j4 & 1;
				if(k1 == 8){
					int k4 = 0;
					for(int i3 = 0; i3 < 8; i3++){
						k4 = k4 * 2 + ai1[i3];
					}
					
					abyte1[l1++] = (byte) k4;
					k1 = 0;
				}
			}
			
			k2 += l3;
			if(k2 < i1){
				if(i2 == j1){
					i2 = 256;
					for(int l5 = 0; l5 < 256; l5++){
						aword1[l5] = 1;
						aword0[l5][0] = (short) l5;
					}
					
				}
				abyte2[i2] = new byte[l3 + 1];
				ai[i2] = l3 + 1;
				for(int j3 = 0; j3 < l3; j3++){
					abyte2[i2][j3] = abyte2[word1][j3];
				}
				
				abyte2[i2][l3] = abyte0[k2];
				int i6 = abyte2[i2][0] & 0xff;
				aword0[i6][aword1[i6]++] = (short) i2;
				i2++;
			}
		}
		
		if(k1 > 0){
			int l4 = 0;
			for(int k3 = 0; k3 < 8; k3++){
				l4 = l4 * 2 + ai1[k3];
			}
			
			abyte1[l1++] = (byte) l4;
		}
		return l1;
	}
	
	int b(byte abyte0[], byte abyte1[], int i1){
		byte abyte2[][] = new byte[8192][];
		int ai[] = new int[8192];
		int ai1[] = new int[8];
		int j1 = 0;
		int k1 = 0;
		int l1 = 256;
		for(int i2 = 0; i2 < 256; i2++){
			abyte2[i2] = new byte[1];
			ai[i2] = 1;
			abyte2[i2][0] = (byte) i2;
		}
		
		int j2 = 0;
		do {
			int i3 = 8;
			for(int l3 = l1; l3 >= 256;){
				l3 >>= 1;
				i3++;
			}
			
			int l2 = 0;
			for(int k2 = 0; k2 < i3; k2++){
				if(j1 == 0){
					if(j2 == i1){
						return k1;
					}
					j1 = 8;
					int i4 = abyte0[j2++];
					for(int j3 = 0; j3 < 8; j3++){
						ai1[j3] = i4 & 1;
						i4 >>= 1;
					}
					
				}
				l2 = l2 * 2 + ai1[--j1];
			}
			
			if(l1 > 256){
				abyte2[l1 - 1][ai[l1 - 1] - 1] = abyte2[l2][0];
			}
			if(l1 == 8192){
				l1 = 256;
			}
			abyte2[l1] = new byte[ai[l2] + 1];
			for(int k3 = 0; k3 < ai[l2]; k3++){
				abyte2[l1][k3] = abyte1[k1++] = abyte2[l2][k3];
			}
			
			ai[l1++] = ai[l2] + 1;
		} while(true);
	}
	
	static int c(byte abyte0[], byte abyte1[], int i1){
		byte byte0 = abyte0[0];
		int j1 = 0;
		int k1 = 1;
		for(int l1 = 1; l1 < i1; l1++){
			if(abyte0[l1] == byte0 && k1 < 257){
				k1++;
			} else {
				if(k1 >= 2){
					abyte1[j1++] = byte0;
					abyte1[j1++] = byte0;
					abyte1[j1++] = (byte) (k1 - 2);
				} else {
					abyte1[j1++] = byte0;
				}
				byte0 = abyte0[l1];
				k1 = 1;
			}
			if(j1 > i1 + 10){
				return 0;
			}
		}
		
		if(k1 >= 2){
			abyte1[j1++] = byte0;
			abyte1[j1++] = byte0;
			abyte1[j1++] = (byte) (k1 - 2);
		} else {
			abyte1[j1++] = byte0;
		}
		return j1;
	}
	
	int d(byte abyte0[], byte abyte1[], int i1){
		char c1 = '\u01F4';
		int j1 = 0;
		for(int l1 = 0; l1 < i1; l1++){
			abyte1[j1++] = abyte0[l1];
			if(abyte0[l1] - c1 == 0){
				int k1 = abyte0[++l1] & 0xff;
				for(int i2 = 0; i2 < k1; i2++){
					abyte1[j1++] = (byte) c1;
				}
				
				c1 = '\u01F4';
			} else {
				c1 = (char) abyte0[l1];
			}
		}
		
		return j1;
	}
	
	public int[] d() throws IOException{
		byte abyte0[] = e();
		int i1 = abyte0.length;
		int ai[] = new int[i1];
		for(int j1 = 0; j1 < i1; j1++){
			ai[j1] = abyte0[j1] & 0xff;
		}
		
		abyte0 = null;
		return ai;
	}
	
	public byte[] e() throws IOException{
		int i1 = f() - 8;
		int j1 = f();
		if(j1 == 0){
			byte abyte0[] = new byte[i1];
			a(i1, abyte0);
			return abyte0;
		} else {
			byte abyte1[] = new byte[j1];
			byte abyte2[] = new byte[j1 + 1000];
			a(i1, abyte1);
			i1 = b(abyte1, abyte2, i1);
			i1 = d(abyte2, abyte1, i1);
			abyte2 = null;
			return abyte1;
		}
	}
	
	public static void a(String s1, byte abyte0[], int i1){
		byte abyte1[] = new byte[8];
		i1 += 8;
		abyte1[0] = (byte) (i1 >> 24);
		abyte1[1] = (byte) (i1 >> 16);
		abyte1[2] = (byte) (i1 >> 8);
		abyte1[3] = (byte) i1;
		abyte1[4] = 0;
		abyte1[5] = 0;
		abyte1[6] = 0;
		abyte1[7] = 0;
		try{
			FileOutputStream fileoutputstream = new FileOutputStream(p + s1);
			fileoutputstream.write(abyte1, 0, 8);
			fileoutputstream.write(abyte0, 0, i1 - 8);
			fileoutputstream.close();
			return;
		} catch(Exception exception){
			System.out.println("Unable to save file: " + s1 + " " + exception);
		}
	}
	
	public static void b(String s1, byte abyte0[], int i1) throws IOException{
		int j1 = i1;
		byte abyte1[] = new byte[i1 + 20];
		byte abyte2[] = new byte[i1 + 20];
		i1 = c(abyte0, abyte1, i1);
		if(i1 == 0){
			a(s1, abyte0, j1);
			return;
		}
		i1 = a(abyte1, abyte2, i1);
		if(i1 >= j1){
			a(s1, abyte0, j1);
			return;
		}
		byte abyte3[] = new byte[8];
		i1 += 8;
		abyte3[0] = (byte) (i1 >> 24);
		abyte3[1] = (byte) (i1 >> 16);
		abyte3[2] = (byte) (i1 >> 8);
		abyte3[3] = (byte) i1;
		abyte3[4] = (byte) (j1 >> 24);
		abyte3[5] = (byte) (j1 >> 16);
		abyte3[6] = (byte) (j1 >> 8);
		abyte3[7] = (byte) j1;
		try{
			FileOutputStream fileoutputstream = new FileOutputStream(p + s1);
			fileoutputstream.write(abyte3, 0, 8);
			fileoutputstream.write(abyte2, 0, i1 - 8);
			fileoutputstream.close();
		} catch(Exception _ex){
			System.out.println("Unable to save file: " + s1);
		}
		abyte1 = null;
	}
	
	//FIXME Deprecation
	@SuppressWarnings("deprecation")
	public int b(String s1){
		int i1 = i[0] * 256 + i[1];
		byte abyte0[] = new byte[s1.length() + 1];
		s1.getBytes(0, s1.length(), abyte0, 0);
		abyte0[s1.length()] = 0;
		for(int j1 = 0; j1 < i1; j1++){
			int k1;
			for(k1 = 0; abyte0[k1] != 0; k1++){
				if(abyte0[k1] != i[j1 * 28 + 2 + k1] && abyte0[k1] != i[j1 * 28 + 2 + k1] + 32){
					break;
				}
			}
			
			if(abyte0[k1] == 0 && i[j1 * 28 + 2 + k1] == 0){
				int l1 = a(i[j1 * 28 + 22]) * 0x1000000 + a(i[j1 * 28 + 23]) * 0x10000 + a(i[j1 * 28 + 24]) * 256 + a(i[j1 * 28 + 25]);
				return l1;
			}
		}
		
		System.out.println("Error file not found: " + s1);
		return 0;
	}
	
	public void g() throws IOException{
		i = e();
	}
	
	public void run(){
		while(a != null && !e){
			int i1;
			int j1;
			synchronized(this){
				if(b == c){
					try{
						wait();
					} catch(InterruptedException _ex){
					}
				}
				if(a == null || e){
					return;
				}
				j1 = c;
				if(b > c){
					i1 = b - c;
				} else {
					i1 = 5000 - c;
				}
			}
			try{
				h.write(d, j1, i1);
			} catch(IOException ioexception){
				k = true;
				j = "Twriter IOEx:" + ioexception;
			}
			c = (c + i1) % 5000;
		}
	}
	
	public void a(byte abyte0[], int i1, int j1, boolean flag) throws IOException{
		if(m){
			return;
		}
		if(d == null){
			d = new byte[5000];
		}
		synchronized(this){
			for(int k1 = 0; k1 < j1; k1++){
				d[b] = abyte0[k1 + i1];
				b = (b + 1) % 5000;
				if(b != (c + 4900) % 5000){
					continue;
				}
				k = true;
				j = "Write buffer full! " + j1;
				k1 = j1 + 1;
				e = true;
				l.close();
				h.close();
				m = true;
				break;
			}
			
			if(flag){
				if(a == null){
					openco++;
					e = false;
					a = new Thread(this);
					a.setDaemon(true);
					a.setPriority(4);
					a.start();
				}
				notify();
			}
		}
		if(k){
			throw new IOException(j);
		} else {
			return;
		}
	}
	
	public void a(int i1, boolean flag) throws IOException{
		if(m){
			return;
		} else {
			byte abyte0[] = new byte[1];
			abyte0[0] = (byte) i1;
			a(abyte0, 0, 1, flag);
			return;
		}
	}
	
	public void c(String s1) throws IOException{
		if(m){
			return;
		} else {
			h.write(s1.getBytes());
			return;
		}
	}
	
	public void a(byte abyte0[], int i1, int j1) throws IOException{
		if(m){
			return;
		} else {
			h.write(abyte0, i1, j1);
			return;
		}
	}
	
	public void a(byte abyte0[]) throws IOException{
		if(m){
			return;
		} else {
			h.write(abyte0);
			return;
		}
	}
	
	public void e(int i1) throws IOException{
		if(m){
			return;
		} else {
			h.write(i1 / 256);
			h.write(i1 & 0xff);
			return;
		}
	}
	
	public void f(int i1) throws IOException{
		if(m){
			return;
		} else {
			h.write(i1);
			return;
		}
	}
	
	public int h() throws IOException{
		int i1;
		for(i1 = i(); i1 < 32 || i1 > 122 || i1 == comma || i1 == semi || i1 == equals;){
			i1 = i();
			if(i1 == -1){
				throw new IOException("Eof!");
			}
		}
		
		return i1;
	}
	
	public String j() throws IOException{
		String s1 = "";
		boolean flag = false;
		int i1;
		for(i1 = i(); i1 < 32 || i1 > 122 || i1 == comma || i1 == semi || i1 == equals;){
			i1 = i();
			if(i1 == -1){
				throw new IOException("Eof!");
			}
		}
		
		if(i1 == quotes){
			flag = true;
			i1 = i();
		}
		for(; i1 != -1; i1 = i()){
			if(!flag && (i1 == equals || i1 == semi) || flag && i1 == quotes){
				break;
			}
			s1 = s1 + cmap[i1];
		}
		
		return s1;
	}
	
	public String getString() throws IOException{
		String s1 = "";
		boolean flag = false;
		int i1;
		for(i1 = i(); i1 < 32 || i1 > 122 || i1 == comma || i1 == semi || i1 == equals;){
			i1 = i();
			if(i1 == -1){
				throw new IOException("Eof!");
			}
		}
		
		if(i1 == quotes){
			flag = true;
			i1 = i();
		}
		for(; i1 != -1; i1 = i()){
			if(!flag && (i1 == comma || i1 == equals || i1 == semi) || flag && i1 == quotes){
				break;
			}
			s1 = s1 + cmap[i1];
		}
		
		return s1;
	}
	
	public int getInt() throws IOException{
		int i1 = 0;
		boolean flag = false;
		int j1;
		for(j1 = i(); j1 < 48 || j1 > 57;){
			if(j1 == minus){
				flag = true;
			}
			j1 = i();
			if(j1 == -1){
				throw new IOException("Eof!");
			}
		}
		
		for(; j1 >= 48 && j1 <= 57; j1 = i()){
			i1 = (i1 * 10 + j1) - 48;
		}
		
		if(flag){
			i1 = -i1;
		}
		return i1;
	}
	
	public void m() throws IOException{
		for(int i1 = i(); i1 != equals && i1 != -1; i1 = i()){
		}
	}
	
	public String n() throws IOException{
		String s1 = "";
		int i1;
		for(i1 = i(); i1 == 10 || i1 == 13; i1 = i()){
		}
		for(; i1 != 10 && i1 != 13 && i1 != -1; i1 = i()){
			s1 = s1 + cmap[i1];
		}
		
		return s1;
	}
	
	public void o() throws IOException{
		for(int i1 = i(); i1 != comma && i1 != semi && i1 != equals && i1 != -1; i1 = i()){
		}
	}
	
	public int a(byte abyte0[], int i1){
		return a(abyte0[i1]) * 0x1000000 + a(abyte0[i1 + 1]) * 0x10000 + a(abyte0[i1 + 2]) * 256 + a(abyte0[i1 + 3]);
	}
	
	public int b(byte abyte0[], int i1){
		return a(abyte0[i1]) * 256 + a(abyte0[i1 + 1]);
	}
	
	public int a(byte byte0){
		return byte0 & 0xff;
	}
	
	public void a(int i1, int ai[]) throws IOException{
		byte abyte0[] = new byte[i1];
		a(i1, abyte0);
		for(int j1 = 0; j1 < i1; j1++){
			ai[j1] = abyte0[j1] & 0xff;
		}
		
		abyte0 = null;
	}
	
	public void a(int i1, byte abyte0[]) throws IOException{
		if(m){
			return;
		}
		int j1 = 0;
		int k1;
		for(; j1 < i1; j1 += k1){
			if((k1 = l.read(abyte0, j1, i1 - j1)) <= 0){
				throw new IOException("EOF");
			}
		}
		
	}
	
	public int p() throws IOException{
		if(m){
			return 0;
		} else {
			return l.available();
		}
	}
	
	public void g(int i1) throws IOException{
		l.skip(i1);
	}
	
	public int f() throws IOException{
		int i1 = q();
		int j1 = q();
		return i1 * 0x10000 + j1;
	}
	
	public int q() throws IOException{
		int i1 = r();
		int j1 = r();
		return i1 * 256 + j1;
	}
	
	public int r() throws IOException{
		if(m){
			return 0;
		} else {
			return l.read();
		}
	}
	
	public int i() throws IOException{
		if(m){
			return 0;
		} else {
			return l.read();
		}
	}
	
	public void closeStream(){
		if(m){
			return;
		}
		try{
			if(f != null){
				f.close();
			}
			if(a != null){
				e = true;
				synchronized(this){
					notify();
				}
				closeco++;
				a = null;
			}
			if(l != null){
				l.close();
			}
			if(h != null){
				h.close();
			}
			d = null;
			data = null;
			return;
		} catch(IOException _ex){
			System.out.println("Error closing stream");
		}
	}
	
	public Buffer(String s1) throws IOException{
		m = false;
		k = false;
		j = "error in twriter";
		e = true;
		offset = 3;
		l = opencgd.library.D.a(s1);
	}
	
	public Buffer(Socket socket) throws IOException{
		m = false;
		k = false;
		j = "error in twriter";
		e = true;
		offset = 3;
		f = socket;
		l = socket.getInputStream();
		h = socket.getOutputStream();
	}
	
	public Buffer(InputStream inputstream, OutputStream outputstream){
		m = false;
		k = false;
		j = "error in twriter";
		e = true;
		offset = 3;
		l = inputstream;
		h = outputstream;
	}
	
	public Buffer(OutputStream outputstream){
		m = false;
		k = false;
		j = "error in twriter";
		e = true;
		offset = 3;
		h = outputstream;
	}
	
	public Buffer(InputStream inputstream){
		m = false;
		k = false;
		j = "error in twriter";
		e = true;
		offset = 3;
		l = inputstream;
	}
	
	public Buffer(){
		m = false;
		k = false;
		j = "error in twriter";
		e = true;
		offset = 3;
		m = true;
	}
	
	static{
		cmap = new char[256];
		for(int i1 = 0; i1 < 256; i1++){
			cmap[i1] = (char) i1;
		}
		
		cmap[61] = '=';
		cmap[59] = ';';
		cmap[42] = '*';
		cmap[43] = '+';
		cmap[44] = ',';
		cmap[45] = '-';
		cmap[46] = '.';
		cmap[47] = '/';
		cmap[92] = '\\';
		cmap[124] = '|';
		cmap[33] = '!';
		cmap[34] = '"';
	}
}