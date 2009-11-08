package opencgd.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.AbstractGame;

public class Crypt extends AbstractGame {
	
	private boolean l;
	private int f;
	private int mb;
	private int nb;
	private int ob;
	private int pb;
	private int zb;
	private int vb;
	private int qb;
	private int rb;
	private int ub;
	private int bc;
	private int dc;
	private int sb;
	private int tb;
	private int ac;
	private int h;
	private int k;
	private int i;
	private int j;
	private int c[];
	private int r[][];
	private String w[];
	private int u[];
	private int t;
	private int v;
	private int ic[] = {
			119, 119, 119, 204, 204, 204
	};
	private int jc[] = {
			140, 260, 380, 140, 260, 380
	};
	private int o;
	private int p;
	private int xb;
	private int yb[];
	private int wb[][];
	private int ab;
	private int lb[];
	private int kb[];
	private int fc[];
	private int gc[];
	private int hb[];
	private int ib[];
	private int jb[];
	private String hc[];
	private String ec[];
	private int y;
	private int gb;
	private int z;
	private int wc;
	private int yc;
	private int zc;
	private int uc;
	private int vc;
	private int xc;
	private int ad;
	private int kc;
	private int lc;
	private int fb[];
	private int a[];
	private int b[];
	private boolean cb[][];
	private int tc[][];
	private int sc[][];
	private int x;
	private int s;
	private int g;
	private int e;
	private int d;
	private int q[] = {
			0, 1, 2, 1
	};
	private int m[] = {
			13, 28, 40, 27, 46, 26
	};
	private int n[] = {
			84, 28, 95, 59, 64, 74
	};
	private Color db;
	private Color eb;
	private int mc[][] = {
			{12}, {4, 7, 5, 6}, {1, 3}, {0, 2}, {4, 7, 2},
			{4, 5, 3}, {0, 5, 6}, {1, 7, 6}, {8}, {9},
			{10}, {11}, {12}, {12}, {16}
	};
	private Color bb;
	private Font oc;
	private Font pc;
	private Font qc;
	private Font rc;
	private Font nc;
	
	public Crypt(){
		nc = new Font("Helvetica", 1, 9);
		rc = new Font("Helvetica", 1, 11);
		qc = new Font("Helvetica", 1, 13);
		pc = new Font("Helvetica", 1, 16);
		oc = new Font("Helvetica", 1, 25);
		bb = new Color(150, 150, 150);
		eb = new Color(110, 110, 110);
		db = new Color(165, 165, 165);
		e = 30;
		s = -1;
		x = -1;
		sc = new int[100][100];
		tc = new int[100][100];
		cb = new boolean[100][100];
		b = new int[6];
		a = new int[6];
		fb = new int[6];
		lc = 50;
		kc = 50;
		xc = 60;
		y = 23;
		wb = new int[100][6];
		yb = new int[100];
		t = -1;
		u = new int[20];
		w = new String[20];
		r = new int[7][5];
		c = new int[7];
		j = -1;
		i = -1;
		k = -1;
		f = 80;
		l = false;
	}
	
	@Override
	public void a(){
		super.k.a(0, 0, 99);
		for(int i1 = 0; i1 < super.a; i1++){
			if(i1 != super.q){
				a(i1);
			}
		}
		
		a(super.q);
		for(int j1 = 1; j1 >= -1; j1--){
			for(int k1 = -1; k1 <= 1; k1++){
				int i2 = 170 + j1 * 113 + k1 * 66;
				int i3 = (100 - j1 * 33) + k1 * 57;
				int j4 = sc[j1 + lc][k1 + kc];
				if(j4 == 0 || j4 == 12){
					super.k.a(i2, i3 - 5, 14);
				}
				if(j4 == 13){
					super.k.a(i2, i3 - 8, 15);
				}
			}
			
		}
		
		for(int l1 = 0; l1 < 7; l1++){
			for(int j2 = 0; j2 < 5; j2++){
				int j3 = r[l1][j2];
				if(j == l1 && i == j2){
					super.k.a(5 + 70 * l1, 20 + 10 * j2, 69, 9, Color.green, 160, false);
				}
				if(j3 != -1 && j2 > 0 && j != l1 && j != -1 && hb[j3] + c[l1] >= k && hb[j3] <= k + c[j]){
					super.k.a(5 + 70 * l1, 20 + 10 * j2, 69, 9, Color.red, 160, false);
				} else if(j3 == -1 && j2 > 0 && j != l1 && j != -1 && r[l1][j2 - 1] != -1 && c[l1] >= k){
					super.k.a(5 + 70 * l1, 20 + 10 * j2, 69, 9, Color.red, 160, false);
				} else if(j3 == -1){
					super.k.a(5 + 70 * l1, 20 + 10 * j2, 69, 9, bb, 80, false);
				} else if(j2 == 0){
					super.k.a(5 + 70 * l1, 20 + 10 * j2, 69, 9, bb, 200, false);
				} else {
					super.k.a(5 + 70 * l1, 20 + 10 * j2, 69, 9, bb, 160, false);
				}
			}
			
		}
		
		if(j != -1){
			super.k.a(5, 70, 69, 9, Color.red, 160, false);
		}
		if(ab == 0 && h == 0 && d == super.q){
			super.k.a(425, 220, 70, 70, bb, 160, false);
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 453 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 466 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 248 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < 261){
				super.k.a(446, 241, 42);
			} else {
				super.k.a(446, 241, 37);
			}
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 433 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 460 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 220 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < 247){
				super.k.a(433, 220, 38);
			} else {
				super.k.a(433, 220, 33);
			}
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 468 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 495 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 228 && ((opencgd.library.EngineApplet) (super.w)).e - 6 <= 255){
				super.k.a(468, 228, 39);
			} else {
				super.k.a(468, 228, 34);
			}
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 425 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 452 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 255 && ((opencgd.library.EngineApplet) (super.w)).e - 6 <= 282){
				super.k.a(425, 255, 41);
			} else {
				super.k.a(425, 255, 36);
			}
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 460 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 487 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 263 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < 290){
				super.k.a(460, 263, 40);
			} else {
				super.k.a(460, 263, 35);
			}
		} else if(ab == 1 && h == 0){
			int k2 = tc[p][o];
			int k3 = yb[k2];
			for(int k4 = 0; k4 < 6; k4++){
				super.k.a(jc[k4], ic[k4], 107, 78, eb, db, false);
				super.k.a(jc[k4], ic[k4], 107, 78, Color.black);
				if(k4 < k3){
					super.k.a((jc[k4] + 107) - 53, ic[k4] + 1, 49 + wb[k2][k4]);
				}
			}
			
			super.k.a(152, 83, 319, 28, bb, 160, false);
			if(d == super.q && d == super.q){
				super.k.a(8, 82, 122, 198, bb, 160, false);
			}
		} else if(h > 0){
			super.k.a(152, 83, 319, 28, bb, 160, false);
			super.k.a(141, 119, 347, 163, bb, 160, false);
		}
		super.k.a(super.u, 6, 6, false);
		super.u.setColor(Color.white);
		super.u.setFont(nc);
		for(int l2 = 0; l2 < 7; l2++){
			for(int l3 = 0; l3 < 5; l3++){
				int l4 = r[l2][l3];
				if(l4 != -1){
					String s3 = ec[l4];
					String s5 = String.valueOf(ib[l4]);
					if(ib[l4] == 0){
						s5 = "?";
					}
					if(jb[l4] == 0){
						s3 = s3 + "(" + s5 + ")";
					} else if(jb[l4] == 1){
						s3 = s3 + "(" + kb[l4] + "+" + lb[l4] + ")";
					}
					super.u.drawString(s3, 12 + 70 * l2, 34 + 10 * l3);
					continue;
				}
				if(c[l2] == 0){
					continue;
				}
				super.u.drawString(c[l2] + " kg left", 12 + 70 * l2, 34 + 10 * l3);
				break;
			}
			
		}
		
		if(j != -1){
			super.u.drawString("Drop object", 12, 84);
		}
		if(ab == 1 && h == 0){
			super.u.setColor(Color.black);
			opencgd.library.D.a(super.u, "Room Contents", oc, 317, 105);
			if(d == super.q){
				super.u.setColor(Color.white);
				super.u.setFont(qc);
				super.u.drawString("Choose an option", 16, 101);
			}
			int i4 = tc[p][o];
			int i5 = yb[i4];
			for(int k5 = 0; k5 < i5; k5++){
				int l5 = wb[i4][k5];
				super.u.setFont(rc);
				super.u.setColor(Color.black);
				super.u.drawString(ec[l5], jc[k5] + 3 + 6, ic[k5] + 15 + 6);
				super.u.setFont(nc);
				super.u.setColor(Color.black);
				if(jb[l5] == 1){
					super.u.drawString("Friendly:" + gc[l5] + "%", jc[k5] + 2 + 6, ic[k5] + 55 + 6);
					super.u.drawString("Hostile:" + fc[l5] + "%", jc[k5] + 2 + 6, ic[k5] + 65 + 6);
					super.u.drawString("Combat:" + kb[l5] + "+" + lb[l5], jc[k5] + 2 + 6, ic[k5] + 75 + 6);
				} else if(jb[l5] == 0){
					String s6 = String.valueOf(ib[l5]);
					String s8 = hc[l5];
					if(s6.equalsIgnoreCase("0")){
						s6 = "?";
					}
					if(s8 != ""){
						super.u.drawString("Weight:" + hb[l5] + "kg", jc[k5] + 2 + 6, ic[k5] + 55 + 6);
						super.u.drawString("Value:" + s6, jc[k5] + 2 + 6, ic[k5] + 65 + 6);
						super.u.drawString(s8, jc[k5] + 2 + 6, ic[k5] + 75 + 6);
					} else {
						super.u.drawString("Weight: " + hb[l5] + "kg", jc[k5] + 2 + 6, ic[k5] + 65 + 6);
						super.u.drawString("Value: " + s6, jc[k5] + 2 + 6, ic[k5] + 75 + 6);
					}
				} else if(jb[l5] == 2){
					String s7 = hc[l5];
					if(s7 != ""){
						super.u.drawString(s7, jc[k5] + 2 + 6, ic[k5] + 75 + 6);
					}
				}
			}
			
			if(d == super.q){
				super.u.setFont(rc);
				super.u.setColor(Color.white);
				for(int i6 = 0; i6 < v; i6++){
					if(t == i6){
						super.u.setColor(Color.red);
					} else {
						super.u.setColor(Color.white);
					}
					super.u.drawString(w[i6], 16, 116 + i6 * 12);
				}
				
			}
		} else if(h > 0){
			super.u.setColor(Color.black);
			opencgd.library.D.a(super.u, super.n[ac] + " is engaged in combat!", pc, 317, 105);
			String s1 = ".Fighting Enemy.";
			if(h > 100){
				for(int j5 = 0; j5 < (200 - h) / 10; j5++){
					s1 = "." + s1 + ".";
				}
				
			}
			opencgd.library.D.a(super.u, s1, pc, 320, 140);
			opencgd.library.D.a(super.u, super.n[ac] + "'s total strength is: " + rb, qc, 320, 160);
			String s2 = "";
			if(nb != -1){
				s2 = s2 + ec[nb] + " strength:" + tb;
			}
			if(mb != -1){
				s2 = s2 + ", " + ec[mb] + " strength:" + sb;
			}
			if(ub != 0){
				s2 = s2 + ", ranged combat:" + ub;
			}
			opencgd.library.D.a(super.u, "(" + s2 + ")", rc, 320, 175);
			opencgd.library.D.a(super.u, "Opponents total strength is: " + bc, qc, 320, 195);
			String s4 = "";
			if(pb != -1){
				s4 = s4 + ec[pb] + " strength:" + kb[pb];
			}
			if(ob != -1){
				s4 = s4 + " and " + ec[ob] + " strength:" + kb[ob];
			}
			if(dc != 0){
				s4 = s4 + " and ranged combat:" + dc;
			}
			opencgd.library.D.a(super.u, "(" + s4 + ")", rc, 320, 210);
			if(qb == 4){
				opencgd.library.D.a(super.u, "Bonus of +1 for suprise & +3 for potion", qc, 320, 230);
			} else if(qb == 3){
				opencgd.library.D.a(super.u, "Bonus +3 for strength potion", qc, 320, 230);
			} else if(qb > 0){
				opencgd.library.D.a(super.u, "Bonus of +1 for suprise attack", qc, 320, 230);
			} else if(qb < 0){
				opencgd.library.D.a(super.u, "Penalty of -1 for suprise attack", qc, 320, 230);
			}
			if(h < 100){
				if(vb == 0){
					opencgd.library.D.a(super.u, super.n[ac] + " has won the battle!", pc, 320, 260);
				} else if(vb == 1){
					if(!l){
						l = true;
					}
					opencgd.library.D.a(super.u, "Enemy has killed " + super.n[ac] + "'s " + ec[zb], pc, 320, 260);
				} else {
					opencgd.library.D.a(super.u, "Battle drawn - Neither side won", pc, 320, 260);
				}
			} else {
				l = false;
			}
		}
		super.u.setFont(qc);
		super.u.setColor(Color.white);
		if(d == -1){
			super.u.drawString("Please wait...", 10, 20);
		} else if(d == super.q && ab == 0){
			super.u.drawString("Your turn - Click on compass to move!", 10, 20);
		} else if(d == super.q && ab == 1){
			super.u.drawString("Your turn - Choose an option", 10, 20);
		} else {
			super.u.drawString(super.n[d] + "'s turn - Please wait", 10, 20);
		}
		opencgd.library.D.b(super.u, "Tiles-Left:" + f + "    Time-Remaining:" + e, qc, 502, 20);
	}
	
	private void a(int i1){
		if(super.n[i1] != null){
			int j1 = b[i1] - lc;
			int k1 = a[i1] - kc;
			if(j1 >= -2 && j1 <= 2 && k1 >= -2 && k1 <= 2){
				int l1 = 170 + j1 * 113 + k1 * 66;
				int i2 = (100 - j1 * 33) + k1 * 57;
				if(ad != 0 && wc == i1){
					int j2 = zc - lc;
					int k2 = yc - kc;
					if(k2 > 0 || j2 > 0){
						fb[i1] = 46;
					} else {
						fb[i1] = 43;
					}
					fb[i1] = fb[i1] + q[g / 5 & 3];
					int l2 = 170 + j2 * 113 + k2 * 66;
					int i3 = (100 - j2 * 33) + k2 * 57;
					if(ad > 0){
						l1 = (l1 * ad + l2 * (xc - ad)) / xc;
						i2 = (i2 * ad + i3 * (xc - ad)) / xc;
					} else if(ad < -xc / 2){
						l1 = (l1 * -ad + l2 * (xc + ad)) / xc;
						i2 = (i2 * -ad + i3 * (xc + ad)) / xc;
					} else {
						l1 = (l2 * -ad + l1 * (xc + ad)) / xc;
						i2 = (i3 * -ad + i2 * (xc + ad)) / xc;
					}
				}
				if(i1 == super.q){
					super.k.a(l1 + 62, i2 + 35, fb[i1]);
					return;
				}
				super.k.a(l1 + 70, i2 + 30, fb[i1]);
			}
		}
	}
	
	private void b(){
		j = -1;
		super.k.a(0, 0, 0);
		for(int i1 = 2; i1 >= -2; i1--){
			for(int j1 = -2; j1 <= 2; j1++){
				int l1 = sc[i1 + lc][j1 + kc];
				if(l1 != -1){
					int k2 = 170 + i1 * 113 + j1 * 66;
					int j3 = (100 - i1 * 33) + j1 * 57;
					for(int i4 = 0; i4 < mc[l1].length; i4++){
						super.k.a(k2, j3, mc[l1][i4] + 1);
						if(l1 == 0){
							super.k.a(k2, j3 - 14, 18);
						}
					}
					
				}
			}
			
		}
		
		for(int k1 = 2; k1 >= -2; k1--){
			for(int i2 = -2; i2 <= 2; i2++){
				int l2 = tc[k1 + lc][i2 + kc];
				if(l2 >= 0){
					int k3 = 170 + k1 * 113 + i2 * 66;
					int j4 = (100 - k1 * 33) + i2 * 57;
					for(int k4 = 0; k4 < yb[l2]; k4++){
						if(wb[l2][k4] < 21){
							super.k.a(k3 + n[k4], j4 + m[k4], 49 + y + wb[l2][k4]);
						} else if(wb[l2][k4] == 21){
							super.k.a(k3, j4 - 5, 16);
						}
					}
					
				}
			}
			
		}
		
		if(ab == 0 || d != super.q){
			super.k.a(5, 220, 75, 70, bb, 160, false);
			for(int j2 = -5; j2 <= 5; j2++){
				for(int i3 = -5; i3 <= 5; i3++){
					if(sc[j2 + lc][i3 + kc] != -1){
						int l3 = sc[j2 + lc][i3 + kc];
						if(l3 == 13){
							l3 = 12;
						}
						if(j2 == 0 && i3 == 0){
							l3 = 13;
						}
						if(l3 != 14){
							super.k.a(j2 * 6 + 39, i3 * 6 + 252, l3 + 19);
						}
					}
				}
				
			}
			
		}
		super.k.b(99);
	}
	
	@Override
	public void d(){
		g++;
		if(h > 0){
			h--;
		}
		if(ad > 0){
			ad--;
			if(ad == 0){
				b[wc] = zc;
				a[wc] = yc;
			}
		} else if(ad < 0){
			ad++;
		}
		if(ad == (xc * 2) / 3 || ad == -(xc * 2) / 3){
			sc[zc][yc] = z;
			b();
		}
		if(ad == 0 && gb > 0){
			gb = 0;
		}
		if(((opencgd.library.EngineApplet) (super.w)).hh == 1 && j == -1){
			for(int i1 = 0; i1 < 7; i1++){
				for(int l1 = 1; l1 < 5; l1++){
					if(((opencgd.library.EngineApplet) (super.w)).e - 6 <= 29 + 10 * l1 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 20 + 10 * l1 && ((opencgd.library.EngineApplet) (super.w)).f - 6 >= 5 + 70 * i1 && ((opencgd.library.EngineApplet) (super.w)).f - 6 <= 74 + 70 * i1 && r[i1][l1] != -1){
						j = i1;
						i = l1;
						k = hb[r[i1][l1]];
					}
				}
				
			}
			
		} else if(((opencgd.library.EngineApplet) (super.w)).hh == 1 && j != -1){
			for(int j1 = 0; j1 < 7; j1++){
				for(int i2 = 1; i2 < 5; i2++){
					if(((opencgd.library.EngineApplet) (super.w)).e - 6 < 29 + 10 * i2 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 20 + 10 * i2 && ((opencgd.library.EngineApplet) (super.w)).f - 6 >= 5 + 70 * j1 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 74 + 70 * j1){
						int j2 = r[j1][i2];
						if(j2 != -1 && i2 > 0 && j != j1 && j != -1 && hb[j2] + c[j1] >= k && hb[j2] <= k + c[j]){
							super.connectionStream.setPacketID(253);
							super.connectionStream.addShort(j);
							super.connectionStream.addShort(i);
							super.connectionStream.addShort(j1);
							super.connectionStream.addShort(i2);
							super.connectionStream.sendPacket();
							j = -1;
						} else if(j2 == -1 && i2 > 0 && j != j1 && j != -1 && r[j1][i2 - 1] != -1 && c[j1] >= k){
							super.connectionStream.setPacketID(253);
							super.connectionStream.addShort(j);
							super.connectionStream.addShort(i);
							super.connectionStream.addShort(j1);
							super.connectionStream.addShort(i2);
							super.connectionStream.sendPacket();
							j = -1;
						}
					}
				}
				
			}
			
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 5 && ((opencgd.library.EngineApplet) (super.w)).f - 6 <= 74 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 70 && ((opencgd.library.EngineApplet) (super.w)).e - 6 <= 79 && j != -1){
				super.connectionStream.setPacketID(253);
				super.connectionStream.addShort(j);
				super.connectionStream.addShort(i);
				super.connectionStream.addShort(255);
				super.connectionStream.addShort(255);
				super.connectionStream.sendPacket();
				j = -1;
			}
			j = -1;
		}
		if(d == super.q && ((opencgd.library.EngineApplet) (super.w)).hh == 1 && h == 0 && e > 0){
			if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 433 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 460 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 220 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < 247){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(0);
				super.connectionStream.sendPacket();
			} else if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 468 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 495 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 228 && ((opencgd.library.EngineApplet) (super.w)).e - 6 <= 255){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(1);
				super.connectionStream.sendPacket();
			} else if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 425 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 452 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 255 && ((opencgd.library.EngineApplet) (super.w)).e - 6 <= 282){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(3);
				super.connectionStream.sendPacket();
			} else if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 460 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 487 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 263 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < 290){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(2);
				super.connectionStream.sendPacket();
			} else if(((opencgd.library.EngineApplet) (super.w)).f - 6 >= 453 && ((opencgd.library.EngineApplet) (super.w)).f - 6 < 466 && ((opencgd.library.EngineApplet) (super.w)).e - 6 >= 248 && ((opencgd.library.EngineApplet) (super.w)).e - 6 < 261){
				super.connectionStream.setPacketID(255);
				super.connectionStream.addByte(4);
				super.connectionStream.sendPacket();
			}
		}
		t = -1;
		if(ab == 1 && d == super.q && h == 0){
			for(int k1 = 0; k1 < v; k1++){
				if(((opencgd.library.EngineApplet) (super.w)).f > 16 && ((opencgd.library.EngineApplet) (super.w)).f < 126 && ((opencgd.library.EngineApplet) (super.w)).e > 106 + k1 * 12 && ((opencgd.library.EngineApplet) (super.w)).e < 118 + k1 * 12){
					t = k1;
					if(((opencgd.library.EngineApplet) (super.w)).hh == 1){
						super.connectionStream.setPacketID(254);
						super.connectionStream.addShort(u[t]);
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
		for(int i1 = 0; i1 < 100; i1++){
			for(int j1 = 0; j1 < 100; j1++){
				sc[i1][j1] = -1;
				tc[i1][j1] = -1;
				cb[i1][j1] = false;
			}
			
		}
		
		sc[50][50] = 0;
		for(int k1 = 0; k1 < 6; k1++){
			b[k1] = 50;
			a[k1] = 50;
			fb[k1] = 43;
		}
		
		for(int l1 = 0; l1 < 7; l1++){
			for(int i2 = 0; i2 < 5; i2++){
				r[l1][i2] = -1;
			}
			
		}
		
		lc = 50;
		kc = 50;
		ab = 0;
		f = 80;
		e = 60;
		xb = 0;
		for(int j2 = 0; j2 < 100; j2++){
			yb[j2] = 0;
		}
		
		b();
	}
	
	private void c(){
		ec = new String[y];
		hc = new String[y];
		jb = new int[y];
		ib = new int[y];
		hb = new int[y];
		gc = new int[y];
		fc = new int[y];
		kb = new int[y];
		lb = new int[y];
		int i1 = 0;
		try{
			opencgd.library.Buffer buffer = new opencgd.library.Buffer("crypt/cards.dat");
			for(i1 = 0; i1 < y; i1++){
				buffer.m();
				ec[i1] = buffer.getString();
				jb[i1] = buffer.getInt();
				ib[i1] = buffer.getInt();
				hb[i1] = buffer.getInt();
				gc[i1] = buffer.getInt();
				fc[i1] = buffer.getInt();
				kb[i1] = buffer.getInt();
				lb[i1] = buffer.getInt();
				hc[i1] = buffer.getString();
				buffer.getInt();
			}
			
			buffer.closeStream();
			return;
		} catch(IOException _ex){
			System.out.println("Fatal error loading feature-list! n=" + i1);
		}
	}
	
	@Override
	public void loadMedia(){
		super.p = 4;
		super.k.a();
		super.k.a("crypt/back.jpg", 0, false);
		super.k.a("crypt/bits.gif", 1, true, 18, 163, 113);
		super.k.a("crypt/map.gif", 19, true, 14, 6, 6);
		super.k.a("crypt/compass.gif", 33, true, 10, 27, 27);
		super.k.a("crypt/knight.gif", 43, true, 6, 31, 34);
		super.k.a("crypt/all.gif", 49, true, y, 50, 75);
		super.k.a("crypt/allmini.gif", 49 + y, true, y - 2, 30, 44);
		c();
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			d = super.connectionStream.b(super.ab, 1);
			e = super.connectionStream.b(super.ab, 3);
			f = super.connectionStream.b(super.ab, 5);
			ab = 0;
			if(d != s || ab != x){
				s = d;
				x = ab;
				lc = b[d];
				kc = a[d];
				b();
			}
			return;
		}
		if(i1 == 254){
			ab = 0;
			ad = xc;
			gb = 40;
			wc = super.connectionStream.a(super.ab[1]);
			vc = super.connectionStream.a(super.ab[2]);
			uc = super.connectionStream.a(super.ab[3]);
			zc = super.connectionStream.a(super.ab[4]);
			yc = super.connectionStream.a(super.ab[5]);
			z = super.connectionStream.a(super.ab[6]);
			b[wc] = lc = vc;
			a[wc] = kc = uc;
			b();
			return;
		}
		if(i1 == 253){
			ab = 0;
			ad = -xc;
			gb = 40;
			wc = super.connectionStream.a(super.ab[1]);
			vc = super.connectionStream.a(super.ab[2]);
			uc = super.connectionStream.a(super.ab[3]);
			zc = super.connectionStream.a(super.ab[4]);
			yc = super.connectionStream.a(super.ab[5]);
			z = super.connectionStream.a(super.ab[6]);
			b[wc] = lc = vc;
			a[wc] = kc = uc;
			b();
			return;
		}
		if(i1 == 252){
			d = super.connectionStream.b(super.ab, 1);
			e = super.connectionStream.b(super.ab, 3);
			ab = 1;
			p = super.connectionStream.b(super.ab, 5);
			o = super.connectionStream.b(super.ab, 7);
			f = super.connectionStream.b(super.ab, 9);
			if(d != s || ab != x){
				s = d;
				x = ab;
				lc = b[d];
				kc = a[d];
				b();
			}
			boolean flag = false;
			boolean flag1 = false;
			v = 0;
			int k3 = -1;
			int j4 = -1;
			int l4 = tc[p][o];
			int j5 = yb[l4];
			for(int k5 = 0; k5 < j5; k5++){
				int l5 = wb[l4][k5];
				if(l5 == 15 || l5 == 16){
					flag = true;
				}
				if(l5 == 21){
					flag1 = true;
				}
				if(jb[l5] == 1 && ib[l5] > j4){
					k3 = k5;
					j4 = ib[l5];
				}
			}
			
			if(k3 != -1){
				if(!cb[p][o]){
					u[v] = k3 * 256;
					w[v++] = "Talk to " + ec[wb[l4][k3]];
				}
				u[v] = 1;
				w[v++] = "Attack!";
				u[v] = 2;
				w[v++] = "Retreat";
				for(int i6 = 0; i6 < 7; i6++){
					for(int l6 = 1; l6 < 5; l6++){
						if(r[i6][l6] == 7 && flag){
							u[v] = 7;
							w[v++] = "Use Cross";
						}
						if(r[i6][l6] == 9){
							u[v] = 6;
							w[v++] = "Drink potion & Attack";
						}
					}
					
				}
				
			} else {
				for(int j6 = 0; j6 < j5; j6++){
					int i7 = wb[l4][j6];
					if(i7 == 20){
						u[v] = 5;
						w[v++] = "Open Sarcophagus";
					}
					if(jb[i7] == 0){
						u[v] = 4 + j6 * 256;
						w[v++] = "Take " + ec[i7];
					}
				}
				
				u[v] = 3;
				w[v++] = "End Turn";
			}
			for(int k6 = 0; k6 < 7; k6++){
				for(int j7 = 1; j7 < 5; j7++){
					if(r[k6][j7] == 4 && flag1){
						u[v] = 8;
						w[v++] = "Cut web with sword";
					}
				}
				
			}
			
			return;
		}
		if(i1 == 251){
			int k1 = super.connectionStream.b(super.ab, 1);
			int k2 = super.connectionStream.b(super.ab, 3);
			int l3 = super.connectionStream.b(super.ab, 5);
			int k4 = super.connectionStream.b(super.ab, 7);
			tc[k1][k2] = l3;
			yb[l3] = k4;
			if(l3 + 1 > xb){
				xb = l3 + 1;
			}
			for(int i5 = 0; i5 < k4; i5++){
				wb[l3][i5] = super.connectionStream.b(super.ab, 9 + i5 * 2);
			}
			
			b();
			return;
		}
		if(i1 == 250){
			for(int l1 = 0; l1 < 7; l1++){
				int l2 = 0;
				for(int i4 = 0; i4 < 5; i4++){
					r[l1][i4] = super.ab[1 + l1 * 5 + i4];
					if(i4 == 0 && r[l1][i4] != -1){
						l2 = hb[r[l1][i4]];
					} else if(r[l1][i4] != -1){
						l2 -= hb[r[l1][i4]];
					}
				}
				
				c[l1] = l2;
			}
			
			j = -1;
			return;
		}
		if(i1 == 249){
			ac = super.connectionStream.b(super.ab, 1);
			int i2 = super.connectionStream.b(super.ab, 3);
			int i3 = super.connectionStream.b(super.ab, 5);
			if(ac == super.q){
				cb[i2][i3] = true;
			}
			super.connectionStream.b(super.ab, 7);
			dc = super.connectionStream.b(super.ab, 9);
			bc = super.connectionStream.b(super.ab, 11);
			tb = super.ab[13];
			sb = super.ab[14];
			ub = super.connectionStream.b(super.ab, 15);
			rb = super.connectionStream.b(super.ab, 17);
			qb = super.ab[19];
			pb = super.ab[20];
			ob = super.ab[21];
			nb = super.ab[22];
			mb = super.ab[23];
			vb = super.ab[24];
			if(vb == 1){
				zb = super.connectionStream.b(super.ab, 25);
			}
			h = 200;
			return;
		}
		if(i1 == 248){
			int j2 = super.connectionStream.a(super.ab[1]);
			int j3 = super.connectionStream.a(super.ab[2]);
			sc[j2][j3] = 14;
			tc[j2][j3] = -2;
			b();
		}
	}
	
	@Override
	public boolean i(){
		if(ad != 0){
			return false;
		}
		if(gb != 0){
			return false;
		}
		return h == 0;
	}
}