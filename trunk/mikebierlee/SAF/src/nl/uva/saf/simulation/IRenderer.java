package nl.uva.saf.simulation;

import java.awt.Graphics;
import java.util.ConcurrentModificationException;

import javax.swing.JComponent;

public interface IRenderer extends Runnable {
	public void draw(Graphics g);

	public void bindRenderSurface(JComponent surface)
			throws ConcurrentModificationException;

	public void unbindRenderSurface();

	public void start();

	public void stop();

	public void join() throws InterruptedException;

	public void updateDrawArea();

	public JComponent getSurface();
}
