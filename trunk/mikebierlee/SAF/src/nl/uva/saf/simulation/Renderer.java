package nl.uva.saf.simulation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ConcurrentModificationException;

import javax.swing.JComponent;

/**
 * Default renderer implementation for super awesome fighters. Expects two
 * contestants on the field, will not draw more.
 * 
 * @author Mike Bierlee
 * 
 */
public class Renderer implements IRenderer {
	private volatile JComponent surface = null;
	private final int fps;
	private final IFightSimulator simulator;
	private Image titleScreenImage;
	private boolean doTheBlackOne = true;
	private volatile boolean stopRunning;
	
	private final Thread renderThread;

	/**
	 * Creates a new render thread which is tasked to updating the appointed
	 * render surface. Without this the surface would only be updated when
	 * requested by Swing.
	 * 
	 * @param surface
	 *            Reference to surface that has to be updated.
	 * @param fps
	 *            Rate at which the surface has to be updated in frames per
	 *            second. Set to zero or lower to update unrestricted.
	 */
	public Renderer(IFightSimulator simulator, int fps) {
		this.fps = fps;
		this.simulator = simulator;
		titleScreenImage = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/Title.png"));
		
		renderThread = new Thread(this);
		renderThread.setName("Render Thread");
	}

	@Override
	public void run() {
		while (!stopRunning) {
			if (fps > 0) {
				try {
					Thread.sleep(1000 / fps);
				} catch (InterruptedException e) {
					return;
				}
			}

			if (Thread.interrupted()) {
				return;
			}

			if (surface != null) {
				surface.repaint();
			} else {
				return;
			}
		}
	}

	/**
	 * Binds a component to this renderer, allowing it to render on it. You can
	 * only bind when the renderer is not active.
	 * 
	 * @param surface
	 *            Render surface to bind.
	 */
	public void BindRenderSurface(JComponent surface)
			throws ConcurrentModificationException {
		if (renderThread.isAlive()) {
			throw new ConcurrentModificationException();
		}

		this.surface = surface;
	}

	@Override
	public void draw(Graphics g) {
		if (simulator == null || !simulator.isFightInProgress()) {
			g.setColor(doTheBlackOne ? Color.black : Color.yellow);
			g.drawImage(titleScreenImage, 0, 0, null);
			g.fillOval(50, 50, 100, 100);
			doTheBlackOne = !doTheBlackOne;
		}
	}

	@Override
	public void start() {
		stopRunning = false;
		renderThread.start();
	}

	@Override
	public void stop() {
		stopRunning = true;
		renderThread.interrupt();
	}

	@Override
	public void UnbindRenderSurface() {
		surface = null;
	}

	@Override
	public void join() throws InterruptedException {
		renderThread.join();		
	}
}
