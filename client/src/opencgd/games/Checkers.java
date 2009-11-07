package opencgd.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.AbstractGame;

public class Checkers extends AbstractGame {
	
	private boolean s;
	private boolean l;
	private int y;
	private int v;
	private int z;
	private int ab;
	private int w;
	private int x;
	private int bb;
	private int o;
	private int p;
	private int k;
	private int i;
	private int j;
	private int m[];
	private int n[];
	private int q;
	private int a;
	private int c;
	private int u[][];
	private int h;
	private int g;
	private int f;
	private int r[] = {
			1, 4, 2, 5
	};
	private Font t;
	private int d[] = {
			22, 78, 136, 194, 250, 308, 366, 422, 480
	};
	private int e[] = {
			110, 145, 180, 215, 250, 285, 320, 355, 390
	};
	private int b[] = {
			22, 43, 65, 91, 119, 151, 188, 230, 278
	};
	
	public Checkers(){
		t = new Font("Helvetica", 1, 13);
		g = 30;
		u = new int[8][8];
		n = new int[32];
		m = new int[32];
		j = -1;
		i = -1;
		p = -1;
		o = -1;
		y = 25;
		l = true;
		s = false;
	}
	
	@Override
	public void a(){
		super.k.b = 290;
		super.k.a(0, 0, 6);
		super.k.b = 279;
		if(bb > 0){
			a(x, w, ab, z, r[v], bb, y);
		}
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 7; j1 >= 0; j1--){
				if(u[i1][j1] != -1){
					a(i1, j1, r[u[i1][j1]]);
				}
			}
			
		}
		
		if(bb > 0){
			b(x, w, ab, z, r[v], bb, y);
		} else if(h % 20 < 10 && f == super.q && !l){
			for(int k1 = 0; k1 < q; k1++){
				a(n[k1], m[k1]);
			}
			
		}
		super.k.a(super.u, 6, 6, false);
		super.u.setFont(t);
		super.u.setColor(Color.white);
		if(f == -1){
			super.u.drawString("Please wait...", 10, 20);
		} else if(f == super.q){
			super.u.drawString("Your turn - Make a move!", 10, 20);
		} else {
			super.u.drawString(super.n[f] + "'s turn - Please wait", 10, 20);
		}
		opencgd.library.D.b(super.u, "Time-Remaining:" + g, t, 502, 20);
	}
	
	private void b(){
		super.k.b = 290;
		super.k.a(0, 0, 0);
		super.k.b = 279;
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 7; j1 >= 0; j1--){
				if(u[i1][j1] != -1){
					b(i1, j1, r[u[i1][j1]]);
				}
			}
			
		}
		
		super.k.b(6);
	}
	
	private void b(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		j1 = 7 - j1;
		l1 = 7 - l1;
		int l2 = (b[j1] + b[j1 + 1]) / 2 + 4;
		int i3 = (e[i1] + e[i1 + 1]) / 2;
		int j3 = (d[i1] + d[i1 + 1]) / 2;
		int k3 = (i3 * (b[8] - l2) + j3 * (l2 - b[0])) / (b[8] - b[0]);
		int l3 = 27 + (19 * j1) / 7;
		int i4 = 27 + (18 * j1) / 7;
		int j4 = (b[l1] + b[l1 + 1]) / 2 + 4;
		int k4 = (e[k1] + e[k1 + 1]) / 2;
		int l4 = (d[k1] + d[k1 + 1]) / 2;
		int i5 = (k4 * (b[8] - j4) + l4 * (j4 - b[0])) / (b[8] - b[0]);
		int j5 = 27 + (19 * l1) / 7;
		int k5 = 27 + (18 * l1) / 7;
		int l5 = (k3 * j2 + i5 * (k2 - j2)) / k2;
		int i6 = (l2 * j2 + j4 * (k2 - j2)) / k2;
		int j6 = (l3 * j2 + j5 * (k2 - j2)) / k2;
		int k6 = (i4 * j2 + k5 * (k2 - j2)) / k2;
		if((ab - x > 1 || ab - x < -1) && j2 < k2 / 2){
			i6 -= j2 * 2;
		}
		if((ab - x > 1 || ab - x < -1) && j2 >= k2 / 2){
			i6 -= (k2 - j2) * 2;
		}
		super.k.b(l5 - j6 / 2, i6 - k6 / 2 - 4 - k6 / 6, j6, k6, i2);
	}
	
	private void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		j1 = 7 - j1;
		l1 = 7 - l1;
		int l2 = (b[j1] + b[j1 + 1]) / 2 + 4;
		int i3 = (e[i1] + e[i1 + 1]) / 2;
		int j3 = (d[i1] + d[i1 + 1]) / 2;
		int k3 = (i3 * (b[8] - l2) + j3 * (l2 - b[0])) / (b[8] - b[0]);
		int l3 = 27 + (19 * j1) / 7;
		int i4 = 27 + (18 * j1) / 7;
		int j4 = (b[l1] + b[l1 + 1]) / 2 + 4;
		int k4 = (e[k1] + e[k1 + 1]) / 2;
		int l4 = (d[k1] + d[k1 + 1]) / 2;
		int i5 = (k4 * (b[8] - j4) + l4 * (j4 - b[0])) / (b[8] - b[0]);
		int j5 = 27 + (19 * l1) / 7;
		int k5 = 27 + (18 * l1) / 7;
		int l5 = (k3 * j2 + i5 * (k2 - j2)) / k2;
		int i6 = (l2 * j2 + j4 * (k2 - j2)) / k2;
		int j6 = (l3 * j2 + j5 * (k2 - j2)) / k2;
		int k6 = (i4 * j2 + k5 * (k2 - j2)) / k2;
		if((ab - x > 1 || ab - x < -1) && j2 < k2 / 2){
			i6 += j2 * 2;
		}
		if((ab - x > 1 || ab - x < -1) && j2 >= k2 / 2){
			i6 += (k2 - j2) * 2;
		}
		if(i2 == 1 || i2 == 4){
			super.k.a(l5 - j6 / 2, i6 - k6 / 2 - 4, j6, k6, i2, 128);
			return;
		} else {
			super.k.a(l5 - j6 / 2, (i6 - k6 / 2 - 4) + k6 / 6, j6, k6, i2, 128);
			return;
		}
	}
	
	private void a(int i1, int j1, int k1){
		j1 = 7 - j1;
		int l1 = (b[j1] + b[j1 + 1]) / 2 + 4;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[8] - l1) + j2 * (l1 - b[0])) / (b[8] - b[0]);
		int l2 = 27 + (19 * j1) / 7;
		int i3 = 27 + (18 * j1) / 7;
		super.k.b(k2 - l2 / 2, l1 - i3 / 2 - 4 - i3 / 6, l2, i3, k1);
	}
	
	private void b(int i1, int j1, int k1){
		j1 = 7 - j1;
		int l1 = (b[j1] + b[j1 + 1]) / 2 + 4;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[8] - l1) + j2 * (l1 - b[0])) / (b[8] - b[0]);
		int l2 = 27 + (19 * j1) / 7;
		int i3 = 27 + (18 * j1) / 7;
		if(k1 == 1 || k1 == 4){
			super.k.a(k2 - l2 / 2, l1 - i3 / 2 - 4, l2, i3, k1, 128);
			return;
		} else {
			super.k.a(k2 - l2 / 2, (l1 - i3 / 2 - 4) + i3 / 6, l2, i3, k1, 128);
			return;
		}
	}
	
	private void a(int i1, int j1){
		int k1 = (u[i1][j1] + 4) / 2;
		j1 = 7 - j1;
		int l1 = (b[j1] + b[j1 + 1]) / 2 + 4;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[8] - l1) + j2 * (l1 - b[0])) / (b[8] - b[0]);
		int l2 = 27 + (19 * j1) / 7;
		int i3 = 27 + (18 * j1) / 7;
		super.k.b(k2 - l2 / 2, l1 - i3 / 2 - 4 - (k1 * i3) / 6, l2, i3, 3);
	}
	
	private void b(int i1, int j1){
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
			a = 7 - k1;
			break;
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
			if(i1 < ai[i2 + 1]){
				c = i2;
				return;
			}
		}
		
	}
	
	private void c(int i1, int j1){
		if(i1 == -1 || j1 == -1 || g == 0){
			return;
		}
		if(j == -1){
			return;
		}
		if(s){
			return;
		}
		if(f != super.q){
			return;
		}
		for(int k1 = 0; k1 < q; k1++){
			if(n[k1] == i1 && m[k1] == j1){
				break;
			}
			if(k1 == q - 1){
				return;
			}
		}
		
		f = -1;
		s = true;
		super.connectionStream.setPacketID(255);
		super.connectionStream.addByte(j);
		super.connectionStream.addByte(i);
		super.connectionStream.addByte(i1);
		super.connectionStream.addByte(j1);
		super.connectionStream.sendPacket();
		bb = y;
		x = j;
		w = i;
		ab = i1;
		z = j1;
		v = u[x][w];
		u[x][w] = -1;
		b();
		j = -1;
		i = -1;
	}
	
	private void c(){
		if(j == -1){
			return;
		}
		if(f != super.q){
			return;
		} else {
			j = -1;
			i = -1;
			e();
			return;
		}
	}
	
	private void d(int i1, int j1){
		if(i1 == -1 || j1 == -1){
			return;
		}
		if(u[i1][j1] != super.q && u[i1][j1] != super.q + 2){
			return;
		}
		if(j != -1){
			return;
		}
		if(f != super.q){
			return;
		}
		for(int k1 = 0; k1 < q; k1++){
			if(n[k1] == i1 && m[k1] == j1){
				break;
			}
			if(k1 == q - 1){
				return;
			}
		}
		
		j = i1;
		i = j1;
		k = u[i1][j1];
		f();
	}
	
	private void e(){
		l = true;
		q = 0;
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 8; j1++){
				if((p == -1 || p == i1 && o == j1) && (u[i1][j1] == super.q || u[i1][j1] == super.q + 2)){
					if(i1 > 1 && j1 < 6 && u[i1 - 1][j1 + 1] % 2 != super.q && u[i1 - 1][j1 + 1] % 2 != -1 && u[i1 - 2][j1 + 2] == -1){
						n[q] = i1;
						m[q++] = j1;
					} else if(i1 < 6 && j1 < 6 && u[i1 + 1][j1 + 1] % 2 != super.q && u[i1 + 1][j1 + 1] % 2 != -1 && u[i1 + 2][j1 + 2] == -1){
						n[q] = i1;
						m[q++] = j1;
					} else if(u[i1][j1] == 2 || u[i1][j1] == 3){
						if(i1 > 1 && j1 > 1 && u[i1 - 1][j1 - 1] % 2 != super.q && u[i1 - 1][j1 - 1] % 2 != -1 && u[i1 - 2][j1 - 2] == -1){
							n[q] = i1;
							m[q++] = j1;
						} else if(i1 < 6 && j1 > 1 && u[i1 + 1][j1 - 1] % 2 != super.q && u[i1 + 1][j1 - 1] % 2 != -1 && u[i1 + 2][j1 - 2] == -1){
							n[q] = i1;
							m[q++] = j1;
						}
					}
				}
			}
			
		}
		
		if(q != 0){
			return;
		}
		for(int k1 = 0; k1 < 8; k1++){
			for(int l1 = 0; l1 < 8; l1++){
				if(u[k1][l1] == super.q || u[k1][l1] == super.q + 2){
					if(k1 > 0 && l1 < 7 && u[k1 - 1][l1 + 1] == -1){
						n[q] = k1;
						m[q++] = l1;
					} else if(k1 < 7 && l1 < 7 && u[k1 + 1][l1 + 1] == -1){
						n[q] = k1;
						m[q++] = l1;
					} else if(u[k1][l1] == 2 || u[k1][l1] == 3){
						if(k1 > 0 && l1 > 0 && u[k1 - 1][l1 - 1] == -1){
							n[q] = k1;
							m[q++] = l1;
						} else if(k1 < 7 && l1 > 0 && u[k1 + 1][l1 - 1] == -1){
							n[q] = k1;
							m[q++] = l1;
						}
					}
				}
			}
			
		}
		
	}
	
	private void f(){
		int i1 = j;
		int j1 = i;
		q = 0;
		if(i1 > 1 && j1 < 6 && u[i1 - 1][j1 + 1] % 2 != super.q && u[i1 - 1][j1 + 1] != -1 && u[i1 - 2][j1 + 2] == -1){
			n[q] = i1 - 2;
			m[q++] = j1 + 2;
		}
		if(i1 < 6 && j1 < 6 && u[i1 + 1][j1 + 1] % 2 != super.q && u[i1 + 1][j1 + 1] != -1 && u[i1 + 2][j1 + 2] == -1){
			n[q] = i1 + 2;
			m[q++] = j1 + 2;
		}
		if(k == 2 || k == 3){
			if(i1 > 1 && j1 > 1 && u[i1 - 1][j1 - 1] % 2 != super.q && u[i1 - 1][j1 - 1] % 2 != -1 && u[i1 - 2][j1 - 2] == -1){
				n[q] = i1 - 2;
				m[q++] = j1 - 2;
			}
			if(i1 < 6 && j1 > 1 && u[i1 + 1][j1 - 1] % 2 != super.q && u[i1 + 1][j1 - 1] % 2 != -1 && u[i1 + 2][j1 - 2] == -1){
				n[q] = i1 + 2;
				m[q++] = j1 - 2;
			}
		}
		if(q != 0){
			return;
		}
		if(i1 > 0 && j1 < 7 && u[i1 - 1][j1 + 1] == -1){
			n[q] = i1 - 1;
			m[q++] = j1 + 1;
		}
		if(i1 < 7 && j1 < 7 && u[i1 + 1][j1 + 1] == -1){
			n[q] = i1 + 1;
			m[q++] = j1 + 1;
		}
		if(k == 2 || k == 3){
			if(i1 > 0 && j1 > 0 && u[i1 - 1][j1 - 1] == -1){
				n[q] = i1 - 1;
				m[q++] = j1 - 1;
			}
			if(i1 < 7 && j1 > 0 && u[i1 + 1][j1 - 1] == -1){
				n[q] = i1 + 1;
				m[q++] = j1 - 1;
			}
		}
	}
	
	@Override
	public void d(){
		h++;
		if(bb > 0){
			bb--;
			if(bb == 0){
				u[ab][z] = v;
				b();
			}
		}
		b(((opencgd.library.EngineApplet) (super.w)).f, ((opencgd.library.EngineApplet) (super.w)).e);
		if(f == super.q && c != -1 && j == -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 1){
			d(c, a);
		}
		if(f == super.q && j != -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 2){
			c();
		}
		if(f == super.q && j != -1 && ((opencgd.library.EngineApplet) (super.w)).hh == 1){
			c(c, a);
		}
		super.w.hh = 0;
	}
	
	@Override
	public void g(){
		super.k.b = 279;
		super.k.c = 0;
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 8; j1++){
				u[i1][j1] = -1;
			}
			
		}
		
		j = -1;
		i = -1;
		k = 0;
		p = -1;
		o = -1;
		bb = 0;
		s = false;
		f = 0;
		e();
	}
	
	@Override
	public void h(){
		super.p = 2;
		super.k.a();
		super.k.a("checkers/board.jpg", 0, false);
		super.k.a("checkers/checkers.gif", 1, true, 3, 46, 45);
		super.k.a(1, 4);
		super.k.a(1);
		super.k.a(2, 5);
		super.k.a(2);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			l = false;
			int k1 = super.connectionStream.b(super.ab, 1);
			int i2 = super.connectionStream.b(super.ab, 3);
			if(i2 > g){
				s = false;
			}
			g = i2;
			if(!s || f != -1){
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
					u[l1][j2] = super.ab[1 + l1 * 8 + j2];
				}
				
			}
			
			s = false;
			p = -1;
			o = -1;
			j = -1;
			i = -1;
			b();
			e();
			return;
		}
		if(i1 == 253){
			g = 60;
			f = super.connectionStream.a(super.ab[1]);
			if(f == super.q){
				p = super.connectionStream.a(super.ab[2]);
				o = super.connectionStream.a(super.ab[3]);
			}
			if(super.q == 1){
				p = 7 - p;
				o = 7 - o;
			}
			e();
			return;
		}
		if(i1 == 252){
			bb = y;
			x = super.connectionStream.a(super.ab[1]);
			w = super.connectionStream.a(super.ab[2]);
			ab = super.connectionStream.a(super.ab[3]);
			z = super.connectionStream.a(super.ab[4]);
			if(super.q == 1){
				x = 7 - x;
				w = 7 - w;
				ab = 7 - ab;
				z = 7 - z;
			}
			v = u[x][w];
			u[x][w] = -1;
			b();
		}
	}
	
	@Override
	public boolean i(){
		return bb <= 0;
	}
}
