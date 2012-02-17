package nl.uva.saf.simulation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

import javax.swing.JComponent;

import nl.uva.saf.fdl.types.FightActionType;

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
	private Image blueFighter, blueIdleFeet, blueLowKickFeet, blueHighKickFeet;
	private Image redFighter, redIdleFeet, redLowKickFeet, redHighKickFeet;
	private volatile boolean stopRunning;
	
	private Color healthBarColor;

	private volatile Dimension drawArea;

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
		healthBarColor = new Color(0, 210, 0);
		
		this.fps = fps;
		this.simulator = simulator;

		loadContent();

		renderThread = new Thread(this);
		renderThread.setName("Renderer");
	}

	private void loadContent() {		
		titleScreenImage = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/Title.png"));

		blueFighter = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlue.png"));
		redFighter = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRed.png"));
		
		blueIdleFeet = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueNoKick.png"));
		redIdleFeet = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedNoKick.png"));
		
		blueLowKickFeet = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueLowKick.png"));
		redLowKickFeet = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedLowKick.png"));
		
		blueHighKickFeet = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueHighKick.png"));
		redHighKickFeet = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedHighKick.png"));
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
	@Override
	public void bindRenderSurface(JComponent surface)
			throws ConcurrentModificationException {
		if (renderThread.isAlive()) {
			throw new ConcurrentModificationException();
		}

		this.surface = surface;

		drawArea = this.surface.getSize();
	}

	@Override
	public void updateDrawArea() {
		if (surface != null) {
			surface.getSize(drawArea);
		}
	}

	@Override
	public void draw(Graphics g) {
		if (simulator == null || !simulator.isRunning()) {
			g.drawImage(titleScreenImage, 0, 0, null);
		} else if (simulator != null && simulator.isRunning()) {
			drawBackground(g);

			List<FighterBot> fighters = simulator.getContestants();

			if (fighters.size() == 2) {
				drawBattle(g, fighters);
			}
		}
	}

	private void drawBattle(Graphics g, List<FighterBot> fighters) {
		int currentPlayer = 1;
		for (FighterBot fighter : fighters) {
			drawName(g, currentPlayer, fighter);
			drawHealthbar(g, currentPlayer, fighter);
			drawFighter(g, currentPlayer, fighter);

			currentPlayer++;
		}
	}

	private void drawFighter(Graphics g, int currentPlayer, FighterBot fighter) {
		Vector2d drawPosition = new Vector2d(fighter.getPosition());
		drawPosition.substract(fighter.getOrigin());

		ArrayList<Image> playerTextures = new ArrayList<Image>(3);

		Vector2d playfieldOffset = new Vector2d(
				(drawArea.getWidth() - simulator.getPlayFieldSize().width) / 2,
				75);
		drawPosition.add(playfieldOffset);

		playerTextures.add(currentPlayer == 1 ? blueFighter : redFighter);

		if (fighter.isCrouching()) {
			drawPosition.y += 20;
		}

		if (fighter.isJumping()) {
			drawPosition.y -= 20;
		}

		Image feetTexture = chooseFeetTexture(currentPlayer, fighter);
		playerTextures.add(feetTexture);

		for (Image texture : playerTextures) {
			g.drawImage(texture, (int) drawPosition.x, (int) drawPosition.y,
					null);
		}
	}

	private Image chooseFeetTexture(int currentPlayer, FighterBot fighter) {
		Image feetTexture;
		FightActionType playerFightAction = fighter.getFightAction();
		switch (playerFightAction) {
		case kick_low:
			feetTexture = currentPlayer == 1 ? blueLowKickFeet : redLowKickFeet;
			break;
		case kick_high:
			feetTexture = currentPlayer == 1 ? blueHighKickFeet
					: redHighKickFeet;
			break;
		default:
			feetTexture = currentPlayer == 1 ? blueIdleFeet : redIdleFeet;
			break;
		}
		
		return feetTexture;
	}

	private void drawHealthbar(Graphics g, int currentPlayer, FighterBot fighter) {
		int playerHealth = fighter.getHealth();
		int xPosition = currentPlayer == 1 ? 30 : 600;
		g.setColor(Color.gray);
		g.fillRect(xPosition, 35, 200, 20);

		g.setColor(healthBarColor);
		int barWidth = (int) (((double) playerHealth / 100) * 200);
		g.fillRect(xPosition, 35, barWidth, 20);
	}

	private void drawName(Graphics g, int currentPlayer, FighterBot fighter) {
		String name = fighter.getName();

		switch (currentPlayer) {
		case 1:
			g.setColor(Color.blue);
			g.drawString(name, 30, 30);
			break;
		case 2:
			g.setColor(Color.red);
			g.drawString(name, 600, 30);
		}
	}

	private void drawBackground(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, drawArea.width, drawArea.height);
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
	public void unbindRenderSurface() {
		surface = null;
	}

	@Override
	public void join() throws InterruptedException {
		renderThread.join();
	}
	
	@Override
	public JComponent getSurface() {
		return surface;
	}
}
