package nl.uva.saf.simulation;

import java.awt.Graphics;
import java.util.ConcurrentModificationException;

import javax.swing.JComponent;

public interface IRenderer extends Runnable {
	public void draw(Graphics g);
	public void BindRenderSurface(JComponent surface) throws ConcurrentModificationException;
	public void UnbindRenderSurface();
	public void start();
	public void stop();
	public void join()  throws InterruptedException;
}
