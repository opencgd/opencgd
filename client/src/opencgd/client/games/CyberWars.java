package opencgd.client.games;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import opencgd.client.AbstractGame;

public class CyberWars extends AbstractGame {
	
	private int jc;
	private int hc;
	private int ic;
	private int zc;
	private int nc;
	private int mc;
	private int kb[];
	private int mb;
	private int ib;
	private int jb;
	private int lb;
	private int eb;
	private int gb;
	private int fb;
	private int hb;
	private int xc;
	private int pe;
	private int a;
	private int be;
	private int kd;
	private int ld;
	private int md;
	private int c;
	private int d;
	private int e;
	private String bc;
	private int ac;
	private int yb;
	private int zb;
	private int cc;
	private int ie;
	private int oc;
	private int pc;
	private int rc;
	private int sc;
	private int je;
	private int sd[];
	private int od[];
	private int qd[];
	private int pd[];
	private int rd[];
	private int td[];
	private int nd[];
	private int uc;
	private int ob;
	private int pb;
	private int qb;
	private int ne[];
	private int oe[];
	private int le[];
	private int me[];
	private boolean vc;
	private int dc;
	private int ec;
	private int bd;
	private int rb;
	private int w;
	private int x;
	private int l;
	private int ab;
	private int j;
	private int kc;
	private int lc;
	private int f;
	private int ce[][];
	private int de[][];
	private int ee[][];
	private int fe[][];
	private int ge[][];
	private int z;
	private int yc[];
	private int bb[];
	private boolean hd;
	private int sb;
	private int p[];
	private int nb[];
	private int s[];
	private int t[];
	private int v[];
	private int u[];
	private int r[];
	private int ub[];
	private int q[];
	private int wb[];
	private int xb[];
	private int y[];
	private int o[];
	private String tb[];
	private String cb[];
	private int qc;
	private String i;
	private int h;
	private Color gd;
	private int k;
	private int n;
	private int vb;
	private Font ae;
	private Font zd;
	private Font yd;
	private Font wd;
	private Font xd;
	private Font vd;
	private Font ud;
	private Font db;
	
	private int fc[] = {
			0, 1, 2, 1
	};
	private boolean g;
	
	public CyberWars(){
		g = false;
		gd = new Color(230, 230, 230);
		i = "";
		qc = 55;
		hd = false;
		bb = new int[18];
		yc = new int[18];
		ge = new int[15][9];
		fe = new int[15][9];
		ee = new int[15][9];
		de = new int[15][9];
		ce = new int[15][9];
		lc = -1;
		kc = -1;
		x = -1;
		w = -1;
		vc = false;
		me = new int[300];
		le = new int[300];
		oe = new int[300];
		ne = new int[300];
		nd = new int[8];
		td = new int[8];
		rd = new int[8];
		pd = new int[8];
		qd = new int[8];
		od = new int[8];
		sd = new int[8];
		bc = "";
		pe = 3;
		jb = 25;
		kb = new int[100];
		mc = 18;
		nc = 5;
	}
	
	private void a(int i1, int j1, int k1){
		if(i1 < 0 || j1 < 0 || i1 >= 15 || j1 >= 9){
			return;
		} else {
			super.k.a(i1 * 32 + 10, j1 * 32 + 2, 122 + k1);
			return;
		}
	}
	
	private int a(int i1, int j1, int k1, int l1){
		int i2 = i1 - k1;
		if(i2 < 0){
			i2 = -i2;
		}
		int j2 = j1 - l1;
		if(j2 < 0){
			j2 = -j2;
		}
		int k2 = 0;
		for(; i2 > 0 && j2 > 0; j2--){
			k2 += 3;
			i2--;
		}
		
		return k2 + i2 + i2 + j2 + j2;
	}
	
	private boolean b(int i1, int j1, int k1, int l1){
		if(i1 < 0 || j1 < 0 || i1 >= 15 || j1 >= 9){
			return false;
		}
		if(k1 < 0 || l1 < 0 || k1 >= 15 || l1 >= 9){
			return false;
		}
		if(i1 == k1 && j1 == l1){
			return true;
		}
		int i2 = i1 - k1;
		if(i2 < 0){
			i2 = -i2;
		}
		int j2 = j1 - l1;
		if(j2 < 0){
			j2 = -j2;
		}
		int k2 = (i1 << 8) + 128;
		int l2 = (j1 << 8) + 128;
		int i3 = 256;
		int j3 = 256;
		int k3;
		if(i2 > j2){
			j3 = (j2 << 8) / i2;
			k3 = i2;
		} else {
			i3 = (i2 << 8) / j2;
			k3 = j2;
		}
		if(k1 < i1){
			i3 = -i3;
		}
		if(l1 < j1){
			j3 = -j3;
		}
		for(int l3 = 0; l3 < k3 - 1; l3++){
			k2 += i3;
			l2 += j3;
			if(ge[k2 - 4 >> 8][l2 - 4 >> 8] != 255 || ge[k2 + 4 >> 8][l2 - 4 >> 8] != 255 || ge[k2 - 4 >> 8][l2 + 4 >> 8] != 255 || ge[k2 + 4 >> 8][l2 + 4 >> 8] != 255){
				return false;
			}
		}
		
		return true;
	}
	
	private void b(){
		super.connectionStream.setPacketID(246);
		super.connectionStream.sendPacket();
		n = 18;
		vb = 5;
	}
	
	private void c(){
		super.connectionStream.setPacketID(250);
		super.connectionStream.sendPacket();
	}
	
	private void e(){
		super.connectionStream.setPacketID(248);
		super.connectionStream.sendPacket();
	}
	
	private void f(){
		super.connectionStream.setPacketID(253);
		super.connectionStream.sendPacket();
	}
	
	private void b(int i1, int j1, int k1){
		if(i1 == -1 || j1 == -1 || k1 != 1){
			return;
		}
		if(ge[i1][j1] == 255 || fe[i1][j1] != bd){
			return;
		} else {
			super.connectionStream.setPacketID(252);
			super.connectionStream.addByte(i1);
			super.connectionStream.addByte(j1);
			super.connectionStream.sendPacket();
			me[0] = i1;
			le[0] = j1;
			oe[0] = 15;
			ne[0] = 10;
			return;
		}
	}
	
	private void a(int i1, int j1){
		super.connectionStream.setPacketID(249);
		super.connectionStream.addByte(i1);
		super.connectionStream.addByte(j1);
		super.connectionStream.sendPacket();
	}
	
	private void c(int i1, int j1, int k1){
		if(i1 == -1 || j1 == -1){
			return;
		}
		if(k1 == 4 || k1 == 5 || k1 == 6){
			return;
		} else {
			super.connectionStream.setPacketID(247);
			super.connectionStream.addByte(i1);
			super.connectionStream.addByte(j1);
			super.connectionStream.sendPacket();
			me[0] = i1;
			le[0] = j1;
			oe[0] = 15;
			ne[0] = 10;
			return;
		}
	}
	
	private void d(int i1, int j1, int k1){
		if(i1 == -1 || j1 == -1){
			return;
		}
		if(k1 == 4 || k1 == 5 || k1 == 6){
			return;
		} else {
			super.connectionStream.setPacketID(251);
			super.connectionStream.addByte(i1);
			super.connectionStream.addByte(j1);
			super.connectionStream.sendPacket();
			me[0] = i1;
			le[0] = j1;
			oe[0] = 15;
			ne[0] = 10;
			return;
		}
	}
	
	private void e(int i1, int j1, int k1){
		if(i1 == -1 || j1 == -1 || k1 != 1){
			return;
		}
		if(wb[ab] == 0){
			i1 = ec;
			j1 = dc;
		}
		super.connectionStream.setPacketID(254);
		super.connectionStream.addByte(i1);
		super.connectionStream.addByte(j1);
		super.connectionStream.sendPacket();
		me[0] = i1;
		le[0] = j1;
		oe[0] = 50;
		ne[0] = 2;
	}
	
	private void b(int i1, int j1){
		super.connectionStream.setPacketID(255);
		super.connectionStream.addByte(i1);
		super.connectionStream.addByte(j1);
		super.connectionStream.sendPacket();
		sb = i1;
		vb = 2;
		n = 16;
	}
	
	private void a(int i1){
		int j1 = yc[i1];
		sb = i1;
		if(o[j1] == 0){
			vb = 2;
			n = 15;
			return;
		} else {
			b(i1, 0);
			return;
		}
	}
	
	private void f(int i1, int j1, int k1){
		if(k1 >= 21 && k1 <= 24){
			return;
		} else {
			ee[i1][j1] = k1;
			return;
		}
	}
	
	private void l(){
		vb = 4;
		n = 14;
	}
	
	private void c(int i1, int j1){
		if(i1 < 0 || i1 >= qc + 16){
			return;
		}
		if(i1 >= 16){
			zc = i1;
		} else {
			zc = j1;
		}
		vb = 7;
		n = 22;
	}
	
	private void b(int i1){
		if(i1 < 0 || i1 >= qc){
			return;
		} else {
			zc = i1 + 16;
			vb = 3;
			n = 13;
			return;
		}
	}
	
	private void a(Graphics g1, int i1, int j1, int k1, int l1, Color color){
		int i2 = color.getRed();
		int j2 = color.getGreen();
		int k2 = color.getBlue();
		for(int l2 = 7; l2 >= 0; l2--){
			int i3 = i2 - l2 * 32;
			if(i3 < 0){
				i3 = 0;
			}
			int j3 = j2 - l2 * 32;
			if(j3 < 0){
				j3 = 0;
			}
			int k3 = k2 - l2 * 32;
			if(k3 < 0){
				k3 = 0;
			}
			g1.setColor(new Color(i3, j3, k3));
			g1.drawLine(i1 - l2, j1 - l2, i1 + k1 + l2, j1 - l2);
			g1.drawLine(i1 - l2, j1 - l2, i1 - l2, j1 + l1);
			g1.drawLine(i1 + k1 + l2, j1 - l2, i1 + k1 + l2, j1 + l1);
			int l3 = l2 / 2;
			g1.drawLine(i1 + l3, j1 + l3, (i1 + k1) - l3, j1 + l3);
			g1.drawLine(i1 + l3, j1 + l3, i1 + l3, j1 + l1);
			g1.drawLine((i1 + k1) - l3, j1 + l3, (i1 + k1) - l3, j1 + l1);
		}
		
	}
	
	private void b(Graphics g1, int i1, int j1, int k1, int l1, Color color){
		g1.setColor(Color.black);
		g1.fillRect(i1, j1, k1, l1);
		int i2 = color.getRed();
		int j2 = color.getGreen();
		int k2 = color.getBlue();
		for(int l2 = 7; l2 >= 0; l2--){
			int i3 = i2 - l2 * 32;
			if(i3 < 0){
				i3 = 0;
			}
			int j3 = j2 - l2 * 32;
			if(j3 < 0){
				j3 = 0;
			}
			int k3 = k2 - l2 * 32;
			if(k3 < 0){
				k3 = 0;
			}
			g1.setColor(new Color(i3, j3, k3));
			g1.drawRect(i1 - l2, j1 - l2, k1 + l2 + l2, l1 + l2 + l2);
			int l3 = l2 / 2;
			g1.drawRect(i1 + l3, j1 + l3, k1 - l3 - l3, l1 - l3 - l3);
		}
		
	}
	
	public void a(){
		super.u.setColor(new Color(0, 104, 130));
		super.u.fillRect(0, 0, 512, 6);
		super.u.setColor(Color.black);
		super.u.drawLine(5, 5, 507, 5);
		if(vb == 5 || vb == 6){
			super.k.b(0, 0, 500, 290, Color.black);
			for(int i1 = 0; i1 < 15; i1++){
				for(int i2 = 0; i2 < 9; i2++){
					int j3 = ge[i1][i2];
					if(j3 != 255){
						int k5 = -1;
						if(j3 < 16){
							k5 = 122 + j3 * 4 + fc[(k / 6) % 4];
						} else if(j3 < 46){
							j3 -= 16;
							k5 = 2 + j3 * 4 + fc[(k / 6) % 4];
						} else {
							j3 -= 46;
							k5 = 226 + j3 * 4 + (k / 6) % 4;
						}
						super.k.a(i1 * 32 + 10, i2 * 32 + 2, k5);
					} else if(ee[i1][i2] != 255){
						super.k.a(i1 * 32 + 10, i2 * 32 + 2, 2 + ee[i1][i2] * 4 + 3);
					}
				}
				
			}
			
			boolean flag = false;
			if(n == 19 && de[pb][ob] != 255){
				char c1;
				if(pb < 7){
					c1 = '\u01B5';
				} else {
					c1 = '\024';
				}
				if(((opencgd.client.library.EngineApplet) (super.w)).e >= 20 && ((opencgd.client.library.EngineApplet) (super.w)).f >= c1 && ((opencgd.client.library.EngineApplet) (super.w)).f <= c1 + 55 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 60){
					flag = true;
				}
			}
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 16 && ((opencgd.client.library.EngineApplet) (super.w)).e > 13 && ((opencgd.client.library.EngineApplet) (super.w)).f < 496 && ((opencgd.client.library.EngineApplet) (super.w)).e < 297 && f == bd && !flag){
				x = (((opencgd.client.library.EngineApplet) (super.w)).f - 16) / 32;
				w = (((opencgd.client.library.EngineApplet) (super.w)).e - 9) / 32;
				rb = 1;
				if(n == 17 && wb[ab] > 0){
					if(a(ec, dc, x, w) / 2 > wb[ab]){
						rb = 4;
					} else if(wb[ab] != 20 && !b(ec, dc, x, w)){
						rb = 6;
					}
					int k3 = ab;
					int l5 = x;
					int i8 = w;
					if(o[k3] == 0 && ge[l5][i8] != 255){
						rb = 5;
					}
					if(o[k3] == 1 && ge[l5][i8] != 255 && wb[k3] > 0){
						rb = 5;
					}
					if(k3 == 42){
						if(ge[l5][i8] == 255 || fe[l5][i8] == bd){
							rb = 5;
						} else if(ge[l5][i8] >= 16 && xb[ge[l5][i8] - 16] <= 0){
							rb = 5;
						}
					}
					if(k3 == 43){
						if(ge[l5][i8] == 255 || fe[l5][i8] == bd){
							rb = 5;
						} else if(ge[l5][i8] >= 16 && xb[ge[l5][i8] - 16] >= 0){
							rb = 5;
						}
					}
					if((k3 == 44 || k3 == 45 || k3 == 47 || k3 == 54) && (ge[l5][i8] == 255 || fe[l5][i8] == bd)){
						rb = 5;
					}
					if(k3 == 46 && ge[l5][i8] == 255){
						rb = 5;
					}
					if(k3 == 52 && (ee[l5][i8] == 255 || ge[l5][i8] != 255)){
						rb = 5;
					}
					if(k3 == 53 && ge[l5][i8] != 255){
						rb = 5;
					}
					if((k3 == 46 || k3 == 47) && (de[l5][i8] != 255 || ge[l5][i8] < 16)){
						rb = 5;
					}
				}
				if(n == 18 && (ge[x][w] == 255 || fe[x][w] != bd)){
					rb = 5;
				}
				if(n == 19 || n == 20){
					int i6;
					int j8;
					if(qb < 16){
						j8 = rd[qb];
						i6 = sd[qb];
					} else {
						j8 = r[qb - 16];
						i6 = nb[qb - 16];
					}
					int k10 = a(pb, ob, x, w) / 2;
					if(k10 > j8 && j8 != 0 || k10 > 1 && i6 == 0){
						rb = 4;
					} else if(ge[x][w] == 47){
						if(ge[pb][ob] < 16 && de[x][w] == 255){
							rb = 7;
						} else if(de[x][w] != 255 && ce[x][w] != bd){
							rb = 3;
						} else {
							rb = 5;
						}
					} else if(ge[x][w] != 255 && fe[x][w] == bd){
						if(ge[x][w] < 16 || p[ge[x][w] - 16] == 0 || ge[pb][ob] >= 16){
							rb = 5;
						} else {
							rb = 7;
						}
					} else if(ge[x][w] != 255 && ge[x][w] >= 16 && ub[ge[x][w] - 16] == 0){
						rb = 5;
					} else if(ge[x][w] != 255){
						rb = 3;
					} else if(i6 == 1){
						rb = 2;
					} else {
						int j12 = pb;
						int k13 = ob;
						if(x == j12 && w < k13){
							rb = 8;
						} else if(x > j12 && w < k13){
							rb = 9;
						} else if(x > j12 && w == k13){
							rb = 10;
						} else if(x > j12 && w > k13){
							rb = 11;
						} else if(x == j12 && w > k13){
							rb = 12;
						} else if(x < j12 && w > k13){
							rb = 13;
						} else if(x < j12 && w == k13){
							rb = 14;
						} else if(x < j12 && w < k13){
							rb = 15;
						}
					}
					if(j8 == 0 && (k10 > 1 || rb != 3)){
						rb = 4;
					}
					if(n == 20 && (rb != 3 || k10 > 1)){
						rb = 5;
					}
				}
				if(n == 21){
					int j6;
					if(qb < 16){
						j6 = qd[qb];
					} else {
						j6 = v[qb - 16];
					}
					rb = 7;
					int k8 = a(pb, ob, x, w) / 2;
					if(k8 > j6){
						rb = 4;
					} else if(!b(pb, ob, x, w)){
						rb = 6;
					}
					if(ge[x][w] == 255){
						rb = 5;
					} else if(ge[x][w] == 47){
						if(de[x][w] == 255 || ce[x][w] == bd){
							rb = 5;
						}
					} else if(fe[x][w] == bd){
						rb = 5;
					}
				}
				super.k.a(x * 32 + 10, w * 32 + 2, rb + 286);
			} else {
				x = -1;
				w = -1;
				rb = 0;
			}
			if(cc > 16){
				int l3 = (64 - cc) / 2;
				for(int k6 = 0; k6 < l3; k6++){
					a(zb - k6, yb, ac * 4 + 3 * ((cc + k6) % 2));
					a(zb + k6, yb, ac * 4 + 3 * ((cc + k6) % 2));
					a(zb, yb - k6, ac * 4 + 3 * ((cc + k6) % 2));
					a(zb, yb + k6, ac * 4 + 3 * ((cc + k6) % 2));
				}
				
			}
			for(int i4 = 0; i4 < 300; i4++){
				if(oe[i4] > 0){
					super.k.a(me[i4] * 32 + 10, le[i4] * 32 + 2, 178 + ne[i4] * 4 + (oe[i4] / 4) % 4);
				}
			}
			
			if(lb != 0){
				int l6 = lb;
				if(l6 < 0){
					l6 = -lb;
				}
				int l8 = hb * 32 + 10;
				int l10 = fb * 32 + 2;
				int k12 = gb * 32 + 10;
				int l13 = eb * 32 + 2;
				int i14 = (l8 * l6 + k12 * (jb - l6)) / jb;
				int j14 = (l10 * l6 + l13 * (jb - l6)) / jb;
				super.k.a(i14, j14, 250 + ib * 4 + (l6 / 4) % 4);
			}
			if(n == 17){
				super.k.a(ic * 32 + 10, hc * 32 + 2, 302 + (jc / 6) % 2);
			}
			if(n == 19 && de[pb][ob] != 255 && !vc){
				if(pb < 7){
					super.k.a(431, 14, 1);
				} else {
					super.k.a(14, 14, 1);
				}
			}
			super.k.a(super.u, 6, 6, false);
			if(n == 19 || n == 20){
				a(super.u, 14, 7, 484, 289, Color.red);
			} else if(n == 21){
				a(super.u, 14, 7, 484, 289, Color.magenta);
			} else {
				a(super.u, 14, 7, 484, 289, Color.blue);
			}
			if(cc > 0){
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString(bc, 12, 12);
			} else if(h > 0){
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString(i, 12, 12);
			} else if(n == 17){
				String s7 = "";
				if(l <= 35){
					s7 = s7 + super.n[f] + ":";
				}
				if(l <= 20){
					s7 = s7 + " " + cb[ab] + ":";
				}
				if(l <= 5){
					s7 = s7 + " " + wb[ab];
				}
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString(s7, 12, 12);
				if(f == bd){
					super.u.drawString("Click target square", 225, 12);
				} else {
					super.u.drawString("Please wait...", 225, 12);
				}
			} else if(f != bd && n >= 18 && n <= 21){
				String s8 = "";
				if(super.n[f] != null){
					s8 = super.n[f].trim() + "'s Turn - Please wait...";
				}
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString(s8, 12, 12);
			} else if(n == 18){
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString("Your Turn - Click on creature", 12, 12);
				super.u.setColor(gd);
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 210 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 13 && ((opencgd.client.library.EngineApplet) (super.w)).f < 360){
					super.u.setColor(Color.red);
				}
				super.u.drawString("Click here to end turn", 215, 12);
			} else if(n == 19){
				String s14 = "Movement points left: " + uc / 2;
				if(uc % 2 == 1){
					s14 = s14 + "\275";
				}
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString(s14, 12, 12);
				super.u.setColor(gd);
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 210 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 13 && ((opencgd.client.library.EngineApplet) (super.w)).f < 360){
					super.u.setColor(Color.red);
				}
				super.u.drawString("Click here to abort", 225, 12);
			} else if(n == 20){
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString("Engaged To Enemy!", 12, 12);
				super.u.setColor(gd);
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 210 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 13 && ((opencgd.client.library.EngineApplet) (super.w)).f < 360){
					super.u.setColor(Color.red);
				}
				super.u.drawString("Click here to abort", 225, 12);
			} else if(n == 21){
				int k9;
				if(qb < 16){
					k9 = qd[qb];
				} else {
					k9 = v[qb - 16];
				}
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString("Ranged Combat: " + k9, 12, 12);
				super.u.setColor(gd);
				if(((opencgd.client.library.EngineApplet) (super.w)).f > 210 && ((opencgd.client.library.EngineApplet) (super.w)).e <= 13 && ((opencgd.client.library.EngineApplet) (super.w)).f < 360){
					super.u.setColor(Color.red);
				}
				super.u.drawString("Click here to abort", 225, 12);
			}
			if(cc == 0){
				super.u.setColor(gd);
				super.u.setFont(ae);
				super.u.drawString("Time-Remaining:" + j, 378, 12);
			}
		}
		if(vb == 4){
			super.k.b(0, 0, 500, 290, Color.black);
			for(int j1 = 0; j1 < 15; j1++){
				for(int j2 = 0; j2 < 9; j2++){
					int j4 = ge[j1][j2];
					if(j4 != 255){
						int i7 = -1;
						if(j4 < 16){
							i7 = 122 + j4 * 4 + fc[(k / 6) % 4];
						} else if(j4 < 46){
							j4 -= 16;
							i7 = 2 + j4 * 4 + fc[(k / 6) % 4];
						} else {
							j4 -= 46;
							i7 = 226 + j4 * 4 + (k / 6) % 4;
						}
						super.k.a(j1 * 32 + 10, j2 * 32 + 2, i7);
					} else if(ee[j1][j2] != 255){
						super.k.a(j1 * 32 + 10, j2 * 32 + 2, 2 + ee[j1][j2] * 4 + 3);
					}
				}
				
			}
			
			if(((opencgd.client.library.EngineApplet) (super.w)).f > 16 && ((opencgd.client.library.EngineApplet) (super.w)).e > 13 && ((opencgd.client.library.EngineApplet) (super.w)).f < 496 && ((opencgd.client.library.EngineApplet) (super.w)).e < 297 && f == bd){
				x = (((opencgd.client.library.EngineApplet) (super.w)).f - 16) / 32;
				w = (((opencgd.client.library.EngineApplet) (super.w)).e - 9) / 32;
				rb = 1;
				super.k.a(x * 32 + 10, w * 32 + 2, rb + 286);
			}
			if(cc > 16){
				int k2 = (64 - cc) / 2;
				for(int k4 = 0; k4 < k2; k4++){
					a(zb - k4, yb, ac * 4 + 3 * ((cc + k4) % 2));
					a(zb + k4, yb, ac * 4 + 3 * ((cc + k4) % 2));
					a(zb, yb - k4, ac * 4 + 3 * ((cc + k4) % 2));
					a(zb, yb + k4, ac * 4 + 3 * ((cc + k4) % 2));
				}
				
			}
			for(int l2 = 0; l2 < 300; l2++){
				if(oe[l2] > 0){
					super.k.a(me[l2] * 32 + 10, le[l2] * 32 + 2, 178 + ne[l2] * 4 + (oe[l2] / 4) % 4);
				}
			}
			
			super.k.a(super.u, 6, 6, false);
			a(super.u, 14, 7, 484, 289, Color.blue);
			if(cc > 0){
				super.u.setFont(ae);
				super.u.setColor(Color.yellow);
				super.u.drawString(bc, 12, 12);
			} else {
				super.u.setFont(ae);
				super.u.setColor(gd);
				if(((opencgd.client.library.EngineApplet) (super.w)).e <= 13 && ((opencgd.client.library.EngineApplet) (super.w)).f > 8 && ((opencgd.client.library.EngineApplet) (super.w)).f < 192){
					super.u.setColor(Color.red);
				}
				super.u.drawString("Back to previous screen", 12, 12);
				super.u.setColor(gd);
				super.u.drawString("Time-Remaining:" + j, 378, 12);
			}
		}
		if(vb == 3 || vb == 7){
			super.k.a(0, 0, 0);
			super.k.a(super.u, 6, 6, false);
			b(super.u, 96, 16, 320, 249, Color.blue);
			int k1 = 195;
			String s1 = "";
			if(zc >= 16){
				int l4 = zc - 16;
				super.u.setColor(gd);
				opencgd.client.library.D.a(super.u, cb[l4], ud, 256, 34);
				String as[] = {
						"Beam-down", "Special", "Equip-commander", "Special"
				};
				String as1[] = {
						"Mechanoid (2)", "Mechanoid (1)", "Neutral", "Alien (1)", "Alien (2)"
				};
				if(o[l4] != 0){
					opencgd.client.library.D.a(super.u, "Action type: " + as[o[l4]], vd, 256, 104);
					int k11 = y[l4];
					if(xb[l4] > 0 && a > 0){
						k11 += 10 * (a / pe);
					}
					if(xb[l4] < 0 && a < 0){
						k11 += 10 * (-a / pe);
					}
					if(k11 > 100){
						k11 = 100;
					}
					opencgd.client.library.D.a(super.u, "Success Probability: " + k11 + "%", vd, 256, 127);
					int l12 = xb[l4];
					if(l12 >= 3 || l12 <= -3){
						l12 /= 3;
					}
					opencgd.client.library.D.a(super.u, "Alignment: " + as1[l12 + 2], vd, 256, 149);
					opencgd.client.library.D.a(super.u, "Range: " + wb[l4], vd, 256, 171);
				}
				if(o[l4] == 0){
					opencgd.client.library.D.a(super.u, "Action type: " + as[o[l4]], vd, 256, 64);
					int l11 = y[l4];
					if(xb[l4] > 0 && a > 0){
						l11 += 10 * (a / pe);
					}
					if(xb[l4] < 0 && a < 0){
						l11 += 10 * (-a / pe);
					}
					if(l11 > 100){
						l11 = 100;
					}
					opencgd.client.library.D.a(super.u, "Beam-down Probability: " + l11 + "%", vd, 256, 87);
					opencgd.client.library.D.a(super.u, "Alignment: " + as1[xb[l4] + 2], vd, 256, 109);
					opencgd.client.library.D.a(super.u, "Range: " + wb[l4], vd, 256, 131);
					super.u.setFont(db);
					opencgd.client.library.D.a(super.u, "Strength:" + q[l4], wd, 181, 157);
					opencgd.client.library.D.a(super.u, "Defence:" + ub[l4], wd, 181, 182);
					opencgd.client.library.D.a(super.u, "Speed:" + r[l4], wd, 181, 207);
					opencgd.client.library.D.a(super.u, "Resistance:" + u[l4], wd, 331, 157);
					opencgd.client.library.D.a(super.u, "Combat-Range:" + v[l4], wd, 331, 182);
					String s15 = "";
					if(s[l4] == 1){
						s15 = s15 + "(Slime)";
					}
					if(nb[l4] == 1){
						s15 = s15 + "(Flying)";
					}
					if(p[l4] == 1){
						s15 = s15 + "(Transport)";
					}
					if(s15 == ""){
						s15 = "(no special)";
					}
					opencgd.client.library.D.a(super.u, s15, wd, 331, 207);
					k1 = 230;
				}
				s1 = tb[l4];
			} else {
				int i5 = zc;
				super.u.setColor(gd);
				opencgd.client.library.D.a(super.u, "Commander", ud, 256, 41);
				opencgd.client.library.D.a(super.u, "Name: " + super.n[i5], vd, 256, 64);
				super.u.setFont(db);
				opencgd.client.library.D.a(super.u, "Strength:" + nd[i5], db, 181, 107);
				opencgd.client.library.D.a(super.u, "Defence:" + td[i5], db, 181, 132);
				opencgd.client.library.D.a(super.u, "Speed:" + rd[i5], db, 181, 157);
				opencgd.client.library.D.a(super.u, "Resistance:" + pd[i5], db, 331, 107);
				opencgd.client.library.D.a(super.u, "Combat-Range:" + qd[i5], db, 331, 132);
				String s13 = "";
				if(sd[i5] == 1){
					s13 = s13 + "(Flying)";
				}
				if(s13 == ""){
					s13 = "(no special)";
				}
				opencgd.client.library.D.a(super.u, s13, db, 331, 157);
				k1 = 200;
				s1 = "Commanders, are the most important piece in the game. Kill all the enemy command" + "ers to win!";
			}
			String s6 = "";
			int j7 = 0;
			for(int l9 = 0; l9 < s1.length(); l9++){
				if(j7 > 32 && s1.charAt(l9) == ' '){
					opencgd.client.library.D.a(super.u, s6, db, 256, k1 + 7);
					k1 += 17;
					s6 = "";
					j7 = 0;
				} else {
					s6 = s6 + s1.charAt(l9);
					j7++;
				}
			}
			
			if(j7 > 0){
				opencgd.client.library.D.a(super.u, s6, db, 256, k1 + 7);
			}
			super.u.setColor(gd);
			if(((opencgd.client.library.EngineApplet) (super.w)).e < 295 && ((opencgd.client.library.EngineApplet) (super.w)).e > 275 && ((opencgd.client.library.EngineApplet) (super.w)).f > 64 && ((opencgd.client.library.EngineApplet) (super.w)).f < 192){
				super.u.setColor(Color.red);
			}
			opencgd.client.library.D.a(super.u, "Back to previous screen", yd, 120, 285);
			super.u.setColor(gd);
			opencgd.client.library.D.a(super.u, "Time-Remaining:" + j, yd, 392, 285);
		}
		if(vb == 2){
			super.k.a(0, 0, 0);
			if(hd){
				int l1 = 20;
				int i3 = 46;
				for(int j5 = 0; j5 < 18; j5++){
					int k7 = bb[j5];
					if(k7 != 255){
						int i10 = -1;
						if(o[k7] == 0){
							i10 = 2 + k7 * 4 + fc[(k / 6) % 4];
						}
						if(o[k7] == 1){
							i10 = 226 + (k7 - 30) * 4 + (k / 6) % 4;
						}
						if(o[k7] == 2){
							i10 = 122 + ((k7 - 36) + 8) * 4 + fc[(k / 6) % 4];
						}
						if(o[k7] == 3){
							byte byte0 = 2;
							if(k7 == 42 || k7 == 46){
								byte0 = 6;
							}
							if(k7 == 43 || k7 == 47){
								byte0 = 5;
							}
							if(k7 == 44 || k7 == 45){
								byte0 = 0;
							}
							if(k7 == 53 || k7 == 54){
								byte0 = 7;
							}
							i10 = (178 + byte0 * 4 + 3) - (k / 4) % 4;
						}
						if(i10 != -1){
							super.k.a((l1 + 1) - 6, (i3 + 1) - 6, i10);
						}
						if((i3 += 34) > 230){
							i3 = 46;
							l1 += 160;
						}
					}
				}
				
			}
			super.k.a(super.u, 6, 6, false);
			Color color = new Color(0, 103, 128);
			Color color1 = new Color(1, 166, 201);
			Color color2 = new Color(192, 192, 192);
			int l7 = 20;
			int j10 = 46;
			z = 0;
			for(int i12 = 0; i12 < 18; i12++){
				int i13 = bb[i12];
				if(i13 != 255){
					yc[z++] = i13;
					super.u.setColor(Color.black);
					super.u.fillRect(l7 + 34, j10, 118, 34);
					super.u.setColor(color);
					super.u.drawRect(l7, j10, 152, 34);
					super.u.drawRect(l7, j10, 34, 34);
					super.u.setColor(color2);
					if(hd){
						opencgd.client.library.D.a(super.u, cb[i13], ae, l7 + 93, j10 + 18);
					}
					if((j10 += 34) > 230){
						j10 = 46;
						l7 += 160;
					}
				}
			}
			
			super.u.setColor(color1);
			opencgd.client.library.D.a(super.u, "Choose an action - For more info right click an icon", xd, 256, 34);
			int j13 = a / pe;
			super.u.setColor(color2);
			if(j13 == 0){
				opencgd.client.library.D.a(super.u, "World alignment - Neutral", yd, 256, 267);
			} else if(j13 < 0){
				opencgd.client.library.D.a(super.u, "World alignment - Mechanoid " + -j13, yd, 256, 267);
			} else if(j13 > 0){
				opencgd.client.library.D.a(super.u, "World alignment - Alien " + j13, yd, 256, 267);
			}
			if(n == 12){
				super.u.setColor(color2);
				if(((opencgd.client.library.EngineApplet) (super.w)).e > 275 && ((opencgd.client.library.EngineApplet) (super.w)).e < 295 && ((opencgd.client.library.EngineApplet) (super.w)).f > 64 && ((opencgd.client.library.EngineApplet) (super.w)).f < 192){
					super.u.setColor(Color.red);
				}
				opencgd.client.library.D.a(super.u, "View Game-Board", yd, 120, 285);
				super.u.setColor(color2);
				if(((opencgd.client.library.EngineApplet) (super.w)).e > 275 && ((opencgd.client.library.EngineApplet) (super.w)).e < 295 && ((opencgd.client.library.EngineApplet) (super.w)).f > 192 && ((opencgd.client.library.EngineApplet) (super.w)).f < 320){
					super.u.setColor(Color.red);
				}
				opencgd.client.library.D.a(super.u, "Skip-Action", yd, 256, 285);
				super.u.setColor(color2);
				opencgd.client.library.D.a(super.u, "Time-Remaining:" + j, yd, 392, 285);
			}
			if(n == 15){
				super.u.setColor(Color.white);
				if(((opencgd.client.library.EngineApplet) (super.w)).e > 275 && ((opencgd.client.library.EngineApplet) (super.w)).e < 295 && ((opencgd.client.library.EngineApplet) (super.w)).f > 64 && ((opencgd.client.library.EngineApplet) (super.w)).f < 192){
					super.u.setColor(Color.red);
				}
				opencgd.client.library.D.a(super.u, "Project Hologram", yd, 120, 285);
				super.u.setColor(Color.white);
				if(((opencgd.client.library.EngineApplet) (super.w)).e > 275 && ((opencgd.client.library.EngineApplet) (super.w)).e < 295 && ((opencgd.client.library.EngineApplet) (super.w)).f > 192 && ((opencgd.client.library.EngineApplet) (super.w)).f < 320){
					super.u.setColor(Color.red);
				}
				opencgd.client.library.D.a(super.u, "Beam-down", yd, 256, 285);
				super.u.setColor(Color.white);
				if(((opencgd.client.library.EngineApplet) (super.w)).e > 275 && ((opencgd.client.library.EngineApplet) (super.w)).e < 295 && ((opencgd.client.library.EngineApplet) (super.w)).f > 320 && ((opencgd.client.library.EngineApplet) (super.w)).f < 448){
					super.u.setColor(Color.red);
				}
				opencgd.client.library.D.a(super.u, "Cancel", yd, 392, 285);
			}
			if(n == 16){
				super.u.setColor(color2);
				String s16;
				if(sb == -1){
					s16 = "No action";
				} else {
					s16 = cb[yc[sb]];
				}
				opencgd.client.library.D.a(super.u, "Selected:" + s16, zd, 104, 285);
				opencgd.client.library.D.a(super.u, "Awaiting other players", zd, 272, 285);
				opencgd.client.library.D.a(super.u, "Time-Remaining:" + j, zd, 424, 285);
			}
		}
	}
	
	public void d(){
		k++;
		jc++;
		if(h > 0){
			h--;
		} else if(xc > 0){
			xc--;
		} else if(l > 0){
			l--;
		}
		if(cc > 0){
			cc--;
		}
		for(int i1 = 0; i1 < 300; i1++){
			if(oe[i1] > 0 && cc % 2 == 0){
				oe[i1]--;
			}
		}
		
		if(ie > 0){
			ie--;
		}
		if(je > 0){
			je--;
			if(je == 0 && ge[pc][oc] != 46 && ge[sc][rc] == 255){
				ge[sc][rc] = ge[pc][oc];
				ge[pc][oc] = 255;
				fe[sc][rc] = fe[pc][oc];
				fe[pc][oc] = 255;
				de[sc][rc] = de[pc][oc];
				de[pc][oc] = 255;
				if((ge[sc][rc] < 16 || de[sc][rc] < 16) && fe[sc][rc] == bd){
					ec = sc;
					dc = rc;
				}
				pb = sc;
				ob = rc;
			}
			if(je == 16){
				if(ge[sc][rc] >= 16 && ge[sc][rc] < 46 && be == 1){
					f(sc, rc, ge[sc][rc] - 16);
				}
				if(de[sc][rc] != 255){
					if(ge[sc][rc] == 49 || ge[sc][rc] == 47){
						fe[sc][rc] = ce[sc][rc];
					}
					ge[sc][rc] = de[sc][rc];
					de[sc][rc] = 255;
					ce[sc][rc] = 255;
				} else {
					ge[sc][rc] = 255;
					fe[sc][rc] = 255;
				}
			}
			if(je == 31 && ge[sc][rc] >= 16 && ge[sc][rc] < 54 && xb[ge[sc][rc] - 16] < 0){
				oe[0] = 15;
				ne[0] = 3;
				me[0] = sc;
				le[0] = rc;
			}
		}
		if(e > 0){
			e--;
			if(e == 0){
				a(d, c, true);
			}
		}
		if(e < 0){
			e++;
		}
		if(md > 0){
			md--;
			if(md == 0){
				a(ld, kd, false);
			}
		}
		if(md < 0){
			md++;
		}
		if(lb > 0){
			lb--;
			if(lb == 0){
				int j1 = gb;
				int i2 = eb;
				int l2 = mb;
				if(ge[j1][i2] >= 16 && ge[j1][i2] < 46 && l2 == 1){
					f(j1, i2, ge[j1][i2] - 16);
				}
				if(de[j1][i2] != 255){
					if(ge[j1][i2] == 49 || ge[j1][i2] == 47){
						fe[j1][i2] = ce[j1][i2];
					}
					ge[j1][i2] = de[j1][i2];
					de[j1][i2] = 255;
					ce[j1][i2] = 255;
				} else {
					ge[j1][i2] = 255;
					fe[j1][i2] = 255;
				}
			}
		}
		if(lb < 0){
			lb++;
		}
		if(((opencgd.client.library.EngineApplet) (super.w)).hh == 2){
			int k1 = ((opencgd.client.library.EngineApplet) (super.w)).f;
			int j2 = ((opencgd.client.library.EngineApplet) (super.w)).e;
			if(vb == 4 || vb == 5 || vb == 6){
				int i3 = x;
				int l3 = w;
				if(i3 >= 0 && i3 < 15 && l3 >= 0 && l3 < 9){
					int k4 = ge[i3][l3];
					int j5 = fe[i3][l3];
					if(k4 != 255){
						nc = vb;
						mc = n;
						vb = 7;
						n = 22;
						c(k4, j5);
						return;
					}
				}
			} else {
				if(vb == 2 && hd){
					int j3 = 14;
					int i4 = 46;
					for(int l4 = 0; l4 < z; l4++){
						if(k1 > j3 && j2 > i4 && k1 < j3 + 152 && j2 < i4 + 34){
							b(yc[l4]);
							return;
						}
						if((i4 += 34) > 230){
							i4 = 46;
							j3 += 160;
						}
					}
					
					return;
				}
				if(vb == 7){
					vb = nc;
					n = mc;
					return;
				}
				if(vb == 3){
					vb = 2;
					n = 12;
					return;
				}
			}
		} else if(((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
			int l1 = ((opencgd.client.library.EngineApplet) (super.w)).f;
			int k2 = ((opencgd.client.library.EngineApplet) (super.w)).e;
			if(n == 19 && de[pb][ob] != 255){
				char c1;
				if(pb < 7){
					c1 = '\u01B5';
				} else {
					c1 = '\024';
				}
				if(k2 >= 20 && l1 >= c1 && l1 <= c1 + 55 && k2 <= 60){
					if(k2 >= 20 && k2 <= 31){
						if(l1 >= c1 + 8 && l1 <= c1 + 19){
							a(pb - 1, ob - 1);
						}
						if(l1 >= c1 + 22 && l1 <= c1 + 33){
							a(pb, ob - 1);
						}
						if(l1 >= c1 + 36 && l1 <= c1 + 47){
							a(pb + 1, ob - 1);
						}
					}
					if(k2 >= 34 && k2 <= 45){
						if(l1 >= c1 && l1 <= c1 + 11){
							a(pb - 1, ob);
						}
						if(l1 >= c1 + 43 && l1 <= c1 + 54){
							a(pb + 1, ob);
						}
					}
					if(k2 >= 48 && k2 <= 59){
						if(l1 >= c1 + 8 && l1 <= c1 + 19){
							a(pb - 1, ob + 1);
						}
						if(l1 >= c1 + 22 && l1 <= c1 + 33){
							a(pb, ob + 1);
						}
						if(l1 >= c1 + 36 && l1 <= c1 + 47){
							a(pb + 1, ob + 1);
						}
					}
					return;
				}
			}
			if(vb == 3 && l1 > 210 && k2 <= 13 && l1 < 360){
				vb = 2;
				n = 12;
				return;
			}
			if(vb == 4 && k2 <= 13 && l1 > 16 && l1 < 192){
				vb = 2;
				n = 12;
				return;
			}
			if(vb == 7){
				vb = nc;
				n = mc;
				return;
			}
			if(n == 12){
				if(k2 > 275 && k2 < 295 && l1 > 64 && l1 < 192){
					l();
					return;
				}
				if(k2 > 275 && k2 < 295 && l1 > 192 && l1 < 320){
					b(-1, 0);
					return;
				}
			}
			if(n == 15){
				if(k2 > 275 && k2 < 295 && l1 > 64 && l1 < 192){
					b(sb, 0);
					return;
				}
				if(k2 > 275 && k2 < 295 && l1 > 192 && l1 < 320){
					b(sb, 1);
					return;
				}
				if(k2 > 275 && k2 < 295 && l1 > 320 && l1 < 448){
					vb = 2;
					n = 12;
					return;
				}
			}
			if(vb == 3){
				vb = 2;
				n = 12;
				return;
			}
			if(vb == 2 && hd){
				int k3 = 14;
				int j4 = 46;
				for(int i5 = 0; i5 < z; i5++){
					if(l1 > k3 && k2 > j4 && l1 < k3 + 152 && k2 < j4 + 34){
						a(i5);
						return;
					}
					if((j4 += 34) > 230){
						j4 = 46;
						k3 += 160;
					}
				}
				
			}
			if(n == 17){
				if(l1 > 210 && k2 <= 13 && l1 < 360){
					e();
				} else if(x != -1 && rb == 1){
					e(x, w, rb);
				}
			}
			if(n == 18){
				if(l1 > 210 && k2 <= 13 && l1 < 360){
					f();
				} else if(x != -1 && rb == 1){
					b(x, w, rb);
				}
			}
			if(n == 19 || n == 20){
				if(l1 > 210 && k2 <= 13 && l1 < 360){
					n = 18;
					c();
					return;
				}
				if(x != -1){
					d(x, w, rb);
				}
			}
			if(n == 21){
				if(l1 > 210 && k2 <= 13 && l1 < 360){
					n = 18;
					b();
					return;
				}
				if(x != -1){
					c(x, w, rb);
				}
			}
		}
	}
	
	private void m(){
		cb = new String[qc];
		tb = new String[qc];
		o = new int[qc];
		y = new int[qc];
		xb = new int[qc];
		wb = new int[qc];
		q = new int[qc];
		ub = new int[qc];
		r = new int[qc];
		u = new int[qc];
		v = new int[qc];
		t = new int[qc];
		s = new int[qc];
		nb = new int[qc];
		p = new int[qc];
		int i1 = 0;
		for(int j1 = 0; j1 < 16; j1++){
			kb[j1] = 8;
		}
		
		try{
			opencgd.client.library.Buffer g1 = new opencgd.client.library.Buffer("cyber/actions.dat");
			for(int k1 = 0; k1 < qc; k1++){
				g1.m();
				cb[k1] = g1.getString();
				o[k1] = g1.getInt();
				y[k1] = g1.getInt();
				xb[k1] = g1.getInt();
				wb[k1] = g1.getInt();
				q[k1] = g1.getInt();
				ub[k1] = g1.getInt();
				r[k1] = g1.getInt();
				u[k1] = g1.getInt();
				v[k1] = g1.getInt();
				t[k1] = g1.getInt();
				s[k1] = g1.getInt();
				nb[k1] = g1.getInt();
				p[k1] = g1.getInt();
				tb[k1] = g1.j();
				if(v[k1] != 0){
					kb[k1 + 16] = i1++;
				}
			}
			
			g1.closeStream();
			return;
		} catch(IOException _ex){
			throw new RuntimeException("Fatal error loading feature-list!");
		}
	}
	
	public void g(){
		super.k.c = 0;
		super.k.b = 290;
		super.k.f = 0;
		super.k.e = 512;
		f = 0;
		j = 60;
		for(int i1 = 0; i1 < 8; i1++){
			nd[i1] = 5;
			td[i1] = 5;
			rd[i1] = 1;
			qd[i1] = 0;
			sd[i1] = 0;
			pd[i1] = 7;
		}
		
		vb = 2;
		n = 12;
		hd = false;
		for(int j1 = 2; j1 >= 1; j1--){
			super.v[j1] = super.v[j1 - 1];
		}
		
		super.v[0] = "Welcome to CyberWars! For further instructions on any screen just type: help";
	}
	
	public void loadMedia(){
		super.p = 6;
		super.k.a();
		super.k.a("crypt/back.jpg", 0, false);
		super.k.a("cyber/rider.gif", 1, false);
		super.k.a("cyber/monsters.gif", 2, true, 120, 32, 32);
		super.k.a("cyber/commanders.gif", 122, true, 56, 32, 32);
		super.k.a("cyber/sfx.gif", 178, true, 48, 32, 32);
		super.k.a("cyber/buildings.gif", 226, true, 24, 32, 32);
		super.k.a("cyber/bullets.gif", 250, true, 36, 32, 32);
		super.k.a("cyber/select.gif", 286, true, 18, 32, 32);
		m();
		db = new Font("TimesRoman", 0, 18);
		ud = new Font("Helvetica", 1, 30);
		vd = new Font("Helvetica", 1, 20);
		wd = new Font("Helvetica", 1, 15);
		xd = new Font("Helvetica", 1, 16);
		yd = new Font("Helvetica", 1, 14);
		zd = new Font("Helvetica", 1, 13);
		ae = new Font("Helvetica", 1, 13);
	}
	
	private void a(int i1, int j1, boolean flag){
		if(ge[i1][j1] < 16){
			int k1 = 0;
			for(int l1 = 0; l1 < 15; l1++){
				for(int i2 = 0; i2 < 9; i2++){
					if(fe[l1][i2] == fe[i1][j1] && ge[l1][i2] >= 16 && (!flag || xb[ge[l1][i2] - 16] > 0) && (flag || xb[ge[l1][i2] - 16] < 0)){
						if(ge[l1][i2] == 49 || ge[l1][i2] == 47){
							fe[l1][i2] = ce[l1][i2];
						}
						ge[l1][i2] = de[l1][i2];
						de[l1][i2] = 255;
						if(ge[l1][i2] == 255){
							fe[l1][i2] = 255;
						}
						oe[k1] = 15;
						me[k1] = l1;
						le[k1] = i2;
						ne[k1] = 9;
						k1++;
					}
				}
				
			}
			
			return;
		}
		if(ge[i1][j1] == 49 || ge[i1][j1] == 47){
			fe[i1][j1] = ce[i1][j1];
		}
		ge[i1][j1] = de[i1][j1];
		de[i1][j1] = 255;
		if(ge[i1][j1] == 255){
			fe[i1][j1] = 255;
		}
		oe[0] = 15;
		me[0] = i1;
		le[0] = j1;
		ne[0] = 9;
	}
	
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			for(int k1 = 0; k1 < 18; k1++){
				bb[k1] = super.connectionStream.getUShort(super.ab, 1 + k1 * 2);
			}
			
			bd = super.connectionStream.getUShort(super.ab, 37);
			hd = true;
			return;
		}
		if(i1 == 254){
			j = super.connectionStream.getUShort(super.ab, 1);
			a = super.connectionStream.a(super.ab[3]) - 128;
			if(vb != 2 && vb != 3 && vb != 4 && (vb != 7 || nc != 4)){
				vb = 2;
				n = 12;
			}
			lc = -1;
			kc = -1;
			return;
		}
		if(i1 == 253){
			int l1 = 1;
			for(int k8 = 0; k8 < 15; k8++){
				for(int i15 = 0; i15 < 9; i15++){
					ge[k8][i15] = super.connectionStream.a(super.ab[l1++]);
					fe[k8][i15] = super.connectionStream.a(super.ab[l1++]);
					ee[k8][i15] = super.connectionStream.a(super.ab[l1++]);
					de[k8][i15] = super.connectionStream.a(super.ab[l1++]);
					ce[k8][i15] = super.connectionStream.a(super.ab[l1++]);
					if(fe[k8][i15] == bd && ge[k8][i15] < 16){
						ec = k8;
						dc = i15;
					}
				}
				
			}
			
			return;
		}
		if(i1 == 252){
			f = super.connectionStream.getUShort(super.ab, 1);
			j = super.connectionStream.getUShort(super.ab, 3);
			ab = super.connectionStream.getUShort(super.ab, 5);
			ic = super.connectionStream.getUShort(super.ab, 7);
			hc = super.connectionStream.getUShort(super.ab, 9);
			if(f != kc){
				vb = 5;
				n = 17;
				l = 40;
				kc = f;
			}
			lc = -1;
			return;
		}
		if(i1 == 251){
			f = super.connectionStream.getUShort(super.ab, 1);
			j = super.connectionStream.getUShort(super.ab, 3);
			if(vb != 6 && vb != 7){
				vb = 5;
			}
			if(n != 19 && n != 20 && n != 21 && n != 22){
				n = 18;
			}
			if(f != lc){
				n = 18;
				vb = 5;
				int i2 = 0;
				for(int l8 = 0; l8 < 15; l8++){
					for(int j15 = 0; j15 < 9; j15++){
						if(fe[l8][j15] == f){
							ne[i2] = 11;
							me[i2] = l8;
							le[i2] = j15;
							oe[i2] = 16;
							i2++;
						}
					}
					
				}
				
				lc = f;
				return;
			}
		} else {
			if(i1 == 250){
				h = 50;
				i = "Action Failed";
				int j2 = super.connectionStream.a(super.ab[1]);
				int i9 = super.connectionStream.a(super.ab[2]);
				oe[0] = 15;
				me[0] = j2;
				le[0] = i9;
				ne[0] = 8;
				return;
			}
			if(i1 == 249){
				h = 50;
				i = "Action Succeeded";
				int k2 = super.connectionStream.a(super.ab[1]);
				int j9 = super.connectionStream.a(super.ab[2]);
				int k15 = super.connectionStream.a(super.ab[3]);
				int k18 = super.connectionStream.a(super.ab[4]);
				if(de[k2][j9] != 255){
					de[k2][j9] = k18;
				} else {
					ge[k2][j9] = k18;
					fe[k2][j9] = k15;
					ce[k2][j9] = 255;
				}
				int i21;
				for(i21 = 0; ne[i21] == 1 && oe[i21] > 0 && i21 < 19; i21++){
				}
				oe[i21] = 20;
				me[i21] = k2;
				le[i21] = j9;
				ne[i21] = 1;
				return;
			}
			if(i1 == 248){
				h = 50;
				i = "Beam Down Failure";
				int l2 = super.connectionStream.a(super.ab[1]);
				int k9 = super.connectionStream.a(super.ab[2]);
				oe[0] = 31;
				me[0] = l2;
				le[0] = k9;
				ne[0] = 4;
				return;
			}
			if(i1 == 247){
				// spell cast
				h = 50;
				i = "Target cannot move";
				oe[0] = 0;
				return;
			}
			if(i1 == 246){
				// move
				n = 19;
				qb = super.connectionStream.a(super.ab[1]);
				pb = super.connectionStream.a(super.ab[2]);
				ob = super.connectionStream.a(super.ab[3]);
				if(qb < 16){
					uc = rd[qb] * 2;
				} else {
					uc = r[qb - 16] * 2;
				}
				vc = false;
				return;
			}
			if(i1 == 245){
				// spell cast
				h = 50;
				i = "Target has already moved";
				oe[0] = 0;
				return;
			}
			if(i1 == 244){
				n = 18;
				return;
			}
			if(i1 == 243){
				int i3 = super.connectionStream.a(super.ab[1]);
				nd[i3] = super.connectionStream.a(super.ab[2]);
				td[i3] = super.connectionStream.a(super.ab[3]);
				rd[i3] = super.connectionStream.a(super.ab[4]);
				pd[i3] = super.connectionStream.a(super.ab[5]);
				qd[i3] = super.connectionStream.a(super.ab[6]);
				od[i3] = super.connectionStream.a(super.ab[7]);
				sd[i3] = super.connectionStream.a(super.ab[8]);
				return;
			}
			if(i1 == 242){
				// electro sound
				int j3 = super.connectionStream.a(super.ab[1]);
				int l9 = super.connectionStream.a(super.ab[2]);
				int l15 = super.connectionStream.a(super.ab[3]);
				int l18 = super.connectionStream.a(super.ab[4]);
				ge[j3][l9] = ge[l15][l18];
				ge[l15][l18] = 255;
				fe[j3][l9] = fe[l15][l18];
				fe[l15][l18] = 255;
				de[j3][l9] = de[l15][l18];
				de[l15][l18] = 255;
				pb = j3;
				ob = l9;
				if((ge[j3][l9] < 16 || de[j3][l9] < 16) && fe[j3][l9] == bd){
					ec = j3;
					dc = l9;
				}
				uc = super.connectionStream.a(super.ab[5]);
				vc = true;
				return;
			}
			if(i1 == 241){
				n = 20;
				return;
			}
			if(i1 == 240){
				je = 64;
				sc = super.connectionStream.a(super.ab[1]);
				rc = super.connectionStream.a(super.ab[2]);
				pc = super.connectionStream.a(super.ab[3]);
				oc = super.connectionStream.a(super.ab[4]);
				be = super.connectionStream.a(super.ab[5]);
				oe[0] = 48;
				me[0] = sc;
				le[0] = rc;
				ne[0] = 0;
				if(f == bd){
					n = 18;
					return;
				}
			} else if(i1 == 239){
				ie = 48;
				int k3 = super.connectionStream.a(super.ab[1]);
				int i10 = super.connectionStream.a(super.ab[2]);
				oe[0] = 48;
				me[0] = k3;
				le[0] = i10;
				ne[0] = 0;
				if(f == bd){
					n = 18;
					return;
				}
			} else if(i1 == 238){
				int l3 = super.connectionStream.a(super.ab[1]);
				int j10 = super.connectionStream.a(super.ab[2]);
				int i16 = super.connectionStream.a(super.ab[3]);
				int i19 = super.connectionStream.a(super.ab[4]);
				de[l3][j10] = ge[i16][i19];
				ge[i16][i19] = 255;
				fe[i16][i19] = 255;
				de[i16][i19] = 255;
				if(fe[l3][j10] == bd){
					ec = l3;
					dc = j10;
				}
				if(f == bd){
					n = 18;
					return;
				}
			} else if(i1 == 237){
				int i4 = super.connectionStream.a(super.ab[1]);
				int k10 = super.connectionStream.a(super.ab[2]);
				int j16 = super.connectionStream.a(super.ab[3]);
				int j19 = super.connectionStream.a(super.ab[4]);
				ge[i4][k10] = de[j16][j19];
				fe[i4][k10] = fe[j16][j19];
				de[j16][j19] = 255;
				de[i4][k10] = 255;
				if(fe[i4][k10] == bd){
					ec = i4;
					dc = k10;
				}
				if(f == bd){
					n = 18;
					return;
				}
			} else {
				if(i1 == 236){
					int j4 = super.connectionStream.a(super.ab[1]);
					zb = super.connectionStream.a(super.ab[2]);
					yb = super.connectionStream.a(super.ab[3]);
					ac = super.connectionStream.a(super.ab[4]);
					if(vb < 4){
						l();
					}
					if(vb == 7){
						vb = nc;
						n = mc;
					}
					int l10 = 0;
					for(int k16 = 0; k16 < 15; k16++){
						for(int k19 = 0; k19 < 9; k19++){
							if(ce[k16][k19] == j4){
								ce[k16][k19] = 255;
								if(ge[k16][k19] == 49 || ge[k16][k19] == 47){
									de[k16][k19] = 255;
								}
							}
							if(fe[k16][k19] == j4){
								ne[l10] = 9;
								oe[l10] = 15;
								me[l10] = k16;
								le[l10] = k19;
								l10++;
								if(ce[k16][k19] != 255 && de[k16][k19] != 255 && (ge[k16][k19] == 49 || ge[k16][k19] == 47)){
									ge[k16][k19] = de[k16][k19];
									fe[k16][k19] = ce[k16][k19];
									de[k16][k19] = 255;
									ce[k16][k19] = 255;
								} else {
									ge[k16][k19] = 255;
									fe[k16][k19] = 255;
									de[k16][k19] = 255;
									ce[k16][k19] = 255;
								}
							}
						}
						
					}
					
					cc = 63;
					bc = super.n[j4] + " left the game!";
					return;
				}
				if(i1 == 235){
					int k4 = super.connectionStream.a(super.ab[1]);
					zb = super.connectionStream.a(super.ab[2]);
					yb = super.connectionStream.a(super.ab[3]);
					ac = super.connectionStream.a(super.ab[4]);
					if(vb < 4){
						l();
					}
					if(vb == 7){
						vb = nc;
						n = mc;
					}
					int i11 = 0;
					for(int l16 = 0; l16 < 15; l16++){
						for(int l19 = 0; l19 < 9; l19++){
							if(ce[l16][l19] == k4){
								ce[l16][l19] = 255;
								if(ge[l16][l19] == 49 || ge[l16][l19] == 47){
									de[l16][l19] = 255;
								}
							}
							if(fe[l16][l19] == k4){
								ne[i11] = 9;
								oe[i11] = 15;
								me[i11] = l16;
								le[i11] = l19;
								i11++;
								if(ce[l16][l19] != 255 && de[l16][l19] != 255 && (ge[l16][l19] == 49 || ge[l16][l19] == 47)){
									ge[l16][l19] = de[l16][l19];
									fe[l16][l19] = ce[l16][l19];
									de[l16][l19] = 255;
									ce[l16][l19] = 255;
								} else {
									ge[l16][l19] = 255;
									fe[l16][l19] = 255;
									de[l16][l19] = 255;
									ce[l16][l19] = 255;
								}
							}
						}
						
					}
					
					cc = 63;
					bc = super.n[k4] + " has died!";
					return;
				}
				if(i1 == 234){
					e = 63;
					d = super.connectionStream.a(super.ab[1]);
					c = super.connectionStream.a(super.ab[2]);
					oe[0] = 63;
					me[0] = d;
					le[0] = c;
					ne[0] = 6;
					return;
				}
				if(i1 == 233){
					e = -63;
					d = super.connectionStream.a(super.ab[1]);
					c = super.connectionStream.a(super.ab[2]);
					oe[0] = 63;
					me[0] = d;
					le[0] = c;
					ne[0] = 6;
					return;
				}
				if(i1 == 232){
					md = 63;
					ld = super.connectionStream.a(super.ab[1]);
					kd = super.connectionStream.a(super.ab[2]);
					oe[0] = 63;
					me[0] = ld;
					le[0] = kd;
					ne[0] = 5;
					return;
				}
				if(i1 == 231){
					md = -63;
					ld = super.connectionStream.a(super.ab[1]);
					kd = super.connectionStream.a(super.ab[2]);
					oe[0] = 63;
					me[0] = ld;
					le[0] = kd;
					ne[0] = 5;
					return;
				}
				if(i1 == 230){
					ie = 48;
					int l4 = super.connectionStream.a(super.ab[1]);
					int j11 = super.connectionStream.a(super.ab[2]);
					oe[0] = 48;
					me[0] = l4;
					le[0] = j11;
					ne[0] = 0;
					if(ge[l4][j11] == 49 || ge[l4][j11] == 47){
						fe[l4][j11] = ce[l4][j11];
					}
					ge[l4][j11] = de[l4][j11];
					de[l4][j11] = 255;
					if(ge[l4][j11] == 255){
						fe[l4][j11] = 255;
						return;
					}
				} else {
					if(i1 == 229){
						ie = 48;
						int i5 = super.connectionStream.a(super.ab[1]);
						int k11 = super.connectionStream.a(super.ab[2]);
						oe[0] = 48;
						me[0] = i5;
						le[0] = k11;
						ne[0] = 0;
						return;
					}
					if(i1 == 228){
						ie = 63;
						int j5 = super.connectionStream.a(super.ab[1]);
						int l11 = super.connectionStream.a(super.ab[2]);
						oe[0] = 63;
						me[0] = j5;
						le[0] = l11;
						ne[0] = 6;
						ge[j5][l11] = super.connectionStream.a(super.ab[3]);
						return;
					}
					if(i1 == 227){
						ie = 63;
						int k5 = super.connectionStream.a(super.ab[1]);
						int i12 = super.connectionStream.a(super.ab[2]);
						oe[0] = 63;
						me[0] = k5;
						le[0] = i12;
						ne[0] = 6;
						return;
					}
					if(i1 == 226){
						ie = 63;
						int l5 = super.connectionStream.a(super.ab[1]);
						int j12 = super.connectionStream.a(super.ab[2]);
						oe[0] = 63;
						me[0] = l5;
						le[0] = j12;
						ne[0] = 5;
						fe[l5][j12] = super.connectionStream.a(super.ab[3]);
						h = 64;
						i = "Mind Control Success";
						return;
					}
					if(i1 == 225){
						ie = 63;
						int i6 = super.connectionStream.a(super.ab[1]);
						int k12 = super.connectionStream.a(super.ab[2]);
						oe[0] = 63;
						me[0] = i6;
						le[0] = k12;
						ne[0] = 5;
						h = 64;
						i = "Mind Control Failure";
						return;
					}
					if(i1 == 224){
						h = 50;
						i = "Destroying Hologram";
						ie = 48;
						int j6 = super.connectionStream.a(super.ab[1]);
						int l12 = super.connectionStream.a(super.ab[2]);
						oe[0] = 48;
						me[0] = j6;
						le[0] = l12;
						ne[0] = 7;
						if(ge[j6][l12] == 49 || ge[j6][l12] == 47){
							fe[j6][l12] = ce[j6][l12];
						}
						ge[j6][l12] = de[j6][l12];
						de[j6][l12] = 255;
						if(ge[j6][l12] == 255){
							fe[j6][l12] = 255;
							return;
						}
					} else {
						if(i1 == 223){
							h = 50;
							i = "Not A Hologram";
							int k6 = super.connectionStream.a(super.ab[1]);
							int i13 = super.connectionStream.a(super.ab[2]);
							oe[0] = 48;
							me[0] = k6;
							le[0] = i13;
							ne[0] = 7;
							return;
						}
						if(i1 == 222){
							h = 50;
							i = "Slime cannot be attacked!";
							return;
						}
						if(i1 == 221){
							h = 50;
							i = "Resurrect Succeeded";
							int l6 = super.connectionStream.a(super.ab[1]);
							int j13 = super.connectionStream.a(super.ab[2]);
							int i17 = super.connectionStream.a(super.ab[3]);
							int i20 = super.connectionStream.a(super.ab[4]);
							ge[l6][j13] = i17;
							fe[l6][j13] = i20;
							ee[l6][j13] = 255;
							oe[0] = 48;
							me[0] = l6;
							le[0] = j13;
							ne[0] = 9;
							return;
						}
						if(i1 == 220){
							h = 50;
							i = "Action Succeeded";
							return;
						}
						if(i1 == 219){
							h = 50;
							i = "Action Succeeded";
							int i7 = super.connectionStream.a(super.ab[1]);
							int k13 = super.connectionStream.a(super.ab[2]);
							int j17 = super.connectionStream.a(super.ab[3]);
							int j20 = super.connectionStream.a(super.ab[4]);
							int j21 = super.connectionStream.a(super.ab[5]);
							if(de[j17][j20] != 255){
								ge[i7][k13] = de[j17][j20];
								fe[i7][k13] = j21;
								de[j17][j20] = 255;
								ce[j17][j20] = 255;
							} else {
								ge[i7][k13] = ge[j17][j20];
								fe[i7][k13] = j21;
								de[i7][k13] = 255;
								ce[i7][k13] = 255;
								ge[j17][j20] = 255;
								fe[j17][j20] = 255;
							}
							
							oe[0] = 48;
							me[0] = i7;
							le[0] = k13;
							ne[0] = 7;
							oe[1] = 48;
							me[1] = j17;
							le[1] = j20;
							ne[1] = 7;
							if(j21 == bd){
								ec = i7;
								dc = k13;
								return;
							}
						} else if(i1 == 218){
							int j7 = super.connectionStream.a(super.ab[1]);
							int l13 = super.connectionStream.a(super.ab[2]);
							int k17 = super.connectionStream.a(super.ab[3]);
							int k20 = super.connectionStream.a(super.ab[4]);
							de[j7][l13] = ge[k17][k20];
							ce[j7][l13] = fe[k17][k20];
							ge[k17][k20] = 255;
							fe[k17][k20] = 255;
							de[k17][k20] = 255;
							if(ce[j7][l13] == bd){
								ec = j7;
								dc = l13;
							}
							if(f == bd){
								n = 18;
								return;
							}
						} else {
							if(i1 == 217){
								vb = 5;
								if(n != 19 && n != 20){
									n = 18;
									f = 0;
								}
								int k7 = super.connectionStream.a(super.ab[1]);
								int i14 = super.connectionStream.a(super.ab[2]);
								int l17 = super.connectionStream.a(super.ab[3]);
								ge[i14][l17] = de[i14][l17];
								fe[i14][l17] = ce[i14][l17];
								de[i14][l17] = 255;
								ce[i14][l17] = 255;
								me[0] = i14;
								le[0] = l17;
								oe[0] = 50;
								ne[0] = 2;
								h = 50;
								i = super.n[k7] + " gained an action";
								xc = 60;
								return;
							}
							if(i1 == 216){
								vb = 5;
								if(n != 19 && n != 20){
									n = 18;
									f = 0;
								}
								int l7 = super.connectionStream.a(super.ab[1]);
								int j14 = super.connectionStream.a(super.ab[2]);
								int i18 = super.connectionStream.a(super.ab[3]);
								int l20 = super.connectionStream.a(super.ab[4]);
								if(ge[i18][l20] >= 16 && l7 == 49){
									de[i18][l20] = ge[i18][l20];
									ce[i18][l20] = fe[i18][l20];
								} else {
									de[i18][l20] = 255;
									ce[i18][l20] = 255;
								}
								ge[i18][l20] = l7;
								fe[i18][l20] = j14;
								ee[i18][l20] = 255;
								return;
							}
							if(i1 == 215){
								vb = 5;
								if(n != 19 && n != 20){
									n = 18;
									f = 0;
								}
								int i8 = super.connectionStream.a(super.ab[1]);
								int k14 = super.connectionStream.a(super.ab[2]);
								int j18 = super.connectionStream.a(super.ab[3]);
								if(i8 == 49 && de[k14][j18] != 255){
									ge[k14][j18] = de[k14][j18];
									fe[k14][j18] = ce[k14][j18];
									ee[k14][j18] = 255;
									de[k14][j18] = 255;
									ce[k14][j18] = 255;
									return;
								} else {
									ge[k14][j18] = 255;
									fe[k14][j18] = 255;
									ee[k14][j18] = 255;
									de[k14][j18] = 255;
									ce[k14][j18] = 255;
									return;
								}
							}
							if(i1 == 214){
								vb = 5;
								if(n != 19 && n != 20){
									n = 18;
									f = 0;
								}
								int j8 = super.connectionStream.a(super.ab[1]);
								int l14 = super.connectionStream.a(super.ab[2]);
								oe[0] = 15;
								me[0] = j8;
								le[0] = l14;
								ne[0] = 9;
								ge[j8][l14] = de[j8][l14];
								de[j8][l14] = 255;
								return;
							}
							if(i1 == 213){
								vb = 6;
								n = 21;
								return;
							}
							if(i1 == 212){
								if(n == 21){
									n = 18;
									vb = 5;
								}
								gb = super.connectionStream.a(super.ab[1]);
								eb = super.connectionStream.a(super.ab[2]);
								hb = super.connectionStream.a(super.ab[3]);
								fb = super.connectionStream.a(super.ab[4]);
								super.connectionStream.a(super.ab[5]);
								ib = kb[super.connectionStream.a(super.ab[5])];
								lb = -jb;
								return;
							}
							if(i1 == 211){
								if(n == 21){
									n = 18;
									vb = 5;
								}
								gb = super.connectionStream.a(super.ab[1]);
								eb = super.connectionStream.a(super.ab[2]);
								hb = super.connectionStream.a(super.ab[3]);
								fb = super.connectionStream.a(super.ab[4]);
								ib = kb[super.connectionStream.a(super.ab[5])];
								mb = super.connectionStream.a(super.ab[6]);
								lb = jb;
							}
						}
					}
				}
			}
		}
	}
	
	public boolean isNetworkedGame(){
		if(!g && (l != 0 || e != 0 || md != 0 || je != 0 || cc != 0 || ie != 0 || oe[0] != 0 || xc != 0 || lb != 0)){
			return false;
		}
		return !g || e == 0 && md == 0 && (je == 0 || lb == 0);
	}
	
	public void c(int i1){
		int j1 = -1;
		String s1 = "Sorry, no help available for this screen";
		if(vb == 2){
			j1 = 4;
		}
		if(vb == 3){
			j1 = 12;
		}
		if(vb == 4){
			j1 = 13;
		}
		if(n == 15){
			j1 = 5;
		}
		if(vb == 5){
			if(n == 17){
				j1 = 6;
			}
			if(n == 18){
				j1 = 7;
			}
			if(n == 19){
				if(qb < 16){
					j1 = 14;
				} else {
					int k1 = nb[qb - 16];
					if(k1 == 0){
						j1 = 8;
					} else {
						j1 = 9;
					}
				}
			}
			if(n == 20){
				j1 = 10;
			}
		}
		if(vb == 6){
			j1 = 11;
		}
		if(i1 != -1){
			j1 = i1;
		}
		if(j1 == 4){
			s1 = "Here is a list of all the creatures you can beam from your ship in orbit, and th" + "e other actions your ship can do. You can choose one action each turn. To choose" + " an action just click on it's icon.";
		}
		if(j1 == 5){
			s1 = "You can either beam this creature from your ship, (in which case there is a chan" + "ce that it will be destroyed in transit), or you can project a hologram, (which " + "is bound to work, but can be destroyed with the HoloDetector).";
		}
		if(j1 == 6){
			s1 = "Action phase: When it is your turn you must indicate which square you want to ta" + "rget your action at. You normally need to choose a square near your commander, w" + "ho is indicated with a flashing red & yellow square.";
		}
		if(j1 == 7){
			s1 = "Movement phase: On you turn select a creature by clicking on it with your mouse." + " When you have finished click the 'end-turn' button. You can only select your ow" + "n commander, or creatures you beamed down.";
		}
		if(j1 == 8){
			s1 = "Land-based creatures can only move one square at a time. Click on a square adjac" + "ent to your selected creature to move it. Repeat to use all your movement points" + ". To attack an enemy just try to move your creature into it.";
		}
		if(j1 == 9){
			s1 = "Flying creatures use all their movement at once, just click where you want to la" + "nd. To attack an enemy just try to land on top of it.";
		}
		if(j1 == 10){
			s1 = "Because you are standing next to an enemy, your creature has become engaged in c" + "ombat. Click on an adjacent creature to attack it.";
		}
		if(j1 == 11){
			s1 = "This creature has a ranged-combat ability. Just click on a target to take a shot" + " at it! The target must be in range, and there must be no obstacles between the " + "2 creatures.";
		}
		if(j1 == 12){
			s1 = "This is the action information screen. You can also display it during the game b" + "y right-clicking on any creature on the board.";
		}
		if(j1 == 13){
			s1 = "This is the board preview screen. It is particularly useful for determining if t" + "here is anything near your commander to use one of the short-range offensive act" + "ions on.";
		}
		if(j1 == 14){
			s1 = "You have selected your commander. Try to move your commander to a safe space, ei" + "ther in a building or vehicle, or as far from danger as possible. Click on a squ" + "are adjacent to your commander to move.";
		}
		String as[] = new String[10];
		int l1 = 0;
		String s2 = "";
		int i2 = 0;
		as[l1++] = " ";
		for(int j2 = 0; j2 < s1.length(); j2++){
			if(i2 > 75 && s1.charAt(j2) == ' '){
				as[l1++] = s2;
				s2 = "";
				i2 = 0;
			} else {
				s2 = s2 + s1.charAt(j2);
				i2++;
			}
		}
		
		if(i2 > 0){
			as[l1++] = s2;
		}
		for(int k2 = 0; k2 < l1; k2++){
			for(int l2 = 2; l2 >= 1; l2--){
				super.v[l2] = super.v[l2 - 1];
			}
			
			super.v[0] = as[k2];
		}
		
	}
}