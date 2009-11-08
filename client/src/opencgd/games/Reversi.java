package opencgd.games;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import opencgd.client.AbstractGame;

public class Reversi extends AbstractGame {
	
	private boolean j;
	private boolean f;
	private int a;
	private int c;
	private int m[][];
	private int i;
	private int h;
	private int g;
	private Font l;
	private int d[] = {
			32, 85, 141, 197, 253, 308, 363, 419, 472
	};
	private int e[] = {
			115, 148, 182, 216, 250, 285, 319, 353, 386
	};
	private int b[] = {
			14, 31, 53, 75, 101, 131, 164, 202, 245
	};
	
	public Reversi(){
		l = new Font("Helvetica", 1, 13);
		h = 30;
		m = new int[8][8];
		f = false;
		j = false;
	}
	
	@Override
	public void a(){
		super.k.a(0, 0, 10);
		for(int i1 = 0; i1 <= 7; i1++){
			for(int j1 = 0; j1 <= 7; j1++){
				if(m[i1][j1] != 0 && m[i1][j1] != 1 && m[i1][j1] != 9){
					int k1 = m[i1][j1];
					if(k1 > 9){
						k1 = 9 - (k1 - 9);
					}
					a(i1, j1, k1);
				}
			}
			
		}
		
		super.k.a(super.u, 6, 6, false);
		super.u.setFont(l);
		super.u.setColor(Color.white);
		String s = "You are playing white";
		if(super.q == 1){
			s = "You are playing red";
		}
		if(g == -1){
			super.u.drawString("Please wait...", 10, 20);
		} else if(g == super.q){
			super.u.drawString("Your turn - " + s + " - Make a move!", 10, 20);
		} else {
			super.u.drawString(super.n[g] + "'s turn - Please wait", 10, 20);
		}
		opencgd.client.library.D.b(super.u, "Time-Remaining:" + h, l, 502, 20);
	}
	
	private void b(){
		super.k.a(0, 0, 0);
		for(int i1 = 0; i1 <= 7; i1++){
			for(int j1 = 0; j1 <= 7; j1++){
				if(m[i1][j1] == 1 || m[i1][j1] == 9){
					a(i1, j1, m[i1][j1]);
				}
			}
			
		}
		
		super.k.b(10);
	}
	
	private void a(int i1, int j1, int k1){
		int l1 = (b[j1] + b[j1 + 1]) / 2;
		int i2 = (e[i1] + e[i1 + 1]) / 2;
		int j2 = (d[i1] + d[i1 + 1]) / 2;
		int k2 = (i2 * (b[8] - l1 - 4) + j2 * ((l1 + 4) - b[0])) / (b[8] - b[0]);
		int l2 = 29 + (19 * j1) / 7;
		int i3 = 23 + (23 * j1) / 7;
		super.k.b(k2 - l2 / 2, l1 - i3 / 2, l2, i3, k1);
	}
	
	private void a(int i1, int j1){
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
		
		int ai[] = new int[9];
		for(int l1 = 0; l1 < 9; l1++){
			ai[l1] = (e[l1] * (b[8] - j1) + d[l1] * (j1 - b[0])) / (b[8] - b[0]);
		}
		
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
	
	private int b(int i1, int j1){
		if(i1 < 0 || j1 < 0 || i1 > 7 || j1 > 7){
			return 0;
		} else {
			return m[i1][j1];
		}
	}
	
	private int a(int i1, int j1, int k1, int l1){
		int i2 = 1 + (1 - super.q) * 8;
		int j2 = i1 + k1;
		int k2 = j1 + l1;
		int l2 = 0;
		for(; b(j2, k2) == i2; k2 += l1){
			l2++;
			j2 += k1;
		}
		
		if(b(j2, k2) != super.q * 8 + 1 || l2 == 0){
			return 0;
		}
		j2 = i1 + k1;
		k2 = j1 + l1;
		int i3 = (1 - super.q) * 8 + 2;
		for(; b(j2, k2) == i2; k2 += l1){
			m[j2][k2] = i3;
			j2 += k1;
		}
		
		return l2;
	}
	
	private void c(int i1, int j1){
		if(f){
			return;
		}
		if(i1 < 0 || j1 < 0 || i1 > 7 || j1 > 7 || h == 0){
			return;
		}
		if(g != super.q){
			return;
		}
		if(m[i1][j1] != 0){
			return;
		}
		boolean flag = false;
		if(a(i1, j1, -1, -1) != 0){
			flag = true;
		}
		if(a(i1, j1, 0, -1) != 0){
			flag = true;
		}
		if(a(i1, j1, 1, -1) != 0){
			flag = true;
		}
		if(a(i1, j1, -1, 0) != 0){
			flag = true;
		}
		if(a(i1, j1, 1, 0) != 0){
			flag = true;
		}
		if(a(i1, j1, -1, 1) != 0){
			flag = true;
		}
		if(a(i1, j1, 0, 1) != 0){
			flag = true;
		}
		if(a(i1, j1, 1, 1) != 0){
			flag = true;
		}
		if(!flag){
			return;
		} else {
			super.connectionStream.setPacketID(255);
			super.connectionStream.addByte(i1);
			super.connectionStream.addByte(j1);
			super.connectionStream.sendPacket();
			m[i1][j1] = super.q * 8 + 1;
			b();
			g = 1 - g;
			f = true;
			return;
		}
	}
	
	@Override
	public void d(){
		i++;
		a(((opencgd.client.library.EngineApplet) (super.w)).f, ((opencgd.client.library.EngineApplet) (super.w)).e);
		if(g == super.q && c != -1 && ((opencgd.client.library.EngineApplet) (super.w)).hh == 1){
			c(c, a);
		}
		if(i % 4 == 0){
			f = false;
			boolean flag = false;
			for(int i1 = 0; i1 <= 7; i1++){
				for(int j1 = 0; j1 <= 7; j1++){
					if(m[i1][j1] != 0 && m[i1][j1] != 1 && m[i1][j1] != 9){
						m[i1][j1]++;
						if(m[i1][j1] == 17){
							m[i1][j1] = 1;
							flag = true;
						}
						if(m[i1][j1] == 9){
							flag = true;
						}
						f = true;
					}
				}
				
			}
			
			if(flag){
				b();
			}
			if(f && j){
				j = false;
				return;
			}
			if(!f){
				j = true;
			}
		}
	}
	
	@Override
	public void g(){
		super.k.b = 290;
		super.k.c = 0;
		for(int i1 = 0; i1 < 8; i1++){
			for(int j1 = 0; j1 < 8; j1++){
				m[i1][j1] = 0;
			}
			
		}
		
		g = 0;
		f = false;
		b();
	}
	
	@Override
	public void loadMedia(){
		super.p = 2;
		super.k.a();
		super.k.a("reversi/board.jpg", 0, false);
		super.k.a("reversi/reversi.gif", 1, true, 9, 48, 46);
	}
	
	@Override
	public void handleIncomingPacket(int i1, int j1) throws IOException{
		if(i1 == 255){
			g = super.connectionStream.getShort(super.ab, 1);
			h = super.connectionStream.getShort(super.ab, 3);
			return;
		}
		if(i1 == 254){
			for(int k1 = 0; k1 < 8; k1++){
				for(int l1 = 0; l1 < 8; l1++){
					int i2 = super.connectionStream.a(super.ab[1 + k1 * 8 + l1]);
					if(m[k1][l1] == 0 || i2 == 0){
						m[k1][l1] = i2;
					} else if(m[k1][l1] == 9 && i2 == 1){
						m[k1][l1] = 10;
					} else if(m[k1][l1] == 1 && i2 == 9){
						m[k1][l1] = 2;
					}
				}
				
			}
			
			b();
			f = true;
		}
	}
	
	@Override
	public boolean i(){
		return !f;
	}
}
