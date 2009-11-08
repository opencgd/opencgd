package opencgd.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import opencgd.client.library.B;
import opencgd.client.library.Buffer;
import opencgd.client.library.D;
import opencgd.client.library.E;
import opencgd.client.library.F;
import opencgd.games.BattleCruisers;
import opencgd.games.Checkers;
import opencgd.games.Chess;
import opencgd.games.Crypt;
import opencgd.games.CyberWars;
import opencgd.games.Dungeon;
import opencgd.games.Mahjong;
import opencgd.games.MysteryMonster;
import opencgd.games.Pairs;
import opencgd.games.QuadLink;
import opencgd.games.Reversi;

public class OpenCGD extends opencgd.client.library.EngineApplet {
	
	private static final long serialVersionUID = -5350768759203686867L;
	private int p;
	private String eb[] = {
			"Non rated game", "Rated Game"
	};
	private String l[] = {
			"30-secs", "1-min", "2-mins", "4-mins", "10-mins"
	};
	private int ue;
	private int fb;
	private int o;
	private int xc;
	private boolean ve[] = {
			true, true, true, true, true, true, true, true
	};
	private boolean gb;
	private int k;
	private int ld[];
	private int bd[];
	private String gd[];
	private int jc;
	private int hd;
	private int xb;
	private boolean fe;
	String e;
	String f;
	int d;
	private int mb;
	int currentGame;
	private String fd[] = {
			"Checkers", "Chess", "Battle-Cruisers", "Quad-Link", "Reversi", "Mystery Monster", "Mahjong", "Pairs", "Treasure Crypt", "Castle Dungeon", "Cyber wars"
	};
	int pd;
	private Color xd;
	private Color rc;
	private Color db;
	private String vb;
	private int bb;
	private int z[];
	private int ab[];
	private int qe[][];
	int pe;
	int se;
	int te;
	private int ud[][];
	private int vd[][];
	private int yb;
	private F wd[];
	private boolean ke;
	private int zc;
	private int b;
	private int he;
	private int je[][];
	private int lb;
	private int pb[][];
	private int a;
	private int c;
	private int qd;
	private int ae[][];
	private int kc[][];
	private int lc[][];
	private int mc[][];
	private int nc[][];
	private int ce;
	private int yd;
	private F i;
	private F r;
	private F ge;
	private F sc;
	private String messageBottom;
	private String messageTop;
	private int pc;
	private String password;
	private String username;
	private int s;
	private F ie;
	private int be;
	private boolean cb;
	private int ad;
	private int ib;
	protected static int id;
	private static int myscore;
	private boolean dd;
	private int tc[];
	private int vc[];
	private int uc[];
	private String yc[];
	private int rb[];
	int x[];
	String ac[];
	int wb;
	int j;
	int ic;
	private String de[];
	private String wc;
	boolean oc;
	int n;
	int m;
	int jb;
	int kb;
	byte oe[];
	Buffer y;
	private int zd[];
	private boolean ed;
	private AbstractGame games[];
	private static boolean inAppletMode = true;
	int sb;
	int gameScreen;
	boolean lowDetail;
	private boolean qc;
	private int cc;
	E nb;
	private B g;
	Graphics md;
	private Font rd;
	private Font sd;
	private Font td;
	private Font h;
	Font t;
	private Font me;
	private Font u;
	private Font ec;
	private Font fc;
	private Font ne;
	Image hb;
	Image qb;
	private boolean nd;
	Image le;
	Graphics graphics;
	
	public OpenCGD(){
		nd = true;
		ne = new Font("Helvetica", 0, 40);
		fc = new Font("Helvetica", 0, 23);
		ec = new Font("Helvetica", 0, 21);
		u = new Font("Helvetica", 1, 16);
		me = new Font("Helvetica", 1, 13);
		t = new Font("Helvetica", 0, 13);
		h = new Font("Helvetica", 1, 10);
		td = new Font("Helvetica", 1, 30);
		sd = new Font("Helvetica", 1, 18);
		rd = new Font("Helvetica", 0, 15);
		cc = 0xbc614e;
		qc = false;
		lowDetail = false;
		gameScreen = -1;
		sb = -2;
		games = new AbstractGame[11];
		ed = false;
		zd = new int[11];
		oe = new byte[5000];
		n = 75;
		oc = false;
		wc = "127.0.0.1";
		de = new String[3];
		ic = 500;
		ac = new String[ic];
		x = new int[ic];
		rb = new int[ic];
		yc = new String[50];
		uc = new int[50];
		vc = new int[50];
		tc = new int[50];
		dd = false;
		cb = true;
		username = "";
		password = "";
		zc = -80;
		ke = false;
		wd = new F[20];
		te = -1;
		se = -1;
		pe = -1;
		vb = "";
		db = new Color(160, 0, 0);
		rc = new Color(192, 192, 192);
		xd = new Color(128, 0, 0);
		mb = -1;
		f = "";
		e = "";
		fe = true;
		hd = -1;
		jc = 500;
		gd = new String[jc];
		bd = new int[jc];
		ld = new int[jc];
		k = 1;
		gb = true;
		xc = -330;
		o = 1;
		fb = 1;
	}
	
	private void a(Graphics g1, int i1, int j1, int k1, int l1, boolean flag){
		g1.drawRect(i1, j1, k1, l1);
		if(flag){
			g1.drawLine(i1, j1, i1 + k1, j1 + l1);
			g1.drawLine(i1 + k1, j1, i1, j1 + l1);
		}
	}
	
	private void h(){
		if(pd < 200){
			boolean flag = lowDetail;
			if(pd == 140){
				flag = false;
			}
			if(!flag){
				nb.b(0, 0, 500, 145, Color.black);
				nb.a(0, 145, 500, 145, Color.black, new Color(136, 136, 136), flag);
			} else {
				nb.a(0, 0, 500, 145, new Color(136, 136, 136), Color.black, flag);
				nb.a(0, 145, 500, 145, Color.black, new Color(136, 136, 136), flag);
			}
			g.a(flag);
			if(fe){
				nb.a(12, 4, 120, 10, rc, pd, flag);
				nb.a(12, 16, 120, 256, rc, pd, flag);
				nb.a(12, 274, 120, 10, rc, pd, flag);
			} else {
				nb.a(12, 4, 120, 10, rc, pd, flag);
				nb.a(12, 16, 120, 104, rc, pd, flag);
				nb.a(12, 122, 120, 10, rc, pd, flag);
				nb.a(12, 134, 120, 10, rc, pd, flag);
				nb.a(12, 146, 120, 126, rc, pd, flag);
				nb.a(12, 274, 120, 10, rc, pd, flag);
			}
			nb.a(138, 4, 352, 20, rc, pd, flag);
			nb.a(138, 30, 352, 144, rc, pd, flag);
			nb.a(138, 180, 352, 104, rc, pd, flag);
			if(pd == 140){
				nd = true;
			}
			if(!nd){
				nb.a(md, 6, 6, flag);
			} else {
				nb.a(graphics, 6, 6, flag);
				md.drawImage(le, 0, 0, this);
				nd = false;
			}
			if(pd == 140){
				pd = 200;
			}
		}
		if(pd >= 200){
			nb.a(graphics, 6, 6, false);
			graphics.setColor(Color.black);
			graphics.setFont(me);
			if(wb == 1){
				graphics.drawString(fd[currentGame] + " - Currently " + wb + " player", 148, 24);
			} else {
				graphics.drawString(fd[currentGame] + " - Currently " + wb + " players", 148, 24);
			}
			if(d == 0){
				graphics.drawLine(144, 52, 495, 52);
				graphics.setFont(u);
				graphics.drawString("Top Players", 146, 49);
				graphics.setFont(me);
				graphics.drawString("Name:", 148, 63);
				graphics.drawString("Rating:", 263, 63);
				graphics.drawString("Score:", 355, 63);
				graphics.drawString("Played:", 403, 63);
				graphics.drawString("Won:", 457, 63);
				graphics.drawLine(144, 66, 495, 66);
				graphics.setFont(t);
				if(dd){
					Graphics g1 = graphics.create();
					g1.clipRect(138, 70, 352, 105);
					for(int k1 = 0; k1 < 50; k1++){
						int k2 = (78 + k1 * 16) - xc / 3;
						if(k2 >= 30 && k2 <= 190){
							g1.drawString((k1 + 1) + ": " + yc[k1], 148, k2);
							g1.drawString(b(uc[k1]), 263, k2);
							g1.drawString(String.valueOf(uc[k1]), 355, k2);
							g1.drawString(String.valueOf(vc[k1]), 403, k2);
							g1.drawString(String.valueOf(tc[k1]), 457, k2);
						}
					}
					
				}
			} else if(d == 1){
				D.a(graphics, f, ec, 320, 90);
				D.a(graphics, l[o] + " per move - " + eb[fb], u, 320, 110);
				if(super.f > 214 && super.f < 414 && super.e > 125 && super.e < 145){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				D.a(graphics, "Accept Challenge", u, 320, 140);
				if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				D.a(graphics, "Decline Challenge", u, 320, 160);
			} else if(d == 2){
				D.a(graphics, f, ec, 320, 80);
				D.a(graphics, l[o] + " per move - " + eb[fb], u, 320, 100);
				D.a(graphics, "Waiting for a response", u, 320, 120);
				if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				D.a(graphics, "Abort Challenge", u, 320, 160);
			} else if(d == 3){
				D.a(graphics, f, ec, 320, 90);
				if(e.length() > 55){
					D.a(graphics, e, h, 320, 120);
				} else if(e.length() > 40){
					D.a(graphics, e, t, 320, 120);
				} else {
					D.a(graphics, e, u, 320, 120);
				}
				if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				D.a(graphics, "Click mouse to continue", u, 320, 160);
			} else if(d == 4){
				D.a(graphics, f, ec, 320, 70);
				D.a(graphics, e, u, 320, 90);
				D.a(graphics, l[o] + " per move - " + eb[fb], me, 320, 105);
				if(ue == 0){
					D.a(graphics, "All player-levels allowed", me, 320, 120);
				} else {
					D.a(graphics, "Restricted player-levels allowed", me, 320, 120);
				}
				if(super.f > 214 && super.f < 414 && super.e > 125 && super.e < 145){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				if(id == 0){
					D.a(graphics, "Start game", u, 320, 140);
				}
				if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				if(id == 0){
					D.a(graphics, "Abort game", u, 320, 160);
				} else {
					D.a(graphics, "Leave game", u, 320, 160);
				}
			} else if(d == 5){
				String as[] = new String[50];
				int l1 = 0;
				int l2 = 0;
				String s1 = "";
				for(; l2 < f.length(); l2++){
					char c1 = f.charAt(l2);
					if(c1 == '*'){
						as[l1++] = s1;
						s1 = "";
					} else {
						s1 = s1 + c1;
					}
				}
				
				as[l1++] = s1;
				Font font = t;
				byte byte0 = 6;
				if(l1 > 9){
					font = h;
					byte0 = 4;
				}
				graphics.setFont(t);
				graphics.setColor(Color.black);
				for(int i4 = 0; i4 < l1; i4++){
					D.a(graphics, as[i4], font, 320, (110 - l1 * byte0) + i4 * byte0 * 2);
				}
				
				D.a(graphics, "You won! Score breakdown is:", u, 320, 45);
				D.a(graphics, "Click mouse to continue", t, 320, 170);
			}
			graphics.setFont(me);
			graphics.setColor(Color.black);
			graphics.drawString("Time per move:", 147, 198);
			if(k == 0){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("30-sec", 251, 198);
			if(k == 1){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("1-min", 298, 198);
			if(k == 2){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("2-min", 341, 198);
			if(k == 3){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("4-min", 384, 198);
			if(k == 4){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("10-min", 427, 198);
			graphics.setColor(Color.black);
			graphics.drawString("Rated game:", 147, 211);
			if(gb){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("Yes", 236, 211);
			if(!gb){
				graphics.setColor(db);
			} else {
				graphics.setColor(Color.black);
			}
			graphics.drawString("No", 270, 211);
			graphics.setColor(Color.black);
			graphics.drawLine(144, 230, 495, 230);
			graphics.drawString("Will play against following players:", 147, 242);
			graphics.setFont(t);
			graphics.drawString("- Beginner", 161, 255);
			a(graphics, 149, 246, 9, 9, ve[0]);
			graphics.drawString("- Novice", 161, 270);
			a(graphics, 149, 261, 9, 9, ve[1]);
			graphics.drawString("- Apprentice", 236, 255);
			a(graphics, 224, 246, 9, 9, ve[2]);
			graphics.drawString("- Intermediate", 236, 270);
			a(graphics, 224, 261, 9, 9, ve[3]);
			graphics.drawString("- Experienced", 331, 255);
			a(graphics, 319, 246, 9, 9, ve[4]);
			graphics.drawString("- Expert", 331, 270);
			a(graphics, 319, 261, 9, 9, ve[5]);
			graphics.drawString("- Master", 427, 255);
			a(graphics, 415, 246, 9, 9, ve[6]);
			graphics.drawString("- GM", 427, 270);
			a(graphics, 415, 261, 9, 9, ve[7]);
			graphics.drawLine(144, 274, 495, 274);
			graphics.setFont(me);
			graphics.drawString("Your rating is: " + myscore + " (" + b(myscore) + ")", 149, 286);
			graphics.setFont(h);
			graphics.setColor(db);
			if(d != 4){
				graphics.drawString("Waiting players", 20, 31);
			} else {
				graphics.drawString("Players in game", 20, 31);
			}
			if(fe){
				graphics.drawString("Click name to challenge", 20, 44);
				graphics.setColor(Color.black);
				graphics.drawLine(18, 46, 137, 46);
			} else {
				graphics.setColor(Color.black);
				graphics.drawLine(18, 33, 137, 33);
			}
			int i1 = 0;
			int i2 = 0;
			int i3 = 57;
			if(!fe){
				i3 -= 13;
			}
			for(int j3 = ib; j3 < j; j3++){
				if(ac[j3] == null){
					continue;
				}
				if(c(rb[j3])){
					graphics.setColor(Color.black);
				} else {
					graphics.setColor(xd);
				}
				if(mb == j3 && fe){
					graphics.setColor(db);
				}
				graphics.drawString(ac[j3] + " (" + x[j3] + ")", 20, i3 + i1);
				i1 += 12;
				if(++i2 >= 19 || i2 >= 7 && !fe){
					break;
				}
			}
			
			graphics.setColor(Color.black);
			if(super.f > 18 && super.e > 10 && super.f < 138 && super.e < 20){
				graphics.setColor(db);
			}
			graphics.drawString("Up", 71, 19);
			graphics.setColor(Color.black);
			if(fe){
				if(super.f > 18 && super.e > 280 && super.f < 138 && super.e < 290){
					graphics.setColor(db);
				}
				graphics.drawString("Down", 65, 288);
			} else {
				if(super.f > 18 && super.e > 128 && super.f < 138 && super.e < 138){
					graphics.setColor(db);
				}
				graphics.drawString("Down", 65, 136);
			}
			if(!fe && d != 4){
				graphics.setFont(h);
				graphics.setColor(db);
				graphics.drawString("Available games", 20, 161);
				graphics.drawString("Click game to join", 20, 174);
				graphics.setColor(Color.black);
				graphics.drawLine(18, 176, 137, 176);
				int j1 = 0;
				int j2 = 0;
				for(int k3 = ad; k3 < xb; k3++){
					if(gd[k3] == null){
						continue;
					}
					if(c(ld[k3])){
						graphics.setColor(Color.black);
					} else {
						graphics.setColor(xd);
					}
					if(hd == k3){
						graphics.setColor(db);
					}
					graphics.drawString(gd[k3] + "'s game (" + bd[k3] + "/" + games[currentGame].p + ")", 20, j1 + 57 + 130);
					j1 += 12;
					if(++j2 >= 7){
						break;
					}
				}
				
				if(hd == xb){
					graphics.setColor(db);
				} else {
					graphics.setColor(Color.black);
				}
				graphics.drawString("Create new game", 20, j1 + 57 + 130);
				graphics.setColor(Color.black);
				if(super.f > 18 && super.e > 140 && super.f < 138 && super.e < 150){
					graphics.setColor(db);
				}
				graphics.drawString("Up", 71, 149);
				graphics.setColor(Color.black);
				if(super.f > 18 && super.e > 280 && super.f < 138 && super.e < 290){
					graphics.setColor(db);
				}
				graphics.drawString("Down", 65, 288);
			}
			graphics.drawImage(qb, 0, 298, this);
			graphics.drawImage(hb, currentGame * 46 + 3, 352, this);
			graphics.setColor(Color.white);
			graphics.setFont(t);
			if(super.jj != null){
				graphics.drawString(super.jj, 8, 349);
			}
			for(int l3 = 0; l3 < 3; l3++){
				if(de[l3] != null){
					graphics.drawString(de[l3], 8, 336 - l3 * 12);
				}
			}
			
			md.drawImage(le, 0, 0, this);
		}
	}
	
	private boolean c(int i1){
		if(myscore <= 100 && (i1 & 1) == 0){
			return true;
		}
		if(myscore > 100 && myscore <= 120 && (i1 & 2) == 0){
			return true;
		}
		if(myscore > 120 && myscore <= 140 && (i1 & 4) == 0){
			return true;
		}
		if(myscore > 140 && myscore <= 170 && (i1 & 8) == 0){
			return true;
		}
		if(myscore > 170 && myscore <= 200 && (i1 & 0x10) == 0){
			return true;
		}
		if(myscore > 200 && myscore <= 250 && (i1 & 0x20) == 0){
			return true;
		}
		if(myscore > 250 && myscore <= 300 && (i1 & 0x40) == 0){
			return true;
		}
		return myscore > 300 && (i1 & 0x80) == 0;
	}
	
	private String b(int i1){
		if(i1 <= 100){
			return "Beginner";
		}
		if(i1 <= 120){
			return "Novice";
		}
		if(i1 <= 140){
			return "Apprentice";
		}
		if(i1 <= 170){
			return "Intermediate";
		}
		if(i1 <= 200){
			return "Experienced";
		}
		if(i1 <= 250){
			return "Expert";
		}
		if(i1 <= 300){
			return "Master";
		} else {
			return "GrandMaster";
		}
	}
	
	private void i(){
		j();
		k();
		if(pd < 140){
			pd += 3;
			if(pd > 140){
				pd = 140;
			}
		}
		if(pd >= 200 && dd){
			xc += 2;
			if(xc >= 2450){
				xc = -330;
			}
		}
		if(super.hh != 0 && super.e > 351){
			int i1 = (super.f - 3) / 46;
			if(i1 < 0){
				i1 = 0;
			} else if(i1 > 10){
				i1 = 10;
			}
			gameScreen = 1;
			te = -1;
			se = -1;
			super.hh = 0;
			if(currentGame == i1){
				pe = -1;
			} else {
				pe = i1;
			}
		}
		p++;
		if(super.g == 1 && p % 4 == 0){
			if(super.f > 18 && super.e > 10 && super.f < 138 && super.e < 20){
				do {
					ib--;
					if(ib < 0){
						ib = 0;
					}
				} while(ib != 0 && ac[ib] == null);
			}
			if(super.f > 18 && super.e > 280 && super.f < 138 && super.e < 290 && fe){
				do {
					ib++;
					if(ib > j - 7){
						ib = j - 7;
					}
				} while(ib != j - 7 && ac[ib] == null);
			}
			if(super.f > 18 && super.e > 128 && super.f < 138 && super.e < 138 && !fe){
				do {
					ib++;
					if(ib > j - 7){
						ib = j - 7;
					}
				} while(ib != j - 7 && ac[ib] == null);
			}
			if(super.f > 18 && super.e > 140 && super.f < 138 && super.e < 150){
				do {
					ad--;
					if(ad < 0){
						ad = 0;
					}
				} while(ad != 0 && gd[ad] == null);
			}
			if(super.f > 18 && super.e > 280 && super.f < 138 && super.e < 290){
				do {
					ad++;
					if(ad > xb - 7){
						ad = xb - 7;
					}
				} while(ad != xb - 7 && gd[ad] == null);
			}
		}
		if(ad > xb - 7){
			ad = xb - 7;
		}
		if(ib > j - 7){
			ib = j - 7;
		}
		if(ad < 0){
			ad = 0;
		}
		if(ib < 0){
			ib = 0;
		}
		hd = -1;
		mb = -1;
		if(super.f > 20 && super.f < 140 && super.e > 47 && super.e < 272){
			if(fe){
				int j1 = 57;
				int l1 = 0;
				for(int k2 = ib; k2 < j; k2++){
					if(ac[k2] == null){
						continue;
					}
					if(super.e >= j1 - 10 && super.e <= j1 + 2){
						mb = k2;
					}
					j1 += 12;
					if(++l1 >= 19 || l1 >= 7 && !fe){
						break;
					}
				}
				
				if(super.hh != 0 && mb != -1){
					y.setPacketID(6);
					y.addShort(mb);
					y.sendPacket();
					super.hh = 0;
				}
			} else {
				int k1 = 187;
				int i2 = 0;
				for(int l2 = ad; l2 <= xb; l2++){
					if(gd[l2] == null && l2 != xb){
						continue;
					}
					if(super.e >= k1 - 10 && super.e <= k1 + 2){
						hd = l2;
					}
					k1 += 12;
					if(++i2 >= 7){
						break;
					}
				}
				
				if(super.hh != 0 && hd != -1){
					if(hd < xb){
						y.setPacketID(13);
						y.addShort(hd);
						y.sendPacket();
					} else {
						y.setPacketID(10);
						y.sendPacket();
					}
				}
			}
		}
		if(d == 1 && super.hh != 0){
			if(super.f > 214 && super.f < 414 && super.e > 125 && super.e < 145){
				y.setPacketID(7);
				y.sendPacket();
			}
			if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
				y.setPacketID(8);
				y.sendPacket();
				d = 0;
			}
			super.hh = 0;
		} else if(d == 2 && super.hh != 0){
			if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
				y.setPacketID(8);
				y.sendPacket();
				d = 0;
			}
			super.hh = 0;
		} else if((d == 3 || d == 5) && super.hh != 0){
			d = 0;
			super.hh = 0;
		} else if(d == 4 && super.hh != 0){
			if(super.f > 214 && super.f < 414 && super.e > 125 && super.e < 145){
				y.setPacketID(11);
				y.sendPacket();
				super.hh = 0;
			}
			if(super.f > 214 && super.f < 414 && super.e > 145 && super.e < 165){
				y.setPacketID(12);
				y.sendPacket();
				d = 0;
				super.hh = 0;
			}
		}
		if(super.hh != 0){
			boolean flag = false;
			if(super.e > 188 && super.e <= 198){
				if(super.f >= 250 && super.f < 293){
					k = 0;
					flag = true;
				}
				if(super.f >= 298 && super.f < 336){
					k = 1;
					flag = true;
				}
				if(super.f >= 341 && super.f < 379){
					k = 2;
					flag = true;
				}
				if(super.f >= 384 && super.f < 422){
					k = 3;
					flag = true;
				}
				if(super.f >= 427 && super.f < 477){
					k = 4;
					flag = true;
				}
			}
			if(super.e > 201 && super.e <= 211){
				if(super.f >= 236 && super.f < 266){
					gb = true;
					flag = true;
				}
				if(super.f >= 270 && super.f < 300){
					gb = false;
					flag = true;
				}
			}
			if(super.e >= 246 && super.e <= 255){
				if(super.f >= 149 && super.f <= 158){
					ve[0] = !ve[0];
					flag = true;
				}
				if(super.f >= 224 && super.f <= 233){
					ve[2] = !ve[2];
					flag = true;
				}
				if(super.f >= 319 && super.f <= 328){
					ve[4] = !ve[4];
					flag = true;
				}
				if(super.f >= 415 && super.f <= 424){
					ve[6] = !ve[6];
					flag = true;
				}
			}
			if(super.e >= 261 && super.e <= 270){
				if(super.f >= 149 && super.f <= 158){
					ve[1] = !ve[1];
					flag = true;
				}
				if(super.f >= 224 && super.f <= 233){
					ve[3] = !ve[3];
					flag = true;
				}
				if(super.f >= 319 && super.f <= 328){
					ve[5] = !ve[5];
					flag = true;
				}
				if(super.f >= 415 && super.f <= 424){
					ve[7] = !ve[7];
					flag = true;
				}
			}
			if(flag){
				y.setPacketID(5);
				y.addShort(k);
				y.addShort(gb ? 1 : 0);
				int j2 = 0;
				if(!ve[0]){
					j2++;
				}
				if(!ve[1]){
					j2 += 2;
				}
				if(!ve[2]){
					j2 += 4;
				}
				if(!ve[3]){
					j2 += 8;
				}
				if(!ve[4]){
					j2 += 16;
				}
				if(!ve[5]){
					j2 += 32;
				}
				if(!ve[6]){
					j2 += 64;
				}
				if(!ve[7]){
					j2 += 128;
				}
				y.addShort(j2);
				y.sendPacket();
			}
		}
		super.hh = 0;
	}
	
	private void k(){
		try{
			if(super.ii != ""){
				y.setPacketID(3);
				y.addString(super.ii);
				y.sendPacket();
				m = 0;
				super.jj = "";
				super.ii = "";
			}
			if(kb == 0 && y.p() >= 2){
				kb = y.q();
			}
			if(kb > 0 && y.p() >= kb){
				y.a(kb, oe);
				jb = y.a(oe[0]);
				
				if(jb == 5){					
					wb = y.getShort(oe, 1);
					id = y.getShort(oe, 3);
					int i1 = (kb - 5) / 18;
					j = 0;
					for(int k2 = 0; k2 < ic; k2++){
						ac[k2] = null;
					}
					
					for(int j3 = 0; j3 < i1; j3++){
						int l3 = y.getShort(oe, 5 + j3 * 18);
						x[l3] = y.getShort(oe, 7 + j3 * 18);
						rb[l3] = y.getShort(oe, 9 + j3 * 18);
						ac[l3] = (new String(oe, 11 + j3 * 18, 12)).trim();
						
						if(l3 + 1 > j){
							j = l3 + 1;
						}
					}
					
				} else if(jb == 6){
					int j1 = (kb - 1) / 18;
					xb = 0;
					for(int l2 = 0; l2 < jc; l2++){
						gd[l2] = null;
					}
					
					for(int k3 = 0; k3 < j1; k3++){
						int i4 = y.getShort(oe, 1 + k3 * 18);
						gd[i4] = (new String(oe, 3 + k3 * 18, 12)).trim();
						bd[i4] = y.getShort(oe, 15 + k3 * 18);
						ld[i4] = y.getShort(oe, 17 + k3 * 18);
						if(i4 + 1 > xb){
							xb = i4 + 1;
						}
					}
					
				} else if(jb == 7){
					myscore = y.a(oe, 1);
					for(int k1 = 0; k1 < 50; k1++){
						yc[k1] = (new String(oe, 5 + k1 * 20, 12)).trim();
						uc[k1] = y.a(oe, 17 + k1 * 20);
						vc[k1] = y.getShort(oe, 21 + k1 * 20);
						tc[k1] = y.getShort(oe, 23 + k1 * 20);
					}
					
					dd = true;
				} else if(jb == 8){
					nd = true;
					for(int l1 = 2; l1 >= 1; l1--){
						de[l1] = de[l1 - 1];
					}
					
					de[0] = new String(oe, 1, kb - 1);
				} else if(jb == 9 && fe){
					f = ac[y.getShort(oe, 1)] + " has challenged you!";
					o = y.getShort(oe, 3);
					fb = y.getShort(oe, 5);
					d = 1;
				} else if(jb == 10 && fe){
					f = "Challenging: " + ac[y.getShort(oe, 1)];
					o = y.getShort(oe, 3);
					fb = y.getShort(oe, 5);
					d = 2;
				} else if(jb == 11 && fe){
					f = "Player busy with another challenge";
					e = "";
					d = 3;
				} else if(jb == 12 && d == 2 && fe){
					f = "Other player declined challenge";
					e = "";
					d = 3;
				} else if(jb == 12 && d == 1 && fe){
					f = "Other player aborted challenge";
					e = "";
					d = 3;
				} else if(jb == 13 && !fe){
					int i2 = y.getShort(oe, 3);
					int i3 = y.getShort(oe, 5);
					o = y.getShort(oe, 7);
					fb = y.getShort(oe, 9);
					ue = y.getShort(oe, 11);
					if(i2 == 1){
						f = ac[0] + "'s game - Currently 1 player";
					} else {
						f = ac[0] + "'s game - Currently " + i2 + " players";
					}
					if(i3 > 0){
						e = "Game starts in: " + i3;
					} else {
						e = "";
					}
					d = 4;
				} else if(jb == 14 && !fe){
					f = "Game Aborted by owner";
					e = "";
					d = 3;
				} else if(jb == 15 && !fe){
					f = "Game is not available for joining";
					e = "";
					d = 3;
				} else if(jb == 16){
					id = y.getShort(oe, 1);
					gameScreen = currentGame + 3;
					for(int j2 = 0; j2 < 3; j2++){
						de[j2] = "";
					}
					
				}
				kb = 0;
				return;
			}
		} catch(IOException _ex){
			oc = true;
		}
	}
	
	private void l(){
		g.a(lowDetail);
		nb.a(96, 105, 320, 40, rc, 140, lowDetail);
		nb.a(graphics, 6, 6, lowDetail);
		graphics.setColor(Color.black);
		D.a(graphics, "Please Wait... Loading Game", fc, 256, 130);
		md.drawImage(le, 0, 0, this);
		qc = true;
		int i1 = 0;
		try{ // XXX Games
			y.setPacketID(15);
			y.sendPacket();
			
			if(games[currentGame] == null){
				if(currentGame == 0){
					games[currentGame] = new Checkers(); // Checkers (media done)
				} else if(currentGame == 1){
					games[currentGame] = new Chess(); // Chess (media done)
				} else if(currentGame == 2){
					games[currentGame] = new BattleCruisers(); // Battle Cruisers (media done)
				} else if(currentGame == 3){
					games[currentGame] = new QuadLink(); // Quadlink (media done)
				} else if(currentGame == 4){
					games[currentGame] = new Reversi(); // Reversi (media done)
				} else if(currentGame == 5){
					games[currentGame] = new MysteryMonster(); // Mystery Monster
					// (missing back.gif
					// which I think are the
					// monsters in the grid
					// or the grid itself)
				} else if(currentGame == 6){
					games[currentGame] = new Mahjong(); // Mahjong (media done)
				} else if(currentGame == 7){
					games[currentGame] = new Pairs(); // Pairs (media done)
				} else if(currentGame == 8){
					games[currentGame] = new Crypt(); // Crypt (media done)
				} else if(currentGame == 9){
					games[currentGame] = new Dungeon(); // Dungeon (media done)
				} else if(currentGame == 10){
					games[currentGame] = new CyberWars(); // CyberWars (media done)
				}
			}
			i1 = 1;
			games[currentGame].a(this);
			i1 = 0;
		} catch(Throwable throwable){
			if(gameScreen != 0 && y != null && cb){
				cb = false;
				y.setPacketID(17);
				y.addString("l: " + throwable + " s:" + gameScreen + " g:" + currentGame + " dl:" + i1);
				y.sendPacket();
			}
		}
		qc = false;
		d = 0;
		pd = 0;
		for(int j1 = 0; j1 < 3; j1++){
			de[j1] = "";
		}
		
		if(games[currentGame].p == 2){
			fe = true;
		} else {
			fe = false;
		}
		
		y.setPacketID(16);
		y.addByte(currentGame + 1);
		y.sendPacket();
		xc = -330;
		ib = 0;
		ad = 0;
	}
	
	private void drawLobby(){
		if(gameScreen == 1){
			if(!lowDetail){
				nb.b(0, 0, 500, 145, Color.black);
				nb.a(0, 145, 500, 145, Color.black, new Color(136, 136, 136), lowDetail);
			} else {
				nb.a(0, 0, 500, 145, new Color(136, 136, 136), Color.black, lowDetail);
				nb.a(0, 145, 500, 145, Color.black, new Color(136, 136, 136), lowDetail);
			}
			g.a(c, zc, a, b, qd, 0);
			g.a(lowDetail);
			if(vb != super.jj){
				nd = true;
				vb = super.jj;
			}
			if(!nd){
				nb.a(md, 6, 6, lowDetail);
				return;
			}
			nb.a(graphics, 6, 6, lowDetail);
			graphics.drawImage(qb, 0, 298, this);
			graphics.setColor(Color.white);
			graphics.setFont(t);
			if(super.jj != null){
				graphics.drawString(super.jj, 8, 349);
			}
			for(int i1 = 0; i1 < 3; i1++){
				if(de[i1] != null){
					graphics.drawString(de[i1], 8, 336 - i1 * 12);
				}
			}
			
			if(ed){
				graphics.setColor(Color.black);
				for(int j1 = 0; j1 < 11; j1++){
					D.b(graphics, String.valueOf(zd[j1]), h, 46 + j1 * 46, 362);
				}
				
			}
			md.drawImage(le, 0, 0, this);
			nd = false;
		}
	}
	
	private boolean d(int i1, int j1){
		int k1 = i1 >> 7;
		int l1 = j1 >> 7;
		int i2 = i1 & 0x7f;
		int j2 = j1 & 0x7f;
		int k2 = kc[k1][l1];
		if(k2 == 0){
			return false;
		}
		if(mc[k1][l1] == 1){
			if(ud[k1][l1] < 100){
				if(k2 == 45){
					if(j2 > 64){
						ud[k1][l1] += 100;
					} else {
						ud[k1][l1] += 200;
					}
				} else if(k2 == 124){
					if(i2 > 64){
						ud[k1][l1] += 200;
					} else {
						ud[k1][l1] += 100;
					}
				}
			}
			if(ud[k1][l1] == 300 || ud[k1][l1] == 400){
				return false;
			}
		}
		if(nc[k1][l1] == 48 || nc[k1][l1] == 49 || nc[k1][l1] == 50){
			te = k1;
			se = l1;
			return true;
		}
		if(k2 == 45 && (j2 < 54 || j2 > 74)){
			return false;
		}
		if(k2 == 124 && (i2 < 54 || i2 > 74)){
			return false;
		}
		if(k2 == 1 && (i2 > 74 || j2 > 74)){
			return false;
		}
		if(k2 == 2 && (i2 < 54 || j2 > 74)){
			return false;
		}
		if(k2 == 3 && (i2 < 54 || j2 < 54)){
			return false;
		}
		if(k2 == 4 && (i2 > 74 || j2 < 54)){
			return false;
		}
		if(k2 == 5 && i2 > 74){
			return false;
		}
		if(k2 == 9 && i2 < 54){
			return false;
		}
		if(k2 == 6 && j2 > 74){
			return false;
		}
		if(k2 == 10 && j2 < 54){
			return false;
		}
		if(k2 == 7 && i2 > 74){
			return false;
		}
		if(k2 == 11 && i2 < 54){
			return false;
		}
		if(k2 == 8 && j2 > 74){
			return false;
		}
		if(k2 == 12 && j2 < 54){
			return false;
		}
		if(k2 == 92 && (i2 - j2 < -10 || i2 - j2 > 10)){
			return false;
		}
		if(k2 == 47 && (128 - i2 - j2 < -10 || 128 - i2 - j2 > 10)){
			return false;
		}
		if(k2 >= 16 && k2 < 32){
			if(((k2 -= 16) & 1) == 1 && i2 >= 54 && i2 <= 74 && j2 <= 74){
				return true;
			}
			if((k2 & 2) == 2 && i2 >= 54 && i2 <= 74 && j2 >= 54){
				return true;
			}
			if((k2 & 4) == 4 && j2 >= 54 && j2 <= 74 && i2 <= 74){
				return true;
			}
			return (k2 & 8) == 8 && j2 >= 54 && j2 <= 74 && i2 >= 54;
		} else {
			return true;
		}
	}
	
	private void n(){
		j();
		o();
		
		if(super.hh != 0 && super.e > 351){
			int i1 = (super.f - 3) / 46;
			if(i1 < 0){
				i1 = 0;
			} else if(i1 > 10){
				i1 = 10;
			}
			pe = i1;
			super.hh = 0;
		}
		
		if(te == -1 || se == -1){
			if(b > 0){
				b--;
			}
			int j1 = 0;
			int l1 = 0;
			if(pe == -1){
				if(super.leftArrowKey){
					qd = qd + 2 & 0xff;
				}
				if(super.rightArrowKey){
					qd = qd + 253 & 0xff;
				}
				if(super.upArrowKey){
					j1 = -(int) (Math.sin(((double) qd * 6.2800000000000002D) / 256D) * 10D);
					l1 = (int) (Math.cos(((double) qd * 6.2800000000000002D) / 256D) * 10D);
				}
				if(super.downArrowKey){
					j1 = (int) (Math.sin(((double) qd * 6.2800000000000002D) / 256D) * 10D);
					l1 = -(int) (Math.cos(((double) qd * 6.2800000000000002D) / 256D) * 10D);
				}
			} else {
				if(pe < 100){
					p();
				}
				if(pe != -1){
					int j2 = ab[bb - (pe - 99)];
					int i3 = z[bb - (pe - 99)];
					int l3 = z[bb - (pe - 99) - 1];
					int j4 = (j2 * 128) / 3 + 22;
					int l4 = (i3 * 128) / 3 + 22;
					int i5 = (j2 * 128) / 3 + 22;
					int j5 = (l3 * 128) / 3 + 22;
					int k5 = (int) ((Math.atan2(c - j4, l4 - a) * 4D) / 6.2800000000000002D) * 64 & 0xff;
					int l5 = (int) ((Math.atan2(c - i5, j5 - a) * 4D) / 6.2800000000000002D) * 64 & 0xff;
					if(c == j4 && a == l4){
						k5 = qd;
					}
					if(l5 != k5){
						k5 = qd;
					}
					int i6 = k5 - qd;
					if(i6 < 4 && i6 > -4){
						qd = k5;
					} else if(i6 < -128 || i6 > 0 && i6 < 128){
						qd = qd + 3 & 0xff;
					} else {
						qd = qd - 3 & 0xff;
					}
					if(qd == k5){
						if(c - j4 > -15 && c - j4 < 15){
							j1 = j4 - c;
						} else if(c < j4){
							j1 = 15;
						} else if(c > j4){
							j1 = -15;
						}
						if(a - l4 > -15 && a - l4 < 15){
							l1 = l4 - a;
						} else if(a < l4){
							l1 = 15;
						} else if(a > l4){
							l1 -= 15;
						}
						if(c - j4 > -15 && c - j4 < 15 && a - l4 > -15 && a - l4 < 15 && pe < bb + 100){
							pe++;
						}
					}
				}
			}
			while(j1 != 0 || l1 != 0){
				c += j1;
				if(d(c - 10, a - 10) || d(c + 10, a - 10) || d(c - 10, a + 10) || d(c + 10, a + 10)){
					c -= j1;
				} else {
					j1 = 0;
				}
				a += l1;
				if(d(c - 10, a - 10) || d(c + 10, a - 10) || d(c - 10, a + 10) || d(c + 10, a + 10)){
					a -= l1;
				} else {
					l1 = 0;
				}
				if(j1 > 0){
					j1--;
				} else if(j1 < 0){
					j1++;
				}
				if(l1 > 0){
					l1--;
				} else if(l1 < 0){
					l1++;
				}
			}
			for(int k2 = 0; k2 < yd; k2++){
				for(int j3 = 0; j3 < ce; j3++){
					if(ud[k2][j3] >= 100 && ud[k2][j3] < 200){
						ud[k2][j3] += 2;
						wd[vd[k2][j3]].j(0, ud[k2][j3] - 100, 0);
						if(ud[k2][j3] >= 166){
							ud[k2][j3] = 300;
						}
					}
					if(ud[k2][j3] >= 200 && ud[k2][j3] < 300){
						ud[k2][j3] += 2;
						wd[vd[k2][j3]].j(0, 256 - (ud[k2][j3] - 200) & 0xff, 0);
						if(ud[k2][j3] >= 266){
							ud[k2][j3] = 400;
						}
					}
					if(ud[k2][j3] == 300 || ud[k2][j3] == 400){
						int i4 = k2 * 128 + 64;
						int k4 = j3 * 128 + 64;
						if(i4 - c < -256 || i4 - c > 256 || k4 - a < -256 || k4 - a > 256){
							ud[k2][j3] += 2;
						}
					}
					if(ud[k2][j3] > 300 && ud[k2][j3] < 400){
						ud[k2][j3] += 2;
						wd[vd[k2][j3]].j(0, 66 - (ud[k2][j3] - 300), 0);
						if(ud[k2][j3] >= 366){
							ud[k2][j3] = 0;
						}
					}
					if(ud[k2][j3] > 400 && ud[k2][j3] < 500){
						ud[k2][j3] += 2;
						wd[vd[k2][j3]].j(0, (190 + ud[k2][j3]) - 400 & 0xff, 0);
						if(ud[k2][j3] >= 466){
							ud[k2][j3] = 0;
						}
					}
				}
				
			}
			
			return;
		}
		int k1 = te * 128 + 64;
		int i2 = se * 128 + 64;
		int l2 = (int) ((Math.atan2(c - k1, i2 - a) * 256D) / 6.2800000000000002D) & 0xff;
		int k3 = l2 - qd;
		if(k3 < -128 || k3 > 0 && k3 < 128){
			qd = qd + 2 & 0xff;
		} else {
			qd = qd - 2 & 0xff;
		}
		if(k3 < 4 && k3 > -4){
			qd = l2;
		}
		if(qd == l2 && b < 20){
			b++;
		}
		if(b == 20){
			gameScreen = 2;
			currentGame = mc[te][se] - 100;
		}
	}
	
	private void o(){
		try{
			if(super.ii != ""){
				y.setPacketID(3);
				y.addString(super.ii);
				y.sendPacket();
				m = 0;
				super.jj = "";
				super.ii = "";
			}
			if(kb == 0 && y.p() >= 2){
				kb = y.q();
			}
			if(kb > 0 && y.p() >= kb){
				y.a(kb, oe);
				jb = y.a(oe[0]);
				if(jb == 8){
					nd = true;
					for(int i1 = 2; i1 >= 1; i1--){
						de[i1] = de[i1 - 1];
					}
					
					de[0] = new String(oe, 1, kb - 1);
				} else if(jb == 255){
					ed = true;
					nd = true;
					for(int j1 = 0; j1 < 11; j1++){
						zd[j1] = y.getShort(oe, 1 + j1 * 2);
					}
					
				}
				kb = 0;
				return;
			}
		} catch(IOException _ex){
			oc = true;
		}
	}
	
	private void p(){
		try{
			for(int i1 = 0; i1 < yd * 3; i1++){
				for(int j1 = 0; j1 < ce * 3; j1++){
					if(mc[i1 / 3][j1 / 3] - 100 == pe){
						qe[i1][j1] = 0;
					} else if(mc[i1 / 3][j1 / 3] >= 100){
						qe[i1][j1] = 100;
					} else if(mc[i1 / 3][j1 / 3] == 1){
						qe[i1][j1] = 0;
					} else {
						qe[i1][j1] = d(22 + (i1 * 128) / 3, 22 + (j1 * 128) / 3) ? 100 : 0;
					}
				}
				
			}
			
			int k1 = (c * 3) / 128;
			int l1 = (a * 3) / 128;
			int i2 = c * 3 & 0x7f;
			int j2 = a * 3 & 0x7f;
			if(qe[k1][l1] != 0){
				if(i2 < 64 && k1 > 0 && qe[k1 - 1][l1] == 0){
					k1--;
				} else if(i2 >= 64 && k1 < yd - 1 && qe[k1 + 1][l1] == 0){
					k1++;
				} else if(j2 < 64 && l1 > 0 && qe[k1][l1 - 1] == 0){
					l1--;
				} else if(j2 >= 64 && l1 > ce - 1 && qe[k1][l1 + 1] == 0){
					l1++;
				}
			}
			bb = 0;
			qe[k1][l1] = 100;
			int ai[] = new int[yd * ce * 9];
			int ai1[] = new int[yd * ce * 9];
			int i3 = 0;
			int j3 = 1;
			ai[0] = k1;
			ai1[0] = l1;
			int k2;
			int l2;
			do {
				int k3 = ai[i3];
				int l3 = ai1[i3];
				i3++;
				bb++;
				if(mc[k3 / 3][l3 / 3] == pe + 100 && k3 % 3 == 1 && l3 % 3 == 1){
					k2 = k3;
					l2 = l3;
					break;
				}
				if(qe[k3][l3] == 1 || qe[k3][l3] == 3){
					if(k3 > 0 && qe[k3 - 1][l3] == 0){
						ai[j3] = k3 - 1;
						ai1[j3] = l3;
						qe[k3 - 1][l3] = 1;
						j3++;
					}
					if(k3 < yd * 3 - 1 && qe[k3 + 1][l3] == 0){
						ai[j3] = k3 + 1;
						ai1[j3] = l3;
						qe[k3 + 1][l3] = 3;
						j3++;
					}
					if(l3 > 0 && qe[k3][l3 - 1] == 0){
						ai[j3] = k3;
						ai1[j3] = l3 - 1;
						qe[k3][l3 - 1] = 2;
						j3++;
					}
					if(l3 < ce * 3 - 1 && qe[k3][l3 + 1] == 0){
						ai[j3] = k3;
						ai1[j3] = l3 + 1;
						qe[k3][l3 + 1] = 4;
						j3++;
					}
				} else {
					if(l3 > 0 && qe[k3][l3 - 1] == 0){
						ai[j3] = k3;
						ai1[j3] = l3 - 1;
						qe[k3][l3 - 1] = 2;
						j3++;
					}
					if(l3 < ce * 3 - 1 && qe[k3][l3 + 1] == 0){
						ai[j3] = k3;
						ai1[j3] = l3 + 1;
						qe[k3][l3 + 1] = 4;
						j3++;
					}
					if(k3 > 0 && qe[k3 - 1][l3] == 0){
						ai[j3] = k3 - 1;
						ai1[j3] = l3;
						qe[k3 - 1][l3] = 1;
						j3++;
					}
					if(k3 < yd * 3 - 1 && qe[k3 + 1][l3] == 0){
						ai[j3] = k3 + 1;
						ai1[j3] = l3;
						qe[k3 + 1][l3] = 3;
						j3++;
					}
				}
			} while(true);
			ab = new int[bb + 1];
			z = new int[bb + 1];
			ab[0] = k2;
			z[0] = l2;
			j3 = 1;
			do {
				ab[j3] = k2;
				z[j3] = l2;
				j3++;
				if(k2 == k1 && l2 == l1){
					break;
				}
				if(qe[k2][l2] == 1){
					k2++;
				} else if(qe[k2][l2] == 2){
					l2++;
				} else if(qe[k2][l2] == 3){
					k2--;
				} else if(qe[k2][l2] == 4){
					l2--;
				}
			} while(true);
			bb = j3;
			pe = 100;
			return;
		} catch(Exception _ex){
			gameScreen = 2;
		}
		currentGame = pe;
		pe = -1;
	}
	
	private boolean bb(int i1, int j1){
		if(i1 < 0 || j1 < 0 || i1 >= yd || j1 >= ce){
			return false;
		}
		char c1 = (char) nc[i1][j1];
		if(c1 >= '0' && c1 <= '9'){
			return false;
		}
		return c1 > 0;
	}
	
	private boolean a(int i1, int j1, char c1){
		if(i1 < 0 || j1 < 0 || i1 >= yd || j1 >= ce){
			return false;
		}
		char c2 = (char) nc[i1][j1];
		if(c1 == '*' && c2 != '*'){
			return false;
		}
		if(c1 == 'o' && c2 != 'o'){
			return false;
		}
		return c2 > 0;
	}
	
	private void q(){
		sc = new F((yd + 1) * (ce + 1) * 6, yd * ce * 2);
		ge = new F((yd + 1) * (ce + 1) * 4, yd * ce * 4);
		pb = new int[yd * 2 + 1][ce * 2 + 1];
		lb = 1;
		je = new int[yd * 2 + 1][ce * 2 + 1];
		he = 1;
		for(int i1 = 0; i1 < ce; i1++){
			for(int j1 = 0; j1 < yd; j1++){
				char c1 = (char) nc[j1][i1];
				if(c1 == '0'){
					F f1 = r.c();
					f1.i(j1 * 128 + 64, 0, i1 * 128 + 64);
					g.b(f1);
				} else if(c1 == '1' || c1 == '2'){
					F f2 = i.c();
					f2.i(j1 * 128 + 64, 0, i1 * 128 + 64);
					g.b(f2);
				}
				if(c1 == '-'){
					int j2 = j1 * 2;
					int i5 = i1 * 2 + 1;
					int l7 = j1 * 2 + 2;
					int i11 = i1 * 2 + 1;
					a(j2, i5, l7, i11, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
				} else if(c1 == '|'){
					int k2 = j1 * 2 + 1;
					int j5 = i1 * 2;
					int i8 = j1 * 2 + 1;
					int j11 = i1 * 2 + 2;
					a(k2, j5, i8, j11, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
				} else if(c1 == '\\'){
					int l2 = j1 * 2;
					int k5 = i1 * 2;
					int j8 = j1 * 2 + 2;
					int k11 = i1 * 2 + 2;
					a(l2, k5, j8, k11, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
				} else if(c1 == '/'){
					int i3 = j1 * 2 + 2;
					int l5 = i1 * 2;
					int k8 = j1 * 2;
					int l11 = i1 * 2 + 2;
					a(i3, l5, k8, l11, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
				} else if(c1 == '+'){
					int j3 = j1 * 2 + 1;
					int i6 = i1 * 2 + 1;
					kc[j1][i1] = 16;
					if(bb(j1, i1 - 1)){
						int l8 = j1 * 2 + 1;
						int i12 = i1 * 2;
						a(l8, i12, j3, i6, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
						kc[j1][i1]++;
					}
					if(bb(j1, i1 + 1)){
						int i9 = j1 * 2 + 1;
						int j12 = i1 * 2 + 2;
						a(j3, i6, i9, j12, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
						kc[j1][i1] += 2;
					}
					if(bb(j1 - 1, i1)){
						int j9 = j1 * 2;
						int k12 = i1 * 2 + 1;
						a(j3, i6, j9, k12, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
						kc[j1][i1] += 4;
					}
					if(bb(j1 + 1, i1)){
						int k9 = j1 * 2 + 2;
						int l12 = i1 * 2 + 1;
						a(j3, i6, k9, l12, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
						kc[j1][i1] += 8;
					}
				} else if(c1 == '*' || c1 == 'o'){
					byte byte0 = 0;
					byte byte1 = 0;
					byte byte2 = 0;
					byte byte3 = 0;
					if(bb(j1, i1 - 1)){
						byte0 = 0;
						byte1 = -1;
					}
					if(bb(j1, i1 + 1)){
						byte2 = 0;
						byte3 = 1;
					}
					if(bb(j1 - 1, i1) && byte0 == 0 && byte1 == 0){
						byte0 = -1;
					} else if(bb(j1 - 1, i1) && byte2 == 0 && byte3 == 0){
						byte2 = -1;
					}
					if(bb(j1 + 1, i1) && byte0 == 0 && byte1 == 0){
						byte0 = 1;
					} else if(bb(j1 + 1, i1) && byte2 == 0 && byte3 == 0){
						byte2 = 1;
					}
					if(a(j1 - 1, i1 - 1, c1) && byte0 == 0 && byte1 == 0){
						byte0 = -1;
						byte1 = -1;
					} else if(a(j1 - 1, i1 - 1, c1) && byte2 == 0 && byte3 == 0){
						byte2 = -1;
						byte3 = -1;
					}
					if(a(j1 + 1, i1 + 1, c1) && byte0 == 0 && byte1 == 0){
						byte0 = 1;
						byte1 = 1;
					} else if(a(j1 + 1, i1 + 1, c1) && byte2 == 0 && byte3 == 0){
						byte2 = 1;
						byte3 = 1;
					}
					if(a(j1 + 1, i1 - 1, c1) && byte0 == 0 && byte1 == 0){
						byte0 = 1;
						byte1 = -1;
					} else if(a(j1 + 1, i1 - 1, c1) && byte2 == 0 && byte3 == 0){
						byte2 = 1;
						byte3 = -1;
					}
					if(a(j1 - 1, i1 + 1, c1) && byte0 == 0 && byte1 == 0){
						byte0 = -1;
						byte1 = 1;
					} else if(a(j1 - 1, i1 + 1, c1) && byte2 == 0 && byte3 == 0){
						byte2 = -1;
						byte3 = 1;
					}
					int k14 = j1 * 2 + byte0 + 1;
					int j15 = i1 * 2 + byte1 + 1;
					int l15 = j1 * 2 + byte2 + 1;
					int j16 = i1 * 2 + byte3 + 1;
					a(k14, j15, l15, j16, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
					kc[j1][i1] = 0;
					if(byte0 == -1 && byte1 == 0 && byte3 == 0 && byte2 == 1){
						kc[j1][i1] = 45;
					} else if(byte1 == -1 && byte0 == 0 && byte2 == 0 && byte3 == 1){
						kc[j1][i1] = 124;
					} else if(byte0 == -1 && byte1 == -1 && byte2 == 1 && byte3 == 1){
						kc[j1][i1] = 92;
					} else if(byte0 == 1 && byte3 == 1 && byte1 == -1 && byte2 == -1){
						kc[j1][i1] = 47;
					} else if(byte0 == 0 && byte1 == -1 && byte3 == 1 && byte2 == -1){
						kc[j1][i1] = 5;
					} else if(byte0 == 0 && byte1 == -1 && byte3 == 1 && byte2 == 1){
						kc[j1][i1] = 9;
					} else if(byte0 == 1 && byte1 == 0 && byte2 == -1 && byte3 == -1){
						kc[j1][i1] = 6;
					} else if(byte0 == 1 && byte1 == 0 && byte2 == -1 && byte3 == 1){
						kc[j1][i1] = 10;
					} else if(byte2 == 0 && byte3 == 1 && byte1 == -1 && byte0 == -1){
						kc[j1][i1] = 7;
					} else if(byte2 == 0 && byte3 == 1 && byte1 == -1 && byte0 == 1){
						kc[j1][i1] = 11;
					} else if(byte0 == -1 && byte1 == 0 && byte2 == 1 && byte3 == -1){
						kc[j1][i1] = 8;
					} else if(byte0 == -1 && byte1 == 0 && byte2 == 1 && byte3 == 1){
						kc[j1][i1] = 12;
					} else if(byte0 == 0 && byte1 == -1 && byte2 == -1 && byte3 == 0){
						kc[j1][i1] = 1;
					} else if(byte0 == 0 && byte1 == -1 && byte2 == 1 && byte3 == 0){
						kc[j1][i1] = 2;
					} else if(byte2 == 0 && byte3 == 1 && byte0 == 1 && byte1 == 0){
						kc[j1][i1] = 3;
					} else if(byte2 == 0 && byte3 == 1 && byte0 == -1 && byte1 == 0){
						kc[j1][i1] = 4;
					}
				} else if(nc[j1][i1] == 88){
					if(j1 > 0 && nc[j1 - 1][i1] != 88){
						int k3 = j1 * 2;
						int j6 = i1 * 2;
						int l9 = j1 * 2;
						int i13 = i1 * 2 + 2;
						a(k3, j6, l9, i13, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
					}
					if(j1 < yd - 1 && nc[j1 + 1][i1] != 88){
						int l3 = j1 * 2 + 2;
						int k6 = i1 * 2;
						int i10 = j1 * 2 + 2;
						int j13 = i1 * 2 + 2;
						a(l3, k6, i10, j13, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
					}
					if(i1 > 0 && nc[j1][i1 - 1] != 88){
						int i4 = j1 * 2;
						int l6 = i1 * 2;
						int j10 = j1 * 2 + 2;
						int k13 = i1 * 2;
						a(i4, l6, j10, k13, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
					}
					if(i1 < ce - 1 && nc[j1][i1 + 1] != 88){
						int j4 = j1 * 2;
						int i7 = i1 * 2 + 2;
						int k10 = j1 * 2 + 2;
						int l13 = i1 * 2 + 2;
						a(j4, i7, k10, l13, mc[j1][i1], mc[j1][i1], lc[j1][i1]);
					}
				}
			}
			
		}
		
		sc.a(true, 75, 24);
		g.b(sc);
		for(int k1 = 0; k1 < ce; k1++){
			for(int l1 = 0; l1 < yd; l1++){
				int k4 = kc[l1][k1];
				int j7 = l1 * 2;
				int l10 = k1 * 2;
				if(k4 != 88){
					int i14 = ae[j7 / 2][l10 / 2];
					int l14 = ae[j7 / 2 + 1][l10 / 2];
					int k15 = ae[j7 / 2 + 1][l10 / 2 + 1];
					int i16 = ae[j7 / 2][l10 / 2 + 1];
					if(i14 == l14 && l14 == k15 && k15 == i16){
						a(j7, l10, j7 + 2, l10, j7 + 2, l10 + 2, j7, l10 + 2);
					} else if(k4 == 0 || k4 == 32){
						if(i14 == l14 && k15 == i16 || i14 == i16 && l14 == k15){
							a(j7, l10, j7 + 2, l10, j7 + 2, l10 + 2, j7, l10 + 2);
						} else {
							a(j7, l10, j7 + 2, l10, j7, l10 + 2);
							a(j7 + 2, l10 + 2, j7, l10 + 2, j7 + 2, l10);
						}
					} else if(k4 == 47){
						a(j7, l10, j7 + 2, l10, j7, l10 + 2);
						a(j7 + 2, l10 + 2, j7, l10 + 2, j7 + 2, l10);
					} else if(k4 == 92){
						a(j7 + 2, l10, j7 + 2, l10 + 2, j7, l10);
						a(j7, l10 + 2, j7, l10, j7 + 2, l10 + 2);
					} else if(k4 == 45){
						a(j7, l10, j7 + 2, l10, j7, l10 + 1);
						a(j7 + 2, l10 + 1, j7, l10 + 1, j7 + 2, l10);
						a(j7, l10 + 1, j7 + 2, l10 + 1, j7, l10 + 2);
						a(j7 + 2, l10 + 2, j7, l10 + 2, j7 + 2, l10 + 1);
					} else if(k4 == 124){
						a(j7, l10, j7 + 1, l10, j7, l10 + 2);
						a(j7 + 1, l10 + 2, j7, l10 + 2, j7 + 1, l10);
						a(j7 + 1, l10, j7 + 2, l10, j7 + 1, l10 + 2);
						a(j7 + 2, l10 + 2, j7 + 1, l10 + 2, j7 + 2, l10);
					} else if(k4 >= 16 && k4 < 32){
						if(pb[j7 + 1][l10] == 0){
							a(j7, l10, j7 + 2, l10, j7 + 1, l10 + 1);
						} else {
							a(j7 + 1, l10, j7 + 1, l10 + 1, j7, l10);
							a(j7 + 1, l10, j7 + 2, l10, j7 + 1, l10 + 1);
						}
						if(pb[j7][l10 + 1] == 0){
							a(j7, l10, j7 + 1, l10 + 1, j7, l10 + 2);
						} else {
							a(j7, l10 + 1, j7, l10, j7 + 1, l10 + 1);
							a(j7, l10 + 1, j7 + 1, l10 + 1, j7, l10 + 2);
						}
						if(pb[j7 + 2][l10 + 1] == 0){
							a(j7 + 2, l10, j7 + 2, l10 + 2, j7 + 1, l10 + 1);
						} else {
							a(j7 + 2, l10 + 1, j7 + 1, l10 + 1, j7 + 2, l10);
							a(j7 + 2, l10 + 1, j7 + 2, l10 + 2, j7 + 1, l10 + 1);
						}
						if(pb[j7 + 1][l10 + 2] == 0){
							a(j7, l10 + 2, j7 + 1, l10 + 1, j7 + 2, l10 + 2);
						} else {
							a(j7 + 1, l10 + 2, j7, l10 + 2, j7 + 1, l10 + 1);
							a(j7 + 1, l10 + 2, j7 + 1, l10 + 1, j7 + 2, l10 + 2);
						}
					} else if(k4 == 1){
						a(j7, l10, j7 + 1, l10, j7, l10 + 1);
						a(j7 + 2, l10, j7 + 2, l10 + 2, j7 + 1, l10);
						a(j7, l10 + 2, j7, l10 + 1, j7 + 2, l10 + 2);
						a(j7 + 2, l10 + 2, j7, l10 + 1, j7 + 1, l10);
					} else if(k4 == 2){
						a(j7 + 2, l10, j7 + 2, l10 + 1, j7 + 1, l10);
						a(j7, l10, j7 + 1, l10, j7, l10 + 2);
						a(j7 + 2, l10 + 2, j7, l10 + 2, j7 + 2, l10 + 1);
						a(j7, l10 + 2, j7 + 1, l10, j7 + 2, l10 + 1);
					} else if(k4 == 3){
						a(j7 + 2, l10, j7 + 2, l10 + 1, j7, l10);
						a(j7, l10 + 2, j7, l10, j7 + 1, l10 + 2);
						a(j7, l10, j7 + 2, l10 + 1, j7 + 1, l10 + 2);
						a(j7 + 2, l10 + 2, j7 + 1, l10 + 2, j7 + 2, l10 + 1);
					} else if(k4 == 4){
						a(j7, l10, j7 + 2, l10, j7, l10 + 1);
						a(j7, l10 + 2, j7, l10 + 1, j7 + 1, l10 + 2);
						a(j7 + 2, l10 + 2, j7 + 1, l10 + 2, j7 + 2, l10);
						a(j7 + 2, l10, j7 + 1, l10 + 2, j7, l10 + 1);
					} else if(k4 == 5 || k4 == 9){
						a(j7, l10, j7 + 1, l10, j7, l10 + 2);
						a(j7 + 2, l10, j7 + 2, l10 + 2, j7 + 1, l10);
						a(j7 + 1, l10, j7 + 2, l10 + 2, j7, l10 + 2);
					} else if(k4 == 6 || k4 == 10){
						a(j7 + 2, l10, j7 + 2, l10 + 1, j7, l10);
						a(j7 + 2, l10 + 2, j7, l10 + 2, j7 + 2, l10 + 1);
						a(j7 + 2, l10 + 1, j7, l10 + 2, j7, l10);
					} else if(k4 == 7 || k4 == 11){
						a(j7, l10 + 2, j7, l10, j7 + 1, l10 + 2);
						a(j7 + 2, l10 + 2, j7 + 1, l10 + 2, j7 + 2, l10);
						a(j7 + 1, l10 + 2, j7, l10, j7 + 2, l10);
					} else if(k4 == 8 || k4 == 12){
						a(j7, l10, j7 + 2, l10, j7, l10 + 1);
						a(j7, l10 + 2, j7, l10 + 1, j7 + 2, l10 + 2);
						a(j7, l10 + 1, j7 + 2, l10, j7 + 2, l10 + 2);
					}
				}
			}
			
		}
		
		ge.a(true, 75, 24);
		if(!lowDetail){
			g.b(ge);
		}
		yb = 0;
		for(int i2 = 0; i2 < ce; i2++){
			for(int l4 = 0; l4 < yd; l4++){
				if(mc[l4][i2] == 1){
					int k7 = 0;
					if(mc[l4][i2 - 1] >= 100){
						k7 = mc[l4][i2 - 1] - 100;
					} else if(mc[l4][i2 + 1] >= 100){
						k7 = mc[l4][i2 + 1] - 100;
					} else if(mc[l4 + 1][i2] >= 100){
						k7 = mc[l4 + 1][i2] - 100;
					} else if(mc[l4 - 1][i2] >= 100){
						k7 = mc[l4 - 1][i2] - 100;
					}
					vd[l4][i2] = yb;
					ud[l4][i2] = 0;
					F f3 = wd[yb++] = new F(8, 2);
					int j14;
					int i15;
					byte byte6;
					byte byte8;
					int k16;
					int l16;
					if(nc[l4][i2] == 45){
						j14 = 0;
						i15 = 0;
						byte6 = 96;
						byte8 = 0;
						k16 = l4 * 128 + 17;
						l16 = i2 * 128 + 64;
					} else {
						j14 = 0;
						i15 = 0;
						byte6 = 0;
						byte8 = 96;
						k16 = l4 * 128 + 64;
						l16 = i2 * 128 + 17;
					}
					int i17 = -lc[l4][i2] * 42;
					f3.a(j14, 0, i15);
					f3.a(j14, i17, i15);
					f3.a(byte6, i17, byte8);
					f3.a(byte6, 0, byte8);
					int ai[] = {
							0, 1, 2, 3
					};
					if(k7 == 5){
						f3.a(4, ai, 7, 7);
					} else {
						f3.a(4, ai, 5, 5);
						byte byte4;
						byte byte5;
						byte byte7;
						byte byte9;
						if(nc[l4][i2] == 45){
							byte4 = 11;
							byte5 = 0;
							byte7 = 59;
							byte9 = 0;
						} else {
							byte4 = 0;
							byte5 = 11;
							byte7 = 0;
							byte9 = 59;
						}
						f3.a(byte4, (i17 * 28) / 128, byte5);
						f3.a(byte4, (i17 * 94) / 128, byte5);
						f3.a(byte7, (i17 * 94) / 128, byte9);
						f3.a(byte7, (i17 * 28) / 128, byte9);
						int ai1[] = {
								8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17
						};
						int ai2[] = {
								4, 5, 6, 7
						};
						f3.a(4, ai2, ai1[k7], ai1[k7]);
					}
					f3.h(k16, 0, l16);
					f3.a(true, 75, 24);
					g.b(f3);
				}
			}
			
		}
		
	}
	
	private void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2){
		if(i1 >= yd * 2 || k1 >= yd * 2 || i2 >= yd * 2 || k2 >= yd * 2 || j1 >= ce * 2 || l1 >= ce * 2 || j2 >= ce * 2 || l2 >= ce * 2){
			return;
		}
		int ai[] = new int[4];
		if(je[i1][j1] == 0){
			int i3 = ae[i1 / 2][j1 / 2];
			if(i3 == 0){
				return;
			}
			je[i1][j1] = he++;
			ge.a(i1 * 64, -i3 * 42, j1 * 64);
		}
		if(je[k1][l1] == 0){
			int j3 = ae[k1 / 2][l1 / 2];
			if(j3 == 0){
				return;
			}
			je[k1][l1] = he++;
			ge.a(k1 * 64, -j3 * 42, l1 * 64);
		}
		if(je[i2][j2] == 0){
			int k3 = ae[i2 / 2][j2 / 2];
			if(k3 == 0){
				return;
			}
			je[i2][j2] = he++;
			ge.a(i2 * 64, -k3 * 42, j2 * 64);
		}
		if(je[k2][l2] == 0){
			int l3 = ae[k2 / 2][l2 / 2];
			if(l3 == 0){
				return;
			}
			je[k2][l2] = he++;
			ge.a(k2 * 64, -l3 * 42, l2 * 64);
		}
		ai[0] = je[i1][j1] - 1;
		ai[1] = je[k1][l1] - 1;
		ai[2] = je[i2][j2] - 1;
		ai[3] = je[k2][l2] - 1;
		ge.a(4, ai, cc, 0);
	}
	
	private void a(int i1, int j1, int k1, int l1, int i2, int j2){
		if(i1 >= yd * 2 || k1 >= yd * 2 || i2 >= yd * 2 || j1 >= ce * 2 || l1 >= ce * 2 || j2 >= ce * 2){
			return;
		}
		int ai[] = new int[3];
		if(je[i1][j1] == 0){
			int k2 = ae[i1 / 2][j1 / 2];
			if(k2 == 0){
				return;
			}
			je[i1][j1] = he++;
			ge.a(i1 * 64, -k2 * 42, j1 * 64);
		}
		if(je[k1][l1] == 0){
			int l2 = ae[k1 / 2][l1 / 2];
			if(l2 == 0){
				return;
			}
			je[k1][l1] = he++;
			ge.a(k1 * 64, -l2 * 42, l1 * 64);
		}
		if(je[i2][j2] == 0){
			int i3 = ae[i2 / 2][j2 / 2];
			if(i3 == 0){
				return;
			}
			je[i2][j2] = he++;
			ge.a(i2 * 64, -i3 * 42, j2 * 64);
		}
		ai[0] = je[i1][j1] - 1;
		ai[1] = je[k1][l1] - 1;
		ai[2] = je[i2][j2] - 1;
		ge.a(3, ai, cc, 0);
	}
	
	private void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		if(k2 == 0){
			return;
		}
		if((i1 & 1) == 0 && (j1 & 1) == 0){
			ae[i1 / 2][j1 / 2] = k2;
		}
		if((k1 & 1) == 0 && (l1 & 1) == 0){
			ae[k1 / 2][l1 / 2] = k2;
		}
		if(pb[i1][j1] == 0){
			pb[i1][j1] = lb++;
			sc.a(i1 * 64, 0, j1 * 64);
			sc.a(i1 * 64, -k2 * 42, j1 * 64);
			je[i1][j1] = he++;
			ge.a(i1 * 64, -k2 * 42, j1 * 64);
		}
		if(pb[k1][l1] == 0){
			pb[k1][l1] = lb++;
			sc.a(k1 * 64, 0, l1 * 64);
			sc.a(k1 * 64, -k2 * 42, l1 * 64);
			je[k1][l1] = he++;
			ge.a(k1 * 64, -k2 * 42, l1 * 64);
		}
		int ai[] = new int[4];
		ai[0] = (pb[i1][j1] - 1) * 2;
		ai[1] = (pb[i1][j1] - 1) * 2 + 1;
		ai[2] = (pb[k1][l1] - 1) * 2 + 1;
		ai[3] = (pb[k1][l1] - 1) * 2;
		sc.a(4, ai, i2, j2);
	}
	
	private void r(){
		if(!ke){
			g.c();
			ke = true;
			q();
		}
		g.b = 5;
		g.a = 800;
		g.kb = 4;
		g.a(c, zc, a, b, qd, 0);
		g.setCamera(250, 145, 250, 145, 500);
		g.a(-64, -32, 32);
		if(!lowDetail){
			zc = -80;
		} else {
			zc = -65;
		}
		graphics.setColor(new Color(0, 104, 130));
		graphics.fillRect(0, 0, 512, 384);
		graphics.setColor(Color.black);
		graphics.fillRect(5, 5, 502, 293);
		graphics.drawImage(qb, 0, 298, this);
		nd = true;
		super.jj = "";
		super.ii = "";
		te = -1;
		se = -1;
		nb.a(false);
		nb.a(graphics, 6, 6, false);
		for(int i1 = 0; i1 < 3; i1++){
			de[i1] = "";
		}
		
		y.setPacketID(16);
		y.addByte(0);
		y.sendPacket();
	}
	
	private void loadCastle(){
		try{
			Buffer g1 = new Buffer("menu/castle.dat");
			g1.m();
			yd = g1.getInt();
			ce = g1.getInt();
			c = yd * 64;
			a = ce * 64;
			qd = 0;
			nc = new int[yd][ce];
			kc = new int[yd][ce];
			qe = new int[yd * 3][ce * 3];
			vd = new int[yd][ce];
			ud = new int[yd][ce];
			for(int i1 = 0; i1 < ce; i1++){
				g1.m();
				String s1 = g1.getString();
				for(int k1 = 0; k1 < yd; k1++){
					char c1 = s1.charAt(k1);
					if(c1 == ' '){
						c1 = '\0';
					}
					kc[k1][i1] = nc[k1][i1] = c1;
				}
				
			}
			
			mc = new int[yd][ce];
			for(int j1 = 0; j1 < ce; j1++){
				g1.m();
				String s2 = g1.getString();
				for(int i2 = 0; i2 < yd; i2++){
					int k2 = s2.charAt(i2);
					if(k2 >= 48 && k2 <= 57){
						k2 -= 48;
					} else if(k2 >= 65 && k2 <= 90){
						k2 = (k2 - 65) + 100;
					} else if(k2 == 32){
						k2 = 0;
					}
					mc[i2][j1] = k2;
				}
				
			}
			
			lc = new int[yd][ce];
			ae = new int[yd + 1][ce + 1];
			for(int l1 = 0; l1 <= yd; l1++){
				ae[l1][0] = 1000;
				ae[l1][ce] = 1000;
			}
			
			for(int j2 = 0; j2 <= ce; j2++){
				ae[0][j2] = 1000;
				ae[yd][j2] = 1000;
			}
			
			for(int l2 = 0; l2 < ce; l2++){
				g1.m();
				String s3 = g1.getString();
				for(int j3 = 0; j3 < yd; j3++){
					int l3 = s3.charAt(j3);
					if(l3 >= 48 && l3 <= 57){
						l3 -= 48;
					} else {
						l3 = 0;
					}
					if(l3 == 0 && nc[j3][l2] != 0){
						l3 = 3;
					}
					lc[j3][l2] = l3;
					if(nc[j3][l2] == 0){
						l3 += 1000;
					}
					if(l3 > ae[j3][l2]){
						ae[j3][l2] = l3;
					}
					if(l3 > ae[j3 + 1][l2]){
						ae[j3 + 1][l2] = l3;
					}
					if(l3 > ae[j3][l2 + 1]){
						ae[j3][l2 + 1] = l3;
					}
					if(l3 > ae[j3 + 1][l2 + 1]){
						ae[j3 + 1][l2 + 1] = l3;
					}
				}
				
			}
			
			for(int i3 = 0; i3 < yd; i3++){
				for(int k3 = 0; k3 < ce; k3++){
					if(ae[i3][k3] >= 1000){
						ae[i3][k3] -= 1000;
					}
				}
				
			}
			
			g1.closeStream();
			be = 1;
		} catch(IOException _ex){
			be = 0;
			System.out.println("Fatal error loading map!");
		}
		r = new F("menu/table.ob2");
		i = new F("menu/trapdoor.ob2");
	}
	
	private void processServerResponse(){
		try{
			y.q();
			int response = y.i();
			System.out.println("Got response: " + response);
			if(response == 0){
				gameScreen = 1;
				return;
			}
			if(response == 1){
				pc = 2;
				messageTop = "New user detected";
				messageBottom = "Did you enter your name correctly? (Y or N)";
				return;
			}
			if(response == 2){
				pc = 3;
				messageTop = "Sorry! The server is currently full";
				messageBottom = "Please try later, or press any key to retry";
				return;
			}
			if(response == 3){
				pc = 4;
				messageTop = "Wrong password - try again!";
				messageBottom = "New players: That name is taken/invalid";
				return;
			} else {
				pc = 3;
				messageTop = "Sorry! Unable to connect to server";
				messageBottom = "Please try later, or press any key to retry";
				return;
			}
		} catch(Exception _ex){
			pc = 3;
		}
		
		messageTop = "Sorry! Unable to connect to server";
		messageBottom = "Please try later, or press any key to retry";
	}
	
	private void connectToServer(){
		try{
			messageTop = "Please wait...";
			messageBottom = "Connecting to server";
			draw();
			f();
			y = null;
			Socket socket;
			if(inAppletMode){
				socket = new Socket(InetAddress.getByName(getCodeBase().getHost()), 4600);
			} else {
				socket = new Socket(InetAddress.getByName(wc), 4600);
			}
			socket.setSoTimeout(10000);
			socket.setTcpNoDelay(true);
			y = new Buffer(socket);
			y.setPacketID(0);
			y.addString(D.fixUserCredential(username, 12));
			y.addString(D.fixUserCredential(password, 12));
			y.c();
			return;
		} catch(Exception exception){
			System.out.println(String.valueOf(exception));
			System.out.println(exception.getMessage());
			pc = 5;
			messageTop = "Sorry! Unable to connect to server";
			messageBottom = "Please try later, or press any key to retry";
			return;
		}
	}
	
	private void drawLoginScreen(){
		if(gameScreen == 0){
			nb.a(lowDetail);
			g.d(0, 0, 0, 235, s, 0, 500);
			g.a(lowDetail);
			nb.a(graphics, 6, 47, lowDetail);
			graphics.setColor(Color.white);
			D.a(graphics, "Welcome to", ne, 256, 50);
			D.a(graphics, "OpenCGD", ne, 256, 85);
			D.a(graphics, messageTop, fc, 256, 200);
			D.a(graphics, messageBottom, fc, 256, 240);
			md.drawImage(le, 0, 0, this);
			nd = false;
		}
	}
	
	private void w(){
		if(gameScreen == 0){
			s = s + 2 & 0xff;
			if(pc == 0){
				if(super.r != username){
					username = super.r;
					messageBottom = "*" + username + "*";
				}
				if(super.q != ""){
					username = super.q;
					super.r = "";
					super.q = "";
					pc = 1;
					messageTop = "Please enter password";
					messageBottom = "*";
					for(int i1 = 0; i1 < password.length(); i1++){
						messageBottom += "+";
					}
					
					messageBottom += "*";
					return;
				}
			} else if(pc == 1){
				if(super.r != username){
					password = super.r;
					messageBottom = "*";
					for(int j1 = 0; j1 < password.length(); j1++){
						messageBottom += "+";
					}
					
					messageBottom += "*";
				}
				if(super.q != ""){
					password = super.q;
					super.r = "";
					super.q = "";
					connectToServer();
					processServerResponse();
					return;
				}
			} else {
				if(pc == 2 && super.s != 0){
					j();
					if(super.s == 121 || super.s == 89){
						y.setPacketID(2);
						y.sendPacket();
						processServerResponse();
						return;
					} else {
						super.r = "";
						super.q = "";
						pc = 0;
						messageTop = "Please Enter a username";
						messageBottom = "*" + username + "*";
						return;
					}
				}
				if(pc == 3 && super.s != 0){
					connectToServer();
					processServerResponse();
					return;
				}
				if(pc == 4 && super.s != 0){
					super.r = "";
					super.q = "";
					pc = 0;
					messageTop = "Please Enter a username";
					messageBottom = "*" + username + "*";
				}
			}
		}
	}
	
	private void x(){
		messageTop = "Please enter a username:";
		messageBottom = "*" + username + "*";
		ke = false;
		g.c();
		g.b(ie);
		g.b = 5;
		g.a = 5000;
		g.a(0, 0, 0, 0, 0, 0);
		g.setCamera(250, 145, 250, 145, 500);
		g.kb = 20;
		g.a(32, 0, 0);
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, 512, 384);
		nd = true;
		pc = 0;
		super.r = "";
		super.q = "";
	}
	
	private void y(){
		ie = new F("menu/castle.ob2");
	}
	
	private void drawOptionsScreen(){
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, 512, 384);
		graphics.setColor(new Color(0, 32, 64));
		graphics.fillRect(0, 64, 512, 144);
		graphics.setColor(new Color(0, 48, 80));
		graphics.fillRect(0, 112, 512, 48);
		graphics.setColor(Color.white);
		D.a(graphics, "Select options:", td, 256, 88);
		D.a(graphics, "Recommended for Pentium\256 Computers", rd, 256, 144);
		D.a(graphics, "Recommended for Pentium-II\256 or better", rd, 256, 192);
		graphics.setColor(Color.red);
		D.a(graphics, "Low detail", sd, 256, 128);
		graphics.setColor(Color.green);
		D.a(graphics, "High detail", sd, 256, 176);
		md.drawImage(le, 0, 0, this);
	}
	
	private void handleSelectOptions(){
		if(super.hh != 0){
			if(super.e >= 112 && super.e < 160){
				lowDetail = true;
				gameScreen = 0;
				super.hh = 0;
				return;
			}
			if(super.e >= 160 && super.e < 208){
				lowDetail = false;
				gameScreen = 0;
				super.hh = 0;
				return;
			}
		}
	}
	
	private void db(){
		if(y != null){
			y.setPacketID(1);
			y.sendPacket();
		}
		gameScreen = 0;
		pc = 0;
	}
	
	private void j(){
		try{
			m++;
			if(m > n){
				m = 0;
				y.setPacketID(4);
				y.c();
				return;
			}
		} catch(IOException _ex){
			oc = true;
		}
	}
	
	public void e(){
		db();
		if(nb != null){
			nb.a();
		}
	}
	
	private void transitionScreen(){
		try{
			if(gameScreen != sb){
				sb = gameScreen;
				super.hh = 0;
				if(gameScreen == 0){
					x();
					return;
				}
				if(gameScreen == 1){
					r();
					return;
				}
				if(gameScreen == 2){
					l();
					return;
				}
				if(gameScreen >= 3){
					games[gameScreen - 3].a(this, id);
					return;
				}
			}
		} catch(Throwable throwable){
			if(gameScreen != 0 && y != null && cb){
				cb = false;
				y.setPacketID(17);
				y.addString("init: " + throwable + " screen:" + gameScreen);
				y.sendPacket();
			}
			
			throwable.printStackTrace();
		}
	}
	
	public synchronized void draw() // XXX
	{
		transitionScreen();
		if(gameScreen == -1){
			drawOptionsScreen();
			return;
		}
		if(gameScreen == 0){
			drawLoginScreen();
			return;
		}
		if(gameScreen == 1){
			drawLobby();
			return;
		}
		if(gameScreen == 2){
			h();
			return;
		}
		if(gameScreen >= 3){
			games[gameScreen - 3].drawGame();
		}
	}
	
	public synchronized void c(){
		try{
			transitionScreen();
			if(gameScreen == -1){
				handleSelectOptions();
			} else if(gameScreen == 0){
				w();
			} else if(gameScreen == 1){
				n();
			} else if(gameScreen == 2){
				i();
			} else if(gameScreen >= 3){
				games[gameScreen - 3].k();
			}
			if(oc){
				oc = false;
				db();
				gameScreen = 0;
				transitionScreen();
				connectToServer();
				processServerResponse();
			}
			super.hh = 0;
			super.s = 0;
			return;
		} catch(Throwable throwable){
			if(gameScreen != 0 && y != null && cb){
				cb = false;
				y.setPacketID(17);
				y.addString("p: " + throwable + " s:" + gameScreen + " a:" + pe + " cl:" + be);
				y.sendPacket();
			}
			
			//throwable.printStackTrace();
		}
	}
	
	public void b(){
		le = createImage(512, 384);
		graphics = le.getGraphics();
		gameScreen = -1;
		md = getGraphics();
		a(40);
		nb = new E(500, 290, 350, this);
		g = new B(nb.l, 100, 5000, 50);
		D.a(10);
		g.a("menu/textures.gif", null, 10, 60);
		D.a(60);
		qb = D.c("menu/panel.gif");
		D.a(70);
		hb = D.c("menu/quit.gif");
		D.a(80);
		y();
		D.a(90);
		loadCastle();
		D.a(100);
	}
	
	public void a(){
		nd = true;
		if(qc){
			md.drawImage(le, 0, 0, this);
		}
	}
	
	public static void main(String args[]){
		inAppletMode = false;
		OpenCGD cgd = new OpenCGD();
		cgd.b(512, 384, "OpenCGD", false);
	}
}