package opencgd.client.library;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

public class EngineApplet extends Applet implements Runnable {
	
	private static final long serialVersionUID = -8090985507472240130L;
	public String ii;
	public String jj;
	public String q;
	public String r;
	public int s;
	public int hh;
	public int g;
	public int e;
	public int f;
	public boolean downArrowKey;
	public boolean upArrowKey;
	public boolean rightArrowKey;
	public boolean leftArrowKey;
	private int k;
	private boolean y;
	private EngineFrame b;
	private long d[];
	private int v;
	private Thread z;
	private int u;
	private int a;
	private int t;
	
	public EngineApplet(){
		t = 1;
		a = 512;
		u = 384;
		v = 20;
		d = new long[10];
		leftArrowKey = false;
		rightArrowKey = false;
		upArrowKey = false;
		downArrowKey = false;
		r = "";
		q = "";
		jj = "";
		ii = "";
	}
	
	@Override
	public final void paint(Graphics g1){
		if(t == 2){
			opencgd.client.library.D.a();
			return;
		}
		if(t == 0){
			a();
		}
	}
	
	@Override
	public final void update(Graphics g1){
		if(t == 2){
			opencgd.client.library.D.a();
			return;
		}
		if(t == 0){
			a();
		}
	}
	
	public final void run(){
		if(t == 1){
			t = 2;
			opencgd.client.library.D.g.setColor(Color.black);
			opencgd.client.library.D.g.fillRect(0, 0, opencgd.client.library.D.width, opencgd.client.library.D.height);
			opencgd.client.library.D.a(0);
			b();
			t = 0;
		}
		int i1 = 0;
		int j1 = 256;
		int k1 = 1;
		int i2 = 0;
		for(int j2 = 0; j2 < 10; j2++){
			d[j2] = System.currentTimeMillis();
		}
		
		while(k >= 0){
			if(k > 0){
				k--;
				if(k == 0){
					destroy();
				}
				return;
			}
			int k2 = j1;
			int i3 = k1;
			j1 = 300;
			k1 = 1;
			long l2 = System.currentTimeMillis();
			if(d[i1] == 0L){
				j1 = k2;
				k1 = i3;
			} else if(l2 > d[i1]){
				j1 = (int) ((2560 * v) / (l2 - d[i1]));
			}
			if(j1 < 25){
				j1 = 25;
			}
			if(j1 > 256){
				j1 = 256;
				k1 = (int) (v - (l2 - d[i1]) / 10L);
				if(k1 < 1){
					k1 = 1;
				}
			}
			try{
				Thread.sleep(k1);
			} catch(InterruptedException _ex){
			}
			d[i1] = l2;
			i1 = (i1 + 1) % 10;
			if(k1 > 1){
				for(int j3 = 0; j3 < 10; j3++){
					if(d[j3] != 0L){
						d[j3] += k1;
					}
				}
				
			}
			for(; i2 < 256; i2 += j1){
				c();
			}
			
			i2 &= 0xff;
			draw();
			if(y && i1 == 0){
				int k3 = (1000 * j1) / (v * 256);
				showStatus("Fps:" + k3 + "Del:" + k1);
			}
			if(b != null && (b.a() != a || b.b() != a)){
				a(b.a(), b.b());
			}
		}
	}
	
	//FIXME Deprecation
	@SuppressWarnings("deprecation")
	@Override
	public final void destroy(){
		System.out.println("Closing program");
		k = -1;
		e();
		if(z != null){
			z.stop();
			z = null;
		}
		if(b != null){
			b.dispose();
		}
		if(!y){
			System.exit(0);
		}
	}
	
	@Override
	public final void stop(){
		if(k >= 0){
			k = 4000 / v;
		}
	}
	
	@Override
	public final void start(){
		if(k >= 0){
			k = 0;
			if(!z.isAlive() || z == null){
				z = new Thread(this);
				z.start();
				System.out.println("Ressurect!");
			}
		}
	}
	
	@Override
	public final void init(){
		y = true;
		System.out.println("Started applet");
		a = getSize().width;
		u = getSize().height;
		t = 1;
		opencgd.client.library.D.a(this, a, u, y);
		z = new Thread(this);
		z.start();
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public synchronized boolean mouseDrag(Event event, int i1, int j1){
		f = i1;
		e = j1;
		if(event.metaDown()){
			g = 2;
		} else {
			g = 1;
		}
		return true;
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public synchronized boolean mouseDown(Event event, int i1, int j1){
		f = i1;
		e = j1;
		if(event.metaDown()){
			g = 2;
		} else {
			g = 1;
		}
		hh = g;
		return true;
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public synchronized boolean mouseUp(Event event, int i1, int j1){
		f = i1;
		e = j1;
		g = 0;
		return true;
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public synchronized boolean mouseMove(Event event, int i1, int j1){
		f = i1;
		e = j1;
		g = 0;
		return true;
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public synchronized boolean keyUp(Event event, int i1){
		if((char) i1 == 'z' || i1 == 1006){
			leftArrowKey = false;
		}
		if((char) i1 == 'x' || i1 == 1007){
			rightArrowKey = false;
		}
		if((char) i1 == 'k' || i1 == 1004){
			upArrowKey = false;
		}
		if((char) i1 == 'm' || i1 == 1005){
			downArrowKey = false;
		}
		return true;
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public synchronized boolean keyDown(Event event, int i1){
		s = i1;
		
		System.out.println("keyDown: " + i1);
		
		if(i1 == 1006){
			leftArrowKey = true;
		}
		if(i1 == 1007){
			rightArrowKey = true;
		}
		if(i1 == 1004){
			upArrowKey = true;
		}
		if(i1 == 1005){
			downArrowKey = true;
		}
		if((i1 >= 97 && i1 <= 122 || i1 >= 65 && i1 <= 90 || i1 >= 48 && i1 <= 57 || i1 == 32) && r.length() < 12){
			r += (char) i1;
		}
		if(i1 >= 32 && i1 <= 122 && jj.length() < 80){
			jj += (char) i1;
		}
		if(i1 == 8 && r.length() > 0){
			r = r.substring(0, r.length() - 1);
		}
		if(i1 == 8 && jj.length() > 0){
			jj = jj.substring(0, jj.length() - 1);
		}
		if(i1 == 10 || i1 == 13){
			q = r;
			ii = jj;
		}
		return true;
	}
	
	public final void f(){
		for(int i1 = 0; i1 < 10; i1++){
			d[i1] = 0L;
		}
		
	}
	
	public final void a(int i1){
		v = 1000 / i1;
	}
	
	public Frame g(){
		return b;
	}
	
	@Override
	public final Image createImage(int i1, int j1){
		if(b == null){
			return super.createImage(i1, j1);
		} else {
			return b.createImage(i1, j1);
		}
	}
	
	@Override
	public final Graphics getGraphics(){
		if(b == null){
			return super.getGraphics();
		} else {
			return b.getGraphics();
		}
	}
	
	private void a(int i1, int j1){
		b(i1, j1);
	}
	
	public final void a(Image image){
		if(b == null){
			return;
		} else {
			b.setIconImage(image);
			return;
		}
	}
	
	private final void b(int i1, int j1){
		if(b == null){
			return;
		} else {
			b.setSize(i1, j1);
			a = i1;
			u = j1;
			opencgd.client.library.D.a(b, a, u, false);
			return;
		}
	}
	
	public final void a(int i1, int j1, String s1, boolean flag){
		if(b != null){
			return;
		} else {
			a = i1;
			u = j1;
			b = new EngineFrame(this, i1, j1, s1, flag, y);
			opencgd.client.library.D.a(b, a, u, false);
			return;
		}
	}
	
	public final void b(int i1, int j1, String s1, boolean flag){
		y = false;
		System.out.println("Started application");
		a = i1;
		u = j1;
		b = new EngineFrame(this, i1, j1, s1, flag, false);
		t = 1;
		opencgd.client.library.D.a(b, a, u, y);
		z = new Thread(this);
		z.start();
	}
	
	public void a(){
	}
	
	public synchronized void draw(){
	}
	
	public void e(){
	}
	
	public synchronized void c(){
	}
	
	public void b(){
	}
}
