package opencgd.games;


import java.awt.*;
import java.io.IOException;

import opencgd.AbstractGame;

public class Chess extends AbstractGame {
	
	private boolean j;
	private boolean g;
	private boolean v;
	private int z;
	private int ab;
	private boolean bb;
	private boolean cb;
	private boolean u;
	private boolean n;
	private int ib;
	private int fb;
	private int jb;
	private int kb;
	private int gb;
	private int hb;
	private int lb;
	private int k;
	private int l;
	private int w[];
	private int x[];
	private int y;
	private int q[];
	private int r[];
	private int o[];
	private int p[];
	private int s;
	private int a;
	private int c;
	private int eb[][];
	private int i;
	private int h;
	private int f;
	private Color t;
	private Font db;
	private int d[] = {
			22, 78, 136, 194, 250, 308, 366, 422, 480
	};
	private int e[] = {
			110, 145, 180, 215, 250, 285, 320, 355, 390
	};
	private int b[] = {
			22, 43, 65, 91, 119, 151, 188, 230, 278
	};
	
	public Chess(){
		db = new Font("Helvetica", 1, 13);
		t = new Color(150, 150, 150);
		h = 30;
		eb = new int[8][8];
		p = new int[250];
		o = new int[250];
		r = new int[250];
		q = new int[250];
		x = new int[64];
		w = new int[64];
		l = -1;
		k = -1;
		ib = 25;
		n = true;
		u = false;
		cb = true;
		bb = true;
		ab = -1;
		v = false;
		g = false;
		j = false;
	}
	
	@Override
	public void a(){
		super.k.b = 290;
		super.k.a(0, 0, 25);
		super.k.b = 279;
		if(i % 20 < 10 && f == super.q && !n && lb == 0 && !j){
			for(int i1 = 0; i1 < y; i1++){
				a(x[i1], w[i1]);
			}
			
		}
		if(lb == 0){
			if(super.q == 0){
				for(int j1 = 0; j1 <= 7; j1++){
					for(int i2 = 7; i2 >= 0; i2--){
						if(eb[j1][i2] != 0){
							a(j1, i2, eb[j1][i2]);
						}
					}
					
				}
				
			} else {
				for(int k1 = 7; k1 >= 0; k1--){
					for(int j2 = 0; j2 <= 7; j2++){
						if(eb[k1][j2] != 0){
							a(k1, j2, eb[k1][j2]);
						}
					}
					
				}
				
			}
		} else {
			a(hb, gb, kb, jb, fb, lb, ib);
			int l1 = (gb * lb + jb * (ib - lb)) / ib;
			if(super.q == 0){
				for(int k2 = 0; k2 <= 7; k2++){
					for(int k3 = 7; k3 > l1; k3--){
						if(eb[k2][k3] != 0){
							a(k2, k3, eb[k2][k3]);
						}
					}
					
				}
				
			} else {
				for(int l2 = 7; l2 >= 0; l2--){
					for(int l3 = 0; l3 < l1; l3++){
						if(eb[l2][l3] != 0){
							a(l2, l3, eb[l2][l3]);
						}
					}
					
				}
				
			}
			b(hb, gb, kb, jb, fb, lb, ib);
			if(super.q == 0){
				for(int i3 = 0; i3 <= 7; i3++){
					for(int i4 = l1; i4 >= 0; i4--){
						if(eb[i3][i4] != 0){
							a(i3, i4, eb[i3][i4]);
						}
					}
					
				}
				
			} else {
				for(int j3 = 7; j3 >= 0; j3--){
					for(int j4 = l1; j4 <= 7; j4++){
						if(eb[j3][j4] != 0){
							a(j3, j4, eb[j3][j4]);
						}
					}
					
				}
				
			}
		}
		if(j){
			super.k.a(130, 50, 240, 150, t, 224, false);
			super.k.a(155, 90, 2);
			super.k.a(205, 90, 3);
			super.k.a(255, 90, 4);
			super.k.a(305, 90, 5);
		}
		super.k.a(super.u, 6, 6, false);
		if(j){
			super.u.setColor(Color.white);
			opencgd.library.D.a(super.u, "Select Piece", db, 256, 76);
		}
		super.u.setFont(db);
		super.u.setColor(Color.white);
		if(f == -1){
			super.u.drawString("Please wait...", 10, 20);
		} else if(f == super.q){
			super.u.drawString("Your turn - Make a move!", 10, 20);
		} else {
			super.u.drawString(super.n[f] + "'s turn - Please wait", 10, 20);
		}
		opencgd.library.D.b(super.u, "Time-Remaining:" + h, db, 502, 20);
	}
	
	public void b(){
		super.k.b = 290;
		super.k.a(0, 0, 0);
		super.k.b = 279;
		if(super.q == 0){
			for(int i1 = 0; i1 <= 7; i1++){
				for(int k1 = 7; k1 >= 0; k1--){
					if(eb[i1][k1] != 0){
						b(i1, k1, eb[i1][k1]);
					}
				}
				
			}
			
		} else {
			for(int j1 = 7; j1 >= 0; j1--){
				for(int l1 = 0; l1 <= 7; l1++){
					if(eb[j1][l1] != 0){
						b(j1, l1, eb[j1][l1]);
					}
				}
				
			}
			
		}
		super.k.b(25);
	}
	
	public void b(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		if(super.q == 0){
			j1 = 7 - j1;
			l1 = 7 - l1;
		}
		if(super.q == 1){
			i1 = 7 - i1;
			k1 = 7 - k1;
		}
		int l2 = (b[j1] + b[j1 + 1]) / 2;
		int i3 = (e[i1] + e[i1 + 1]) / 2;
		int j3 = (d[i1] + d[i1 + 1]) / 2;
		int k3 = (i3 * (b[8] - l2 - 4) + j3 * ((l2 + 4) - b[0])) / (b[8] - b[0]);
		int l3 = 27 + (18 * j1) / 7;
		int i4 = 46 + (45 * j1) / 7;
		int j4 = (b[l1] + b[l1 + 1]) / 2;
		int k4 = (e[k1] + e[k1 + 1]) / 2;
		int l4 = (d[k1] + d[k1 + 1]) / 2;
		int i5 = (k4 * (b[8] - j4 - 4) + l4 * ((j4 + 4) - b[0])) / (b[8] - b[0]);
		int j5 = 27 + (18 * l1) / 7;
		int k5 = 46 + (45 * l1) / 7;
		int l5 = (k3 * j2 + i5 * (k2 - j2)) / k2;
		int i6 = (l2 * j2 + j4 * (k2 - j2)) / k2;
		int j6 = (l3 * j2 + j5 * (k2 - j2)) / k2;
		int k6 = (i4 * j2 + k5 * (k2 - j2)) / k2;
		super.k.b(l5 - j6 / 2, i6 - (k6 * 77) / 91, j6, k6, i2);
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		if(super.q == 0){
			j1 = 7 - j1;
			l1 = 7 - l1;
		}
		if(super.q == 1){
			i1 = 7 - i1;
			k1 = 7 - k1;
		}
		int l2 = (b[j1] + b[j1 + 1]) / 2;
		int i3 = (e[i1] + e[i1 + 1]) / 2;
		int j3 = (d[i1] + d[i1 + 1]) / 2;
		int k3 = (i3 * (b[8] - l2 - 4) + j3 * ((l2 + 4) - b[0])) / (b[8] - b[0]);
		int l3 = 27 + (18 * j1) / 7;
		int i4 = 38 + (37 * j1) / 7;
		int j4 = (b[l1] + b[l1 + 1]) / 2;
		int k4 = (e[k1] + e[k1 + 1]) / 2;
		int l4 = (d[k1] + d[k1 + 1]) / 2;
		int i5 = (k4 * (b[8] - j4 - 4) + l4 * ((j4 + 4) - b[0])) / (b[8] - b[0]);
		int j5 = 27 + (18 * l1) / 7;
		int k5 = 38 + (37 * l1) / 7;
		int l5 = (k3 * j2 + i5 * (k2 - j2)) / k2;
		int i6 = (l2 * j2 + j4 * (k2 - j2)) / k2;
		int j6 = (l3 * j2 + j5 * (k2 - j2)) / k2;
		int k6 = (i4 * j2 + k5 * (k2 - j2)) / k2;
		super.k.a(l5 - j6 / 2, i6 - (k6 * 16) / 75, j6, k6, i2 + 12, 128);
	}
	
	public void a(int i1, int j1, int k1){
		if(super.q == 0){
			j1 = 7 - j1;
		}
		if(super.q == 1){
			i1 = 7 - i1;
		}
		int l1 = (b[j1] + b[j1 + 1]) / 2;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[8] - l1 - 4) + j2 * ((l1 + 4) - b[0])) / (b[8] - b[0]);
		int l2 = 27 + (18 * j1) / 7;
		int i3 = 46 + (45 * j1) / 7;
		super.k.b(k2 - l2 / 2, l1 - (i3 * 77) / 91, l2, i3, k1);
	}
	
	public void b(int i1, int j1, int k1){
		if(super.q == 0){
			j1 = 7 - j1;
		}
		if(super.q == 1){
			i1 = 7 - i1;
		}
		int l1 = (b[j1] + b[j1 + 1]) / 2;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[8] - l1 - 4) + j2 * ((l1 + 4) - b[0])) / (b[8] - b[0]);
		int l2 = 27 + (18 * j1) / 7;
		int i3 = 38 + (37 * j1) / 7;
		super.k.a(k2 - l2 / 2, l1 - (i3 * 16) / 75, l2, i3, k1 + 12, 128);
	}
	
	public void a(int i1, int j1){
		if(super.q == 0){
			j1 = 7 - j1;
		}
		if(super.q == 1){
			i1 = 7 - i1;
		}
		int k1 = (b[j1] + b[j1 + 1]) / 2;
		int l1 = (e[i1] + e[i1 + 1]) / 2;
		int i2 = (d[i1] + d[i1 + 1]) / 2;
		int j2 = (l1 * (b[8] - k1 - 4) + i2 * ((k1 + 4) - b[0])) / (b[8] - b[0]);
		int k2 = 32 + (21 * j1) / 7;
		int l2 = 21 + (20 * j1) / 7;
		super.k.b(j2 - k2 / 2, k1 - l2 / 2, k2, l2, 26);
	}
	
	public void b(int i1, int j1){
		i1 -= 6;
		if((j1 -= 6) < b[0] || j1 >= b[8]){
			a = -1;
			c = -1;
			return;
		}
		a = 0;
		for(int k1 = 0; k1 < 8; k1++){
			if(j1 >= b[k1 + 1]){
				continue;
			}
			a = k1;
			break;
		}
		
		if(super.q == 0){
			a = 7 - a;
		}
		int ai[] = new int[9];
		for(int l1 = 0; l1 < 9; l1++){
			ai[l1] = (e[l1] * (b[8] - j1) + d[l1] * (j1 - b[0])) / (b[8] - b[0]);
		}
		
		super.t.setColor(Color.white);
		if(i1 < ai[0] || i1 >= ai[8]){
			a = -1;
			c = -1;
			return;
		}
		c = 0;
		for(int i2 = 0; i2 < 8; i2++){
			if(i1 >= ai[i2 + 1]){
				continue;
			}
			c = i2;
			break;
		}
		
		if(super.q == 1){
			c = 7 - c;
		}
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2){
		int j2 = Math.abs(k1 - i1);
		int k2 = Math.abs(l1 - j1);
		int l2 = j2;
		if(k2 > l2){
			l2 = k2;
		}
		ib = 20 + l2 * 5;
		lb = ib;
		if(j1 == super.q * 7 && i1 == 0){
			cb = false;
		}
		if(j1 == super.q * 7 && i1 == 7){
			bb = false;
		}
		if(i2 == 1 + super.q * 6){
			cb = false;
			bb = false;
		}
		ab = -1;
		if((i2 == 6 || i2 == 12) && (l1 - j1 == 2 || j1 - l1 == 2)){
			ab = k1;
			z = l1;
		}
	}
	
	public void c(int i1, int j1){
		if(i1 == -1 || j1 == -1 || h == 0){
			return;
		}
		if(l == -1){
			return;
		}
		if(u){
			return;
		}
		if(f != super.q){
			return;
		}
		for(int k1 = 0; k1 < s; k1++){
			if(p[k1] == l && o[k1] == k && r[k1] == i1 && q[k1] == j1){
				break;
			}
			if(k1 == s - 1){
				return;
			}
		}
		
		f = -1;
		u = true;
		super.connectionStream.setPacketID(255);
		super.connectionStream.addByte(l);
		super.connectionStream.addByte(k);
		super.connectionStream.addByte(i1);
		super.connectionStream.addByte(j1);
		super.connectionStream.sendPacket();
		hb = l;
		gb = k;
		kb = i1;
		jb = j1;
		fb = eb[hb][gb];
		eb[hb][gb] = 0;
		b();
		l = -1;
		k = -1;
		a(hb, gb, kb, jb, fb);
	}
	
	public void c(){
		if(l == -1){
			return;
		}
		if(f != super.q){
			return;
		} else {
			l = -1;
			k = -1;
			e();
			return;
		}
	}
	
	public void d(int i1, int j1){
		if(i1 == -1 || j1 == -1){
			return;
		}
		if(l != -1){
			return;
		}
		if(f != super.q){
			return;
		}
		for(int k1 = 0; k1 < y; k1++){
			if(x[k1] == i1 && w[k1] == j1){
				break;
			}
			if(k1 == y - 1){
				return;
			}
		}
		
		l = i1;
		k = j1;
		m = eb[i1][j1];
		f();
	}
	
	public boolean a(int i1, int j1, int k1, int l1){
		int i2 = eb[i1][j1];
		int j2 = eb[k1][l1];
		eb[i1][j1] = 0;
		eb[k1][l1] = i2;
		v = false;
		g = true;
		a(1 - super.q);
		g = false;
		eb[i1][j1] = i2;
		eb[k1][l1] = j2;
		return v;
	}
	
	public void b(int i1, int j1, int k1, int l1){
		if(eb[k1][l1] == 1 || eb[k1][l1] == 7){
			v = true;
		}
		if(!g){
			if(a(i1, j1, k1, l1)){
				return;
			}
			p[s] = i1;
			o[s] = j1;
			r[s] = k1;
			q[s++] = l1;
		}
	}
	
	public boolean c(int i1, int j1, int k1){
		if(i1 < 0 || j1 < 0 || i1 >= 8 || j1 >= 8){
			return false;
		}
		if(eb[i1][j1] == 0){
			return false;
		}
		return (eb[i1][j1] - 1) / 6 != k1;
	}
	
	public boolean f(int i1, int j1){
		if(i1 < 0 || j1 < 0 || i1 >= 8 || j1 >= 8){
			return false;
		}
		return eb[i1][j1] == 0;
	}
	
	public boolean d(int i1, int j1, int k1){
		return f(i1, j1) || c(i1, j1, k1);
	}
	
	public void a(int i1){
		int j1 = i1 * 6;
		for(int k2 = 0; k2 < 8; k2++){
			for(int l2 = 0; l2 < 8; l2++){
				if(eb[k2][l2] != 0){
					if(eb[k2][l2] == 6 + j1){
						if(i1 == 0){
							if(f(k2, l2 + 1)){
								b(k2, l2, k2, l2 + 1);
							}
							if(l2 == 1 && f(k2, l2 + 1) && f(k2, l2 + 2)){
								b(k2, l2, k2, l2 + 2);
							}
							if(c(k2 - 1, l2 + 1, i1)){
								b(k2, l2, k2 - 1, l2 + 1);
							}
							if(c(k2 + 1, l2 + 1, i1)){
								b(k2, l2, k2 + 1, l2 + 1);
							}
							if(ab == k2 - 1 && z == l2 && f(k2 - 1, l2 + 1) && c(k2 - 1, l2, i1)){
								b(k2, l2, k2 - 1, l2 + 1);
							}
							if(ab == k2 + 1 && z == l2 && f(k2 + 1, l2 + 1) && c(k2 + 1, l2, i1)){
								b(k2, l2, k2 + 1, l2 + 1);
							}
						} else if(i1 == 1){
							if(f(k2, l2 - 1)){
								b(k2, l2, k2, l2 - 1);
							}
							if(l2 == 6 && f(k2, l2 - 1) && f(k2, l2 - 2)){
								b(k2, l2, k2, l2 - 2);
							}
							if(c(k2 - 1, l2 - 1, i1)){
								b(k2, l2, k2 - 1, l2 - 1);
							}
							if(c(k2 + 1, l2 - 1, i1)){
								b(k2, l2, k2 + 1, l2 - 1);
							}
							if(ab == k2 - 1 && z == l2 && f(k2 - 1, l2 - 1) && c(k2 - 1, l2, i1)){
								b(k2, l2, k2 - 1, l2 - 1);
							}
							if(ab == k2 + 1 && z == l2 && f(k2 + 1, l2 - 1) && c(k2 + 1, l2, i1)){
								b(k2, l2, k2 + 1, l2 - 1);
							}
						}
					} else if(eb[k2][l2] == 5 + j1 || eb[k2][l2] == 2 + j1){
						int k1 = k2 - 1;
						int i2;
						for(i2 = l2 - 1; f(k1, i2); i2--){
							b(k2, l2, k1, i2);
							k1--;
						}
						
						if(c(k1, i2, i1)){
							b(k2, l2, k1, i2);
						}
						k1 = k2 + 1;
						for(i2 = l2 - 1; f(k1, i2); i2--){
							b(k2, l2, k1, i2);
							k1++;
						}
						
						if(c(k1, i2, i1)){
							b(k2, l2, k1, i2);
						}
						k1 = k2 - 1;
						for(i2 = l2 + 1; f(k1, i2); i2++){
							b(k2, l2, k1, i2);
							k1--;
						}
						
						if(c(k1, i2, i1)){
							b(k2, l2, k1, i2);
						}
						k1 = k2 + 1;
						for(i2 = l2 + 1; f(k1, i2); i2++){
							b(k2, l2, k1, i2);
							k1++;
						}
						
						if(c(k1, i2, i1)){
							b(k2, l2, k1, i2);
						}
					} else if(eb[k2][l2] == 4 + j1){
						if(d(k2 - 1, l2 + 2, i1)){
							b(k2, l2, k2 - 1, l2 + 2);
						}
						if(d(k2 + 1, l2 + 2, i1)){
							b(k2, l2, k2 + 1, l2 + 2);
						}
						if(d(k2 - 1, l2 - 2, i1)){
							b(k2, l2, k2 - 1, l2 - 2);
						}
						if(d(k2 + 1, l2 - 2, i1)){
							b(k2, l2, k2 + 1, l2 - 2);
						}
						if(d(k2 + 2, l2 - 1, i1)){
							b(k2, l2, k2 + 2, l2 - 1);
						}
						if(d(k2 + 2, l2 + 1, i1)){
							b(k2, l2, k2 + 2, l2 + 1);
						}
						if(d(k2 - 2, l2 - 1, i1)){
							b(k2, l2, k2 - 2, l2 - 1);
						}
						if(d(k2 - 2, l2 + 1, i1)){
							b(k2, l2, k2 - 2, l2 + 1);
						}
					}
					if(eb[k2][l2] == 3 + j1 || eb[k2][l2] == 2 + j1){
						int l1 = k2 - 1;
						int j2;
						for(j2 = l2; f(l1, j2); l1--){
							b(k2, l2, l1, j2);
						}
						
						if(c(l1, j2, i1)){
							b(k2, l2, l1, j2);
						}
						l1 = k2 + 1;
						for(j2 = l2; f(l1, j2); l1++){
							b(k2, l2, l1, j2);
						}
						
						if(c(l1, j2, i1)){
							b(k2, l2, l1, j2);
						}
						l1 = k2;
						for(j2 = l2 - 1; f(l1, j2); j2--){
							b(k2, l2, l1, j2);
						}
						
						if(c(l1, j2, i1)){
							b(k2, l2, l1, j2);
						}
						l1 = k2;
						for(j2 = l2 + 1; f(l1, j2); j2++){
							b(k2, l2, l1, j2);
						}
						
						if(c(l1, j2, i1)){
							b(k2, l2, l1, j2);
						}
					} else if(eb[k2][l2] == 1 + j1){
						if(d(k2 - 1, l2 - 1, i1)){
							b(k2, l2, k2 - 1, l2 - 1);
						}
						if(d(k2, l2 - 1, i1)){
							b(k2, l2, k2, l2 - 1);
						}
						if(d(k2 + 1, l2 - 1, i1)){
							b(k2, l2, k2 + 1, l2 - 1);
						}
						if(d(k2 - 1, l2, i1)){
							b(k2, l2, k2 - 1, l2);
						}
						if(d(k2 + 1, l2, i1)){
							b(k2, l2, k2 + 1, l2);
						}
						if(d(k2 - 1, l2 + 1, i1)){
							b(k2, l2, k2 - 1, l2 + 1);
						}
						if(d(k2, l2 + 1, i1)){
							b(k2, l2, k2, l2 + 1);
						}
						if(d(k2 + 1, l2 + 1, i1)){
							b(k2, l2, k2 + 1, l2 + 1);
						}
						if(!g){
							if(cb && f(k2 - 1, l2) && f(k2 - 2, l2) && f(k2 - 3, l2) && !a(0, 0, 0, 0) && !a(k2, l2, k2 - 1, l2)){
								b(k2, l2, k2 - 2, l2);
							}
							if(bb && f(k2 + 1, l2) && f(k2 + 2, l2) && !a(0, 0, 0, 0) && !a(k2, l2, k2 + 1, l2)){
								b(k2, l2, k2 + 2, l2);
							}
						}
					}
				}
			}
			
		}
		
	}
	
	public void e(){
		n = true;
		s = 0;
		y = 0;
		a(super.q);
		for(int i1 = 0; i1 < s; i1++){
			int j1;
			for(j1 = 0; j1 < y; j1++){
				if(x[j1] == p[i1] && w[j1] == o[i1]){
					break;
				}
			}
			
			if(j1 == y){
				x[y] = p[i1];
				w[y++] = o[i1];
			}
		}
		
	}
	
	public void f(){
		int i1 = l;
		int j1 = k;
		y = 0;
		for(int k1 = 0; k1 < s; k1++){
			if(i1 == p[k1] && j1 == o[k1]){
				x[y] = r[k1];
				w[y++] = q[k1];
			}
		}
		
	}
	
	@Override
	public void d(){
		i++;
		if(lb > 0){
			lb--;
			if(lb == 0){
				eb[kb][jb] = fb;
				b();
			}
		}
		if(!j){
			b(((opencgd.library.EngineApplet) (super.w)).f, ((opencgd.library.EngineApplet) (super.w)).e);
			if(f == super.q && c != -1 && l == -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 1){
				d(c, a);
			}
			if(f == super.q && l != -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 2){
				c();
			}
			if(f == super.q && l != -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 1){
				c(c, a);
			}
			
			((opencgd.library.EngineApplet) (super.w)).hh = 0;
		}
		if(j && ((opencgd.library.EngineApplet) (super.w)).hh == 1){
			if(((opencgd.library.EngineApplet) (super.w)).f > 155 && ((opencgd.library.EngineApplet) (super.w)).f < 205){
				super.connectionStream.setPacketID(254);
				super.connectionStream.addByte(2);
				super.connectionStream.sendPacket();
			}
			if(((opencgd.library.EngineApplet) (super.w)).f > 205 && ((opencgd.library.EngineApplet) (super.w)).f < 255){
				super.connectionStream.setPacketID(254);
				super.connectionStream.addByte(3);
				super.connectionStream.sendPacket();
			}
			if(((opencgd.library.EngineApplet) (super.w)).f > 255 && ((opencgd.library.EngineApplet) (super.w)).f < 305){
				super.connectionStream.setPacketID(254);
				super.connectionStream.addByte(4);
				super.connectionStream.sendPacket();
			}
			if(((opencgd.library.EngineApplet) (super.w)).f > 305 && ((opencgd.library.EngineApplet) (super.w)).f < 355){
				super.connectionStream.setPacketID(254);
				super.connectionStream.addByte(5);
				super.connectionStream.sendPacket();
			}
			j = false;
			n = true;
		}
	}
	
	@Override
	public void g(){
		super.k.b = 279;
		super.k.c = 0;
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 8; j1++){
				eb[i1][j1] = 0;
			}
			
		}
		
		l = -1;
		k = -1;
		m = 0;
		lb = 0;
		cb = true;
		bb = true;
		ab = -1;
		v = false;
		g = false;
		u = false;
		f = 0;
		j = false;
		e();
	}
	
	@Override
	public void h(){
		super.p = 2;
		super.k.a();
		super.k.a("checkers/board.jpg", 0, false);
		super.k.a("chess/all.gif", 1, true, 6, 45, 91);
		for(int i1 = 0; i1 < 6; i1++){
			super.k.a(i1 + 1, i1 + 7);
			super.k.a(i1 + 7);
		}
		
		super.k.a("chess/allr.gif", 13, true, 6, 45, 75);
		for(int j1 = 0; j1 < 6; j1++){
			super.k.a(j1 + 13, j1 + 19);
			super.k.a(j1 + 19);
		}
		
		super.k.a("chess/sel.gif", 26, true);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			n = false;
			int k1 = super.connectionStream.b(super.ab, 1);
			int i2 = super.connectionStream.b(super.ab, 3);
			if(i2 > h){
				u = false;
			}
			h = i2;
			if(!u || f != -1){
				if(f != k1){
					e();
				}
				f = k1;
			}
			return;
		}
		if(i1 == 254){
			for(int l1 = 0; l1 < 8; l1++){
				for(int j2 = 0; j2 < 8; j2++){
					eb[l1][j2] = super.connectionStream.a(super.ab[1 + l1 * 8 + j2]);
				}
				
			}
			
			u = false;
			l = -1;
			k = -1;
			b();
			e();
			return;
		}
		if(i1 == 252){
			hb = super.connectionStream.a(super.ab[1]);
			gb = super.connectionStream.a(super.ab[2]);
			kb = super.connectionStream.a(super.ab[3]);
			jb = super.connectionStream.a(super.ab[4]);
			fb = eb[hb][gb];
			eb[hb][gb] = 0;
			b();
			a(hb, gb, kb, jb, fb);
			return;
		}
		if(i1 == 251){
			j = true;
			n = true;
		}
	}
	
	@Override
	public boolean i(){
		return lb <= 0;
	}
}