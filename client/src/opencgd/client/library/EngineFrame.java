package opencgd.client.library;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;

public class EngineFrame extends Frame {
	
	private static final long serialVersionUID = -5103227993732234369L;
	private EngineApplet f;
	private int c;
	private int b;
	private int d;
	private int a;
	
	@Override
	public final void paint(Graphics g){
		f.paint(g);
	}
	
	//FIXME Deprecation
	@SuppressWarnings("deprecation")
	@Override
	public boolean handleEvent(Event event){
		if(event.id == 401){
			f.keyDown(event, event.key);
		} else if(event.id == 402){
			f.keyUp(event, event.key);
		} else if(event.id == 501){
			f.mouseDown(event, event.x, event.y - 24);
		} else if(event.id == 506){
			f.mouseDrag(event, event.x, event.y - 24);
		} else if(event.id == 502){
			f.mouseUp(event, event.x, event.y - 24);
		} else if(event.id == 503){
			f.mouseMove(event, event.x, event.y - 24);
		} else if(event.id == 201){
			f.destroy();
		} else if(event.id == 1001){
			f.action(event, event.target);
		} else if(event.id == 403){
			f.keyDown(event, event.key);
		} else if(event.id == 404){
			f.keyUp(event, event.key);
		}
		return true;
	}
	
	public int b(){
		return getSize().height - c;
	}
	
	public int a(){
		return getSize().width;
	}
	
	@Override
	public void setSize(int i, int j){
		super.setSize(i, j + c);
	}
	
	@Override
	public Graphics getGraphics(){
		Graphics g = super.getGraphics();
		if(b == 0){
			g.translate(0, 24);
		} else {
			g.translate(-5, 0);
		}
		return g;
	}
	
	public EngineFrame(EngineApplet h1, int i, int j, String s, boolean flag, boolean flag1){
		c = flag1 ? 48 : 28;
		a = i;
		d = j;
		f = h1;
		setTitle(s);
		setResizable(flag);
		setVisible(true);
		toFront();
		setSize(a, d);
	}
}