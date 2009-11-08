package opencgd.client.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.client.AbstractGame;

public class BattleCruisers extends AbstractGame {
	
	private boolean t;
	private int u;
	private int y[];
	private int z[];
	private int r;
	private int n;
	private int o;
	private int p;
	private int q;
	private int bb;
	private int gb;
	private int eb;
	private int fb;
	private int hb;
	private int c;
	private int h;
	private int d;
	private int i;
	private int ab;
	private int v;
	private int s[] = {
			2, 2, 3, 3, 4, 5
	};
	private int x[] = {
			2, 2, 3, 3, 4, 5
	};
	private int a;
	private int f;
	private int db[][];
	private int m;
	private int l;
	private int k;
	private Color w;
	private Font cb;
	private int b;
	private int g;
	private int e;
	private int j;
	
	public BattleCruisers(){
		j = 25;
		e = 26;
		g = 45;
		b = 32;
		cb = new Font("Helvetica", 1, 13);
		w = new Color(150, 150, 150);
		l = 30;
		db = new int[10][8];
		gb = 50;
		z = new int[50];
		y = new int[50];
		t = false;
	}
	
	@Override
	public void a(){
		if(k != super.q || v == 0){
			super.k.a(0, 0, 22, m, 0);
			for(int i1 = 0; i1 < 8; i1++){
				for(int j1 = 0; j1 < 10; j1++){
					if(db[j1][i1] >= 0 && db[j1][i1] < 64){
						a(j1, i1, db[j1][i1]);
					}
				}
				
			}
			
			for(int k1 = 0; k1 < u; k1++){
				b(z[k1], y[k1], m / 4 & 3);
			}
			
		} else {
			super.k.a(0, 0, 23, m, 1);
		}
		if(v == 1){
			if(hb != 0){
				c(fb, eb, hb);
			}
			if(r > 0){
				super.k.a(130, 105, 240, 95, w, 128, false);
				super.k.b(250, 160, 6 + (n - 2) * 4);
			}
			if(q != 0){
				a(p, o, p, o);
			}
		}
		if(v == 0 && ab == 1 && i != -1){
			a(i, d, h, c);
		}
		super.k.a(super.u, 6, 6, false);
		if(v == 1 && r > 0){
			super.u.setColor(Color.white);
			opencgd.client.library.D.a(super.u, "You sunk a " + n + " ship!", cb, 256, 126);
		}
		super.u.setFont(cb);
		super.u.setColor(Color.white);
		if(v == 0){
			String s1 = "";
			for(int l1 = 0; l1 < 6; l1++){
				if(s[l1] != 0){
					if(s1.length() > 0){
						s1 = s1 + " - ";
					}
					s1 = s1 + s[l1];
				}
			}
			
			if(s1.length() > 0){
				super.u.drawString("Place ships by clicking and dragging on the grid below", 10, 20);
				super.u.drawString("Ships Remaining: " + s1, 10, 35);
				if(((opencgd.client.library.EngineApplet) (super.w)).e >= 25 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 35 && ((opencgd.client.library.EngineApplet) (super.w)).f > 305){
					super.u.setColor(Color.red);
				}
				opencgd.client.library.D.b(super.u, "Click here to place randomly", cb, 502, 35);
				super.u.setColor(Color.white);
				t = false;
			} else {
				t = true;
				super.u.drawString("Waiting for opponent to place ships...", 10, 20);
			}
		}
		if(v == 1){
			if(k == -1){
				super.u.drawString("Please wait...", 10, 20);
			} else if(k == super.q){
				super.u.drawString("Your turn - Make a move!", 10, 20);
				super.u.drawString("Your opponents grid is shown below", 10, 35);
			} else {
				super.u.drawString(super.n[k] + "'s turn - Please wait", 10, 20);
				super.u.drawString("Your remaining ships are shown below", 10, 35);
			}
		}
		opencgd.client.library.D.b(super.u, "Time-Remaining:" + l, cb, 502, 20);
	}
	
	private void a(int i1, int j1){
		z[u] = i1;
		y[u] = j1;
		u++;
	}
	
	private void d(int i1, int j1, int k1){
		super.k.a(0, 0, 23);
		super.k.a(j + i1 * g, e + j1 * b, 24 + k1);
		super.k.b(23);
	}
	
	private void b(){
		super.k.a(0, 0, 0);
		super.k.b(23);
	}
	
	private void c(){
		super.k.a(0, 0, 0);
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 10; j1++){
				if(db[j1][i1] >= 0 && db[j1][i1] < 64){
					e(j1, i1, db[j1][i1]);
				}
			}
			
		}
		
		super.k.b(22);
	}
	
	private void c(int i1, int j1, int k1){
		if(k1 < 0){
			k1 = -k1;
		}
		k1 = (k1 * 290) / gb;
		super.k.a(j + i1 * g + 6, (e + j1 * b) - k1, 1);
	}
	
	private void b(int i1, int j1, int k1){
		super.k.a(j + i1 * g + 6, (e + j1 * b) - 9, k1 + 2);
	}
	
	private void e(int i1, int j1, int k1){
		int l1 = x[k1 & 0xf];
		int i2 = k1 / 32;
		int j2 = 6 + (l1 - 2) * 4 + i2 * 2 + 1;
		int k2 = super.k.h[j2];
		int l2 = super.k.q[j2];
		if(i2 == 0){
			int i3 = j + i1 * g + (g * l1) / 2;
			int k3 = e + j1 * b + b / 2;
			super.k.a(i3 - k2 / 2, k3, k2, l2, j2, 128);
			return;
		} else {
			int j3 = j + i1 * g + g / 2;
			int l3 = e + j1 * b + (b * l1) / 2;
			super.k.a(j3 - k2 / 2, (l3 - l2 / 2) + 14, k2, l2, j2, 128);
			return;
		}
	}
	
	private void a(int i1, int j1, int k1){
		int l1 = x[k1 & 0xf];
		int i2 = k1 / 32;
		int j2 = 6 + (l1 - 2) * 4 + i2 * 2;
		int k2 = super.k.h[j2];
		int l2 = super.k.q[j2];
		if(i2 == 0){
			int i3 = j + i1 * g + (g * l1) / 2;
			int k3 = e + j1 * b + b / 2;
			super.k.a(i3 - k2 / 2, (k3 - l2) + 14, j2);
			return;
		} else {
			int j3 = j + i1 * g + g / 2;
			int l3 = e + j1 * b + (b * l1) / 2;
			super.k.a(j3 - k2 / 2, l3 - l2 / 2, j2);
			return;
		}
	}
	
	private void b(int i1, int j1){
		i1 -= 6;
		if((j1 -= 6) < e || j1 >= e + b * 8 || i1 < j || i1 >= j + g * 10){
			a = -1;
			f = -1;
			return;
		} else {
			f = (i1 - j) / g;
			a = (j1 - e) / b;
			return;
		}
	}
	
	private void c(int i1, int j1){
		if(i1 < 0 || j1 < 0 || i1 > 9 || j1 > 7 || l == 0){
			return;
		}
		if(hb != 0 || bb != 0 || q != 0){
			return;
		}
		if(k != super.q){
			return;
		} else {
			super.connectionStream.setPacketID(253);
			super.connectionStream.addByte(i1);
			super.connectionStream.addByte(j1);
			super.connectionStream.sendPacket();
			q = 10;
			p = i1;
			o = j1;
			return;
		}
	}
	
	@Override
	public void d(){
		m++;
		b(((opencgd.client.library.EngineApplet) (super.w)).f, ((opencgd.client.library.EngineApplet) (super.w)).e);
		if(r > 0){
			r--;
		}
		if(bb > 0){
			bb--;
		}
		if(q > 0){
			q--;
		}
		if(hb < 0){
			hb++;
			if(hb == 0 && k == super.q){
				bb = 40;
				d(fb, eb, 1);
			}
			if(hb == 0 && k != super.q){
				bb = 40;
			}
		}
		if(hb > 0){
			hb--;
			if(hb == 0 && k == super.q){
				bb = 40;
				d(fb, eb, 0);
			}
			if(hb == 0 && k != super.q){
				bb = 60;
				a(fb, eb);
			}
		}
		if(v == 0){
			if(((opencgd.client.library.EngineApplet) (super.w)).e >= 25 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 35 && ((opencgd.client.library.EngineApplet) (super.w)).f > 305 && ((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && !t){
				e();
			}
			b(((opencgd.client.library.EngineApplet) (super.w)).f, ((opencgd.client.library.EngineApplet) (super.w)).e);
			if(f != -1 && ab == 0 && ((opencgd.client.library.EngineApplet) (super.w)).g != 0){
				d(f, a);
			}
			if(f != -1 && ab == 0 && ((opencgd.client.library.EngineApplet) (super.w)).g == 1){
				ab = 1;
				i = f;
				d = a;
			}
			if(f != -1 && ab == 1){
				b(i, d, f, a);
				if(((opencgd.client.library.EngineApplet) (super.w)).g == 0){
					ab = 0;
					a(i, d, h, c, true);
					return;
				}
			} else {
				i = -1;
			}
			return;
		}
		if(v == 1){
			if(r > 0 && ((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
				r = 0;
				((opencgd.client.library.EngineApplet) (super.w)).g = 0;
				((opencgd.client.library.EngineApplet) (super.w)).hh = 0;
			}
			if(k == super.q && f != -1 && ((opencgd.client.library.EngineApplet) (super.w)).g == 1 && k == super.q){
				c(f, a);
			}
		}
	}
	
	private boolean c(int i1, int j1, int k1, int l1){
		if(i1 < 0 || j1 < 0){
			return false;
		}
		int i2 = i1;
		int j2 = j1;
		for(int k2 = 0; k2 < l1; k2++){
			if(i2 >= 10 || j2 >= 8 || db[i2][j2] != -1){
				return false;
			}
			if(k1 == 0){
				i2++;
			} else {
				j2++;
			}
		}
		
		int l2;
		for(l2 = 0; l2 < 6; l2++){
			if(s[l2] == l1){
				s[l2] = 0;
				break;
			}
			if(l2 == 5){
				return false;
			}
		}
		
		i2 = i1;
		j2 = j1;
		for(int i3 = 0; i3 < l1; i3++){
			db[i2][j2] = l2 + 64;
			if(k1 == 0){
				i2++;
			} else {
				j2++;
			}
		}
		
		db[i1][j1] = l2 + k1 * 32;
		super.connectionStream.setPacketID(255);
		super.connectionStream.addShort(l2);
		super.connectionStream.addShort(i1);
		super.connectionStream.addShort(j1);
		super.connectionStream.addShort(k1);
		super.connectionStream.sendPacket();
		return true;
	}
	
	private void a(int i1, int j1, int k1, int l1, boolean flag){
		if(i1 > k1){
			int i2 = i1;
			i1 = k1;
			k1 = i2;
		}
		if(j1 > l1){
			int j2 = j1;
			j1 = l1;
			l1 = j2;
		}
		if(j1 == l1){
			c(i1, j1, 0, (1 + k1) - i1);
			c();
			return;
		}
		if(i1 == k1){
			c(i1, j1, 1, (1 + l1) - j1);
			c();
			return;
		} else {
			return;
		}
	}
	
	private void a(int i1, int j1, int k1, int l1){
		if(i1 < 0 || j1 < 0 || i1 >= 10 || j1 >= 8){
			return;
		}
		if(k1 < 0 || l1 < 0 || k1 >= 10 || l1 >= 8){
			return;
		}
		if(i1 > k1){
			int i2 = i1;
			i1 = k1;
			k1 = i2;
		}
		if(j1 > l1){
			int j2 = j1;
			j1 = l1;
			l1 = j2;
		}
		super.k.a(j + i1 * g, e + j1 * b, ((k1 - i1) + 1) * g, ((l1 - j1) + 1) * b, Color.red, 128, false);
	}
	
	private void b(int i1, int j1, int k1, int l1){
		int i2 = Math.abs(i1 - k1);
		int j2 = Math.abs(j1 - l1);
		if(i2 < j2){
			k1 = i1;
		} else {
			l1 = j1;
		}
		h = k1;
		c = l1;
	}
	
	private void d(int i1, int j1){
		if(i1 < 0 || j1 < 0 || i1 >= 10 || j1 >= 8){
			return;
		}
		if(db[i1][j1] == -1){
			return;
		}
		int k1 = db[i1][j1] & 0xf;
		s[k1] = x[k1];
		for(int l1 = 0; l1 < 10; l1++){
			for(int i2 = 0; i2 < 8; i2++){
				if((db[l1][i2] & 0xf) == k1){
					db[l1][i2] = -1;
				}
			}
			
		}
		
		super.connectionStream.setPacketID(254);
		super.connectionStream.addShort(k1);
		super.connectionStream.sendPacket();
		c();
	}
	
	private void e(){
		f();
		for(int i1 = 0; i1 < 6; i1++){
			int j1;
			int k1;
			int l1;
			for(boolean flag = false; !flag; flag = c(j1, k1, l1, x[i1])){
				j1 = (int) (Math.random() * 10D);
				k1 = (int) (Math.random() * 8D);
				l1 = (int) (Math.random() * 2D);
			}
			
		}
		
		c();
	}
	
	private void f(){
		for(int i1 = 0; i1 < 10; i1++){
			for(int j1 = 0; j1 < 8; j1++){
				db[i1][j1] = -1;
			}
			
		}
		
		ab = 0;
		s[0] = 2;
		s[1] = 2;
		s[2] = 3;
		s[3] = 3;
		s[4] = 4;
		s[5] = 5;
	}
	
	@Override
	public void g(){
		super.k.b = 290;
		super.k.c = 0;
		k = 0;
		r = 0;
		u = 0;
		v = 0;
		hb = 0;
		bb = 0;
		q = 0;
		f();
		c();
		b();
	}
	
	@Override
	public void loadMedia(){
		super.p = 2;
		super.k.a();
		super.k.a("battle/board.jpg", 0, false);
		super.k.a("battle/bits.gif", 1, true, 5, 32, 32);
		super.k.a("battle/ship2.gif", 6, true, 2, 80, 38);
		super.k.a("battle/ship2f.gif", 8, true, 2, 41, 57);
		super.k.a("battle/ship3.gif", 10, true, 2, 121, 50);
		super.k.a("battle/ship3f.gif", 12, true, 2, 40, 87);
		super.k.a("battle/ship4.gif", 14, true, 2, 162, 51);
		super.k.a("battle/ship4f.gif", 16, true, 2, 40, 118);
		super.k.a("battle/ship5.gif", 18, true, 2, 202, 59);
		super.k.a("battle/ship5f.gif", 20, true, 2, 39, 150);
		super.k.a("battle/cross.gif", 24, true, 2, 45, 32);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			v = 0;
			l = super.connectionStream.getShort(super.ab, 1);
			return;
		}
		if(i1 == 254){
			v = 1;
			k = super.connectionStream.getShort(super.ab, 1);
			l = super.connectionStream.getShort(super.ab, 3);
			return;
		}
		if(i1 == 253){
			f();
			for(int k1 = 0; k1 < 6; k1++){
				c(super.connectionStream.getShort(super.ab, 1 + k1 * 6), super.connectionStream.getShort(super.ab, 3 + k1 * 6), super.connectionStream.getShort(super.ab, 5 + k1 * 6), x[k1]);
			}
			
			return;
		}
		if(i1 == 252){
			int l1 = super.connectionStream.a(super.ab[1]);
			int j2 = super.connectionStream.a(super.ab[2]);
			int l2 = super.connectionStream.a(super.ab[3]);
			hb = -gb;
			fb = j2;
			eb = l2;
			k = l1;
			return;
		}
		if(i1 == 251){
			int i2 = super.connectionStream.a(super.ab[1]);
			int k2 = super.connectionStream.a(super.ab[2]);
			int i3 = super.connectionStream.a(super.ab[3]);
			hb = gb;
			fb = k2;
			eb = i3;
			k = i2;
			return;
		}
		if(i1 == 250){
			n = super.connectionStream.a(super.ab[1]);
			r = 80;
		}
	}
	
	@Override
	public boolean i(){
		return hb == 0 && bb == 0 && r == 0;
	}
}