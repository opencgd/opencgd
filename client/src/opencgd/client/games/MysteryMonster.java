package opencgd.client.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.client.AbstractGame;

public class MysteryMonster extends AbstractGame {
	
	private int x;
	private int r;
	private int o;
	private int p;
	private int hb;
	private String gb;
	private static boolean u[][];
	private static String t[];
	private static int s;
	private int m;
	private int n;
	private int y;
	private int e;
	private int f;
	private boolean fb[][];
	private int a;
	private int g;
	private int q;
	private int l;
	private int k;
	private int j;
	private Color v;
	private Color z;
	private Color w;
	private Font eb[];
	private Font ab;
	private Font bb;
	private Font cb;
	private Font db;
	private int b[] = {
			101, 156, 215, 277
	};
	private int c[] = {
			59, 112, 168, 227
	};
	private int h[] = {
			8, 68, 130, 192, 254, 316, 375
	};
	private int i[] = {
			35, 87, 142, 198, 253, 309, 361
	};
	private int d[] = {
			56, 106, 162, 221, 280
	};
	
	public MysteryMonster(){
		db = new Font("Helvetica", 0, 10);
		cb = new Font("Helvetica", 1, 12);
		bb = new Font("Helvetica", 1, 13);
		ab = new Font("Helvetica", 1, 16);
		eb = new Font[14];
		w = new Color(150, 150, 150);
		z = new Color(26, 138, 116);
		v = new Color(22, 214, 176);
		k = 60;
		q = -1;
		g = -1;
		a = -1;
		fb = new boolean[6][4];
		x = -1;
	}
	
	@Override
	public void a(){
		super.k.a(0, 0, 10);
		super.k.a(super.u, 6, 6, false);
		if(gb != null && hb > 0){
			super.u.setColor(Color.cyan);
			int i1 = 41 - hb / 2;
			if(i1 > 13){
				i1 = 13;
			}
			opencgd.client.library.D.a(super.u, gb, eb[i1], 256, 15);
		}
		if(j == super.userID && r == 1){
			super.u.setFont(ab);
			super.u.setColor(Color.white);
			super.u.drawString("Only one", 390, 54);
			super.u.drawString("Monster left!", 390, 72);
			super.u.setFont(cb);
			super.u.setColor(Color.black);
			super.u.drawString("Click below to", 390, 88);
			super.u.drawString("declare guess,", 390, 100);
			super.u.drawString("but be warned!", 390, 112);
			super.u.drawString("If you are wrong", 390, 124);
			super.u.drawString("you lose the game", 389, 136);
			super.u.setFont(bb);
			super.u.setColor(Color.black);
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 273 && ((opencgd.client.library.EngineApplet) (super.w)).f < 475 && ((opencgd.client.library.EngineApplet) (super.w)).e < 285){
				super.u.setColor(z);
			}
			super.u.drawString("Make guess!", 390, 283);
		} else if(j == super.userID){
			super.u.setFont(db);
			super.u.setColor(Color.white);
			super.u.drawString("Has your monster got:", 390, 35);
			super.u.setFont(cb);
			for(int j1 = 0; j1 < 9; j1++){
				super.u.setColor(Color.black);
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 40 + j1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).e < 52 + j1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).f < 490){
					super.u.setColor(z);
				}
				if(n == j1 + f){
					super.u.setColor(v);
				}
				super.u.drawString(t[j1 + f], 390, 50 + j1 * 12);
			}
			
			super.u.setColor(Color.black);
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 150 && ((opencgd.client.library.EngineApplet) (super.w)).f < 420 && ((opencgd.client.library.EngineApplet) (super.w)).e < 160){
				super.u.setColor(z);
			}
			if(y == 1){
				super.u.setColor(v);
			}
			super.u.drawString("AND", 390, 160);
			super.u.setColor(Color.black);
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 423 && ((opencgd.client.library.EngineApplet) (super.w)).e > 150 && ((opencgd.client.library.EngineApplet) (super.w)).f < 448 && ((opencgd.client.library.EngineApplet) (super.w)).e < 160){
				super.u.setColor(z);
			}
			if(y == 2){
				super.u.setColor(v);
			}
			super.u.drawString("OR", 423, 160);
			super.u.setColor(Color.black);
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 450 && ((opencgd.client.library.EngineApplet) (super.w)).e > 150 && ((opencgd.client.library.EngineApplet) (super.w)).f < 490 && ((opencgd.client.library.EngineApplet) (super.w)).e < 160){
				super.u.setColor(z);
			}
			if(y != 0){
				super.u.drawString("CANCEL", 450, 160);
			}
			if(y != 0){
				for(int k1 = 0; k1 < 9; k1++){
					super.u.setColor(Color.black);
					if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 164 + k1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).e < 176 + k1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).f < 490){
						super.u.setColor(z);
					}
					if(m == k1 + e){
						super.u.setColor(v);
					}
					super.u.drawString(t[k1 + e], 390, 174 + k1 * 12);
				}
				
			}
			super.u.setColor(Color.black);
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 273 && ((opencgd.client.library.EngineApplet) (super.w)).f < 475 && ((opencgd.client.library.EngineApplet) (super.w)).e < 285){
				super.u.setColor(z);
			}
			super.u.drawString("Ask question!", 390, 283);
		}
		if(hb == 0){
			super.u.setFont(bb);
			super.u.setColor(Color.white);
			if(j == -1){
				super.u.drawString("Please wait...", 10, 20);
			} else if(j == super.userID){
				super.u.drawString("Your turn - Choose a question", 10, 20);
			} else {
				super.u.drawString(super.n[j] + "'s turn - Please wait", 10, 20);
			}
			opencgd.client.library.D.b(super.u, "Time-Remaining:" + k, bb, 502, 20);
		}
	}
	
	private void b(){
		super.k.a(0, 0, 0);
		for(int i1 = 0; i1 < 6; i1++){
			for(int j1 = 0; j1 < 4; j1++){
				if(i1 == x % 6 && j1 == x / 6){
					a(i1, j1, 1);
				} else if(fb[i1][j1]){
					a(i1, j1, 0);
				}
			}
			
		}
		
		if(j == super.userID){
			super.k.a(382, 19, 113, 14, w, 150, false);
			super.k.a(382, 34, 103, 108, w, 150, false);
			super.k.a(486, 34, 9, 108, w, 150, false);
			super.k.a(486, 34, 3);
			super.k.a(382, 143, 113, 14, w, 150, false);
			super.k.a(382, 158, 103, 108, w, 150, false);
			super.k.a(486, 158, 9, 108, w, 150, false);
			super.k.a(486, 158, 3);
			super.k.a(382, 267, 113, 14, w, 150, false);
		}
		super.k.b(10);
	}
	
	private void a(int i1, int j1, int k1){
		int l1 = c[j1];
		int i2 = b[j1];
		int j2 = (i[i1] + i[i1 + 1]) / 2;
		int k2 = (h[i1] + h[i1 + 1]) / 2;
		int l2 = (j2 * (d[4] - l1) + k2 * (l1 - d[0])) / (d[4] - d[0]);
		int i3 = (j2 * (d[4] - i2) + k2 * (i2 - d[0])) / (d[4] - d[0]);
		super.k.d(l2 - 3, l1, 1 + k1, i3 - l2, 60 - (i2 - l1));
		super.k.d(l2 - 3 - 13, l1, 1 + k1, i3 - l2, 60 - (i2 - l1));
		super.k.d((l2 - 3) + 13, l1, 1 + k1, i3 - l2, 60 - (i2 - l1));
	}
	
	private void a(int i1, int j1){
		i1 -= 6;
		if((j1 -= 6) < d[0] || j1 >= d[4]){
			a = -1;
			g = -1;
			return;
		}
		a = 0;
		for(int k1 = 0; k1 < 4; k1++){
			if(j1 >= d[k1 + 1]){
				continue;
			}
			a = k1;
			break;
		}
		
		int ai[] = new int[7];
		for(int l1 = 0; l1 < 7; l1++){
			ai[l1] = (i[l1] * (d[4] - j1) + h[l1] * (j1 - d[0])) / (d[4] - d[0]);
		}
		
		if(i1 < ai[0] || i1 >= ai[6]){
			a = -1;
			g = -1;
			return;
		}
		g = 0;
		for(int i2 = 0; i2 < 6; i2++){
			if(i1 < ai[i2 + 1]){
				g = i2;
				return;
			}
		}
		
	}
	
	@Override
	public void d(){
		l++;
		if(hb > 0){
			hb--;
		}
		if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
			a(((opencgd.client.library.EngineApplet) (super.w)).f, ((opencgd.client.library.EngineApplet) (super.w)).e);
			if(g != -1){
				fb[g][a] = !fb[g][a];
				if(g == x % 6 && a == x / 6){
					fb[g][a] = true;
				}
				b();
				p = 0;
				o = 0;
				r = 0;
				for(int i1 = 0; i1 < 6; i1++){
					for(int k1 = 0; k1 < 4; k1++){
						if(!fb[i1][k1]){
							r++;
							p = i1;
							o = k1;
						}
					}
					
				}
				
			}
		}
		if(j == super.userID){
			if(((opencgd.client.library.EngineApplet) (super.w)).g == 1 && (l & 3) == 0){
				if(((opencgd.client.library.EngineApplet) (super.w)).f - 6 > 486 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 > 34 && ((opencgd.client.library.EngineApplet) (super.w)).f - 6 <= 495 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 < 88 && f > 0){
					f--;
				}
				if(((opencgd.client.library.EngineApplet) (super.w)).f - 6 > 486 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 > 88 && ((opencgd.client.library.EngineApplet) (super.w)).f - 6 <= 495 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 < 142 && f < s - 9){
					f++;
				}
				if(((opencgd.client.library.EngineApplet) (super.w)).f - 6 > 486 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 > 158 && ((opencgd.client.library.EngineApplet) (super.w)).f - 6 <= 495 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 < 212 && e > 0){
					e--;
				}
				if(((opencgd.client.library.EngineApplet) (super.w)).f - 6 > 486 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 > 212 && ((opencgd.client.library.EngineApplet) (super.w)).f - 6 <= 495 && ((opencgd.client.library.EngineApplet) (super.w)).e - 6 < 266 && e < s - 9){
					e++;
				}
			}
			if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 150 && ((opencgd.client.library.EngineApplet) (super.w)).f < 420 && ((opencgd.client.library.EngineApplet) (super.w)).e < 160){
					y = 1;
				}
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 423 && ((opencgd.client.library.EngineApplet) (super.w)).e > 150 && ((opencgd.client.library.EngineApplet) (super.w)).f < 448 && ((opencgd.client.library.EngineApplet) (super.w)).e < 160){
					y = 2;
				}
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 450 && ((opencgd.client.library.EngineApplet) (super.w)).e > 150 && ((opencgd.client.library.EngineApplet) (super.w)).f < 490 && ((opencgd.client.library.EngineApplet) (super.w)).e < 160){
					y = 0;
				}
			}
			if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
				for(int j1 = 0; j1 < 9; j1++){
					if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 40 + j1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).e < 52 + j1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).f < 490){
						n = j1 + f;
					}
				}
				
				if(y != 0){
					for(int l1 = 0; l1 < 9; l1++){
						if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 164 + l1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).e < 176 + l1 * 12 && ((opencgd.client.library.EngineApplet) (super.w)).f < 490){
							m = l1 + e;
						}
					}
					
				}
			}
			if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && r != 1 && k > 0){
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 273 && ((opencgd.client.library.EngineApplet) (super.w)).f < 475 && ((opencgd.client.library.EngineApplet) (super.w)).e < 285){
					super.connectionStream.setPacketID(255);
					super.connectionStream.addByte(n);
					super.connectionStream.addByte(y);
					super.connectionStream.addByte(m);
					super.connectionStream.sendPacket();
					return;
				}
			} else if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && r == 1 && k > 0 && ((opencgd.client.library.EngineApplet) (super.w)).f > 390 && ((opencgd.client.library.EngineApplet) (super.w)).e > 273 && ((opencgd.client.library.EngineApplet) (super.w)).f < 475 && ((opencgd.client.library.EngineApplet) (super.w)).e < 285){
				super.connectionStream.setPacketID(254);
				super.connectionStream.addByte(p);
				super.connectionStream.addByte(o);
				super.connectionStream.sendPacket();
			}
		}
	}
	
	@Override
	public void g(){
		super.k.b = 290;
		super.k.c = 0;
		j = 0;
		k = 60;
		f = 0;
		e = 0;
		y = 0;
		q = -1;
		n = 0;
		m = 0;
		for(int i1 = 0; i1 < 6; i1++){
			for(int j1 = 0; j1 < 4; j1++){
				fb[i1][j1] = false;
			}
			
		}
		
		b();
		gb = null;
		hb = 0;
		p = 0;
		o = 0;
		r = 0;
	}
	
	@Override
	public void loadMedia(){
		super.p = 2;
		super.k.a();
		super.k.a("crypt/back.jpg", 4, false);
		super.k.a("monster/back.gif", 0, true);
		super.k.a("monster/bar.gif", 1, false, 2, 7, 60);
		super.k.a("monster/arrows.gif", 3, true);
		super.k.b = 290;
		super.k.c = 0;
		super.k.f = 0;
		super.k.e = 500;
		super.k.a(0, 0, 4);
		super.k.a(0, 0, 0);
		super.k.b(0);
		c();
		for(int i1 = 1; i1 < 14; i1++){
			eb[i1] = new Font("Helvetica", 1, i1);
		}
		
	}
	
	private static void c(){
		int i1 = 0;
		try{
			opencgd.client.library.Buffer g1 = new opencgd.client.library.Buffer("monster/questions.dat");
			s = g1.getInt();
			t = new String[s];
			u = new boolean[s][24];
			for(i1 = 0; i1 < s; i1++){
				g1.m();
				t[i1] = g1.getString();
				for(int j1 = 0; j1 < 24; j1++){
					u[i1][j1] = g1.getInt() == 1;
				}
				
			}
			
			g1.closeStream();
			return;
		} catch(IOException _ex){
			System.out.println("Fatal error loading question-list! n=" + i1);
		}
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			j = super.connectionStream.getUShort(super.ab, 1);
			k = super.connectionStream.getUShort(super.ab, 3);
			if(j != q){
				b();
				return;
			}
		} else {
			if(i1 == 254){
				gb = new String(super.ab, 1, j1 - 1);
				hb = 80;
				return;
			}
			if(i1 == 253){
				x = super.connectionStream.getUShort(super.ab, 1);
				fb[x % 6][x / 6] = true;
				b();
			}
		}
	}
	
	@Override
	public boolean isNetworkedGame(){
		return hb == 0;
	}
}
