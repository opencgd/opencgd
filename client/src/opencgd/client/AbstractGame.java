package opencgd.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import opencgd.client.library.Buffer;
import opencgd.client.library.D;
import opencgd.client.library.E;
import opencgd.client.library.EngineApplet;

public abstract class AbstractGame {
	
	private Font z;
	private Color r;
	private int x;
	private int g;
	protected String v[];
	public int userID;
	public OpenCGD w;
	private int s;
	public int p;
	private int e[];
	public String n[];
	public int m;
	public int a;
	private int o;
	private int c;
	private int b;
	private int packetID;
	private int packetLength;
	public byte ab[];
	public Buffer connectionStream;
	private Image h;
	private Image l;
	public E k;
	public Graphics t;
	private Image y;
	public Graphics u;
	
	protected AbstractGame(){
		c = 75;
		o = 500;
		p = 2;
		v = new String[3];
		r = new Color(200, 200, 200);
		z = new Font("Helvetica", 1, 14);
	}
	
	public void c(int i1){
		for(int j1 = 2; j1 >= 1; j1--){
			v[j1] = v[j1 - 1];
		}
		
		v[0] = "Sorry, no help available for this screen";
	}
	
	public void a(){
	}
	
	public void d(){
	}
	
	public abstract void loadMedia();
	
	public void g(){
	}
	
	public void handleIncomingPacket(int id, int length) throws IOException{
	}
	
	public boolean isNetworkedGame(){
		return true;
	}
	
	public final void drawGame(){
		u.drawImage(l, 0, 298, w);
		u.drawImage(h, s * 46 + 3, 352, w);
		u.setColor(Color.white);
		u.setFont(w.t);
		if(((opencgd.client.library.EngineApplet) (w)).jj != null){
			u.drawString(((opencgd.client.library.EngineApplet) (w)).jj, 8, 349);
		}
		for(int i1 = 0; i1 < 3; i1++){
			if(v[i1] != null){
				u.drawString(v[i1], 8, 336 - i1 * 12);
			}
		}
		
		if(g == 0){
			a();
		} else {
			u.setColor(r);
			u.fillRect(166, 115, 180, 60);
			u.setColor(Color.black);
			u.drawRect(166, 115, 180, 60);
			opencgd.client.library.D.a(u, "Are you sure you", z, 256, 125);
			opencgd.client.library.D.a(u, "want to resign?", z, 256, 145);
			if(((opencgd.client.library.EngineApplet) (w)).f > 206 && ((opencgd.client.library.EngineApplet) (w)).e > 150 && ((opencgd.client.library.EngineApplet) (w)).f < 246 && ((opencgd.client.library.EngineApplet) (w)).e < 170){
				u.setColor(Color.red);
			}
			opencgd.client.library.D.a(u, "YES", z, 226, 165);
			u.setColor(Color.black);
			if(((EngineApplet) (w)).f > 266 && ((EngineApplet) (w)).e > 150 && ((EngineApplet) (w)).f < 306 && ((EngineApplet) (w)).e < 170){
				u.setColor(Color.red);
			}
			D.a(u, "NO", z, 286, 165);
		}
		t.drawImage(y, 0, 0, w);
	}
	
	private void n(){
		u.setColor(new Color(0, 104, 130));
		u.fillRect(0, 0, 512, 6);
		u.setColor(Color.black);
		u.drawLine(5, 5, 507, 5);
	}
	
	private final void o(){
		try{
			b++;
			if(b > c){
				b = 0;
				connectionStream.setPacketID(4);
				connectionStream.c();
			}
			if(((EngineApplet) (w)).ii != ""){
				if(((EngineApplet) (w)).ii.equalsIgnoreCase("help")){
					c(-1);
				} else {
					connectionStream.setPacketID(3);
					connectionStream.addString(((EngineApplet) (w)).ii);
					connectionStream.sendPacket();
					b = 0;
				}
				w.jj = "";
				w.ii = "";
			}
			if(!isNetworkedGame()){
				//Don't read data, because this isn't going to receive anything
				return;
			}
			if(packetLength == 0 && connectionStream.available() >= 2){
				packetLength = connectionStream.getShort();
			}
			if(packetLength > 0 && connectionStream.available() >= packetLength){
				connectionStream.a(packetLength, ab);
				packetID = connectionStream.a(ab[0]);
				if(packetID == 5){
					m = connectionStream.getUShort(ab, 1);
					userID = connectionStream.getUShort(ab, 3);
					System.out.println("Got id: " + userID);
					int i1 = (packetLength - 5) / 18;
					a = 0;
					for(int j2 = 0; j2 < o; j2++){
						n[j2] = null;
					}
					
					for(int i3 = 0; i3 < i1; i3++){
						int k3 = connectionStream.getUShort(ab, 5 + i3 * 18);
						e[k3] = connectionStream.getUShort(ab, 7 + i3 * 18);
						n[k3] = (new String(ab, 11 + i3 * 18, 12)).trim();
						if(k3 + 1 > a){
							a = k3 + 1;
						}
					}
					
				} else if(packetID == 8){
					for(int j1 = 2; j1 >= 1; j1--){
						v[j1] = v[j1 - 1];
					}
					
					v[0] = new String(ab, 1, packetLength - 1);
				} else if(packetID == 17){
					for(int k1 = 0; k1 < 3; k1++){
						v[k1] = "";
					}
					
					String s1 = new String(ab, 1, packetLength - 1);
					w.gameScreen = 2;
					w.sb = 2;
					w.d = 3;
					w.pd = 140;
					w.f = s1;
					w.e = "";
					n();
				} else if(packetID == 18){
					for(int l1 = 0; l1 < 3; l1++){
						v[l1] = "";
					}
					
					int winnerID = connectionStream.a(ab[1]);
					int points = connectionStream.getUShort(ab, 2);
					String s3 = new String(ab, 4, packetLength - 4);
					w.gameScreen = 2;
					w.sb = 2;
					w.d = 3;
					w.pd = 140;
					if(points != 0){
						if(winnerID == userID){
							w.f = "You won! - points gained:" + points;
						} else {
							w.f = "You lost! - points lost:" + points;
						}
					} else if(winnerID == userID){
						w.f = "You won! - Non-rated game";
					} else {
						w.f = "You lost! - Non-rated game";
					}
					w.e = s3;
					n();
				} else if(packetID == 19){
					for(int i2 = 0; i2 < 3; i2++){
						v[i2] = "";
					}
					
					int l2 = connectionStream.getUShort(ab, 1);
					String s2 = new String(ab, 3, packetLength - 3);
					w.gameScreen = 2;
					w.sb = 2;
					w.d = 5;
					w.pd = 140;
					w.f = s2;
					if(l2 != 0){
						w.f += "League points gained:" + l2;
					} else {
						w.f += "Non-rated Game";
					}
					n();
				} else {
					handleIncomingPacket(packetID, packetLength);
				}
				packetLength = 0;
				return;
			}
		} catch(IOException _ex){
			w.oc = true;
		}
	}
	
	public final void k(){
		o();
		if(((EngineApplet) (w)).hh != 0 && g == 0 && ((EngineApplet) (w)).e > 351){
			x = (((EngineApplet) (w)).f - 3) / 46;
			g = 1;
			if(x < 0){
				x = 0;
			} else if(x > 10){
				x = 10;
			}
		}
		if(g == 1){
			if(((EngineApplet) (w)).hh == 1 && ((EngineApplet) (w)).f > 206 && ((EngineApplet) (w)).e > 150 && ((EngineApplet) (w)).f < 246 && ((EngineApplet) (w)).e < 170){
				p();
			}
			if(((EngineApplet) (w)).hh == 1 && ((EngineApplet) (w)).f > 266 && ((EngineApplet) (w)).e > 150 && ((EngineApplet) (w)).f < 306 && ((EngineApplet) (w)).e < 170){
				g = 0;
			}
			return;
		} else {
			d();
			return;
		}
	}
	
	private final void p(){
		w.gameScreen = 1;
		w.te = -1;
		w.se = -1;
		w.hh = 0;
		for(int i1 = 0; i1 < 3; i1++){
			v[i1] = "";
		}
		
		if(s == x){
			w.pe = -1;
		} else {
			w.pe = x;
		}
		n();
	}
	
	public final void a(OpenCGD castle1, int i1){
		w = castle1;
		o = w.ic;
		a = w.j;
		m = w.currentPlayerCount;
		userID = OpenCGD.userID;
		System.out.println("Copied id: " + userID + " Castle id: " + OpenCGD.userID + " extra id: " + i1);
		packetLength = w.packetLength;
		packetID = w.packetID;
		b = w.m;
		c = w.n;
		s = w.currentGame;
		g = 0;
		for(int j1 = 0; j1 < 3; j1++){
			v[j1] = "";
		}
		
		k.c = 0;
		k.b = 290;
		k.f = 0;
		k.e = 500;
		g();
	}
	
	public final void a(OpenCGD castle1){
		w = castle1;
		u = w.graphics;
		y = w.le;
		t = w.md;
		k = w.nb;
		l = w.qb;
		h = w.hb;
		connectionStream = w.connection;
		ab = w.incomingPacketData;
		n = w.waitingList_name;
		e = w.waitingList_rating;
		s = w.currentGame;
		g = 0;
		loadMedia();
	}
}