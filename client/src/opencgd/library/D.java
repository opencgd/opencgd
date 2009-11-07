package opencgd.library;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class D extends Dialog {
	
	private static final long serialVersionUID = 5661356917194069265L;
	Button h;
	public static String abspath = "";
	private static Font e;
	private static Font f;
	public static int hsscore[];
	public static String hsname[];
	private static String a[];
	private static String b[];
	private static int d;
	private static int c_int_static_fld;
	public static int height;
	public static int width;
	public static Graphics g;
	public static Applet app;
	public static Component c_java_awt_Component_static_fld;
	
	@Override
	public boolean action(Event event, Object obj){
		if(event.target == h){
			dispose();
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean handleEvent(Event event){
		if(event.id == 201){
			dispose();
			return true;
		} else {
			return super.handleEvent(event);
		}
	}
	
	public D(Frame frame, String s){
		super(frame, s);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		add("Center", h = new Button("Cancel"));
		setSize(300, 50);
		setModal(true);
		setResizable(false);
		setTitle(s);
		setVisible(true);
	}
	
	public static void b(String s){
		if(app != null){
			System.out.println(s);
			return;
		} else {
			new D((Frame) c_java_awt_Component_static_fld, s);
			return;
		}
	}
	
	public static int d(String s){
		for(int i = 0; i < d; i++){
			if(b[i].equals(s)){
				return Integer.parseInt(a[i]);
			}
		}
		
		return -1;
	}
	
	public static String e(String s){
		for(int i = 0; i < d; i++){
			if(b[i].equals(s)){
				return a[i];
			}
		}
		
		return null;
	}
	
	public static void a(String s, int i){
		String s1 = " ";
		int k = 0;
		b = new String[i];
		a = new String[i];
		try{
			InputStream inputstream = a(s);
			DataInputStream datainputstream = new DataInputStream(inputstream);
			while(s1 != null && s1.length() > 0){
				s1 = datainputstream.readLine();
				if(s1 != null && s1.length() > 0){
					int j = 0;
					String s2 = "";
					for(; s1.charAt(j) != '='; j++){
						s2 = s2 + s1.charAt(j);
					}
					
					j++;
					String s3 = "";
					for(; s1.charAt(j) != ';'; j++){
						s3 = s3 + s1.charAt(j);
					}
					
					b[k] = s2;
					a[k] = s3;
					k++;
				}
			}
			d = k;
			datainputstream.close();
			return;
		} catch(MalformedURLException _ex){
			throw new RuntimeException("Tagfile: " + s + " is invalid.");
		} catch(IOException _ex){
			throw new RuntimeException("Tagfile: " + s + " is invalid.");
		}
	}
	
	public static void a(){
		a(c_int_static_fld);
	}
	
	public static void a(int i){
		int j = (width - 281) / 2;
		int k = (height - 148) / 2;
		g.setColor(Color.black);
		g.fillRect(0, 0, 512, 384);
		j += 2;
		k += 90;
		c_int_static_fld = i;
		g.setColor(new Color(132, 132, 132));
		g.drawRect(j - 2, k - 2, 280, 23);
		g.fillRect(j, k, (277 * i) / 100, 20);
		g.setColor(new Color(198, 198, 198));
		a(g, "Now Loading - " + i + "%", f, j + 138, k + 10);
	}
	
	public static Image a(Image image, int i, int j){
		int k = image.getWidth(c_java_awt_Component_static_fld);
		int l = image.getHeight(c_java_awt_Component_static_fld);
		int ai[] = new int[k * l];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, k, l, ai, 0, k);
		try{
			pixelgrabber.grabPixels();
		} catch(InterruptedException _ex){
			System.out.println("Error!");
		}
		int ai1[] = new int[i * j];
		for(int i1 = 0; i1 < j; i1++){
			for(int j1 = 0; j1 < i; j1++){
				int k1 = (j1 * k) / i;
				int l1 = (i1 * l) / j;
				ai1[j1 + i1 * i] = ai[k1 + l1 * k];
			}
			
		}
		
		Image image1;
		for(image1 = c_java_awt_Component_static_fld.createImage(new MemoryImageSource(i, j, ai1, 0, i)); !c_java_awt_Component_static_fld.prepareImage(image1, c_java_awt_Component_static_fld);){
		}
		return image1;
	}
	
	public static Image a(Image image){
		int i = image.getWidth(c_java_awt_Component_static_fld);
		int j = image.getHeight(c_java_awt_Component_static_fld);
		int ai[] = new int[i * j];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i, j, ai, 0, i);
		try{
			pixelgrabber.grabPixels();
		} catch(InterruptedException _ex){
			System.out.println("Error!");
		}
		int ai1[] = new int[i * j];
		for(int k = 0; k < j; k++){
			for(int l = 0; l < i; l++){
				ai1[(j - k - 1) + l * j] = ai[l + k * i];
			}
			
		}
		
		Image image1;
		for(image1 = c_java_awt_Component_static_fld.createImage(new MemoryImageSource(j, i, ai1, 0, j)); !c_java_awt_Component_static_fld.prepareImage(image1, c_java_awt_Component_static_fld);){
		}
		return image1;
	}
	
	public static void b(){
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
	}
	
	public static void b(Graphics g1, String s, Font font, int i, int j){
		FontMetrics fontmetrics = c_java_awt_Component_static_fld.getFontMetrics(font);
		fontmetrics.stringWidth(s);
		g1.setFont(font);
		g1.drawString(s, i - fontmetrics.stringWidth(s), j);
	}
	
	public static void a(Graphics g1, String s, Font font, int i, int j){
		FontMetrics fontmetrics = c_java_awt_Component_static_fld.getFontMetrics(font);
		fontmetrics.stringWidth(s);
		g1.setFont(font);
		g1.drawString(s, i - fontmetrics.stringWidth(s) / 2, j + fontmetrics.getHeight() / 4);
	}
	
	public static void a(byte abyte0[], int i, int j){
		abyte0[i] = (byte) (j / 0x1997a0);
		abyte0[i + 1] = (byte) (j / 0x10000);
		abyte0[i + 2] = (byte) (j / 256);
		abyte0[i + 3] = (byte) j;
	}
	
	public static int a(byte abyte0[], int i){
		return (abyte0[i] & 0xff) * 0x1000000 + (abyte0[i + 1] & 0xff) * 0x10000 + (abyte0[i + 2] & 0xff) * 256 + (abyte0[i + 3] & 0xff);
	}
	
	public static int a(String s, byte abyte0[], int i){
		try{
			OutputStream outputstream = f(s);
			outputstream.write(abyte0, 0, i);
			outputstream.close();
		} catch(Exception _ex){
			return -1;
		}
		return 0;
	}
	
	public static int a(String s, byte abyte0[], int i, int j, int k){
		try{
			InputStream inputstream = a(s);
			DataInputStream datainputstream = new DataInputStream(inputstream);
			for(int l = 0; l <= i / 10000; l++){
				datainputstream.readFully(abyte0, l * 10000, 10000);
				int i1 = j + (l * 10000 * (k - j)) / i;
				if(i1 > 100){
					i1 = 100;
				}
				if(k > 0){
					a(i1);
				}
			}
			
			datainputstream.close();
		} catch(IOException _ex){
			return -1;
		}
		return 0;
	}
	
	public static OutputStream g(String s) throws IOException{
		FileOutputStream fileoutputstream = new FileOutputStream(abspath + s, true);
		return fileoutputstream;
	}
	
	public static OutputStream f(String s) throws IOException{
		FileOutputStream fileoutputstream = new FileOutputStream(abspath + s);
		return fileoutputstream;
	}
	
	public static InputStream a(String s) throws IOException{
		Object obj;
		if(app == null){
			obj = new FileInputStream(abspath + s);
		} else {
			URL url = new URL(app.getCodeBase(), s);
			obj = url.openStream();
		}
		return ((InputStream) (obj));
	}
	
	public static Image[] a(String s, int i, int j){
		Image image = c(s);
		int k = image.getWidth(c_java_awt_Component_static_fld);
		int l = image.getHeight(c_java_awt_Component_static_fld);
		int ai[] = new int[k * l];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, k, l, ai, 0, k);
		try{
			pixelgrabber.grabPixels();
		} catch(InterruptedException _ex){
			System.out.println("Error!");
		}
		int i1 = 0;
		int j1 = 0;
		int k1 = (k / i) * (l / j);
		Image aimage[] = new Image[k1];
		for(int l1 = 0; l1 < k1; l1++){
			int i2 = 0;
			int ai1[] = new int[i * j];
			for(int j2 = j1; j2 < j1 + j; j2++){
				for(int k2 = i1; k2 < i1 + i; k2++){
					ai1[i2++] = ai[k2 + j2 * k];
				}
				
			}
			
			for(aimage[l1] = c_java_awt_Component_static_fld.createImage(new MemoryImageSource(i, j, ai1, 0, i)); !c_java_awt_Component_static_fld.prepareImage(aimage[l1], c_java_awt_Component_static_fld);){
			}
			i1 += i;
			if(i1 >= k){
				i1 = 0;
				j1 += j;
			}
		}
		
		return aimage;
	}
	
	public static Image h(String s){
		Image image;
		if(app == null){
			image = Toolkit.getDefaultToolkit().getImage(s);
		} else {
			image = app.getImage(app.getCodeBase(), s);
		}
		return image;
	}
	
	public static Image c(String s){
		Image image;
		if(app == null){
			image = Toolkit.getDefaultToolkit().getImage(s);
		} else {
			image = app.getImage(app.getCodeBase(), s);
		}
		MediaTracker mediatracker = new MediaTracker(c_java_awt_Component_static_fld);
		mediatracker.addImage(image, 0);
		try{
			mediatracker.waitForID(0);
		} catch(InterruptedException _ex){
			System.out.println("Error!");
		}
		if(mediatracker.isErrorID(0)){
			image = null;
		}
		return image;
	}
	
	public static void a(int i, int j, String s){
		hsname = new String[j * 50];
		hsscore = new int[j * 50];
		for(int k = 0; k < j * 50; k++){
			hsname[k] = "";
			hsscore[k] = 0;
		}
		
		try{
			URL url = new URL(s + "?" + i + "+" + j + "+" + (int) (Math.random() * 99999D));
			InputStream inputstream = url.openStream();
			DataInputStream datainputstream = new DataInputStream(inputstream);
			for(int i1 = 0; i1 < j * 50; i1++){
				hsname[i1] = datainputstream.readLine();
				String s1 = datainputstream.readLine();
				hsscore[i1] = Integer.valueOf(s1, 10).intValue();
			}
			
			datainputstream.close();
		} catch(Throwable _ex){
		}
		if(hsname[49] == ""){
			for(int l = 0; l < j * 50; l++){
				hsname[l] = "GamesArena";
				hsscore[l] = 0;
			}
			
		}
	}
	
	public static void a(String s, int i, int j, int k, String s1){
		String s2 = "";
		int l = 0xbc614e;
		for(int i1 = 0; i1 < s.length(); i1++){
			char c1 = s.charAt(i1);
			if(c1 >= '0' && c1 <= '9' || c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z'){
				s2 = s2 + c1;
			} else {
				s2 = s2 + '_';
			}
			if(i1 == 14){
				break;
			}
		}
		
		if(s2 == ""){
			s2 = "Anonymous";
		}
		for(int j1 = 0; j1 < 50; j1++){
			if(i <= hsscore[j1 + j * 50]){
				continue;
			}
			for(int k1 = 49; k1 > j1; k1--){
				hsscore[k1 + j * 50] = hsscore[(k1 + j * 50) - 1];
				hsname[k1 + j * 50] = hsname[(k1 + j * 50) - 1];
			}
			
			hsname[j1 + j * 50] = s2;
			hsscore[j1 + j * 50] = i;
			break;
		}
		
		j += k;
		l = (l + i * 13 + j * 5) % 20000;
		for(int l1 = 0; l1 < s2.length(); l1++){
			l = (l * (l1 + 1) + l1) % 30000;
		}
		
		l = (l * l) % 0x5f5e100;
		try{
			URL url = new URL(s1 + "?" + s2 + "+" + i + "+" + j + "+" + l + "+" + (int) (Math.random() * 99999D));
			InputStream inputstream = url.openStream();
			DataInputStream datainputstream = new DataInputStream(inputstream);
			datainputstream.readLine();
			datainputstream.close();
			return;
		} catch(Throwable _ex){
			return;
		}
	}
	
	public static String fixUserCredential(String s, int maxLength){
		String s1 = "";
		for(int j = 0; j < maxLength; j++){
			if(j >= s.length()){
				s1 = s1 + " ";
			} else {
				char c1 = s.charAt(j);
				if(c1 >= 'a' && c1 <= 'z'){
					s1 = s1 + c1;
				} else if(c1 >= 'A' && c1 <= 'Z'){
					s1 = s1 + c1;
				} else if(c1 >= '0' && c1 <= '9'){
					s1 = s1 + c1;
				} else {
					s1 = s1 + '_';
				}
			}
		}
		
		return s1;
	}
	
	public static void a(Component component, int i, int j, boolean flag){
		c_java_awt_Component_static_fld = component;
		width = i;
		height = j;
		app = flag ? (Applet) component : null;
		g = component.getGraphics();
		f = new Font("TimesRoman", 0, 15);
		e = new Font("Helvetica", 1, 13);
	}
}