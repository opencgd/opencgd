package opencgd.client.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.client.AbstractGame;

public class Dungeon extends AbstractGame {
	
	private String h;
	private int k[];
	private int b[];
	private int d[];
	private int t[][];
	private int j;
	private int g;
	private int f;
	private int e;
	private int o;
	private int l;
	private int p;
	private int m;
	private int n;
	private int x;
	private int ab;
	private int y;
	private int w;
	private int z;
	private int u[];
	private int v[];
	private int a[] = {
			-18, -14, -14, 1, -3, -3
	};
	private int c[] = {
			-6, 6, -18, -6, 6, -18
	};
	private int i[] = {
			0, 1, 2, 1
	};
	private Font r;
	
	public Dungeon(){
		r = new Font("Helvetica", 1, 13);
		v = new int[7];
		u = new int[7];
		x = 20;
		f = 60;
		t = new int[8][5];
		d = new int[6];
		b = new int[6];
		k = new int[12];
		h = "";
	}
	
	@Override
	public void a(){
		super.k.a(0, 0, 50);
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 5; j1++){
				int l1 = 117 + 49 * i1;
				int i3 = 65 + 49 * j1;
				if(i1 == 0 && j1 == 0){
					super.k.b(l1, i3, 19);
				} else if(t[i1][j1] == -1){
					super.k.b(l1, i3, 20 + i[g / 6 & 3]);
				} else if(t[i1][j1] >= 36){
					super.k.b(l1, i3, 23 + (g / 6 & 3));
				}
			}
			
		}
		
		for(int k1 = 0; k1 < 6; k1++){
			if(super.n[k1] != null && (ab == 0 || z != k1)){
				int i2 = 117 + 49 * d[k1];
				int j3 = 65 + 49 * b[k1];
				super.k.a(i2 + c[k1], j3 + a[k1], k1 + 39);
			}
		}
		
		if(ab > 0){
			int j2 = y * x - ab;
			int k3 = j2 / x;
			int j4 = k3 + 1;
			int i5 = j2 % x;
			int k5 = 117 + 49 * v[k3];
			int l5 = 65 + 49 * u[k3];
			int i6 = 117 + 49 * v[j4];
			int j6 = 65 + 49 * u[j4];
			int k6 = (k5 * (x - i5) + i6 * i5) / x;
			int l6 = (l5 * (x - i5) + j6 * i5) / x;
			super.k.a(k6 + c[z], l6 + a[z], z + 39);
		}
		if(p > 0){
			super.k.a(12, 2, 28 + (g / 2 & 3));
		} else if(ab > 0 && o != -1){
			super.k.a(12, 2, 31 + o);
		} else if(e == super.q && j == 0 && ab == 0){
			super.k.a(12, 2, 38);
		}
		if(j == 1 && e == super.q && ((opencgd.client.library.EngineApplet) (super.w)).f > 93 && ((opencgd.client.library.EngineApplet) (super.w)).f < 485 && ((opencgd.client.library.EngineApplet) (super.w)).e > 41 && ((opencgd.client.library.EngineApplet) (super.w)).e < 286){
			int k2 = (((opencgd.client.library.EngineApplet) (super.w)).f - 93) / 49;
			int l3 = (((opencgd.client.library.EngineApplet) (super.w)).e - 41) / 49;
			int k4 = 117 + 49 * k2;
			int j5 = 65 + 49 * l3;
			super.k.b(k4, j5, 23 + (g / 6 & 3));
		}
		if(n != 0){
			int l2 = n;
			if(l2 < 0){
				l2 = 64 + l2;
			}
			int i4 = 5 + (m % 2) * 38;
			int l4 = 65 + (m / 2) * 37;
			super.k.a(i4 - l2 / 2, l4 - l2 / 2, 35 + l2, 36 + l2, 1 + l, 256 - l2 * 4);
		}
		super.k.a(super.u, 6, 6, false);
		super.u.setFont(r);
		super.u.setColor(Color.white);
		if(e == super.q && j == 0){
			super.u.drawString("Your turn - Choose a direction", 95, 20);
		} else if(e == super.q && j == 1){
			super.u.drawString("Teleporter! - Choose any location", 95, 20);
		} else {
			super.u.drawString(super.n[e] + "'s turn - Please wait", 95, 20);
		}
		opencgd.client.library.D.b(super.u, "Time-Remaining:" + f, r, 497, 20);
		super.u.drawString(h, 95, 38);
	}
	
	private void b(){
		super.k.a(0, 0, 0);
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 5; j1++){
				int l1 = 117 + 49 * i1;
				int j2 = 65 + 49 * j1;
				if(t[i1][j1] >= 0 && t[i1][j1] < 18){
					super.k.b(l1, j2, t[i1][j1] + 1);
				}
				if(t[i1][j1] >= 18 && t[i1][j1] < 36){
					super.k.b(l1, j2, (t[i1][j1] + 1) - 18);
					super.k.a(l1 - 24, j2 - 21, 49, 42, 27, 128);
				}
			}
			
		}
		
		for(int k1 = 0; k1 < 12; k1++){
			if(k[k1] != -1){
				int i2 = 5 + (k1 % 2) * 38;
				int k2 = 65 + (k1 / 2) * 37;
				super.k.a(i2, k2, 1 + k[k1]);
			}
		}
		
		super.k.b(50);
	}
	
	@Override
	public void d(){
		g++;
		if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && j == 0 && e == super.q && f > 0){
			int i1 = ((opencgd.client.library.EngineApplet) (super.w)).f - 18;
			int k1 = ((opencgd.client.library.EngineApplet) (super.w)).e - 8;
			if(i1 > 0 && k1 > 0 && i1 < 20 && k1 < 20){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(0);
				super.connectionStream.sendPacket();
			}
			if(i1 > 20 && k1 > 0 && i1 < 40 && k1 < 20){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(1);
				super.connectionStream.sendPacket();
			}
			if(i1 > 40 && k1 > 0 && i1 < 60 && k1 < 20){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(2);
				super.connectionStream.sendPacket();
			}
			if(i1 > 0 && k1 > 20 && i1 < 20 && k1 < 40){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(3);
				super.connectionStream.sendPacket();
			}
			if(i1 > 40 && k1 > 20 && i1 < 60 && k1 < 40){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(4);
				super.connectionStream.sendPacket();
			}
			if(i1 > 0 && k1 > 40 && i1 < 20 && k1 < 60){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(5);
				super.connectionStream.sendPacket();
			}
			if(i1 > 20 && k1 > 40 && i1 < 40 && k1 < 60){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(6);
				super.connectionStream.sendPacket();
			}
			if(i1 > 40 && k1 > 40 && i1 < 60 && k1 < 60){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(7);
				super.connectionStream.sendPacket();
			}
		}
		if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && j == 1 && e == super.q && f > 0 && ((opencgd.client.library.EngineApplet) (super.w)).f > 93 && ((opencgd.client.library.EngineApplet) (super.w)).f < 485 && ((opencgd.client.library.EngineApplet) (super.w)).e > 41 && ((opencgd.client.library.EngineApplet) (super.w)).e < 286){
			int j1 = (((opencgd.client.library.EngineApplet) (super.w)).f - 93) / 49;
			int l1 = (((opencgd.client.library.EngineApplet) (super.w)).e - 41) / 49;
			super.connectionStream.setPacketID(254);
			super.connectionStream.addByte(j1);
			super.connectionStream.addByte(l1);
			super.connectionStream.sendPacket();
		}
		if(p > 0){
			p--;
			if(p == 0){
				ab = y * x;
			}
		}
		if(ab > 0){
			ab--;
			if(ab == 0){
				d[z] = v[y];
				b[z] = u[y];
				t[v[y]][u[y]] = w;
				b();
			}
		}
		if(n > 0){
			n -= 2;
			if(n == 0){
				k[m] = l;
				b();
				return;
			}
		} else if(n < 0){
			n += 2;
		}
	}
	
	@Override
	public void g(){
		super.k.c = 0;
		super.k.b = 290;
		super.k.f = 0;
		super.k.e = 512;
		e = 0;
		f = 60;
		g = 0;
		h = "";
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 5; j1++){
				t[i1][j1] = -1;
			}
			
		}
		
		for(int k1 = 0; k1 < 6; k1++){
			d[k1] = 0;
			b[k1] = 0;
		}
		
		for(int l1 = 0; l1 < 12; l1++){
			k[l1] = -1;
		}
		
		b();
	}
	
	@Override
	public void loadMedia(){
		super.p = 6;
		super.k.a();
		super.k.a("dungeon/caves.jpg", 0, false);
		super.k.a("dungeon/all.gif", 1, true, 18, 35, 36);
		super.k.a("dungeon/bits.gif", 19, true, 9, 49, 42);
		super.k.a("dungeon/compass.gif", 28, true, 11, 60, 60);
		super.k.a("dungeon/players.gif", 39, true, 6, 13, 18);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			e = super.connectionStream.getShort(super.ab, 1);
			f = super.connectionStream.getShort(super.ab, 3);
			j = 0;
			return;
		}
		if(i1 == 254){
			int k1 = 1;
			z = super.ab[k1++];
			y = super.ab[k1++];
			if(y == 0){
				y = 1;
				ab = y * x;
				o = -1;
			} else {
				o = y;
				p = 40;
				ab = 0;
			}
			for(int i2 = 0; i2 <= y; i2++){
				v[i2] = super.ab[k1++];
				u[i2] = super.ab[k1++];
			}
			
			w = super.ab[k1++];
			return;
		}
		if(i1 == 253){
			int l1 = super.ab[1];
			boolean flag = false;
			for(int k2 = 0; k2 < 12; k2++){
				if(k[k2] != l1){
					continue;
				}
				flag = true;
				break;
			}
			
			if(!flag){
				for(int l2 = 0; l2 < 12; l2++){
					if(k[l2] == -1){
						n = 64;
						m = l2;
						l = l1;
						return;
					}
				}
				
				return;
			}
		} else {
			if(i1 == 252){
				byte byte0 = super.ab[1];
				for(int j2 = 0; j2 < 12; j2++){
					if(k[j2] != byte0){
						continue;
					}
					n = -64;
					m = j2;
					l = k[j2];
					k[j2] = -1;
					break;
				}
				
				b();
				return;
			}
			if(i1 == 251){
				e = super.connectionStream.getShort(super.ab, 1);
				f = super.connectionStream.getShort(super.ab, 3);
				j = 1;
				return;
			}
			if(i1 == 250){
				h = new String(super.ab, 1, j1 - 1);
			}
		}
	}
	
	@Override
	public boolean i(){
		if(ab != 0){
			return false;
		}
		if(n != 0){
			return false;
		}
		return p == 0;
	}
}