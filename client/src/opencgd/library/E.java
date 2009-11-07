package opencgd.library;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.PixelGrabber;

public class E implements ImageObserver, ImageProducer {
	
	public int e;
	public int f;
	public int b;
	public int c;
	private boolean i[];
	private int n[];
	private int m[];
	private int a[];
	private int d[];
	public int q[];
	public int h[];
	private int k[][];
	private Image s;
	private ImageConsumer p;
	public int l[];
	private ColorModel o;
	private int r;
	private int g;
	
	public boolean imageUpdate(Image image, int i1, int j1, int k1, int l1, int i2){
		return true;
	}
	
	public void a(int i1){
		int ai[] = k[i1];
		int j1 = h[i1] * q[i1];
		for(int k1 = 0; k1 < j1; k1++){
			int l1 = ai[k1];
			if(l1 != 0){
				l1 = l1 >>> 1 & 0xff0ff0ff;
				if(l1 == 0){
					l1 = 1;
				}
				ai[k1] = l1;
			}
		}
		
	}
	
	private void a(int ai[], int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		ai = l;
		i1 = k1 + l1 * g;
		j1 = 0;
		int ai1[] = k[i2];
		int i3 = -q[i2];
		int j3 = -h[i2];
		int k3 = g + j3;
		if(l1 < 0){
			i3 -= l1;
			j1 += l1 * j3;
			i1 = k1;
		}
		for(l1 = i3; l1 < 0; l1++){
			int l2 = (int) (Math.sin((l1 + j2) / 4D) * (2 - k2) + Math.sin((l1 + j2) / 6D) * (3 - k2) + Math.sin((l1 + j2) / 8D) * (4 - k2));
			if(l1 == -1 || l1 == i3){
				l2 = 0;
			}
			for(k1 = j3; k1 < 0; k1++){
				ai[l2 + i1++] = ai1[j1++];
			}
			
			i1 += k3;
		}
		
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2){
		a(l, 0, 0, i1, j1, k1, l1, i2);
	}
	
	private void a(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3, int k3){
		int l3 = j1;
		int i4 = 256 - k3;
		for(int l5 = -k2; l5 < 0; l5++){
			int i6 = (k1 >> 16) * j3;
			for(int j6 = -j2; j6 < 0; j6++){
				i1 = ai1[(j1 >> 16) + i6];
				if(i1 != 0){
					int j4 = (i1 >> 24 & 0xff) * k3;
					int k4 = (i1 >> 12 & 0xff) * k3;
					int l4 = (i1 & 0xff) * k3;
					int i5 = (ai[l1] >> 24 & 0xff) * i4;
					int j5 = (ai[l1] >> 12 & 0xff) * i4;
					int k5 = (ai[l1] & 0xff) * i4;
					int k6 = ((j4 + i5 >> 8) << 24) + ((k4 + j5 >> 8) << 12) + (l4 + k5 >> 8);
					ai[l1++] = k6;
				} else {
					l1++;
				}
				j1 += l2;
			}
			
			k1 += i3;
			j1 = l3;
			l1 += i2;
		}
		
	}
	
	private void a(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3){
		int k3 = j1;
		for(int l3 = -k2; l3 < 0; l3++){
			int i4 = (k1 >> 16) * j3;
			for(int j4 = -j2; j4 < 0; j4++){
				i1 = ai1[(j1 >> 16) + i4];
				if(i1 != 0){
					ai[l1++] = (i1 >>> 1 & 0xff0ff0ff) + (ai[l1] >>> 1 & 0xff0ff0ff);
				} else {
					l1++;
				}
				j1 += l2;
			}
			
			k1 += i3;
			j1 = k3;
			l1 += i2;
		}
		
	}
	
	public void a(int i1, int j1, int k1, int l1, int i2, int j2){
		if(i[i2]){
			i1 += (d[i2] * k1) / m[i2];
			j1 += (a[i2] * l1) / n[i2];
			k1 = (k1 * h[i2]) / m[i2];
			l1 = (l1 * q[i2]) / n[i2];
		}
		int k2 = i1 + j1 * g;
		int l2 = h[i2];
		int i3 = q[i2];
		int j3 = g - k1;
		int k3 = 0;
		int l3 = 0;
		int i4 = (l2 << 16) / k1;
		int j4 = (i3 << 16) / l1;
		if(j1 < c){
			int k4 = c - j1;
			l1 -= k4;
			j1 = 0;
			k2 += k4 * g;
			l3 += j4 * k4;
		}
		if(j1 + l1 >= b){
			l1 -= (j1 + l1) - b;
		}
		if(i1 < f){
			int l4 = f - i1;
			k1 -= l4;
			i1 = 0;
			k2 += l4;
			k3 += i4 * l4;
			j3 += l4;
		}
		if(i1 + k1 >= e){
			int i5 = (i1 + k1) - e;
			k1 -= i5;
			j3 += i5;
		}
		if(j2 == 128){
			a(l, k[i2], 0, k3, l3, k2, j3, k1, l1, i4, j4, l2);
			return;
		} else {
			a(l, k[i2], 0, k3, l3, k2, j3, k1, l1, i4, j4, l2, j2);
			return;
		}
	}
	
	private void b(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3, int j3){
		try{
			int k3 = j1;
			for(int l3 = -k2; l3 < 0; l3++){
				int i4 = (k1 >> 16) * j3;
				for(int j4 = -j2; j4 < 0; j4++){
					i1 = ai1[(j1 >> 16) + i4];
					if(i1 != 0){
						ai[l1++] = i1;
					} else {
						l1++;
					}
					j1 += l2;
				}
				
				k1 += i3;
				j1 = k3;
				l1 += i2;
			}
			
			return;
		} catch(Exception _ex){
			System.out.println("error in transparent sprite plot routine");
		}
	}
	
	private void a(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2, int i3){
		try{
			int j3 = j1;
			for(int k3 = -j2; k3 < 0; k3++){
				int l3 = (k1 >> 16) * i3;
				for(int i4 = -i2; i4 < 0; i4++){
					ai[i1++] = ai1[(j1 >> 16) + l3];
					j1 += k2;
				}
				
				k1 += l2;
				j1 = j3;
				i1 += l1;
			}
			
			return;
		} catch(Exception _ex){
			System.out.println("error in sprite plot routine");
		}
	}
	
	public void b(int i1, int j1, int k1, int l1, int i2){
		try{
			if(i[i2]){
				i1 += (d[i2] * k1) / m[i2];
				j1 += (a[i2] * l1) / n[i2];
				k1 = (k1 * h[i2]) / m[i2];
				l1 = (l1 * q[i2]) / n[i2];
			}
			int j2 = i1 + j1 * g;
			int k2 = h[i2];
			int l2 = q[i2];
			int i3 = g - k1;
			int j3 = 0;
			int k3 = 0;
			int l3 = (k2 << 16) / k1;
			int i4 = (l2 << 16) / l1;
			if(j1 < c){
				int j4 = c - j1;
				l1 -= j4;
				j1 = 0;
				j2 += j4 * g;
				k3 += i4 * j4;
			}
			if(j1 + l1 >= b){
				l1 -= (j1 + l1) - b;
			}
			if(i1 < f){
				int k4 = f - i1;
				k1 -= k4;
				i1 = 0;
				j2 += k4;
				j3 += l3 * k4;
				i3 += k4;
			}
			if(i1 + k1 >= e){
				int l4 = (i1 + k1) - e;
				k1 -= l4;
				i3 += l4;
			}
			if(i[i2]){
				b(l, k[i2], 0, j3, k3, j2, i3, k1, l1, l3, i4, k2);
				return;
			} else {
				a(l, k[i2], j2, j3, k3, i3, k1, l1, l3, i4, k2);
				return;
			}
		} catch(Exception _ex){
			System.out.println("error in sprite clipping routine");
		}
	}
	
	private void a(int ai[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2){
		try{
			ai = l;
			i1 = i2 + j2 * g;
			j1 = 0;
			int ai1[] = k[k2];
			int i3 = -q[k2];
			int j3 = -h[k2];
			int k3 = 1 + g * i3;
			int l3 = 1 - j3 * i3;
			int i4 = g;
			if(l1 < 0){
				l1 = -l1;
				i4 = -g;
			}
			int j4 = 0;
			l1 = ((l1 + 1) * 0x10000) / ((-j3 + 1) - l2);
			int k4 = 0;
			l2 = ((l2 + 1) * 0x10000) / ((-j3 + 1) - l2);
			for(i2 = j3; i2 < 0; i2++){
				for(j2 = i3; j2 < 0; j2++){
					k1 = ai1[j1];
					if(k1 != 0){
						ai[i1] = k1;
					}
					j1 -= j3;
					i1 += g;
				}
				
				i1 += k3;
				j1 += l3;
				for(j4 += l1; j4 > 0x10000;){
					j4 -= 0x10000;
					i1 += i4;
				}
				
				for(k4 += l2; k4 > 0x10000;){
					k4 -= 0x10000;
					j1++;
					i2++;
				}
				
			}
			
			return;
		} catch(Exception _ex){
			System.out.println("bf:" + ai + " off:" + i1 + " co:" + j1 + " c:" + k1 + " skew:" + l1 + " x:" + i2 + " y:" + j2 + " n:" + k2 + " skip:" + l2);
		}
		System.out.println("spr:" + k[k2] + " h:" + q[k2] + " w:" + h[k2]);
	}
	
	public void c(int i1, int j1, int k1, int l1, int i2){
		a(null, 0, 0, 0, l1, i1 + (d[k1] * (m[k1] - i2)) / m[k1], j1 + a[k1], k1, (i2 * h[k1]) / m[k1]);
	}
	
	private void b(int ai[], int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2){
		try{
			ai = l;
			i1 = i2 + j2 * g;
			j1 = 0;
			int ai1[] = k[k2];
			int i3 = -q[k2];
			int j3 = -h[k2];
			int k3 = g + j3;
			byte byte0 = 1;
			if(l1 < 0){
				l1 = -l1;
				byte0 = -1;
			}
			int l3 = 0;
			l1 = ((l1 + 1) * 0x10000) / ((-i3 + 1) - l2);
			int i4 = 0;
			l2 = ((l2 + 1) * 0x10000) / ((-i3 + 1) - l2);
			if(j2 < c){
				i3 -= j2 - c;
				j1 += (j2 - c) * j3;
				i1 = i2 + c * g;
			}
			for(j2 = i3; j2 < 0; j2++){
				for(i2 = j3; i2 < 0; i2++){
					k1 = ai1[j1++];
					if(k1 != 0){
						ai[i1++] = k1;
					} else {
						i1++;
					}
				}
				
				i1 += k3;
				for(l3 += l1; l3 > 0x10000;){
					l3 -= 0x10000;
					i1 += byte0;
				}
				
				for(i4 += l2; i4 > 0x10000;){
					i4 -= 0x10000;
					j1 -= j3;
					j2++;
				}
				
			}
			
			return;
		} catch(Exception _ex){
			System.out.println("bf:" + ai + " off:" + i1 + " co:" + j1 + " c:" + k1 + " skew:" + l1 + " x:" + i2 + " y:" + j2 + " n:" + k2 + " skip:" + l2);
		}
		System.out.println("spr:" + k[k2] + " h:" + q[k2] + " w:" + h[k2]);
	}
	
	public void d(int i1, int j1, int k1, int l1, int i2){
		b(null, 0, 0, 0, l1, i1 + d[k1], j1 + (a[k1] * (n[k1] - i2)) / n[k1], k1, (i2 * q[k1]) / n[k1]);
	}
	
	private void a(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		for(int l2 = i2; l2 < 0; l2++){
			for(int i3 = l1; i3 < 0; i3++){
				i1 = ai1[j1++];
				if(i1 != 0){
					ai[k1++] = i1;
				} else {
					k1++;
				}
			}
			
			k1 += j2;
			j1 += k2;
		}
		
	}
	
	private void b(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, int k2){
		l1 >>= 2;
		for(int l2 = i2; l2 < 0; l2++){
			for(int i3 = l1; i3 < 0; i3++){
				i1 = ai1[j1++];
				if(i1 != 0){
					ai[k1++] = i1;
				} else {
					k1++;
				}
				i1 = ai1[j1++];
				if(i1 != 0){
					ai[k1++] = i1;
				} else {
					k1++;
				}
				i1 = ai1[j1++];
				if(i1 != 0){
					ai[k1++] = i1;
				} else {
					k1++;
				}
				i1 = ai1[j1++];
				if(i1 != 0){
					ai[k1++] = i1;
				} else {
					k1++;
				}
			}
			
			k1 += j2;
			j1 += k2;
		}
		
	}
	
	private void a(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2){
		for(int k2 = l1; k2 < 0; k2++){
			for(int l2 = k1; l2 < 0; l2++){
				ai[j1++] = ai1[i1++];
			}
			
			j1 += i2;
			i1 += j2;
		}
		
	}
	
	private void b(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2){
		k1 >>= 2;
		for(int k2 = l1; k2 < 0; k2++){
			for(int l2 = k1; l2 < 0; l2++){
				ai[j1++] = ai1[i1++];
				ai[j1++] = ai1[i1++];
				ai[j1++] = ai1[i1++];
				ai[j1++] = ai1[i1++];
			}
			
			j1 += i2;
			i1 += j2;
		}
		
	}
	
	public void a(int i1, int j1, int k1){
		if(i[k1]){
			i1 += d[k1];
			j1 += a[k1];
		}
		int l1 = i1 + j1 * g;
		int i2 = 0;
		int j2 = -q[k1];
		int k2 = -h[k1];
		int l2 = g + k2;
		int i3 = 0;
		if(j1 < c){
			int j3 = c - j1;
			j2 += j3;
			j1 = 0;
			i2 += j3 * h[k1];
			l1 += j3 * g;
		}
		if(j1 - j2 >= b){
			j2 += j1 - j2 - b;
		}
		if(i1 < f){
			int k3 = f - i1;
			k2 += k3;
			i1 = 0;
			i2 += k3;
			l1 += k3;
			i3 += k3;
			l2 += k3;
		}
		if(i1 - k2 >= e){
			int l3 = i1 - k2 - e;
			k2 += l3;
			i3 += l3;
			l2 += l3;
		}
		if(i[k1]){
			if((-k2 & 3) == 0){
				b(l, k[k1], 0, i2, l1, k2, j2, l2, i3);
				return;
			} else {
				a(l, k[k1], 0, i2, l1, k2, j2, l2, i3);
				return;
			}
		}
		if((-k2 & 3) == 0){
			b(l, k[k1], i2, l1, k2, j2, l2, i3);
			return;
		} else {
			a(l, k[k1], i2, l1, k2, j2, l2, i3);
			return;
		}
	}
	
	public void b(int i1, int j1, int k1){
		a(i1 - m[k1] / 2, j1 - n[k1] / 2, k1);
	}
	
	public void a(int i1, int j1){
		h[j1] = h[i1];
		q[j1] = q[i1];
		d[j1] = d[i1];
		a[j1] = a[i1];
		i[j1] = i[i1];
		m[j1] = m[i1];
		n[j1] = n[i1];
		int k1 = h[i1] * q[i1];
		k[j1] = new int[k1];
		for(int l1 = 0; l1 < k1; l1++){
			k[j1][l1] = k[i1][l1];
		}
		
	}
	
	public void b(int i1){
		h[i1] = g;
		q[i1] = r;
		i[i1] = false;
		d[i1] = 0;
		a[i1] = 0;
		m[i1] = g;
		n[i1] = r;
		int j1 = g * r;
		k[i1] = new int[j1];
		for(int k1 = 0; k1 < j1; k1++){
			k[i1][k1] = l[k1];
		}
		
	}
	
	private void a(int ai[], int i1, int j1, int k1, boolean flag){
		int l1 = 0;
		int i2 = 0;
		int j2 = i1;
		int k2 = j1;
		if(flag){
			label0: for(int l2 = 0; l2 < j1; l2++){
				for(int j3 = 0; j3 < i1; j3++){
					int i4 = ai[j3 + l2 * i1];
					if((i4 & 0xff000000) == 0 || i4 == -65281){
						continue;
					}
					i2 = l2;
					break label0;
				}
				
			}
			
			label1: for(int k3 = 0; k3 < i1; k3++){
				for(int j4 = 0; j4 < j1; j4++){
					int i5 = ai[k3 + j4 * i1];
					if((i5 & 0xff000000) == 0 || i5 == -65281){
						continue;
					}
					l1 = k3;
					break label1;
				}
				
			}
			
			label2: for(int k4 = j1 - 1; k4 >= 0; k4--){
				for(int j5 = 0; j5 < i1; j5++){
					int i6 = ai[j5 + k4 * i1];
					if((i6 & 0xff000000) == 0 || i6 == -65281){
						continue;
					}
					k2 = k4 + 1;
					break label2;
				}
				
			}
			
			label3: for(int k5 = i1 - 1; k5 >= 0; k5--){
				for(int j6 = 0; j6 < j1; j6++){
					int k6 = ai[k5 + j6 * i1];
					if((k6 & 0xff000000) == 0 || k6 == -65281){
						continue;
					}
					j2 = k5 + 1;
					break label3;
				}
				
			}
			
		}
		k[k1] = new int[(j2 - l1) * (k2 - i2)];
		h[k1] = j2 - l1;
		q[k1] = k2 - i2;
		i[k1] = flag;
		d[k1] = l1;
		a[k1] = i2;
		m[k1] = i1;
		n[k1] = j1;
		int i3 = 0;
		for(int l3 = i2; l3 < k2; l3++){
			for(int l4 = l1; l4 < j2; l4++){
				int l5 = ai[l4 + l3 * i1];
				if(l5 == 0xff000000){
					l5 = 0xff010101;
				}
				if((l5 & 0xff000000) == 0 || l5 == -65281){
					l5 = 0;
				}
				l5 = ((l5 & 0xff0000) << 8) + ((l5 & 0xff00) << 4) + (l5 & 0xff);
				k[k1][i3++] = l5;
			}
			
		}
		
	}
	
	private void a(Image image, int i1, boolean flag){
		int j1 = image.getWidth(this);
		int k1 = image.getHeight(this);
		int ai[] = new int[j1 * k1];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, j1, k1, ai, 0, j1);
		try{
			pixelgrabber.grabPixels();
		} catch(InterruptedException _ex){
			System.out.println("Error!");
		}
		image.flush();
		image = null;
		a(ai, j1, k1, i1, flag);
	}
	
	public void a(String s1, int i1, boolean flag, int j1, int k1, int l1){
		Image image = null;
		for(int i2 = 0; i2 < 5; i2++){
			image = opencgd.library.D.c(s1);
			if(image != null){
				break;
			}
			if(i2 == 4){
				throw new RuntimeException("Error loading:" + s1);
			}
		}
		
		try{
			int j2 = image.getWidth(opencgd.library.D.c_java_awt_Component_static_fld);
			int k2 = image.getHeight(opencgd.library.D.c_java_awt_Component_static_fld);
			int ai[] = new int[j2 * k2];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, j2, k2, ai, 0, j2);
			try{
				pixelgrabber.grabPixels();
			} catch(InterruptedException _ex){
				System.out.println("Error!");
			}
			int l2 = 0;
			int i3 = 0;
			for(int j3 = 0; j3 < j1; j3++){
				int k3 = 0;
				int ai1[] = new int[k1 * l1];
				for(int l3 = i3; l3 < i3 + l1; l3++){
					for(int i4 = l2; i4 < l2 + k1; i4++){
						ai1[k3++] = ai[i4 + l3 * j2];
					}
					
				}
				
				a(ai1, k1, l1, j3 + i1, flag);
				l2 += k1;
				if(l2 >= j2){
					l2 = 0;
					i3 += l1;
				}
			}
			
			image.flush();
			image = null;
			return;
		} catch(Exception _ex){
			throw new RuntimeException("Error buildling:" + s1);
		}
	}
	
	public void a(String s1, int i1, boolean flag){
		Image image = null;
		for(int j1 = 0; j1 < 5; j1++){
			image = opencgd.library.D.c(s1);
			if(image != null){
				break;
			}
			if(j1 == 4){
				throw new RuntimeException("Error loading:" + s1);
			}
		}
		
		try{
			a(image, i1, flag);
			return;
		} catch(Exception _ex){
			throw new RuntimeException("Error buildling:" + s1);
		}
	}
	
	public void a(){
		for(int i1 = 0; i1 < k.length; i1++){
			k[i1] = null;
			h[i1] = 0;
			q[i1] = 0;
		}
		
	}
	
	public void b(){
		int i1 = g * r;
		for(int j1 = 0; j1 < i1; j1++){
			int k1 = l[j1];
			int l1 = k1 >> 24 & 0xff;
			int i2 = k1 >> 12 & 0xff;
			int j2 = k1 & 0xff;
			int k2 = j2 / 6 + i2 / 2 + l1 / 3;
			l[j1] = (k2 << 24) + (k2 << 12) + k2;
		}
		
	}
	
	public void c(int i1){
		for(int j1 = 0; j1 < g; j1++){
			for(int k1 = 0; k1 < r; k1++){
				int l1 = 0;
				int i2 = 0;
				int j2 = 0;
				int k2 = 0;
				for(int l2 = j1 - i1; l2 <= j1 + i1; l2++){
					if(l2 >= 0 && l2 < g){
						for(int i3 = k1 - i1; i3 <= k1 + i1; i3++){
							if(i3 >= 0 && i3 < r){
								int j3 = l[l2 + g * i3];
								l1 += j3 >> 24 & 0xff;
								i2 += j3 >> 12 & 0xff;
								j2 += j3 & 0xff;
								k2++;
							}
						}
						
					}
				}
				
				l[j1 + g * k1] = (l1 / k2 << 24) + (i2 / k2 << 12) + j2 / k2;
			}
			
		}
		
	}
	
	public void a(int i1, boolean flag){
		int l1 = g * r;
		for(int k1 = 0; k1 < l1; k1++){
			int j1 = l[k1] & 0xff0ff0ff;
			l[k1] = (j1 >>> 1) + (j1 >>> 2) + (j1 >>> 3) + (j1 >>> 4);
		}
		
	}
	
	public void a(int i1, int j1, int k1, int l1, Color color){
		int i2 = (color.getRed() << 24) + (color.getGreen() << 12) + color.getBlue();
		int j2 = i1 + j1 * g;
		for(int k2 = 0; k2 < k1; k2++){
			l[j2 + k2] = i2;
			l[j2 + k2 + (l1 - 1) * g] = i2;
		}
		
		for(int l2 = 0; l2 < l1; l2++){
			l[j2 + l2 * g] = i2;
			l[(j2 + l2 * g + k1) - 1] = i2;
		}
		
	}
	
	public void b(int i1, int j1, int k1, int l1, Color color){
		int i2 = (color.getRed() << 24) + (color.getGreen() << 12) + color.getBlue();
		int j2 = i1 + j1 * g;
		int k2 = g - k1;
		for(int l2 = -l1; l2 < 0; l2++){
			for(int i3 = -k1; i3 < 0; i3++){
				l[j2++] = i2;
			}
			
			j2 += k2;
		}
		
	}
	
	public void a(int i1, int j1, int k1, int l1, Color color, Color color1, boolean flag){
		int i2 = color1.getRed();
		int j2 = color1.getGreen();
		int k2 = color1.getBlue();
		int l2 = color.getRed();
		int i3 = color.getGreen();
		int j3 = color.getBlue();
		int k3 = g - k1;
		byte byte0 = 1;
		if(flag){
			byte0 = 2;
			k3 += g;
			if((j1 & 1) != 0){
				j1++;
				l1--;
			}
		}
		int l3 = i1 + j1 * g;
		for(int i4 = 0; i4 < l1; i4 += byte0){
			int j4 = ((i2 * i4 + l2 * (l1 - i4)) / l1 << 24) + ((j2 * i4 + i3 * (l1 - i4)) / l1 << 12) + (k2 * i4 + j3 * (l1 - i4)) / l1;
			for(int k4 = -k1; k4 < 0; k4++){
				l[l3++] = j4;
			}
			
			l3 += k3;
		}
		
	}
	
	public void a(int i1, int j1, int k1, int l1, Color color, int i2, boolean flag){
		int j2 = 256 - i2;
		int k2 = color.getRed() * i2;
		int l2 = color.getGreen() * i2;
		int i3 = color.getBlue() * i2;
		int i4 = g - k1;
		byte byte0 = 1;
		if(flag){
			byte0 = 2;
			i4 += g;
			if((j1 & 1) != 0){
				j1++;
				l1--;
			}
		}
		int j4 = i1 + j1 * g;
		for(int k4 = 0; k4 < l1; k4 += byte0){
			for(int l4 = -k1; l4 < 0; l4++){
				int j3 = (l[j4] >> 24 & 0xff) * j2;
				int k3 = (l[j4] >> 12 & 0xff) * j2;
				int l3 = (l[j4] & 0xff) * j2;
				int i5 = ((k2 + j3 >> 8) << 24) + ((l2 + k3 >> 8) << 12) + (i3 + l3 >> 8);
				l[j4++] = i5;
			}
			
			j4 += i4;
		}
		
	}
	
	public void a(boolean flag){
		int i1 = g * r;
		if(!flag){
			for(int j1 = 0; j1 < i1; j1++){
				l[j1] = 0;
			}
			
			return;
		}
		int k1 = 0;
		for(int l1 = -r; l1 < 0; l1 += 2){
			for(int i2 = -g; i2 < 0; i2++){
				l[k1++] = 0;
			}
			
			k1 += g;
		}
		
	}
	
	public void a(Graphics g1, int i1, int j1, boolean flag){
		b(flag);
		g1.drawImage(s, i1, j1, this);
	}
	
	private synchronized void b(boolean flag){
		if(p == null){
			return;
		}
		if(!flag){
			p.setPixels(0, 0, g, r, o, l, 0, g);
		} else {
			for(int i1 = 0; i1 < r; i1 += 2){
				p.setPixels(0, i1, g, 1, o, l, i1 * g, g);
			}
			
		}
		p.imageComplete(2);
	}
	
	public void requestTopDownLeftRightResend(ImageConsumer imageconsumer){
		System.out.println("TDLR");
	}
	
	public void startProduction(ImageConsumer imageconsumer){
		addConsumer(imageconsumer);
	}
	
	public synchronized void removeConsumer(ImageConsumer imageconsumer){
		if(p == imageconsumer){
			p = null;
		}
	}
	
	public synchronized boolean isConsumer(ImageConsumer imageconsumer){
		return p == imageconsumer;
	}
	
	public synchronized void addConsumer(ImageConsumer imageconsumer){
		p = imageconsumer;
		imageconsumer.setDimensions(g, r);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(o);
		imageconsumer.setHints(14);
	}
	
	public E(int i1, int j1, int k1, Component component){
		o = new DirectColorModel(32, 0xff000000, 0xff000, 255);
		g = i1;
		r = j1;
		l = new int[i1 * j1];
		k = new int[k1][];
		i = new boolean[k1];
		h = new int[k1];
		q = new int[k1];
		m = new int[k1];
		n = new int[k1];
		d = new int[k1];
		a = new int[k1];
		int l1 = g * r;
		for(int i2 = 0; i2 < l1; i2++){
			l[i2] = 0;
		}
		
		s = component.createImage(this);
		b(false);
		component.prepareImage(s, component);
		b(false);
		component.prepareImage(s, component);
		b(false);
		component.prepareImage(s, component);
		b = j1;
		e = i1;
	}
}