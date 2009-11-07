package opencgd.games;


import java.awt.*;
import java.io.IOException;

import opencgd.AbstractGame;

public class QuadLink extends AbstractGame {
	
	int i;
	int h;
	int f;
	int g;
	boolean m;
	int t;
	int q;
	int r;
	int s;
	int u;
	int a;
	int c;
	int p[][];
	int l;
	int k;
	int j;
	Color n;
	Font o;
	int d[] = {
			1, 61, 122, 183, 246, 309, 371, 431
	};
	int e[] = {
			68, 110, 151, 193, 235, 277, 319, 361
	};
	int b[] = {
			1, 26, 59, 94, 134, 181, 232
	};
	
	public QuadLink(){
		o = new Font("Helvetica", 1, 13);
		n = new Color(150, 150, 150);
		k = 60;
		p = new int[7][6];
		m = false;
	}
	
	@Override
	public void a(){
		super.k.a(0, 0, 2);
		if(u > 0){
			a(r, q, t, u, s);
		}
		if(j == super.q && !m && c != -1){
			a(c, 5, super.q + 1, 128, 128);
		}
		if(i > 0 && i % 20 < 10){
			int i1 = g;
			int j1 = f;
			for(int k1 = 0; k1 < 4; k1++){
				a(i1, j1, 3, false);
				if(h == 0){
					i1++;
				} else if(h == 1){
					j1++;
				} else if(h == 2){
					i1++;
					j1--;
				} else if(h == 3){
					i1++;
					j1++;
				}
			}
			
		}
		super.k.a(36, 28, 1);
		super.k.a(super.u, 6, 6, false);
		super.u.setFont(o);
		super.u.setColor(Color.white);
		if(j == -1){
			super.u.drawString("Please wait...", 10, 20);
		} else if(j == super.q){
			super.u.drawString("Your turn - Make a move!", 10, 20);
		} else {
			super.u.drawString(super.n[j] + "'s turn - Please wait", 10, 20);
		}
		opencgd.library.D.b(super.u, "Time-Remaining:" + k, o, 502, 20);
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2){
		j1 = 5 - j1;
		int j2 = (b[0] + b[1]) / 2 - 16;
		int k2 = (e[i1] + e[i1 + 1]) / 2;
		int l2 = (d[i1] + d[i1 + 1]) / 2;
		int i3 = (k2 * (b[6] - j2 - 4) + l2 * ((j2 + 4) - b[0])) / (b[6] - b[0]);
		int j3 = (b[j1] + b[j1 + 1]) / 2;
		int k3 = (k2 * (b[6] - j3 - 4) + l2 * ((j3 + 4) - b[0])) / (b[6] - b[0]);
		int l3 = 35 + (23 * j1) / 6;
		int i4 = 26 + (26 * j1) / 6;
		int j4 = (35 * l1 + l3 * (i2 - l1)) / i2;
		int k4 = (26 * l1 + i4 * (i2 - l1)) / i2;
		int l4 = (i3 * l1 + k3 * (i2 - l1)) / i2;
		int i5 = (j2 * l1 + j3 * (i2 - l1)) / i2;
		super.k.b((36 + l4) - j4 / 2, (36 + i5) - k4 / 2, j4, k4, k1 + 2);
	}
	
	public void a(int i1, int j1, int k1, boolean flag){
		j1 = 5 - j1;
		if(flag){
			super.k.a(0, 0, 2);
		}
		int l1 = (b[j1] + b[j1 + 1]) / 2;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[6] - l1 - 4) + j2 * ((l1 + 4) - b[0])) / (b[6] - b[0]);
		int l2 = 35 + (23 * j1) / 5;
		int i3 = 26 + (26 * j1) / 5;
		super.k.b((36 + k2) - l2 / 2, (36 + l1) - i3 / 2, l2, i3, k1 + 2);
		if(flag){
			super.k.b(2);
		}
	}
	
	public void a(int i1, int j1){
		i1 -= 42;
		if((j1 -= 44) < b[0] || j1 >= b[6]){
			a = -1;
			c = -1;
			return;
		}
		a = 0;
		for(int k1 = 0; k1 < 8; k1++){
			if(j1 >= b[k1 + 1]){
				continue;
			}
			a = 5 - k1;
			break;
		}
		
		int ai[] = new int[8];
		for(int l1 = 0; l1 < 8; l1++){
			ai[l1] = (e[l1] * (b[6] - j1) + d[l1] * (j1 - b[0])) / (b[6] - b[0]);
		}
		
		if(i1 < ai[0] || i1 >= ai[7]){
			a = -1;
			c = -1;
			return;
		}
		c = 0;
		for(int i2 = 0; i2 < 7; i2++){
			if(i1 < ai[i2 + 1]){
				c = i2;
				return;
			}
		}
		
	}
	
	public void a(int i1){
		if(i1 < 0 || i1 > 6){
			return;
		}
		if(j != super.q || m || k == 0){
			return;
		}
		if(p[i1][5] != 0){
			return;
		}
		super.connectionStream.setPacketID(255);
		super.connectionStream.addByte(i1);
		super.connectionStream.sendPacket();
		for(q = 0; q < 6; q++){
			if(p[i1][q] == 0){
				break;
			}
		}
		
		r = i1;
		s = u = (5 - q) * 24 + 16;
		t = super.q + 1;
		m = true;
	}
	
	@Override
	public void d(){
		l++;
		if(u > 0){
			u -= 2;
			if(u <= 0){
				a(r, q, t, true);
				p[r][q] = t;
				a(p);
			}
		}
		if(i > 0){
			i--;
		}
		a(((opencgd.library.EngineApplet) (super.w)).f, ((opencgd.library.EngineApplet) (super.w)).e);
		if(j == super.q && c != -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 1){
			a(c);
		}
	}
	
	public boolean a(int ai[][]){
		for(int i1 = 0; i1 < 7; i1++){
			for(int j1 = 0; j1 < 6; j1++){
				int k1 = ai[i1][j1];
				if(k1 != 0){
					for(int l1 = 1; l1 < 4; l1++){
						if(i1 + l1 >= 7 || ai[i1 + l1][j1] != k1){
							break;
						}
						if(l1 == 3){
							g = i1;
							f = j1;
							h = 0;
							i = 75;
							return true;
						}
					}
					
					for(int i2 = 1; i2 < 4; i2++){
						if(j1 + i2 >= 6 || ai[i1][j1 + i2] != k1){
							break;
						}
						if(i2 == 3){
							g = i1;
							f = j1;
							h = 1;
							i = 75;
							return true;
						}
					}
					
					for(int j2 = 1; j2 < 4; j2++){
						if(i1 + j2 >= 7 || j1 - j2 < 0 || ai[i1 + j2][j1 - j2] != k1){
							break;
						}
						if(j2 == 3){
							g = i1;
							f = j1;
							h = 2;
							i = 75;
							return true;
						}
					}
					
					for(int k2 = 1; k2 < 4; k2++){
						if(i1 + k2 >= 7 || j1 + k2 >= 6 || ai[i1 + k2][j1 + k2] != k1){
							break;
						}
						if(k2 == 3){
							g = i1;
							f = j1;
							h = 3;
							i = 75;
							return true;
						}
					}
					
				}
			}
			
		}
		
		return false;
	}
	
	@Override
	public void g(){
		super.k.b = 290;
		super.k.c = 0;
		super.k.a(0, 0, 0);
		super.k.a(36, 38, 1);
		super.k.b(2);
		for(int i1 = 0; i1 < 7; i1++){
			for(int j1 = 0; j1 < 6; j1++){
				p[i1][j1] = 0;
			}
			
		}
		
		j = 0;
		u = 0;
		i = 0;
		m = false;
	}
	
	@Override
	public void h(){
		super.p = 2;
		super.k.a();
		super.k.a("quadlink/board.jpg", 0, false);
		super.k.a("quadlink/grid.gif", 1, true);
		super.k.a("quadlink/bits.gif", 3, true, 3, 58, 52);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			j = super.connectionStream.b(super.ab, 1);
			k = super.connectionStream.b(super.ab, 3);
			if(j != super.q){
				m = false;
				return;
			}
		} else if(i1 == 254){
			r = super.connectionStream.b(super.ab, 1);
			q = super.connectionStream.b(super.ab, 3);
			t = super.connectionStream.b(super.ab, 5);
			s = u = (5 - q) * 24 + 16;
		}
	}
	
	@Override
	public boolean i(){
		return u == 0 && i == 0;
	}
}
