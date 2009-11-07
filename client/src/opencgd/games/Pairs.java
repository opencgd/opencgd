package opencgd.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.AbstractGame;

public class Pairs extends AbstractGame {
	
	private int l;
	private int t;
	private int r;
	private int s;
	private int j;
	private int u;
	private int k[];
	private int q[][];
	private int e;
	private int d;
	private int c;
	private int i[] = {
			-16, -12, -6, 0
	};
	private int h[] = {
			30, 16, 5, 0
	};
	private int f[] = {
			24, 24, 24, 21
	};
	private int g[] = {
			43, 34, 24, 16
	};
	private int m[] = {
			45, 43, 41, 39
	};
	private int a[] = {
			38, 97, 154, 210
	};
	private int b[] = {
			48, 115, 176, 234
	};
	private Font o;
	private Font n;
	
	public Pairs(){
		n = new Font("Helvetica", 1, 16);
		o = new Font("Helvetica", 1, 13);
		d = 60;
		q = new int[9][4];
		k = new int[6];
	}
	
	@Override
	public void a(){
		super.k.c = 0;
		super.k.a(0, 0, 27);
		if(u > 0){
			int i1 = m[r];
			super.k.c = b[r];
			int l1 = (250 + i1 * (s - 4)) - 36;
			int k2 = a[r];
			int i3 = 19 + r;
			if(r == 0){
				k2 += 3;
				l1++;
				i3++;
			} else {
				k2 += 6;
			}
			int k3;
			if(u < 40){
				k3 = u / 3;
			} else {
				k3 = (80 - u) / 3;
			}
			if(k3 >= 1){
				k2 += 4;
			}
			i3++;
			if(k3 >= 2){
				k2 += 4;
			}
			if(++i3 > 22){
				i3 = 22;
			}
			if(k3 > 2){
				i3 = 20 + k3;
			}
			if(i3 > 26){
				i3 = 26;
			}
			try{
				super.k.a(l1, k2, i3);
			} catch(RuntimeException _ex){
			}
			if(i3 >= 23){
				super.k.c(l1 + g[i3 - 23], k2 + f[i3 - 23], t, i[i3 - 23], h[i3 - 23]);
			}
		}
		if(c == super.q && u == 0){
			for(int j1 = 0; j1 < 4; j1++){
				super.k.c = b[j1];
				int i2 = m[j1];
				for(int l2 = 0; l2 < 9; l2++){
					int j3 = (250 + i2 * (l2 - 4)) - 36;
					int l3 = a[j1];
					int i4 = 19 + j1;
					if(((opencgd.library.EngineApplet) (super.w)).f - 6 > j3 + 16 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < j3 + 55 && ((opencgd.library.EngineApplet) (super.w)).e - 6 > l3 + 10 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < l3 + 67 && q[l2][j1] != 0){
						if(j1 == 0){
							l3 += 3;
							j3++;
							i4++;
						} else {
							l3 += 6;
						}
						super.k.a(j3, l3, i4);
					}
				}
				
			}
			
		}
		super.k.a(super.u, 6, 6, false);
		int k1 = 10;
		super.u.setColor(Color.white);
		super.u.setFont(n);
		for(int j2 = 0; j2 < super.a; j2++){
			if(super.n[j2] != null){
				super.u.drawString(super.n[j2] + ":" + k[j2], k1, 290);
				k1 += 125;
			}
		}
		
		super.u.setFont(o);
		super.u.setColor(Color.white);
		if(c == -1){
			super.u.drawString("Please wait...", 10, 20);
		} else if(c == super.q && j == 0){
			super.u.drawString("Your turn - Select a book", 10, 20);
		} else if(c == super.q){
			super.u.drawString("Your turn - Find the matching book", 10, 20);
		} else {
			super.u.drawString(super.n[c] + "'s turn - Please wait", 10, 20);
		}
		opencgd.library.D.b(super.u, "Time-Remaining:" + d, o, 502, 20);
	}
	
	private void b(){
		super.k.c = 0;
		super.k.a(0, 0, 0);
		for(int i1 = 0; i1 < 4; i1++){
			super.k.c = b[i1];
			int j1 = m[i1];
			for(int k1 = 0; k1 < 9; k1++){
				if(q[k1][i1] == 1){
					int l1 = (250 + j1 * (k1 - 4)) - 36;
					int i2 = a[i1];
					int j2 = 19 + i1;
					if(j2 > 22){
						j2 = 22;
						i2 += 6;
					}
					super.k.a(l1, i2, j2);
				}
			}
			
		}
		
		super.k.b(27);
	}
	
	@Override
	public void d(){
		e++;
		if(u != 0){
			u++;
			if(u >= 40 && l == 1){
				u = 0;
			}
			if(u >= 80){
				u = 0;
				q[s][r] = 1;
				b();
			}
		}
		if(c == super.q && u == 0 && ((opencgd.library.EngineApplet) (super.w)).hh == 1 && d > 0){
			for(int i1 = 0; i1 < 4; i1++){
				int j1 = m[i1];
				for(int k1 = 0; k1 < 9; k1++){
					int l1 = (250 + j1 * (k1 - 4)) - 36;
					int i2 = a[i1];
					if(((opencgd.library.EngineApplet) (super.w)).f - 6 > l1 + 16 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < l1 + 55 && ((opencgd.library.EngineApplet) (super.w)).e - 6 > i2 + 10 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < i2 + 67 && q[k1][i1] != 0){
						super.connectionStream.setPacketID(255);
						super.connectionStream.addByte(k1);
						super.connectionStream.addByte(i1);
						super.connectionStream.addByte(j);
						super.connectionStream.sendPacket();
					}
				}
				
			}
			
		}
	}
	
	@Override
	public void g(){
		super.k.b = 290;
		super.k.c = 0;
		c = 0;
		d = 60;
		e = 0;
		u = 0;
		j = 0;
	}
	
	@Override
	public void h(){
		super.p = 4;
		super.k.a();
		super.k.a("pairs/bookcase.jpg", 0, false);
		super.k.a("pairs/all.gif", 1, true, 18, 47, 41);
		super.k.a("pairs/books.gif", 19, true, 8, 72, 70);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			c = super.connectionStream.b(super.ab, 1);
			d = super.connectionStream.b(super.ab, 3);
			j = super.connectionStream.b(super.ab, 5);
			return;
		}
		if(i1 == 254){
			int k1 = 1;
			for(int l1 = 0; l1 < 9; l1++){
				for(int i2 = 0; i2 < 4; i2++){
					q[l1][i2] = super.connectionStream.a(super.ab[k1++]);
				}
				
			}
			
			b();
			for(int j2 = 0; j2 < 6; j2++){
				k[j2] = super.connectionStream.b(super.ab, k1);
				k1 += 2;
			}
			
			return;
		}
		if(i1 == 253){
			u = 1;
			s = super.connectionStream.b(super.ab, 1);
			r = super.connectionStream.b(super.ab, 3);
			t = super.connectionStream.b(super.ab, 5);
			l = super.connectionStream.b(super.ab, 7);
			q[s][r] = 0;
			b();
		}
	}
	
	@Override
	public boolean i(){
		return u == 0;
	}
}
