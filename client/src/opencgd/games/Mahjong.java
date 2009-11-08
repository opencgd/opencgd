package opencgd.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.client.AbstractGame;

public class Mahjong extends AbstractGame {
	
	private boolean n;
	private boolean o;
	private int j[];
	private int k[][];
	private boolean bb;
	private String z[];
	private int y[];
	private int ab;
	private int p;
	private int q;
	private int u;
	private int v;
	private boolean w;
	private int t[];
	private int x;
	private int r;
	private int i;
	private int h;
	private int g;
	private int l[] = {
			0, 0, 0, 0, 0, 0, 0, 5, 5, 4, 4, 4, 5, 5
	};
	private int b[] = {
			196, 202, 206, 206, 206, 202, 196, 269, 276, 280, 282, 280, 276, 269
	};
	private int e[] = {
			87, 146, 209, 273, 340, 403, 460, 97, 153, 213, 272, 334, 394, 447
	};
	private int c[] = {
			135, 139, 144, 148, 144, 139, 135, 212, 221, 226, 230, 226, 221, 212
	};
	private int f[] = {
			35, 93, 155, 223, 290, 355, 417, 50, 105, 162, 224, 286, 346, 406
	};
	private int m[] = {
			6, 4, 2, 0, -2, -4, -6, 6, 4, 2, 0, -2, -4, -6
	};
	private int a[] = {
			140, 147, 151, 152, 151, 147, 140, 219, 226, 232, 234, 232, 226, 219
	};
	private int d[] = {
			41, 101, 165, 231, 297, 361, 421, 55, 109, 170, 231, 293, 352, 408
	};
	private Color s;
	private Font db;
	private Font cb;
	
	public Mahjong(){
		cb = new Font("Helvetica", 1, 13);
		db = new Font("Helvetica", 1, 11);
		s = new Color(150, 150, 200);
		h = 60;
		t = new int[14];
		w = false;
		v = 100;
		q = -1;
		ab = -1;
		y = new int[50];
		z = new String[50];
		bb = false;
		k = new int[6][10];
		j = new int[6];
		o = false;
		n = false;
	}
	
	@Override
	public void a(){
		super.k.a(0, 0, 0);
		for(int i1 = 0; i1 < 14; i1++){
			if(t[i1] != 0 && (v != i1 || u % 10 < 5 || u > 75)){
				super.k.d(d[i1], a[i1], t[i1], m[i1], l[i1]);
			}
		}
		
		if(r == 0){
			for(int j1 = 0; j1 < super.m; j1++){
				super.k.a(5, 22 + j1 * 15, 490, 13, s, 128, false);
			}
			
		} else if(r == 1){
			super.k.a(5, 22, 430, 79, s, 128, false);
			super.k.a(439, 22, 35);
			super.k.a(450, 46, x);
		}
		super.k.a(super.u, 6, 6, false);
		if(r == 0){
			super.u.setFont(db);
			super.u.setColor(Color.white);
			int k1 = 0;
			for(int l1 = 0; l1 < super.a; l1++){
				if(super.n[l1] != null){
					String s2 = "";
					if(j[l1] == 0){
						s2 = "none";
					}
					for(int k2 = 0; k2 < j[l1]; k2++){
						int l2 = k[l1][k2];
						int i3;
						for(i3 = l2; i3 >= 100; i3 -= 100){
						}
						String s3 = "";
						String s4 = "";
						int j3 = 0;
						if(i3 <= 9){
							j3 = i3;
							s3 = String.valueOf(j3);
							s4 = "Bamboo";
						} else if(i3 <= 18){
							j3 = i3 - 9;
							s3 = String.valueOf(j3);
							s4 = "Circles";
						} else if(i3 <= 27){
							j3 = i3 - 18;
							s3 = String.valueOf(j3);
							s4 = "Chars";
						} else if(i3 == 28){
							s3 = "N";
							s4 = "Wind";
						} else if(i3 == 29){
							s3 = "E";
							s4 = "Wind";
						} else if(i3 == 30){
							s3 = "S";
							s4 = "Wind";
						} else if(i3 == 31){
							s3 = "W";
							s4 = "Wind";
						} else if(i3 == 32){
							s3 = "R";
							s4 = "Dragon";
						} else if(i3 == 33){
							s3 = "W";
							s4 = "Dragon";
						} else if(i3 == 34){
							s3 = "G";
							s4 = "Dragon";
						}
						if(l2 >= 200){
							s2 = s2 + "" + s3 + s3 + s3 + s3 + "-" + s4 + " ";
						} else if(l2 >= 100){
							s2 = s2 + "" + s3 + s3 + s3 + "-" + s4 + " ";
						} else {
							s2 = s2 + "" + j3 + (j3 + 1) + (j3 + 2) + "-" + s4 + " ";
						}
					}
					
					super.u.drawString(super.n[l1] + " - played: " + s2, 15, 38 + k1);
					k1 += 15;
				}
			}
			
		} else if(r == 1){
			super.u.setFont(db);
			super.u.setColor(Color.white);
			String s1 = "";
			if(x <= 9){
				s1 = "the " + x + " of bamboo";
			} else if(x <= 18){
				s1 = "the " + (x - 9) + " of circles";
			} else if(x <= 27){
				s1 = "the " + (x - 18) + " of charactors";
			} else if(x == 28){
				s1 = "a north wind";
			} else if(x == 29){
				s1 = "an east wind";
			} else if(x == 30){
				s1 = "a south wind";
			} else if(x == 31){
				s1 = "a west wind";
			} else if(x == 32){
				s1 = "a red dragon";
			} else if(x == 33){
				s1 = "a white dragon";
			} else if(x == 34){
				s1 = "a green dragon";
			}
			super.u.drawString(super.n[g] + " has discarded " + s1, 20, 40);
			if(p == 0){
				super.u.drawString("Waiting for other players...", 20, 55);
			} else {
				int i2 = 55;
				for(int j2 = 0; j2 < p; j2++){
					if(ab == j2){
						super.u.setColor(Color.red);
					} else {
						super.u.setColor(Color.white);
					}
					super.u.drawString(z[j2], 20, i2);
					i2 += 15;
				}
				
				if(ab == p){
					super.u.setColor(Color.red);
				} else {
					super.u.setColor(Color.white);
				}
				super.u.drawString("Don't claim", 20, i2);
			}
		}
		if(o && g == super.q && r == 0){
			super.u.setColor(Color.white);
			if(((opencgd.client.library.EngineApplet) (super.w)).f >= 156 && ((opencgd.client.library.EngineApplet) (super.w)).f <= 356 && ((opencgd.client.library.EngineApplet) (super.w)).e >= 118 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 134){
				super.u.setColor(Color.red);
			}
			opencgd.client.library.D.a(super.u, "Click here to declare kong", cb, 256, 126);
		}
		if(n && g == super.q && r == 0){
			super.u.setColor(Color.white);
			if(((opencgd.client.library.EngineApplet) (super.w)).f >= 156 && ((opencgd.client.library.EngineApplet) (super.w)).f <= 356 && ((opencgd.client.library.EngineApplet) (super.w)).e >= 118 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 134){
				super.u.setColor(Color.red);
			}
			opencgd.client.library.D.a(super.u, "Click here to declare mahjong!", cb, 256, 126);
		}
		super.u.setFont(cb);
		super.u.setColor(Color.white);
		if(r == 0){
			if(g == -1){
				super.u.drawString("Please wait...", 10, 20);
			} else if(g == super.q){
				super.u.drawString("Your turn - Choose a brick to discard", 10, 20);
			} else {
				super.u.drawString(super.n[g] + "'s turn - Please wait", 10, 20);
			}
		}
		opencgd.client.library.D.b(super.u, "Time-Remaining:" + h, cb, 502, 20);
	}
	
	@Override
	public void d(){
		i++;
		u++;
		if(g == super.q && ((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && !w && r == 0 && h > 0){
			for(int i1 = 0; i1 < 14; i1++){
				if(((opencgd.client.library.EngineApplet) (super.w)).f - 6 <= f[i1] || ((opencgd.client.library.EngineApplet) (super.w)).f - 6 >= e[i1] || ((opencgd.client.library.EngineApplet) (super.w)).e - 6 <= c[i1] || ((opencgd.client.library.EngineApplet) (super.w)).e - 6 >= b[i1] || t[i1] == 0){
					continue;
				}
				t[i1] = 0;
				super.connectionStream.setPacketID(255);
				super.connectionStream.addShort(i1);
				super.connectionStream.sendPacket();
				w = true;
				break;
			}
			
		}
		if(r == 1 && p > 0 && h > 0){
			if(((opencgd.client.library.EngineApplet) (super.w)).e > 45 && ((opencgd.client.library.EngineApplet) (super.w)).f > 20 && ((opencgd.client.library.EngineApplet) (super.w)).f < 400){
				ab = (((opencgd.client.library.EngineApplet) (super.w)).e - 45) / 15;
				if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && ab < p){
					super.connectionStream.setPacketID(254);
					super.connectionStream.addShort(y[ab]);
					super.connectionStream.sendPacket();
					p = 0;
				} else if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1 && ab == p){
					super.connectionStream.setPacketID(254);
					super.connectionStream.addShort(0);
					super.connectionStream.sendPacket();
					p = 0;
				}
			} else {
				ab = -1;
			}
		}
		if(g == super.q && !w){
			o = false;
			n = false;
			for(int j1 = 0; j1 < j[super.q]; j1++){
				for(int k1 = 0; k1 < 14; k1++){
					if(t[k1] == k[super.q][j1] - 100){
						o = true;
					}
				}
				
			}
			
			for(int l1 = 0; l1 < 14; l1++){
				int i2 = t[l1];
				int j2 = 0;
				for(int k2 = 0; k2 < 14; k2++){
					if(t[k2] == i2 && i2 != 0){
						j2++;
					}
				}
				
				if(j2 >= 4){
					o = true;
				}
			}
			
			if(g == super.q && !w && a(t)){
				n = true;
				o = false;
			}
			if(o && g == super.q && r == 0 && ((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
				super.connectionStream.setPacketID(253);
				super.connectionStream.sendPacket();
				return;
			}
			if(n && g == super.q && r == 0 && ((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
				super.connectionStream.setPacketID(252);
				super.connectionStream.sendPacket();
			}
		}
	}
	
	@Override
	public void g(){
		super.k.b = 290;
		super.k.c = 0;
		w = false;
		r = 0;
		g = 0;
		h = 60;
		i = 0;
		v = -1;
		x = 0;
		q = -1;
		bb = false;
		p = 0;
		o = false;
		n = false;
		for(int i1 = 0; i1 < 14; i1++){
			t[i1] = 0;
		}
		
		for(int j1 = 0; j1 < 6; j1++){
			j[j1] = 0;
		}
		
	}
	
	@Override
	public void loadMedia(){
		super.p = 6;
		super.k.a();
		super.k.a("mahjong/bricks.jpg", 0, false);
		super.k.a("mahjong/all.gif", 1, true, 34, 35, 50);
		super.k.a("mahjong/brick.gif", 35, true);
	}
	
	private void a(int i1, boolean flag, boolean flag1){
		int ai[] = new int[14];
		p = 0;
		if(g == super.q){
			bb = true;
			return;
		}
		int j1 = 1 + (i1 - 1) % 9;
		int k1 = 0;
		int ai1[] = new int[16];
		int l1 = -1;
		int i2 = -1;
		int j2 = -1;
		int k2 = -1;
		for(int l2 = 0; l2 < 13; l2++){
			int i3 = t[l2];
			if(i3 == i1){
				ai1[k1++] = l2;
			}
			if(t[l2] <= 27 && i1 <= 27){
				if(i3 == i1 - 2 && j1 > 2){
					l1 = l2;
				} else if(i3 == i1 - 1 && j1 > 1){
					i2 = l2;
				} else if(i3 == i1 + 1 && j1 < 9){
					j2 = l2;
				} else if(i3 == i1 + 2 && j1 < 8){
					k2 = l2;
				}
			}
		}
		
		if(l1 != -1 && i2 != -1){
			for(int j3 = 0; j3 < 14; j3++){
				ai[j3] = t[j3];
			}
			
			ai[l1] = 0;
			ai[i2] = 0;
			if(a(ai)){
				y[p] = 65;
				z[p++] = "Claim for sequence " + (j1 - 2) + (j1 - 1) + j1 + " (mahjong!)";
			} else if(q == super.q && !flag){
				y[p] = 1;
				z[p++] = "Claim for sequence " + (j1 - 2) + (j1 - 1) + j1 + " (chow)";
			}
		}
		if(i2 != -1 && j2 != -1){
			for(int k3 = 0; k3 < 14; k3++){
				ai[k3] = t[k3];
			}
			
			ai[i2] = 0;
			ai[j2] = 0;
			if(a(ai)){
				y[p] = 66;
				z[p++] = "Claim for sequence " + (j1 - 1) + j1 + (j1 + 1) + " (mahjong!)";
			} else if(q == super.q && !flag){
				y[p] = 2;
				z[p++] = "Claim for sequence " + (j1 - 1) + j1 + (j1 + 1) + " (chow)";
			}
		}
		if(j2 != -1 && k2 != -1){
			for(int l3 = 0; l3 < 14; l3++){
				ai[l3] = t[l3];
			}
			
			ai[j2] = 0;
			ai[k2] = 0;
			if(a(ai)){
				y[p] = 67;
				z[p++] = "Claim for sequence " + j1 + (j1 + 1) + (j1 + 2) + " (mahjong!)";
			} else if(q == super.q && !flag){
				y[p] = 3;
				z[p++] = "Claim for sequence " + j1 + (j1 + 1) + (j1 + 2) + " (chow)";
			}
		}
		if(k1 >= 1){
			for(int i4 = 0; i4 < 14; i4++){
				ai[i4] = t[i4];
			}
			
			ai[ai1[0]] = 0;
			if(a(ai)){
				y[p] = 68;
				z[p++] = "Claim for pair (mahjong!)";
			}
		}
		if(k1 >= 2){
			for(int j4 = 0; j4 < 14; j4++){
				ai[j4] = t[j4];
			}
			
			ai[ai1[0]] = 0;
			ai[ai1[1]] = 0;
			if(a(ai)){
				y[p] = 69;
				z[p++] = "Claim for triplet (mahjong!)";
			} else if(!flag1){
				y[p] = 5;
				z[p++] = "Claim for triplet (pung)";
			}
		}
		if(k1 >= 3 && !flag1){
			y[p] = 6;
			z[p++] = "Claim for quadruplet (kong)";
		}
		for(int k4 = 0; k4 < j[super.q]; k4++){
			if(k[super.q][k4] == i1 + 100){
				y[p] = 7;
				z[p++] = "Claim for quadruplet (kong)";
			}
		}
		
		if(p == 0){
			super.connectionStream.setPacketID(254);
			super.connectionStream.addShort(0);
			super.connectionStream.sendPacket();
		}
		bb = true;
	}
	
	private boolean a(int ai[]){
		int ai1[] = new int[14];
		for(int i1 = 0; i1 < 14; i1++){
			int j1 = ai[i1];
			if(j1 != 0){
				int l1 = 0;
				for(int j2 = 0; j2 < 14; j2++){
					ai1[j2] = ai[j2];
				}
				
				for(int k2 = 0; k2 < 14; k2++){
					if(ai1[k2] == j1){
						ai1[k2] = 0;
						l1++;
					}
					if(l1 != 3){
						continue;
					}
					if(a(ai1)){
						return true;
					}
					break;
				}
				
				if(j1 <= 27){
					int l2 = 1 + (j1 - 1) % 9;
					int i3 = -1;
					int j3 = -1;
					for(int k3 = 0; k3 < 13; k3++){
						if(ai[k3] <= 27){
							int l3 = ai[k3];
							if(l3 == j1 + 1 && l2 < 9){
								i3 = k3;
							} else if(l3 == j1 + 2 && l2 < 8){
								j3 = k3;
							}
						}
					}
					
					if(i3 != -1 && j3 != -1){
						for(int i4 = 0; i4 < 14; i4++){
							ai1[i4] = ai[i4];
						}
						
						ai1[i3] = 0;
						ai1[j3] = 0;
						ai1[i1] = 0;
						if(a(ai1)){
							return true;
						}
					}
				}
			}
		}
		
		int k1 = -1;
		for(int i2 = 0; i2 < 14; i2++){
			if(ai[i2] != 0){
				if(ai[i2] != 0 && k1 == -1){
					k1 = ai[i2];
				} else if(ai[i2] != 0 && ai[i2] == k1){
					k1 = 99;
				} else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			g = super.connectionStream.getShort(super.ab, 1);
			h = super.connectionStream.getShort(super.ab, 3);
			r = 0;
			if(g != super.q){
				w = false;
			}
			bb = false;
			return;
		}
		if(i1 == 254){
			v = super.connectionStream.getShort(super.ab, 1);
			u = 0;
			for(int k1 = 0; k1 < 14; k1++){
				t[k1] = super.connectionStream.getShort(super.ab, k1 * 2 + 3);
			}
			
			return;
		}
		if(i1 == 253){
			g = super.connectionStream.getShort(super.ab, 1);
			h = super.connectionStream.getShort(super.ab, 3);
			x = super.connectionStream.getShort(super.ab, 5);
			q = super.connectionStream.getShort(super.ab, 7);
			r = 1;
			w = false;
			if(!bb){
				a(x, false, false);
				return;
			}
		} else {
			if(i1 == 252 && p > 0){
				int l1 = super.connectionStream.getShort(super.ab, 1);
				int j2 = super.connectionStream.getShort(super.ab, 3);
				int l2 = super.q - g;
				if(l2 <= 0){
					l2 += 10;
				}
				int j3 = l1 - g;
				if(j3 <= 0){
					l2 += 10;
				}
				if(j2 >= 64 && j3 < l2){
					p = 0;
					super.connectionStream.setPacketID(254);
					super.connectionStream.addShort(0);
					super.connectionStream.sendPacket();
					return;
				}
				if(j2 < 64){
					a(x, true, false);
					return;
				} else {
					a(x, true, true);
					return;
				}
			}
			if(i1 == 251){
				int i2 = super.connectionStream.getShort(super.ab, 1);
				int k2 = super.connectionStream.getShort(super.ab, 3);
				j[i2] = k2;
				for(int i3 = 0; i3 < k2; i3++){
					k[i2][i3] = super.connectionStream.getShort(super.ab, 5 + i3 * 2);
				}
				
			}
		}
	}
	
	@Override
	public boolean i(){
		return true;
	}
}
