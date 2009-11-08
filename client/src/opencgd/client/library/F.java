package opencgd.client.library;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F {
	
	private int wc;
	private byte xc[];
	private int jb;
	private int gb;
	private int kb;
	private int hb;
	private int lb;
	private int ib;
	private int xb;
	private int f;
	private int e;
	private int a;
	private int b;
	private int c;
	private int d;
	private int l;
	private int m;
	private int n;
	private int p;
	private int q;
	private int r;
	private int h;
	private int i;
	private int j;
	private int dc[];
	private int zb[];
	private int ec[];
	private int ac[];
	private int fc[];
	private int bc[];
	private int pc[][];
	private int cc;
	private int nb[];
	private int ob[];
	private int pb[];
	private int v[];
	private int x[];
	private int z[];
	private int wb;
	private int s;
	private int vb;
	private static int g[];
	private static byte yc[];
	private static int k[];
	protected int qc;
	protected int o;
	protected boolean rc[];
	protected int zc[];
	protected int vc[];
	protected int oc[];
	protected int qb[];
	protected int rb[];
	protected int sb[];
	protected int nc[];
	protected int mc[];
	protected int ic[];
	protected int jc[];
	protected int kc[][];
	protected int lc[];
	protected int ub;
	protected int fb[];
	private int ab[];
	protected int eb[];
	protected int bb[];
	protected int cb[];
	protected int db[];
	protected int w[];
	protected int y[];
	protected int sc[];
	protected int tc[];
	protected int uc[];
	protected int tb;
	
	public F[] a(){
		b();
		int i1 = 0;
		for(int j1 = 0; j1 < ub; j1++){
			if(pc[j1][0] > i1){
				i1 = pc[j1][0];
			}
		}
		
		int ai[] = new int[++i1];
		int ai1[] = new int[i1];
		for(int k1 = 0; k1 < i1; k1++){
			ai[k1] = 0;
			ai1[k1] = 0;
		}
		
		for(int l1 = 0; l1 < ub; l1++){
			ai1[pc[l1][0]]++;
			ai[pc[l1][0]] += lc[l1];
		}
		
		F af[] = new F[i1];
		for(int i2 = 0; i2 < i1; i2++){
			af[i2] = new F(ai[i2], ai1[i2], true);
		}
		
		for(int j2 = 0; j2 < ub; j2++){
			F f1 = af[pc[j2][0]];
			int ai2[] = new int[lc[j2]];
			int ai3[] = kc[j2];
			for(int k2 = 0; k2 < lc[j2]; k2++){
				ai2[k2] = f1.a(z[ai3[k2]], x[ai3[k2]], v[ai3[k2]]);
			}
			
			int l2 = f1.a(lc[j2], ai2, jc[j2], ic[j2]);
			f1.rc[l2] = rc[j2];
			f1.zc[l2] = zc[j2];
			f1.vc[l2] = vc[j2];
			int i3 = pc[j2].length - 1;
			if(i3 < 1){
				i3 = 1;
			}
			f1.pc[l2] = new int[i3];
			if(i3 > 1){
				for(int j3 = 0; j3 < i3; j3++){
					f1.pc[l2][j3] = pc[j2][j3 + 1];
				}
				
			} else {
				f1.pc[l2][0] = l2;
			}
		}
		
		return af;
	}
	
	public void a(String s1){
		b();
		int i1 = 3 + tb * 3 + ub * 7;
		for(int j1 = 0; j1 < ub; j1++){
			i1 += lc[j1] + pc[j1].length;
		}
		
		i1 *= 3;
		xc = new byte[i1 + i1 / 120];
		wc = 0;
		a(i1 - 3);
		a(tb);
		a(ub);
		for(int k1 = 0; k1 < tb; k1++){
			a(z[k1]);
			a(x[k1]);
			a(v[k1]);
		}
		
		for(int l1 = 0; l1 < ub; l1++){
			a(lc[l1]);
			a(jc[l1]);
			a(ic[l1]);
			a(pc[l1].length);
			a(vc[l1]);
			a(zc[l1]);
			a(rc[l1] ? 1 : 0);
			for(int i2 = 0; i2 < lc[l1]; i2++){
				a(kc[l1][i2]);
			}
			
			for(int j2 = 0; j2 < pc[l1].length; j2++){
				a(pc[l1][j2]);
			}
			
		}
		
		try{
			FileOutputStream fileoutputstream = new FileOutputStream(s1);
			fileoutputstream.write(xc, 0, wc);
			fileoutputstream.close();
			return;
		} catch(Exception _ex){
			opencgd.client.library.D.b("Error! Unable to save file");
		}
	}
	
	public void b(String s1){
		b();
		int i1 = 3 + tb * 3 + ub * 4;
		for(int j1 = 0; j1 < ub; j1++){
			i1 += lc[j1] + pc[j1].length;
		}
		
		i1 *= 3;
		xc = new byte[i1 + i1 / 120];
		wc = 0;
		a(i1 - 3);
		a(tb);
		a(ub);
		for(int k1 = 0; k1 < tb; k1++){
			a(z[k1]);
			a(x[k1]);
			a(v[k1]);
		}
		
		for(int l1 = 0; l1 < ub; l1++){
			a(lc[l1]);
			a(jc[l1]);
			a(ic[l1]);
			a(pc[l1].length);
			for(int i2 = 0; i2 < lc[l1]; i2++){
				a(kc[l1][i2]);
			}
			
			for(int j2 = 0; j2 < pc[l1].length; j2++){
				a(pc[l1][j2]);
			}
			
		}
		
		try{
			FileOutputStream fileoutputstream = new FileOutputStream(s1);
			fileoutputstream.write(xc, 0, wc);
			fileoutputstream.close();
			return;
		} catch(Exception _ex){
			opencgd.client.library.D.b("Error! Unable to save file");
		}
	}
	
	private int a(byte abyte0[]){
		for(; abyte0[wc] == 10 || abyte0[wc] == 13; wc++){
		}
		int i1 = g[abyte0[wc++] & 0xff];
		int j1 = g[abyte0[wc++] & 0xff];
		int k1 = g[abyte0[wc++] & 0xff];
		int l1 = (i1 * 4096 + j1 * 64 + k1) - 0x20000;
		if(l1 == 0x1e240){
			l1 = vb;
		}
		return l1;
	}
	
	private void a(int i1){
		if(i1 == vb){
			i1 = 0x1e240;
		}
		i1 += 0x20000;
		xc[wc++] = yc[i1 >> 12 & 0x3f];
		xc[wc++] = yc[i1 >> 6 & 0x3f];
		xc[wc++] = yc[i1 & 0x3f];
	}
	
	public F c(){
		F af[] = new F[1];
		af[0] = this;
		return new F(af, 1);
	}
	
	public boolean a(int i1, int j1, int k1, int l1){
		d();
		if(i1 >= ib && i1 <= lb && j1 >= hb && j1 <= kb && k1 >= gb && k1 <= jb){
			for(int i2 = 0; i2 < ub; i2++){
				if(i1 >= bc[i2] && i1 <= fc[i2] && j1 >= ac[i2] && j1 <= ec[i2] && k1 >= zb[i2] && k1 <= zb[i2]){
					int j2 = kc[i2][0];
					int k2 = pb[j2];
					int l2 = ob[j2];
					int i3 = nb[j2];
					int j3 = (i1 - k2) * sb[i2] + (j1 - l2) * rb[i2] + (k1 - i3) * qb[i2];
					l1 *= 256;
					if(j3 >= -l1 && j3 <= l1){
						return true;
					}
				}
			}
			
		}
		return false;
	}
	
	public boolean a(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		d();
		if((i1 >= ib || l1 >= ib) && (i1 <= lb || l1 <= lb) && (j1 >= hb || i2 >= hb) && (j1 <= kb || i2 <= kb) && (k1 >= gb || j2 >= gb) && (k1 <= jb || j2 <= jb)){
			for(int l2 = 0; l2 < ub; l2++){
				if((i1 > bc[l2] || l1 > bc[l2]) && (i1 < fc[l2] || l1 < fc[l2])){
					int i3 = i1;
					int j3 = j1;
					int k3 = k1;
					int l3 = l1;
					int i4 = i2;
					int j4 = j2;
					if(l3 != i3){
						double d1 = (double) (i4 - j3) / (double) (l3 - i3);
						double d3 = (double) (j4 - k3) / (double) (l3 - i3);
						if(i3 < bc[l2]){
							j3 = (int) (j3 + (bc[l2] - i3) * d1);
							k3 = (int) (k3 + (bc[l2] - i3) * d3);
							i3 = bc[l2];
						} else if(i3 > fc[l2]){
							j3 = (int) (j3 + (fc[l2] - i3) * d1);
							k3 = (int) (k3 + (fc[l2] - i3) * d3);
							i3 = fc[l2];
						}
						if(l3 < bc[l2]){
							i4 = (int) (i4 + (bc[l2] - l3) * d1);
							j4 = (int) (j4 + (bc[l2] - l3) * d3);
							l3 = bc[l2];
						} else if(l3 > fc[l2]){
							i4 = (int) (i4 + (fc[l2] - l3) * d1);
							j4 = (int) (j4 + (fc[l2] - l3) * d3);
							l3 = fc[l2];
						}
					}
					if((j3 >= ac[l2] || i4 >= ac[l2]) && (j3 <= ec[l2] || i4 <= ec[l2])){
						if(i4 != j3){
							double d2 = (double) (j4 - k3) / (double) (i4 - j3);
							if(j3 < ac[l2]){
								k3 = (int) (k3 + (ac[l2] - j3) * d2);
								j3 = ac[l2];
							} else if(j3 > ec[l2]){
								k3 = (int) (k3 + (ec[l2] - j3) * d2);
								j3 = ec[l2];
							}
							if(i4 < ac[l2]){
								j4 = (int) (j4 + (ac[l2] - i4) * d2);
								i4 = ac[l2];
							} else if(i4 > ec[l2]){
								j4 = (int) (j4 + (ec[l2] - i4) * d2);
								i4 = ec[l2];
							}
						}
						if((k3 >= zb[l2] || j4 >= zb[l2]) && (k3 <= dc[l2] || j4 <= dc[l2])){
							int k4 = kc[l2][0];
							int l4 = pb[k4];
							int i5 = ob[k4];
							int j5 = nb[k4];
							int k5 = (i1 - l4) * sb[l2] + (j1 - i5) * rb[l2] + (k1 - j5) * qb[l2];
							int l5 = (l1 - l4) * sb[l2] + (i2 - i5) * rb[l2] + (j2 - j5) * qb[l2];
							k2 *= 256;
							if(k5 <= k2 && l5 >= -k2 || k5 >= -k2 && l5 <= k2){
								return true;
							}
						}
					}
				}
			}
			
		}
		return false;
	}
	
	private void b(){
		d();
		for(int i1 = 0; i1 < tb; i1++){
			z[i1] = pb[i1];
			x[i1] = ob[i1];
			v[i1] = nb[i1];
		}
		
		j = i = h = 0;
		r = q = p = 0;
		n = m = l = 256;
		d = c = b = a = e = f = 256;
		xb = 0;
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2){
		d();
		for(int i3 = 0; i3 < tb; i3++){
			uc[i3] = pb[i3] - i1;
			tc[i3] = ob[i3] - j1;
			sc[i3] = nb[i3] - k1;
		}
		
		b(l1, i2, j2);
		for(int j3 = 0; j3 < tb; j3++){
			if(sc[j3] >= l2){
				y[j3] = (uc[j3] << k2) / sc[j3];
			} else {
				y[j3] = uc[j3] << k2;
			}
			if(sc[j3] >= l2){
				w[j3] = (tc[j3] << k2) / sc[j3];
			} else {
				w[j3] = tc[j3] << k2;
			}
		}
		
	}
	
	private void d(){
		if(s == 1){
			s = 0;
			for(int i1 = 0; i1 < tb; i1++){
				pb[i1] = z[i1];
				ob[i1] = x[i1];
				nb[i1] = v[i1];
			}
			
			if(xb >= 2){
				c(r, q, p);
			}
			if(xb >= 3){
				d(n, m, l);
			}
			if(xb >= 4){
				a(d, c, b, a, e, f);
			}
			if(xb >= 1){
				e(j, i, h);
			}
			e();
			f();
		}
	}
	
	public void f(){
		for(int i1 = 0; i1 < tb; i1++){
			eb[i1] = vb;
			ab[i1] = vb;
			db[i1] = 0;
			cb[i1] = 0;
			bb[i1] = 0;
			fb[i1] = 0;
		}
		
		for(int j1 = 0; j1 < ub; j1++){
			int ai[] = kc[j1];
			int k1 = pb[ai[0]];
			int l1 = ob[ai[0]];
			int i2 = nb[ai[0]];
			int j2 = pb[ai[1]] - k1;
			int k2 = ob[ai[1]] - l1;
			int l2 = nb[ai[1]] - i2;
			int i3 = pb[ai[2]] - k1;
			int j3 = ob[ai[2]] - l1;
			int k3 = nb[ai[2]] - i2;
			int l3 = k2 * k3 - j3 * l2;
			int i4 = l2 * i3 - k3 * j2;
			int j4;
			for(j4 = j2 * j3 - i3 * k2; l3 > 8192 || i4 > 8192 || j4 > 8192 || l3 < -8192 || i4 < -8192 || j4 < -8192; j4 >>= 1){
				l3 >>= 1;
				i4 >>= 1;
			}
			
			int k4 = (int) (256D * Math.sqrt(l3 * l3 + i4 * i4 + j4 * j4));
			if(k4 <= 0){
				k4 = 1;
			}
			sb[j1] = (l3 * 0x10000) / k4;
			rb[j1] = (i4 * 0x10000) / k4;
			qb[j1] = (j4 * 0x10000) / k4;
			mc[j1] = -1;
			oc[j1] = vb;
			if(rc[j1]){
				for(int l4 = 0; l4 < lc[j1]; l4++){
					int i5 = kc[j1][l4];
					db[i5] += sb[j1];
					cb[i5] += rb[j1];
					bb[i5] += qb[j1];
					fb[i5]++;
				}
				
			}
		}
		
	}
	
	private void e(){
		ib = hb = gb = 0xf423f;
		lb = kb = jb = 0xfff0bdc1;
		for(int i1 = 0; i1 < ub; i1++){
			int ai[] = kc[i1];
			int k1 = ai[0];
			int i2 = lc[i1];
			int j2;
			int k2 = j2 = pb[k1];
			int l2;
			int i3 = l2 = ob[k1];
			int j3;
			int k3 = j3 = nb[k1];
			for(int j1 = 0; j1 < i2; j1++){
				int l1 = ai[j1];
				if(pb[l1] < j2){
					j2 = pb[l1];
				} else if(pb[l1] > k2){
					k2 = pb[l1];
				}
				if(ob[l1] < l2){
					l2 = ob[l1];
				} else if(ob[l1] > i3){
					i3 = ob[l1];
				}
				if(nb[l1] < j3){
					j3 = nb[l1];
				} else if(nb[l1] > k3){
					k3 = nb[l1];
				}
			}
			
			bc[i1] = j2;
			fc[i1] = k2;
			ac[i1] = l2;
			ec[i1] = i3;
			zb[i1] = j3;
			dc[i1] = k3;
			if(j2 < ib){
				ib = j2;
			}
			if(k2 > lb){
				lb = k2;
			}
			if(l2 < hb){
				hb = l2;
			}
			if(i3 > kb){
				kb = i3;
			}
			if(j3 < gb){
				gb = j3;
			}
			if(k3 > jb){
				jb = k3;
			}
		}
		
	}
	
	private void d(int i1, int j1, int k1){
		for(int l1 = 0; l1 < tb; l1++){
			pb[l1] = pb[l1] * i1 >> 8;
			ob[l1] = ob[l1] * j1 >> 8;
			nb[l1] = nb[l1] * k1 >> 8;
		}
		
	}
	
	private void a(int i1, int j1, int k1, int l1, int i2, int j2){
		for(int k2 = 0; k2 < tb; k2++){
			if(i1 != 0){
				pb[k2] += ob[k2] * i1 >> 8;
			}
			if(j1 != 0){
				nb[k2] += ob[k2] * j1 >> 8;
			}
			if(k1 != 0){
				pb[k2] += nb[k2] * k1 >> 8;
			}
			if(l1 != 0){
				ob[k2] += nb[k2] * l1 >> 8;
			}
			if(i2 != 0){
				nb[k2] += pb[k2] * i2 >> 8;
			}
			if(j2 != 0){
				ob[k2] += pb[k2] * j2 >> 8;
			}
		}
		
	}
	
	private void c(int i1, int j1, int k1){
		for(int i4 = 0; i4 < tb; i4++){
			if(k1 != 0){
				int l1 = k[k1];
				int k2 = k[k1 + 256];
				int j3 = ob[i4] * l1 + pb[i4] * k2 >> 15;
				ob[i4] = ob[i4] * k2 - pb[i4] * l1 >> 15;
				pb[i4] = j3;
			}
			if(i1 != 0){
				int i2 = k[i1];
				int l2 = k[i1 + 256];
				int k3 = ob[i4] * l2 - nb[i4] * i2 >> 15;
				nb[i4] = ob[i4] * i2 + nb[i4] * l2 >> 15;
				ob[i4] = k3;
			}
			if(j1 != 0){
				int j2 = k[j1];
				int i3 = k[j1 + 256];
				int l3 = nb[i4] * j2 + pb[i4] * i3 >> 15;
				nb[i4] = nb[i4] * i3 - pb[i4] * j2 >> 15;
				pb[i4] = l3;
			}
		}
		
	}
	
	private void b(int i1, int j1, int k1){
		for(int i4 = 0; i4 < tb; i4++){
			if(k1 != 0){
				int l1 = k[k1];
				int k2 = k[k1 + 256];
				int j3 = tc[i4] * l1 + uc[i4] * k2 >> 15;
				tc[i4] = tc[i4] * k2 - uc[i4] * l1 >> 15;
				uc[i4] = j3;
			}
			if(j1 != 0){
				int i2 = k[j1];
				int l2 = k[j1 + 256];
				int k3 = sc[i4] * i2 + uc[i4] * l2 >> 15;
				sc[i4] = sc[i4] * l2 - uc[i4] * i2 >> 15;
				uc[i4] = k3;
			}
			if(i1 != 0){
				int j2 = k[i1];
				int i3 = k[i1 + 256];
				int l3 = tc[i4] * i3 - sc[i4] * j2 >> 15;
				sc[i4] = tc[i4] * j2 + sc[i4] * i3 >> 15;
				tc[i4] = l3;
			}
		}
		
	}
	
	private void e(int i1, int j1, int k1){
		for(int l1 = 0; l1 < tb; l1++){
			pb[l1] += i1;
			ob[l1] += j1;
			nb[l1] += k1;
		}
		
	}
	
	private void g(){
		if(d != 256 || c != 256 || b != 256 || a != 256 || e != 256 || f != 256){
			xb = 4;
			return;
		}
		if(n != 256 || m != 256 || l != 256){
			xb = 3;
			return;
		}
		if(r != 0 || q != 0 || p != 0){
			xb = 2;
			return;
		}
		if(j != 0 || i != 0 || h != 0){
			xb = 1;
			return;
		} else {
			xb = 0;
			return;
		}
	}
	
	public void f(int i1, int j1, int k1){
		int l1 = j - i1;
		int i2 = i - j1;
		int j2 = h - k1;
		for(int k2 = 0; k2 < tb; k2++){
			z[k2] += l1;
			x[k2] += i2;
			v[k2] += j2;
		}
		
		j = i1;
		i = j1;
		h = k1;
		s = 1;
	}
	
	public void b(int i1, int j1, int k1, int l1, int i2, int j2){
		d = i1;
		c = j1;
		b = k1;
		a = l1;
		e = i2;
		f = j2;
		g();
		s = 1;
	}
	
	public void g(int i1, int j1, int k1){
		n = i1;
		m = j1;
		l = k1;
		g();
		s = 1;
	}
	
	public int h(){
		return h;
	}
	
	public int i(){
		return i;
	}
	
	public int j(){
		return j;
	}
	
	public void a(double d1){
		int i1 = 0;
		int j1 = 0;
		int k1 = 0;
		for(int l1 = 0; l1 < tb; l1++){
			i1 += z[l1];
			j1 += x[l1];
			k1 += v[l1];
		}
		
		i1 /= tb;
		j1 /= tb;
		k1 /= tb;
		i1 = (int) (i1 * d1) - i1;
		j1 = (int) (j1 * d1) - j1;
		k1 = (int) (k1 * d1) - k1;
		for(int i2 = 0; i2 < tb; i2++){
			z[i2] += i1;
			x[i2] += j1;
			v[i2] += k1;
		}
		
		s = 1;
	}
	
	public void h(int i1, int j1, int k1){
		j = i1;
		i = j1;
		h = k1;
		g();
		s = 1;
	}
	
	public void i(int i1, int j1, int k1){
		j += i1;
		i += j1;
		h += k1;
		g();
		s = 1;
	}
	
	public void j(int i1, int j1, int k1){
		r = i1 & 0xff;
		q = j1 & 0xff;
		p = k1 & 0xff;
		g();
		s = 1;
	}
	
	public void k(int i1, int j1, int k1){
		r = r + i1 & 0xff;
		q = q + j1 & 0xff;
		p = p + k1 & 0xff;
		g();
		s = 1;
	}
	
	public void b(int i1){
		int j1 = lc[i1];
		if(j1 <= 3){
			return;
		}
		int ai[] = kc[i1];
		int l1 = z[ai[0]];
		int i2 = x[ai[0]];
		int j2 = v[ai[0]];
		int k2 = z[ai[1]] - l1;
		int l2 = x[ai[1]] - i2;
		int i3 = v[ai[1]] - j2;
		int j3 = z[ai[2]] - l1;
		int k3 = x[ai[2]] - i2;
		int l3 = v[ai[2]] - j2;
		long l4 = l2 * l3 - k3 * i3;
		long l5 = i3 * j3 - l3 * k2;
		long l6 = k2 * k3 - j3 * l2;
		long l7 = (long) Math.sqrt(l4 * l4 + l5 * l5 + l6 * l6);
		if(l7 == 0L){
			return;
		}
		for(int i4 = 3; i4 < j1; i4++){
			int k1 = ai[i4];
			long l8 = ((z[k1] - l1) * l4 + (x[k1] - i2) * l5 + (v[k1] - j2) * l6) / l7;
			if(l8 != 0L){
				z[k1] -= (l8 * l4) / l7;
				x[k1] -= (l8 * l5) / l7;
				v[k1] -= (l8 * l6) / l7;
			}
		}
		
		s = 1;
	}
	
	public void c(int i1){
		int ai[] = kc[i1];
		int j1 = lc[i1];
		int k1 = ai[j1 - 1];
		for(int l1 = j1 - 1; l1 > 0; l1--){
			ai[l1] = ai[l1 - 1];
		}
		
		ai[0] = k1;
		s = 1;
	}
	
	public void d(int i1){
		int ai[] = kc[i1];
		int j1 = lc[i1];
		int k1 = ai[0];
		for(int l1 = 0; l1 < j1 - 1; l1++){
			ai[l1] = ai[l1 + 1];
		}
		
		ai[j1 - 1] = k1;
		s = 1;
	}
	
	public void e(int i1){
		int ai[] = kc[i1];
		int j1 = lc[i1];
		int ai1[] = new int[j1];
		for(int k1 = 0; k1 < j1; k1++){
			ai1[k1] = ai[j1 - k1 - 1];
		}
		
		for(int l1 = 0; l1 < j1; l1++){
			ai[l1] = ai1[l1];
		}
		
		s = 1;
	}
	
	public void k(){
		for(int i1 = 0; i1 < ub; i1++){
			if(jc[i1] == vb){
				jc[i1] = ic[i1];
			}
			if(ic[i1] == vb){
				ic[i1] = jc[i1];
			}
		}
		
	}
	
	public int f(int i1){
		return ic[i1];
	}
	
	public int g(int i1){
		return jc[i1];
	}
	
	public void a(int i1, int j1){
		ic[i1] = j1;
	}
	
	public void b(int i1, int j1){
		jc[i1] = j1;
	}
	
	public int l(int i1, int j1, int k1){
		int l1 = 0x98967f;
		int j2 = 0;
		for(int k2 = 0; k2 < tb; k2++){
			int i2 = 0;
			if(i1 != vb){
				i2 += Math.abs(i1 - z[k2]);
			}
			if(j1 != vb){
				i2 += Math.abs(j1 - x[k2]);
			}
			if(k1 != vb){
				i2 += Math.abs(k1 - v[k2]);
			}
			if(i2 < l1){
				l1 = i2;
				j2 = k2;
			}
		}
		
		return j2;
	}
	
	public void b(int i1, int j1, int k1, int l1){
		if(j1 != vb){
			z[i1] = j1;
		}
		if(k1 != vb){
			x[i1] = k1;
		}
		if(l1 != vb){
			v[i1] = l1;
		}
		s = 1;
	}
	
	public void a(boolean flag, int i1, int j1){
		i1 = 256 - i1 * 4;
		j1 = (64 - j1) * 16 + 128;
		for(int k1 = 0; k1 < ub; k1++){
			rc[k1] = flag;
			zc[k1] = i1;
			vc[k1] = j1;
		}
		
		f();
	}
	
	public int a(int i1, int ai[], int j1, int k1){
		if(ub >= cc){
			return -1;
		} else {
			lc[ub] = i1;
			kc[ub] = ai;
			jc[ub] = j1;
			ic[ub] = k1;
			s = 1;
			return ub++;
		}
	}
	
	public int a(int i1, int j1, int k1){
		for(int l1 = 0; l1 < tb; l1++){
			if(z[l1] == i1 && x[l1] == j1 && v[l1] == k1){
				return l1;
			}
		}
		
		if(tb >= wb){
			return -1;
		} else {
			z[tb] = i1;
			x[tb] = j1;
			v[tb] = k1;
			return tb++;
		}
	}
	
	public F(int i1, int ai[], int ai1[], int ai2[], int j1, int k1){
		this(i1, 1);
		tb = i1;
		for(int l1 = 0; l1 < i1; l1++){
			z[l1] = ai[l1];
			x[l1] = ai1[l1];
			v[l1] = ai2[l1];
		}
		
		ub = 1;
		lc[0] = i1;
		int ai3[] = new int[i1];
		for(int i2 = 0; i2 < i1; i2++){
			ai3[i2] = i2;
		}
		
		kc[0] = ai3;
		jc[0] = j1;
		ic[0] = k1;
		s = 1;
	}
	
	public F(int i1, int ai[], int ai1[], int ai2[], int j1, int k1, int l1, boolean flag, int i2, int j2){
		this(i1 + 1, flag ? i1 + 1 : i1);
		for(int k2 = 0; k2 < i1; k2++){
			z[k2] = ai[k2];
			x[k2] = ai1[k2];
			v[k2] = ai2[k2];
		}
		
		z[i1] = j1;
		x[i1] = k1;
		v[i1] = l1;
		tb = i1 + 1;
		ub = flag ? i1 + 1 : i1;
		for(int l2 = 0; l2 < i1; l2++){
			int ai3[] = new int[3];
			ai3[0] = l2;
			ai3[1] = (l2 + 1) % i1;
			ai3[2] = i1;
			lc[l2] = 3;
			kc[l2] = ai3;
			jc[l2] = i2;
			ic[l2] = j2;
		}
		
		if(flag){
			int ai4[] = new int[i1];
			lc[i1] = i1;
			for(int i3 = 0; i3 < i1; i3++){
				ai4[i1 - i3 - 1] = i3;
			}
			
			kc[i1] = ai4;
			jc[i1] = i2;
			ic[i1] = j2;
		}
		s = 1;
	}
	
	public F(int i1, int ai[], int ai1[], int ai2[], int ai3[], int ai4[], int ai5[], boolean flag, int j1, int k1){
		this(i1 * 2, flag ? i1 + 2 : i1);
		tb = i1 * 2;
		for(int l1 = 0; l1 < i1; l1++){
			z[l1] = ai[l1];
			x[l1] = ai1[l1];
			v[l1] = ai2[l1];
			z[l1 + i1] = ai3[l1];
			x[l1 + i1] = ai4[l1];
			v[l1 + i1] = ai5[l1];
		}
		
		ub = flag ? i1 + 2 : i1;
		for(int i2 = 0; i2 < i1; i2++){
			int ai6[] = new int[4];
			lc[i2] = 4;
			ai6[0] = i2;
			ai6[1] = (i2 + 1) % i1;
			ai6[2] = (i2 + 1) % i1 + i1;
			ai6[3] = i2 + i1;
			kc[i2] = ai6;
			jc[i2] = j1;
			ic[i2] = k1;
			rc[i2] = true;
		}
		
		if(flag){
			int ai7[] = new int[i1];
			lc[i1] = i1;
			for(int j2 = 0; j2 < i1; j2++){
				ai7[i1 - j2 - 1] = j2;
			}
			
			kc[i1] = ai7;
			jc[i1] = j1;
			ic[i1] = k1;
			int ai8[] = new int[i1];
			lc[i1 + 1] = i1;
			for(int k2 = 0; k2 < i1; k2++){
				ai8[k2] = k2 + i1;
			}
			
			kc[i1 + 1] = ai8;
			jc[i1 + 1] = j1;
			ic[i1 + 1] = k1;
		}
		s = 1;
	}
	
	public F(F af[], int i1){
		vb = 0xbc614e;
		s = 1;
		int j1 = 0;
		int k1 = 0;
		for(int l1 = 0; l1 < i1; l1++){
			j1 += af[l1].ub;
			k1 += af[l1].tb;
		}
		
		c(k1, j1);
		pc = new int[j1][];
		for(int i2 = 0; i2 < i1; i2++){
			F f1 = af[i2];
			f1.b();
			for(int j2 = 0; j2 < f1.ub; j2++){
				int ai[] = new int[f1.lc[j2]];
				int ai1[] = f1.kc[j2];
				for(int k2 = 0; k2 < f1.lc[j2]; k2++){
					ai[k2] = a(f1.z[ai1[k2]], f1.x[ai1[k2]], f1.v[ai1[k2]]);
				}
				
				int l2 = a(f1.lc[j2], ai, f1.jc[j2], f1.ic[j2]);
				rc[l2] = f1.rc[j2];
				zc[l2] = f1.zc[j2];
				vc[l2] = f1.vc[j2];
				if(i1 > 1){
					pc[l2] = new int[f1.pc[j2].length + 1];
					pc[l2][0] = i2;
					for(int i3 = 0; i3 < f1.pc[j2].length; i3++){
						pc[l2][i3 + 1] = f1.pc[j2][i3];
					}
					
				} else {
					pc[l2] = new int[f1.pc[j2].length];
					for(int j3 = 0; j3 < f1.pc[j2].length; j3++){
						pc[l2][j3] = f1.pc[j2][j3];
					}
					
				}
			}
			
		}
		
		s = 1;
	}
	
	public F(String s1){
		vb = 0xbc614e;
		s = 1;
		byte abyte0[] = null;
		try{
			java.io.InputStream inputstream = opencgd.client.library.D.a(s1);
			DataInputStream datainputstream = new DataInputStream(inputstream);
			abyte0 = new byte[3];
			wc = 0;
			for(int i1 = 0; i1 < 3; i1 += datainputstream.read(abyte0, i1, 3 - i1)){
			}
			int k1 = a(abyte0);
			abyte0 = new byte[k1];
			wc = 0;
			for(int j1 = 0; j1 < k1; j1 += datainputstream.read(abyte0, j1, k1 - j1)){
			}
			datainputstream.close();
		} catch(IOException _ex){
			opencgd.client.library.D.b("Unable to load file!");
		}
		int l1 = a(abyte0);
		int i2 = a(abyte0);
		int i4 = 0;
		int j4 = 0;
		int k4 = 0;
		boolean flag2 = true;
		if(s1.toLowerCase().endsWith(".obj")){
			flag2 = false;
		}
		c(l1, i2);
		pc = new int[i2][];
		for(int l4 = 0; l4 < l1; l4++){
			int j2 = a(abyte0);
			int k2 = a(abyte0);
			int l2 = a(abyte0);
			a(j2, k2, l2);
		}
		
		for(int i5 = 0; i5 < i2; i5++){
			int i3 = a(abyte0);
			int j3 = a(abyte0);
			int k3 = a(abyte0);
			int l3 = a(abyte0);
			if(flag2){
				i4 = a(abyte0);
				j4 = a(abyte0);
				k4 = a(abyte0);
			}
			int ai[] = new int[i3];
			for(int j5 = 0; j5 < i3; j5++){
				ai[j5] = a(abyte0);
			}
			
			int ai1[] = new int[l3];
			for(int k5 = 0; k5 < l3; k5++){
				ai1[k5] = a(abyte0);
			}
			
			int l5 = a(i3, ai, j3, k3);
			pc[i5] = ai1;
			if(flag2){
				zc[l5] = j4;
				vc[l5] = i4;
				if(k4 == 0){
					rc[l5] = false;
				} else {
					rc[l5] = true;
				}
			}
		}
		
		s = 1;
	}
	
	public F(Buffer g1, String s1){
		vb = 0xbc614e;
		s = 1;
		byte abyte0[] = g1.i;
		wc = g1.b(s1);
		if(wc == 0){
			return;
		}
		a(abyte0);
		int i1 = a(abyte0);
		int j1 = a(abyte0);
		int j3 = 0;
		int k3 = 0;
		int l3 = 0;
		boolean flag = true;
		if(s1.toLowerCase().endsWith(".obj")){
			flag = false;
		}
		c(i1, j1);
		pc = new int[j1][];
		for(int i4 = 0; i4 < i1; i4++){
			int k1 = a(abyte0);
			int l1 = a(abyte0);
			int i2 = a(abyte0);
			a(k1, l1, i2);
		}
		
		for(int j4 = 0; j4 < j1; j4++){
			int j2 = a(abyte0);
			int k2 = a(abyte0);
			int l2 = a(abyte0);
			int i3 = a(abyte0);
			if(flag){
				j3 = a(abyte0);
				k3 = a(abyte0);
				l3 = a(abyte0);
			}
			int ai[] = new int[j2];
			for(int k4 = 0; k4 < j2; k4++){
				ai[k4] = a(abyte0);
			}
			
			int ai1[] = new int[i3];
			for(int l4 = 0; l4 < i3; l4++){
				ai1[l4] = a(abyte0);
			}
			
			int i5 = a(j2, ai, k2, l2);
			pc[j4] = ai1;
			if(flag){
				zc[i5] = k3;
				vc[i5] = j3;
				if(l3 == 0){
					rc[i5] = false;
				} else {
					rc[i5] = true;
				}
			}
		}
		
		s = 1;
	}
	
	private void c(int i1, int j1){
		z = new int[i1];
		x = new int[i1];
		v = new int[i1];
		pb = new int[i1];
		ob = new int[i1];
		nb = new int[i1];
		uc = new int[i1];
		tc = new int[i1];
		sc = new int[i1];
		y = new int[i1];
		w = new int[i1];
		db = new int[i1];
		cb = new int[i1];
		bb = new int[i1];
		eb = new int[i1];
		ab = new int[i1];
		fb = new int[i1];
		lc = new int[j1];
		kc = new int[j1][];
		jc = new int[j1];
		ic = new int[j1];
		sb = new int[j1];
		rb = new int[j1];
		qb = new int[j1];
		oc = new int[j1];
		mc = new int[j1];
		nc = new int[j1];
		bc = new int[j1];
		fc = new int[j1];
		ac = new int[j1];
		ec = new int[j1];
		zb = new int[j1];
		dc = new int[j1];
		rc = new boolean[j1];
		zc = new int[j1];
		vc = new int[j1];
		for(int k1 = 0; k1 < j1; k1++){
			rc[k1] = false;
			zc[k1] = 32;
			vc[k1] = 512;
		}
		
		ub = 0;
		tb = 0;
		wb = i1;
		cc = j1;
		j = i = h = 0;
		r = q = p = 0;
		n = m = l = 256;
		d = c = b = a = e = f = 256;
		xb = 0;
	}
	
	private F(int i1, int j1, boolean flag){
		vb = 0xbc614e;
		s = 1;
		c(i1, j1);
		pc = new int[j1][];
	}
	
	public F(int i1, int j1){
		vb = 0xbc614e;
		s = 1;
		c(i1, j1);
		pc = new int[j1][1];
		for(int k1 = 0; k1 < j1; k1++){
			pc[k1][0] = k1;
		}
		
	}
	
	static{
		k = new int[512];
		yc = new byte[64];
		g = new int[256];
		for(int i1 = 0; i1 < 256; i1++){
			k[i1] = (int) (Math.sin(i1 * 0.02454369D) * 32768D);
			k[i1 + 256] = (int) (Math.cos(i1 * 0.02454369D) * 32768D);
		}
		
		for(int j1 = 0; j1 < 10; j1++){
			yc[j1] = (byte) (48 + j1);
		}
		
		for(int k1 = 0; k1 < 26; k1++){
			yc[k1 + 10] = (byte) (65 + k1);
		}
		
		for(int l1 = 0; l1 < 26; l1++){
			yc[l1 + 36] = (byte) (97 + l1);
		}
		
		yc[62] = -93;
		yc[63] = 36;
		for(int i2 = 0; i2 < 10; i2++){
			g[48 + i2] = i2;
		}
		
		for(int j2 = 0; j2 < 26; j2++){
			g[65 + j2] = j2 + 10;
		}
		
		for(int k2 = 0; k2 < 26; k2++){
			g[97 + k2] = k2 + 36;
		}
		
		g[163] = 62;
		g[36] = 63;
	}
}