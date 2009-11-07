package opencgd.library;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class B {
	
	private boolean h;
	private int gb[];
	private int hb[];
	private int y[];
	private int u[];
	private int cc[];
	private int e[];
	private boolean g[];
	private int i[][];
	private int o;
	private int xb;
	private int r;
	private int x[];
	private int t[];
	private int z[];
	private int ab[];
	private int v[];
	private int w[];
	private int jb[];
	private int qb[];
	private int mb[];
	private int nb[];
	private int ob[];
	private int ib[];
	private int pb[];
	private int q;
	private F lb[];
	private int tb[];
	private F m[];
	private int bb;
	private int p;
	private int vb;
	private int yb;
	private int ac;
	private int wb;
	private int zb;
	private int bc;
	private int s;
	private int k;
	private int l;
	private int c;
	private int d;
	private int fb;
	private int cb;
	private int db;
	private int eb;
	private int rb;
	private double sb;
	private int f[];
	private int j;
	private int ub;
	public int kb;
	public int a;
	private int n;
	public int b;
	
	public void a(int i1, int j1, int k1){
		if(i1 == 0 && j1 == 0 && k1 == 0){
			i1 = 32;
		}
		eb = i1;
		db = j1;
		cb = k1;
		fb = (int) Math.sqrt(i1 * i1 + j1 * j1 + k1 * k1);
		for(int l1 = 0; l1 < p; l1++){
			m[l1].f();
		}
		
	}
	
	public void a(String s1){
		F f1 = new F(m, p);
		f1.a(s1);
	}
	
	public F a(int i1, int j1, int k1, int l1){
		xb = (xb + 1) % p;
		for(int i2 = 0; i2 < p; i2++){
			int j2 = (i2 + xb) % p;
			if(m[j2].a(i1, j1, k1, l1) && m[j2].o == 0){
				return m[j2];
			}
		}
		
		return null;
	}
	
	public F[] b(int i1, int j1, int k1, int l1){
		int ai[] = new int[p];
		int i2 = 0;
		for(int j2 = 0; j2 < p; j2++){
			if(m[j2].a(i1, j1, k1, l1)){
				ai[i2++] = j2;
			}
		}
		
		if(i2 == 0){
			return null;
		}
		F af[] = new F[i2];
		for(int k2 = 0; k2 < i2; k2++){
			af[k2] = m[ai[k2]];
		}
		
		return af;
	}
	
	public F a(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		xb = (xb + 1) % p;
		for(int l2 = 0; l2 < p; l2++){
			int i3 = (l2 + xb) % p;
			if(m[i3].a(i1, j1, k1, l1, i2, j2, k2) && m[i3].o == 0){
				return m[i3];
			}
		}
		
		return null;
	}
	
	public F b(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		xb = (xb + 1) % p;
		for(int l2 = 0; l2 < p; l2++){
			int i3 = (l2 + xb) % p;
			if(m[i3].a(i1, j1, k1, l1, i2, j2, k2) && m[i3].o == 1){
				return m[i3];
			}
		}
		
		return null;
	}
	
	public F a(F f1, int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2){
		for(int i3 = i1; i3 < p; i3++){
			if(m[i3] != f1 && m[i3].a(j1, k1, l1, i2, j2, k2, l2)){
				return m[i3];
			}
		}
		
		return null;
	}
	
	public F[] a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2){
		int ai[] = new int[p];
		int i3 = 0;
		for(int j3 = i1; j3 < p; j3++){
			if(m[j3].a(j1, k1, l1, i2, j2, k2, l2)){
				ai[i3++] = j3;
			}
		}
		
		if(i3 == 0){
			return null;
		}
		F af[] = new F[i3];
		for(int k3 = 0; k3 < i3; k3++){
			af[k3] = m[ai[k3]];
		}
		
		return af;
	}
	
	public F[] c(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		int ai[] = new int[p];
		int l2 = 0;
		for(int i3 = 0; i3 < p; i3++){
			if(m[i3].a(i1, j1, k1, l1, i2, j2, k2)){
				ai[l2++] = i3;
			}
		}
		
		if(l2 == 0){
			return null;
		}
		F af[] = new F[l2];
		for(int j3 = 0; j3 < l2; j3++){
			af[j3] = m[ai[j3]];
		}
		
		return af;
	}
	
	private void a(int i1){
		char c1;
		if(e[i1] == 0){
			c1 = '\u1000';
		} else {
			c1 = '\u4000';
		}
		for(int j1 = 0; j1 < c1; j1++){
			int k1 = i[i1][j1];
			k1 = ((k1 & 0xff0000) << 8) + ((k1 & 0xff00) << 4) + (k1 & 0xff);
			i[i1][j1] = k1;
		}
		
		if(i[i1][0] == 0){
			g[i1] = true;
		} else {
			g[i1] = false;
		}
		for(int l1 = 1; l1 < 4; l1++){
			for(int i2 = 0; i2 < c1; i2++){
				int j2 = i[i1][i2];
				if(l1 == 1){
					i[i1][l1 * c1 + i2] = j2 - (j2 >>> 3) & 0xff0ff0ff;
				}
				if(l1 == 2){
					i[i1][l1 * c1 + i2] = j2 - (j2 >>> 2) & 0xff0ff0ff;
				}
				if(l1 == 3){
					i[i1][l1 * c1 + i2] = j2 - (j2 >>> 2) - (j2 >>> 3) & 0xff0ff0ff;
				}
			}
			
		}
		
	}
	
	private int a(Image image, int ai[], int i1, int j1){
		if(j1 > 0){
			i1 = (i1 + j1) / 2;
			opencgd.library.D.a(i1);
		}
		image.getWidth(opencgd.library.D.c_java_awt_Component_static_fld);
		int k1 = image.getHeight(opencgd.library.D.c_java_awt_Component_static_fld);
		int l1 = k1 / 128;
		o = l1;
		i = new int[l1][];
		g = new boolean[l1];
		if(ai == null){
			e = new int[l1];
			int ai1[] = new int[4096];
			for(int j2 = 0; j2 < l1; j2++){
				PixelGrabber pixelgrabber = new PixelGrabber(image, 64, j2 * 128, 64, 64, ai1, 0, 64);
				try{
					pixelgrabber.grabPixels();
				} catch(InterruptedException _ex){
					System.out.println("Error!");
				}
				e[j2] = 0;
				int l2 = ai1[0];
				for(int i3 = 0; i3 < 4096; i3++){
					if(ai1[i3] == l2){
						continue;
					}
					e[j2] = 1;
					break;
				}
				
			}
			
		} else {
			e = ai;
		}
		for(int i2 = 0; i2 < l1; i2++){
			char c1 = '@';
			if(e[i2] == 1){
				c1 = '\200';
			}
			int k2 = c1 * c1;
			i[i2] = new int[k2 * 4];
			PixelGrabber pixelgrabber1 = new PixelGrabber(image, 0, i2 * 128, c1, c1, i[i2], 0, c1);
			try{
				pixelgrabber1.grabPixels();
			} catch(InterruptedException _ex){
				System.out.println("Error!");
			}
			a(i2);
			if(j1 > 0){
				opencgd.library.D.a(i1 + ((j1 - i1) * (i2 + 1)) / l1);
			}
		}
		
		image.flush();
		image = null;
		return l1;
	}
	
	public int a(String s1, int ai[], int i1, int j1){
		Image image = opencgd.library.D.c(s1);
		return a(image, ai, i1, j1);
	}
	
	private boolean a(int i1, int j1){
		if(t[i1] > x[j1]){
			return true;
		}
		if(t[j1] > x[i1]){
			return false;
		}
		if(w[i1] > ab[j1]){
			return true;
		}
		if(w[j1] > ab[i1]){
			return true;
		}
		if(v[i1] > z[j1]){
			return true;
		}
		if(v[j1] > z[i1]){
			return true;
		}
		F f1 = lb[i1];
		F f2 = lb[j1];
		int k1 = pb[i1];
		int l1 = pb[j1];
		int ai[] = f1.kc[k1];
		int ai1[] = f2.kc[l1];
		int i2 = f1.lc[k1];
		int j2 = f2.lc[l1];
		int k3 = f2.uc[ai1[0]];
		int l3 = f2.tc[ai1[0]];
		int i4 = f2.sc[ai1[0]];
		int j4 = ob[j1];
		int k4 = nb[j1];
		int l4 = mb[j1];
		int i5 = f2.nc[l1];
		int j5 = qb[j1];
		boolean flag = false;
		for(int k5 = 0; k5 < i2; k5++){
			int k2 = ai[k5];
			int i3 = (k3 - f1.uc[k2]) * j4 + (l3 - f1.tc[k2]) * k4 + (i4 - f1.sc[k2]) * l4;
			if((i3 >= -i5 || j5 >= 0) && (i3 <= i5 || j5 <= 0)){
				continue;
			}
			flag = true;
			break;
		}
		
		if(!flag){
			return true;
		}
		k3 = f1.uc[ai[0]];
		l3 = f1.tc[ai[0]];
		i4 = f1.sc[ai[0]];
		j4 = ob[i1];
		k4 = nb[i1];
		l4 = mb[i1];
		i5 = f1.nc[k1];
		j5 = qb[i1];
		flag = false;
		for(int l5 = 0; l5 < j2; l5++){
			int l2 = ai1[l5];
			int j3 = (k3 - f2.uc[l2]) * j4 + (l3 - f2.tc[l2]) * k4 + (i4 - f2.sc[l2]) * l4;
			if((j3 >= -i5 || j5 <= 0) && (j3 <= i5 || j5 >= 0)){
				continue;
			}
			flag = true;
			break;
		}
		
		return !flag;
	}
	
	private void b(int i1){
		F f1 = lb[i1];
		int j1 = pb[i1];
		int ai[] = f1.kc[j1];
		int k1 = f1.lc[j1];
		int l1 = f1.mc[j1];
		int j2 = f1.uc[ai[0]];
		int k2 = f1.tc[ai[0]];
		int l2 = f1.sc[ai[0]];
		int i3 = f1.uc[ai[1]] - j2;
		int j3 = f1.tc[ai[1]] - k2;
		int k3 = f1.sc[ai[1]] - l2;
		int l3 = f1.uc[ai[2]] - j2;
		int i4 = f1.tc[ai[2]] - k2;
		int j4 = f1.sc[ai[2]] - l2;
		int k4 = j3 * j4 - i4 * k3;
		int l4 = k3 * l3 - j4 * i3;
		int i5 = i3 * i4 - l3 * j3;
		if(l1 == -1){
			l1 = 0;
			for(; k4 > 25000 || l4 > 25000 || i5 > 25000 || k4 < -25000 || l4 < -25000 || i5 < -25000; i5 >>= 1){
				l1++;
				k4 >>= 1;
				l4 >>= 1;
			}
			
			f1.mc[j1] = l1;
			f1.nc[j1] = (int) (s * Math.sqrt(k4 * k4 + l4 * l4 + i5 * i5));
		} else {
			k4 >>= l1;
			l4 >>= l1;
			i5 >>= l1;
		}
		qb[i1] = j2 * k4 + k2 * l4 + l2 * i5;
		ob[i1] = k4;
		nb[i1] = l4;
		mb[i1] = i5;
		int j5 = f1.sc[ai[0]];
		int k5 = j5;
		int l5 = f1.y[ai[0]];
		int i6 = l5;
		int j6 = f1.w[ai[0]];
		int k6 = j6;
		for(int l6 = 1; l6 < k1; l6++){
			int i2 = f1.sc[ai[l6]];
			if(i2 > k5){
				k5 = i2;
			} else if(i2 < j5){
				j5 = i2;
			}
			i2 = f1.y[ai[l6]];
			if(i2 > i6){
				i6 = i2;
			} else if(i2 < l5){
				l5 = i2;
			}
			i2 = f1.w[ai[l6]];
			if(i2 > k6){
				k6 = i2;
			} else if(i2 < j6){
				j6 = i2;
			}
		}
		
		t[i1] = j5;
		x[i1] = k5;
		w[i1] = l5;
		ab[i1] = i6;
		v[i1] = j6;
		z[i1] = k6;
	}
	
	public void a(int ai[], int i1, int j1, int k1){
		int j3 = ai[0];
		int k3 = ai[1];
		int l3 = ai[2];
		if(k1 != 0){
			int l1 = f[k1];
			int k2 = f[k1 + 256];
			ai[0] = k3 * l1 + j3 * k2 >> 15;
			ai[1] = k3 * k2 - j3 * l1 >> 15;
		}
		if(i1 != 0){
			int i2 = f[i1];
			int l2 = f[i1 + 256];
			ai[1] = k3 * l2 - l3 * i2 >> 15;
			ai[2] = k3 * i2 + l3 * l2 >> 15;
		}
		if(j1 != 0){
			int j2 = f[j1];
			int i3 = f[j1 + 256];
			ai[0] = l3 * j2 + j3 * i3 >> 15;
			ai[2] = l3 * i3 - j3 * j2 >> 15;
		}
	}
	
	public void d(int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		ac = (256 - l1) % 256;
		yb = (256 - i2) % 256;
		vb = (256 - j2) % 256;
		int l2 = 0;
		int i3 = 0;
		int j3 = k2;
		if(l1 != 0){
			int k3 = f[l1];
			int j4 = f[l1 + 256];
			int i5 = i3 * j4 - j3 * k3 >> 15;
			j3 = i3 * k3 + j3 * j4 >> 15;
			i3 = i5;
		}
		if(i2 != 0){
			int l3 = f[i2];
			int k4 = f[i2 + 256];
			int j5 = j3 * l3 + l2 * k4 >> 15;
			j3 = j3 * k4 - l2 * l3 >> 15;
			l2 = j5;
		}
		if(j2 != 0){
			int i4 = f[j2];
			int l4 = f[j2 + 256];
			int k5 = i3 * i4 + l2 * l4 >> 15;
			i3 = i3 * l4 - l2 * i4 >> 15;
			l2 = k5;
		}
		bc = i1 - l2;
		zb = j1 - i3;
		wb = k1 - j3;
	}
	
	public int c(int i1, int j1, int k1, int l1){
		return (int) (Math.atan2(k1 - i1, l1 - j1) * 40.740000000000002D);
	}
	
	public void b(int i1, int j1, int k1){
		yb = (int) (Math.atan2(i1 - bc, k1 - wb) * 40.740000000000002D) & 0xff;
		ac = (int) (Math.atan2(j1 - zb, k1 - wb) * 40.740000000000002D) & 0xff;
		yb = 256 - yb & 0xff;
		vb = 0;
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2, int j2){
		bc = i1;
		zb = j1;
		wb = k1;
		ac = l1;
		yb = i2;
		vb = j2;
	}
	
	private static void a(int ai[], int i1, int j1, int k1, int l1, int i2){
		if(i1 >= 0){
			return;
		}
		int ai1[] = {
				k1, k1 - (k1 >>> 3) & 0xff0ff0ff, k1 - (k1 >>> 2) & 0xff0ff0ff, k1 - (k1 >>> 2) - (k1 >>> 3) & 0xff0ff0ff
		};
		i2 <<= 2;
		k1 = ai1[l1 >> 12 & 3] >>> (l1 >> 14);
		l1 += i2;
		int j2 = i1 / 16;
		for(int k2 = j2; k2 < 0; k2++){
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 12 & 3] >>> (l1 >> 14);
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 12 & 3] >>> (l1 >> 14);
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 12 & 3] >>> (l1 >> 14);
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 12 & 3] >>> (l1 >> 14);
			l1 += i2;
		}
		
		j2 = -(i1 % 16);
		for(int l2 = 0; l2 < j2; l2++){
			ai[j1++] = k1;
			if((l2 & 3) == 3){
				k1 = ai1[l1 >> 12 & 3] >>> (l1 >> 14);
				l1 += i2;
			}
		}
		
	}
	
	private static void a(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2, int j2, int k2, int l2, int i3, int j3, int k3, int l3, int i4){
		if(j3 <= 0){
			return;
		}
		int j4 = 0;
		int k4 = 0;
		i4 <<= 2;
		if(j2 != 0){
			j4 = l1 / j2 << 7;
			k4 = i2 / j2 << 7;
		}
		if(j4 < 0){
			j4 = 0;
		} else if(j4 > 16256){
			j4 = 16256;
		}
		for(int j5 = j3; j5 > 0; j5 -= 16){
			l1 += k2;
			i2 += l2;
			j2 += i3;
			j1 = j4;
			k1 = k4;
			if(j2 != 0){
				j4 = l1 / j2 << 7;
				k4 = i2 / j2 << 7;
			}
			if(j4 < 0){
				j4 = 0;
			} else if(j4 > 16256){
				j4 = 16256;
			}
			int l4 = j4 - j1 >> 4;
			int i5 = k4 - k1 >> 4;
			int k5 = l3 >> 23;
			j1 += l3 & 0x600000;
			l3 += i4;
			if(j5 < 16){
				for(int l5 = 0; l5 < j5; l5++){
					if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
						ai[k3] = i1;
					}
					k3++;
					j1 += l4;
					k1 += i5;
					if((l5 & 3) == 3){
						j1 = (j1 & 0x3fff) + (l3 & 0x600000);
						k5 = l3 >> 23;
						l3 += i4;
					}
				}
				
			} else {
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0x3fff) + (l3 & 0x600000);
				k5 = l3 >> 23;
				l3 += i4;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0x3fff) + (l3 & 0x600000);
				k5 = l3 >> 23;
				l3 += i4;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0x3fff) + (l3 & 0x600000);
				k5 = l3 >> 23;
				l3 += i4;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
			}
		}
		
	}
	
	private static void b(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2, int j2, int k2, int l2, int i3, int j3, int k3, int l3, int i4){
		if(j3 <= 0){
			return;
		}
		int j4 = 0;
		int k4 = 0;
		i4 <<= 2;
		if(j2 != 0){
			j4 = l1 / j2 << 6;
			k4 = i2 / j2 << 6;
		}
		if(j4 < 0){
			j4 = 0;
		} else if(j4 > 4032){
			j4 = 4032;
		}
		for(int j5 = j3; j5 > 0; j5 -= 16){
			l1 += k2;
			i2 += l2;
			j2 += i3;
			j1 = j4;
			k1 = k4;
			if(j2 != 0){
				j4 = l1 / j2 << 6;
				k4 = i2 / j2 << 6;
			}
			if(j4 < 0){
				j4 = 0;
			} else if(j4 > 4032){
				j4 = 4032;
			}
			int l4 = j4 - j1 >> 4;
			int i5 = k4 - k1 >> 4;
			int k5 = l3 >> 20;
			j1 += l3 & 0xc0000;
			l3 += i4;
			if(j5 < 16){
				for(int l5 = 0; l5 < j5; l5++){
					if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
						ai[k3] = i1;
					}
					k3++;
					j1 += l4;
					k1 += i5;
					if((l5 & 3) == 3){
						j1 = (j1 & 0xfff) + (l3 & 0xc0000);
						k5 = l3 >> 20;
						l3 += i4;
					}
				}
				
			} else {
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0xfff) + (l3 & 0xc0000);
				k5 = l3 >> 20;
				l3 += i4;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0xfff) + (l3 & 0xc0000);
				k5 = l3 >> 20;
				l3 += i4;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0xfff) + (l3 & 0xc0000);
				k5 = l3 >> 20;
				l3 += i4;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
				j1 += l4;
				k1 += i5;
				if((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0){
					ai[k3] = i1;
				}
				k3++;
			}
		}
		
	}
	
	private static void a(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3, int k3, int l3){
		if(i3 <= 0){
			return;
		}
		int i4 = 0;
		int j4 = 0;
		l3 <<= 2;
		if(i2 != 0){
			i4 = k1 / i2 << 6;
			j4 = l1 / i2 << 6;
		}
		if(i4 < 0){
			i4 = 0;
		} else if(i4 > 4032){
			i4 = 4032;
		}
		for(int i5 = i3; i5 > 0; i5 -= 16){
			k1 += j2;
			l1 += k2;
			i2 += l2;
			i1 = i4;
			j1 = j4;
			if(i2 != 0){
				i4 = k1 / i2 << 6;
				j4 = l1 / i2 << 6;
			}
			if(i4 < 0){
				i4 = 0;
			} else if(i4 > 4032){
				i4 = 4032;
			}
			int k4 = i4 - i1 >> 4;
			int l4 = j4 - j1 >> 4;
			int j5 = k3 >> 20;
			i1 += k3 & 0xc0000;
			k3 += l3;
			if(i5 < 16){
				for(int k5 = 0; k5 < i5; k5++){
					ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
					i1 += k4;
					j1 += l4;
					if((k5 & 3) == 3){
						i1 = (i1 & 0xfff) + (k3 & 0xc0000);
						j5 = k3 >> 20;
						k3 += l3;
					}
				}
				
			} else {
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
			}
		}
		
	}
	
	private static void b(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3, int k3, int l3){
		if(i3 <= 0){
			return;
		}
		int i4 = 0;
		int j4 = 0;
		l3 <<= 2;
		if(i2 != 0){
			i4 = k1 / i2 << 7;
			j4 = l1 / i2 << 7;
		}
		if(i4 < 0){
			i4 = 0;
		} else if(i4 > 16256){
			i4 = 16256;
		}
		for(int i5 = i3; i5 > 0; i5 -= 16){
			k1 += j2;
			l1 += k2;
			i2 += l2;
			i1 = i4;
			j1 = j4;
			if(i2 != 0){
				i4 = k1 / i2 << 7;
				j4 = l1 / i2 << 7;
			}
			if(i4 < 0){
				i4 = 0;
			} else if(i4 > 16256){
				i4 = 16256;
			}
			int k4 = i4 - i1 >> 4;
			int l4 = j4 - j1 >> 4;
			int j5 = k3 >> 23;
			i1 += k3 & 0x600000;
			k3 += l3;
			if(i5 < 16){
				for(int k5 = 0; k5 < i5; k5++){
					ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
					i1 += k4;
					j1 += l4;
					if((k5 & 3) == 3){
						i1 = (i1 & 0x3fff) + (k3 & 0x600000);
						j5 = k3 >> 23;
						k3 += l3;
					}
				}
				
			} else {
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0x3fff) + (k3 & 0x600000);
				j5 = k3 >> 23;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0x3fff) + (k3 & 0x600000);
				j5 = k3 >> 23;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0x3fff) + (k3 & 0x600000);
				j5 = k3 >> 23;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> j5;
			}
		}
		
	}
	
	private void a(int i1, int j1, int ai[], int ai1[], int ai2[], int ai3[], int ai4[], int ai5[], int k1){
		for(int l1 = 0; l1 < i1; l1++){
			if(ai5[l1] < 0){
				ai5[l1] = 0;
			} else if(ai5[l1] > 319){
				ai5[l1] = 319;
			}
		}
		
		if(k1 >= o){
			k1 = 0;
		}
		int i2;
		int j2 = i2 = ai4[0] += k;
		for(int k2 = 1; k2 < i1; k2++){
			int l2;
			if((l2 = ai4[k2] += k) < i2){
				i2 = l2;
			} else if(l2 > j2){
				j2 = l2;
			}
		}
		
		if(i2 < k - c){
			i2 = k - c;
		}
		if(j2 >= k + c){
			j2 = (k + c) - 1;
		}
		if(i2 >= j2){
			return;
		}
		for(int i3 = i2; i3 < j2; i3++){
			u[i3] = 0x10000;
			y[i3] = 0xffff0000;
		}
		
		int j3 = i1 - 1;
		int k3 = ai4[0];
		int i4 = ai4[j3];
		if(k3 < i4){
			int k4 = ai3[0] << 8;
			int j5 = (ai3[j3] - ai3[0] << 8) / (i4 - k3);
			int l6 = ai5[0] << 8;
			int k8 = (ai5[j3] - ai5[0] << 8) / (i4 - k3);
			if(k3 < 0){
				k4 -= j5 * k3;
				l6 -= k8 * k3;
				k3 = 0;
			}
			if(i4 > 383){
				i4 = 383;
			}
			for(int j10 = k3; j10 <= i4; j10++){
				u[j10] = y[j10] = k4;
				hb[j10] = gb[j10] = l6;
				k4 += j5;
				l6 += k8;
			}
			
		} else if(k3 > i4){
			int l4 = ai3[j3] << 8;
			int k5 = (ai3[0] - ai3[j3] << 8) / (k3 - i4);
			int i7 = ai5[j3] << 8;
			int l8 = (ai5[0] - ai5[j3] << 8) / (k3 - i4);
			if(i4 < 0){
				l4 -= k5 * i4;
				i7 -= l8 * i4;
				i4 = 0;
			}
			if(k3 > 383){
				k3 = 383;
			}
			for(int k10 = i4; k10 <= k3; k10++){
				u[k10] = y[k10] = l4;
				hb[k10] = gb[k10] = i7;
				l4 += k5;
				i7 += l8;
			}
			
		}
		for(int i5 = 0; i5 < j3; i5++){
			int l5 = i5 + 1;
			int l3 = ai4[i5];
			int j4 = ai4[l5];
			if(l3 < j4){
				int j7 = ai3[i5] << 8;
				int i9 = (ai3[l5] - ai3[i5] << 8) / (j4 - l3);
				int l10 = ai5[i5] << 8;
				int i12 = (ai5[l5] - ai5[i5] << 8) / (j4 - l3);
				if(l3 < 0){
					j7 -= i9 * l3;
					l10 -= i12 * l3;
					l3 = 0;
				}
				if(j4 > 383){
					j4 = 383;
				}
				for(int j13 = l3; j13 <= j4; j13++){
					if(j7 < u[j13]){
						u[j13] = j7;
						hb[j13] = l10;
					}
					if(j7 > y[j13]){
						y[j13] = j7;
						gb[j13] = l10;
					}
					j7 += i9;
					l10 += i12;
				}
				
			} else if(l3 > j4){
				int k7 = ai3[l5] << 8;
				int j9 = (ai3[i5] - ai3[l5] << 8) / (l3 - j4);
				int i11 = ai5[l5] << 8;
				int j12 = (ai5[i5] - ai5[l5] << 8) / (l3 - j4);
				if(j4 < 0){
					k7 -= j9 * j4;
					i11 -= j12 * j4;
					j4 = 0;
				}
				if(l3 > 383){
					l3 = 383;
				}
				for(int k13 = j4; k13 <= l3; k13++){
					if(k7 < u[k13]){
						u[k13] = k7;
						hb[k13] = i11;
					}
					if(k7 > y[k13]){
						y[k13] = k7;
						gb[k13] = i11;
					}
					k7 += j9;
					i11 += j12;
				}
				
			}
		}
		
		if(k1 >= 0 && e[k1] == 1){
			int i6 = ai[0];
			int l7 = ai1[0];
			int k9 = ai2[0];
			int j11 = i6 - ai[1];
			int k12 = l7 - ai1[1];
			int l13 = k9 - ai2[1];
			j1--;
			int k14 = ai[j1] - i6;
			int j15 = ai1[j1] - l7;
			int l15 = ai2[j1] - k9;
			int j16 = k14 * l7 - j15 * i6 << 12;
			int l16 = j15 * k9 - l15 * l7 << 8;
			int j17 = l15 * i6 - k14 * k9 << 4;
			int l17 = j11 * l7 - k12 * i6 << 12;
			int j18 = k12 * k9 - l13 * l7 << 8;
			int l18 = l13 * i6 - j11 * k9 << 4;
			int j19 = k12 * k14 - j11 * j15 << 5;
			int l19 = l13 * j15 - k12 * l15 << 1;
			int j20 = j11 * l15 - l13 * k14 >> 3;
			int l20 = l16 >> 4;
			int j21 = j18 >> 4;
			int l21 = l19 >> 4;
			int j22 = i2 - k;
			int l22 = l + i2 * j;
			j16 += j17 * j22;
			l17 += l18 * j22;
			j19 += j20 * j22;
			if(!g[k1]){
				for(int j23 = i2; j23 < j2; j23++){
					int j24 = u[j23] >> 8;
					int j25 = y[j23] >> 8;
					if(j25 - j24 <= 0){
						j16 += j17;
						l17 += l18;
						j19 += j20;
						l22 += j;
					} else {
						int j26 = hb[j23] << 9;
						int j27 = ((gb[j23] << 9) - j26) / (j25 - j24);
						if(j24 < -d){
							j26 += (-d - j24) * j27;
							j24 = -d;
						}
						if(j25 > d){
							j25 = d;
						}
						if(!h || (j23 & 1) == 0){
							b(cc, i[k1], 0, 0, j16 + l20 * j24, l17 + j21 * j24, j19 + l21 * j24, l16, j18, l19, j25 - j24, l22 + j24, j26, j27);
						}
						j16 += j17;
						l17 += l18;
						j19 += j20;
						l22 += j;
					}
				}
				
				return;
			}
			for(int k23 = i2; k23 < j2; k23++){
				int k24 = u[k23] >> 8;
				int k25 = y[k23] >> 8;
				if(k25 - k24 <= 0){
					j16 += j17;
					l17 += l18;
					j19 += j20;
					l22 += j;
				} else {
					int k26 = hb[k23] << 9;
					int k27 = ((gb[k23] << 9) - k26) / (k25 - k24);
					if(k24 < -d){
						k26 += (-d - k24) * k27;
						k24 = -d;
					}
					if(k25 > d){
						k25 = d;
					}
					if(!h || (k23 & 1) == 0){
						a(cc, 0, 0, 0, i[k1], j16 + l20 * k24, l17 + j21 * k24, j19 + l21 * k24, l16, j18, l19, k25 - k24, l22 + k24, k26, k27);
					}
					j16 += j17;
					l17 += l18;
					j19 += j20;
					l22 += j;
				}
			}
			
			return;
		}
		if(k1 >= 0 && e[k1] == 0){
			int j6 = ai[0];
			int i8 = ai1[0];
			int l9 = ai2[0];
			int k11 = j6 - ai[1];
			int l12 = i8 - ai1[1];
			int i14 = l9 - ai2[1];
			j1--;
			int l14 = ai[j1] - j6;
			int k15 = ai1[j1] - i8;
			int i16 = ai2[j1] - l9;
			int k16 = l14 * i8 - k15 * j6 << 11;
			int i17 = k15 * l9 - i16 * i8 << 7;
			int k17 = i16 * j6 - l14 * l9 << 3;
			int i18 = k11 * i8 - l12 * j6 << 11;
			int k18 = l12 * l9 - i14 * i8 << 7;
			int i19 = i14 * j6 - k11 * l9 << 3;
			int k19 = l12 * l14 - k11 * k15 << 5;
			int i20 = i14 * k15 - l12 * i16 << 1;
			int k20 = k11 * i16 - i14 * l14 >> 3;
			int i21 = i17 >> 4;
			int k21 = k18 >> 4;
			int i22 = i20 >> 4;
			int k22 = i2 - k;
			int i23 = l + i2 * j;
			k16 += k17 * k22;
			i18 += i19 * k22;
			k19 += k20 * k22;
			if(!g[k1]){
				for(int l23 = i2; l23 < j2; l23++){
					int l24 = u[l23] >> 8;
					int l25 = y[l23] >> 8;
					if(l25 - l24 <= 0){
						k16 += k17;
						i18 += i19;
						k19 += k20;
						i23 += j;
					} else {
						int l26 = hb[l23] << 6;
						int l27 = ((gb[l23] << 6) - l26) / (l25 - l24);
						if(l24 < -d){
							l26 += (-d - l24) * l27;
							l24 = -d;
						}
						if(l25 > d){
							l25 = d;
						}
						if(!h || (l23 & 1) == 0){
							a(cc, i[k1], 0, 0, k16 + i21 * l24, i18 + k21 * l24, k19 + i22 * l24, i17, k18, i20, l25 - l24, i23 + l24, l26, l27);
						}
						k16 += k17;
						i18 += i19;
						k19 += k20;
						i23 += j;
					}
				}
				
				return;
			}
			for(int i24 = i2; i24 < j2; i24++){
				int i25 = u[i24] >> 8;
				int i26 = y[i24] >> 8;
				if(i26 - i25 <= 0){
					k16 += k17;
					i18 += i19;
					k19 += k20;
					i23 += j;
				} else {
					int i27 = hb[i24] << 6;
					int i28 = ((gb[i24] << 6) - i27) / (i26 - i25);
					if(i25 < -d){
						i27 += (-d - i25) * i28;
						i25 = -d;
					}
					if(i26 > d){
						i26 = d;
					}
					if(!h || (i24 & 1) == 0){
						b(cc, 0, 0, 0, i[k1], k16 + i21 * i25, i18 + k21 * i25, k19 + i22 * i25, i17, k18, i20, i26 - i25, i23 + i25, i27, i28);
					}
					k16 += k17;
					i18 += i19;
					k19 += k20;
					i23 += j;
				}
			}
			
			return;
		}
		k1 = -1 - k1;
		int k6 = ((k1 & 0x7c00) << 17) + ((k1 & 0x3e0) << 10) + ((k1 & 0x1f) << 3);
		int j8 = l + i2 * j;
		for(int i10 = i2; i10 < j2; i10++){
			int l11 = u[i10] >> 8;
			int i13 = y[i10] >> 8;
			if(i13 - l11 <= 0){
				j8 += j;
			} else {
				int j14 = hb[i10];
				int i15 = (gb[i10] - j14) / (i13 - l11);
				if(l11 < -d){
					j14 += (-d - l11) * i15;
					l11 = -d;
				}
				if(i13 > d){
					i13 = d;
				}
				if(!h || (i10 & 1) == 0){
					a(cc, l11 - i13, j8 + l11, k6, j14, i15);
				}
				j8 += j;
			}
		}
		
	}
	
	public void a(boolean flag){
		h = flag;
		if(p == 0){
			return;
		}
		for(int i4 = 0; i4 < p; i4++){
			m[i4].a(bc, zb, wb, ac, yb, vb, 8, b);
		}
		
		q = 0;
		for(int j4 = 0; j4 < p; j4++){
			F f1 = m[j4];
			int k4 = 0;
			for(int l4 = 0; l4 < f1.tb; l4++){
				k4 += f1.sc[l4];
			}
			
			if(f1.tb <= 0 || k4 / f1.tb >= n){
				for(int i1 = 0; i1 < f1.ub; i1++){
					int k5 = f1.lc[i1];
					int ai1[] = f1.kc[i1];
					if(k5 != 0){
						boolean flag2 = false;
						boolean flag5 = false;
						for(int j8 = 0; j8 < k5; j8++){
							int i2 = f1.sc[ai1[j8]];
							if(i2 > b){
								flag2 = true;
							}
							if(i2 < a){
								flag5 = true;
							}
						}
						
						if(flag2 && flag5){
							boolean flag3 = false;
							boolean flag6 = false;
							for(int i9 = 0; i9 < k5; i9++){
								int j2 = f1.y[ai1[i9]];
								if(j2 > -d){
									flag3 = true;
								}
								if(j2 < d){
									flag6 = true;
								}
							}
							
							if(flag3 && flag6){
								boolean flag4 = false;
								boolean flag7 = false;
								for(int k9 = 0; k9 < k5; k9++){
									int k2 = f1.w[ai1[k9]];
									if(k2 > -c){
										flag4 = true;
									}
									if(k2 < c){
										flag7 = true;
									}
								}
								
								if(flag4 && flag7){
									lb[q] = f1;
									pb[q] = i1;
									b(q);
									if(qb[q] < 0){
										jb[q] = f1.jc[i1];
									} else {
										jb[q] = f1.ic[i1];
									}
									if(jb[q] != r){
										int l2 = 0;
										for(int i10 = 0; i10 < k5; i10++){
											l2 += f1.sc[ai1[i10]];
										}
										
										ib[q] = l2 / k5 + f1.qc;
										q++;
									}
								}
							}
						}
					}
				}
				
			}
		}
		
		if(q == 0){
			return;
		}
		int ai[] = new int[q];
		for(int j1 = 0; j1 < q; j1++){
			int i5 = -5000;
			for(int l5 = 0; l5 < q; l5++){
				if(ib[l5] > i5){
					i5 = ib[l5];
					ai[j1] = l5;
				}
			}
			
			ib[ai[j1]] = -5000;
		}
		
		for(int i6 = 0; i6 < ub; i6++){
			for(int j6 = 1; j6 <= 4; j6++){
				for(int k1 = 0; k1 < q - j6; k1++){
					if(!a(ai[k1], ai[k1 + j6])){
						int j5 = j6;
						int i3 = ai[k1 + j6];
						for(int l6 = j6 - 1; l6 >= 0; l6--){
							if(!a(i3, ai[k1 + l6])){
								break;
							}
							ai[k1 + l6 + 1] = ai[k1 + l6];
							ai[k1 + l6] = i3;
							j5 = l6;
						}
						
						i3 = ai[k1];
						for(int k7 = 1; k7 <= j5; k7++){
							if(!a(ai[k1 + k7], i3)){
								break;
							}
							ai[(k1 + k7) - 1] = ai[k1 + k7];
							ai[k1 + k7] = i3;
						}
						
					}
				}
				
			}
			
		}
		
		for(int k6 = 0; k6 < q; k6++){
			try{
				int l3 = ai[k6];
				F f2 = lb[l3];
				int l1 = pb[l3];
				int j9 = 0;
				int j10 = 0;
				int k10 = f2.lc[l1];
				int ai2[] = f2.kc[l1];
				int ai3[] = new int[k10 + 10];
				int ai4[] = new int[k10 + 10];
				int ai5[] = new int[k10 + 10];
				int ai6[] = new int[k10];
				int ai7[] = new int[k10];
				int ai8[] = new int[k10];
				int l10 = (f2.vc[l1] * fb) / 256;
				if(!f2.rc[l1]){
					if(f2.oc[l1] == r){
						f2.oc[l1] = (f2.sb[l1] * eb + f2.rb[l1] * db + f2.qb[l1] * cb) / l10;
					}
					if(qb[l3] < 0){
						j10 = f2.zc[l1] - f2.oc[l1];
					} else {
						j10 = f2.zc[l1] + f2.oc[l1];
					}
				}
				for(int i11 = 0; i11 < k10; i11++){
					int j3 = ai2[i11];
					ai6[i11] = f2.uc[j3];
					ai7[i11] = f2.tc[j3];
					ai8[i11] = f2.sc[j3];
					if(f2.rc[l1]){
						if(f2.eb[j3] == r){
							f2.eb[j3] = (f2.db[j3] * eb + f2.cb[j3] * db + f2.bb[j3] * cb) / (l10 * f2.fb[j3]);
						}
						if(qb[l3] < 0){
							j10 = f2.zc[l1] - f2.eb[j3];
						} else {
							j10 = f2.zc[l1] + f2.eb[j3];
						}
					}
					if(f2.sc[j3] >= b){
						ai3[j9] = f2.y[j3];
						ai4[j9] = f2.w[j3];
						ai5[j9] = f2.sc[j3] / kb + j10;
						j9++;
					} else {
						int l9;
						if(i11 == 0){
							l9 = ai2[k10 - 1];
						} else {
							l9 = ai2[i11 - 1];
						}
						if(f2.sc[l9] >= b){
							int k8 = f2.sc[j3] - f2.sc[l9];
							int i7 = f2.uc[j3] - ((f2.uc[j3] - f2.uc[l9]) * (f2.sc[j3] - b)) / k8;
							int l7 = f2.tc[j3] - ((f2.tc[j3] - f2.tc[l9]) * (f2.sc[j3] - b)) / k8;
							ai3[j9] = (i7 << 8) / b;
							ai4[j9] = (l7 << 8) / b;
							ai5[j9] = b / kb + j10;
							j9++;
						}
						if(i11 == k10 - 1){
							l9 = ai2[0];
						} else {
							l9 = ai2[i11 + 1];
						}
						if(f2.sc[l9] >= b){
							int l8 = f2.sc[j3] - f2.sc[l9];
							int j7 = f2.uc[j3] - ((f2.uc[j3] - f2.uc[l9]) * (f2.sc[j3] - b)) / l8;
							int i8 = f2.tc[j3] - ((f2.tc[j3] - f2.tc[l9]) * (f2.sc[j3] - b)) / l8;
							ai3[j9] = (j7 << 8) / b;
							ai4[j9] = (i8 << 8) / b;
							ai5[j9] = b / kb + j10;
							j9++;
						}
					}
				}
				
				a(j9, k10, ai6, ai7, ai8, ai3, ai4, ai5, jb[l3]);
			} catch(Exception exception){
				System.out.println(String.valueOf(exception));
			}
		}
		
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2){
		d = k1;
		c = l1;
		l = i1;
		k = j1;
		j = i2;
	}
	
	public void a(Graphics g1, Graphics g2, Graphics g3, F f1, int i1){
		Color color = Color.white;
		for(int j1 = 0; j1 < f1.ub; j1++){
			int k1 = f1.lc[j1];
			int ai[] = f1.kc[j1];
			for(int i2 = 0; i2 < k1; i2++){
				int l1 = ai[i2];
				a(g1, color, (f1.sc[l1] - wb << 8) / i1, (f1.tc[l1] - zb << 8) / i1);
				a(g2, color, (f1.uc[l1] - bc << 8) / i1, (f1.tc[l1] - zb << 8) / i1);
				a(g3, color, (f1.uc[l1] - bc << 8) / i1, (wb - f1.sc[l1] << 8) / i1);
			}
			
		}
		
	}
	
	private void a(Graphics g1, Color color, int i1, int j1){
		g1.setColor(color);
		g1.drawLine(i1 - 3, j1 - 3, i1 + 3, j1 + 3);
		g1.drawLine(i1 + 3, j1 - 3, i1 - 3, j1 + 3);
	}
	
	public void a(Graphics g1, int i1, int j1){
		if(p == 0){
			return;
		}
		g1.setColor(Color.yellow);
		for(int k1 = 0; k1 < p; k1++){
			F f1 = m[k1];
			if(f1.o == 0){
				for(int l1 = 0; l1 < f1.ub; l1++){
					int j2 = f1.lc[l1];
					int ai[] = f1.kc[l1];
					for(int i3 = 0; i3 < j2; i3++){
						int j3;
						int l3;
						if(i3 == j2 - 1){
							j3 = ai[i3];
							l3 = ai[0];
						} else {
							j3 = ai[i3];
							l3 = ai[i3 + 1];
						}
						if(i1 == 0){
							g1.drawLine((f1.sc[j3] - wb << 8) / j1, (f1.tc[j3] - zb << 8) / j1, (f1.sc[l3] - wb << 8) / j1, (f1.tc[l3] - zb << 8) / j1);
						}
						if(i1 == 1){
							g1.drawLine((f1.uc[j3] - bc << 8) / j1, (f1.tc[j3] - zb << 8) / j1, (f1.uc[l3] - bc << 8) / j1, (f1.tc[l3] - zb << 8) / j1);
						}
						if(i1 == 2){
							g1.drawLine((f1.uc[j3] - bc << 8) / j1, (wb - f1.sc[j3] << 8) / j1, (f1.uc[l3] - bc << 8) / j1, (wb - f1.sc[l3] << 8) / j1);
						}
					}
					
				}
				
			}
		}
		
		for(int i2 = 0; i2 < p; i2++){
			F f2 = m[i2];
			if(f2.o == 1){
				for(int k2 = 0; k2 < f2.ub; k2++){
					if(f2.ub > 1){
						g1.setColor(Color.green);
					} else {
						g1.setColor(Color.magenta);
					}
					int l2 = f2.lc[k2];
					int ai1[] = f2.kc[k2];
					for(int k3 = 0; k3 < l2; k3++){
						int i4;
						int j4;
						if(k3 == l2 - 1){
							i4 = ai1[k3];
							j4 = ai1[0];
						} else {
							i4 = ai1[k3];
							j4 = ai1[k3 + 1];
						}
						if(i1 == 0){
							g1.drawLine((f2.sc[i4] - wb << 8) / j1, (f2.tc[i4] - zb << 8) / j1, (f2.sc[j4] - wb << 8) / j1, (f2.tc[j4] - zb << 8) / j1);
						}
						if(i1 == 1){
							g1.drawLine((f2.uc[i4] - bc << 8) / j1, (f2.tc[i4] - zb << 8) / j1, (f2.uc[j4] - bc << 8) / j1, (f2.tc[j4] - zb << 8) / j1);
						}
						if(i1 == 2){
							g1.drawLine((f2.uc[i4] - bc << 8) / j1, (wb - f2.sc[i4] << 8) / j1, (f2.uc[j4] - bc << 8) / j1, (wb - f2.sc[j4] << 8) / j1);
						}
					}
					
				}
				
			}
		}
		
	}
	
	public void a(){
		if(p == 0){
			return;
		}
		for(int i1 = 0; i1 < p; i1++){
			m[i1].a(0, 0, 0, 0, 0, 0, 8, b);
		}
		
	}
	
	public void b(){
		for(int i1 = 0; i1 < p; i1++){
			if(tb[i1] > 0){
				tb[i1]--;
				m[i1].a(sb);
				m[i1].k(rb, rb, rb);
				if(tb[i1] == 0){
					a(m[i1]);
					i1--;
				}
			}
		}
		
	}
	
	public void c(){
		for(int i1 = 0; i1 < p; i1++){
			m[i1] = null;
		}
		
		p = 0;
	}
	
	public void a(F f1, int i1){
		int j1 = f1.j();
		int k1 = f1.i();
		int l1 = f1.h();
		f1.h(0, 0, 0);
		F af[] = f1.a();
		a(f1);
		for(int i2 = 0; i2 < af.length; i2++){
			if(p < bb){
				tb[p] = i1;
				m[p++] = af[i2];
				af[i2].i(j1, k1, l1);
				af[i2].k();
			}
		}
		
	}
	
	private void a(F f1){
		for(int i1 = 0; i1 < p; i1++){
			if(m[i1] == f1){
				p--;
				for(int j1 = i1; j1 < p; j1++){
					m[j1] = m[j1 + 1];
					tb[j1] = tb[j1 + 1];
				}
				
			}
		}
		
	}
	
	public void b(F f1){
		if(p < bb){
			tb[p] = 0;
			m[p++] = f1;
		}
	}
	
	public B(int ai[], int i1, int j1, int k1){
		b = 5;
		n = -5000;
		a = 1000;
		kb = 20;
		ub = 3;
		j = 512;
		f = new int[512];
		sb = 1.1000000000000001D;
		rb = 1;
		eb = 180;
		db = 155;
		cb = 95;
		fb = 256;
		d = 256;
		c = 192;
		l = 256;
		k = 256;
		s = 4;
		r = 0xbc614e;
		cc = new int[0x30000];
		u = new int[384];
		y = new int[384];
		hb = new int[384];
		gb = new int[384];
		h = false;
		d = 256;
		c = 192;
		cc = ai;
		p = 0;
		bb = i1;
		m = new F[bb];
		tb = new int[bb];
		q = 0;
		lb = new F[j1];
		pb = new int[j1];
		ib = new int[j1];
		ob = new int[j1];
		nb = new int[j1];
		mb = new int[j1];
		qb = new int[j1];
		jb = new int[j1];
		t = new int[j1];
		x = new int[j1];
		w = new int[j1];
		ab = new int[j1];
		v = new int[j1];
		z = new int[j1];
		bc = 0;
		zb = 0;
		wb = 0;
		ac = 0;
		yb = 0;
		vb = 0;
		for(int l1 = 0; l1 < 256; l1++){
			f[l1] = (int) (Math.sin(l1 * 0.02454369D) * 32768D);
			f[l1 + 256] = (int) (Math.cos(l1 * 0.02454369D) * 32768D);
		}
		
	}
}
