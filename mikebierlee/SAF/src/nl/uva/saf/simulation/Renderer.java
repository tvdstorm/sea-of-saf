/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
	private Image blueFighter, blueIdleFeet, blueLowKickFeet, blueHighKickFeet, blueIdleHands, blueLowPunchHands,
			blueHighPunchHands, blueBlockLowHands, blueBlockHighHands;
	private volatile Dimension drawArea;
	private final int fps;
	private Color healthBarColor;
	private Image redFighter, redIdleFeet, redLowKickFeet, redHighKickFeet, redIdleHands, redLowPunchHands,
			redHighPunchHands, redBlockLowHands, redBlockHighHands;
	private Thread renderThread;
	private final IFightSimulator simulator;

	private volatile boolean stopRunning;

	private volatile JComponent surface = null;

	private Image titleScreenImage;

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
	}

	/**
	 * Binds a component to this renderer, allowing it to render on it. You can
	 * only bind when the renderer is not active.
	 * 
	 * @param surface
	 *            Render surface to bind.
	 */
	@Override
	public void bindRenderSurface(JComponent surface) throws ConcurrentModificationException {
		if (renderThread != null && renderThread.isAlive()) {
			throw new ConcurrentModificationException();
		}

		this.surface = surface;

		drawArea = this.surface.getSize();
	}

	private void chooseTextures(int currentPlayer, FighterBot fighter, List<Image> playerTextures) {
		Image feetTexture, handsTexture;
		FightActionType playerFightAction = fighter.getFightAction();

		switch (playerFightAction) {
		case kick_low:
			feetTexture = currentPlayer == 1 ? blueLowKickFeet : redLowKickFeet;
			break;
		case kick_high:
			feetTexture = currentPlayer == 1 ? blueHighKickFeet : redHighKickFeet;
			break;
		default:
			feetTexture = currentPlayer == 1 ? blueIdleFeet : redIdleFeet;
			break;
		}

		switch (playerFightAction) {
		case punch_low:
			handsTexture = currentPlayer == 1 ? blueLowPunchHands : redLowPunchHands;
			break;
		case punch_high:
			handsTexture = currentPlayer == 1 ? blueHighPunchHands : redHighPunchHands;
			break;
		case block_low:
			handsTexture = currentPlayer == 1 ? blueBlockLowHands : redBlockLowHands;
			break;
		case block_high:
			handsTexture = currentPlayer == 1 ? blueBlockHighHands : redBlockHighHands;
			break;
		default:
			handsTexture = currentPlayer == 1 ? blueIdleHands : redIdleHands;
			break;
		}

		playerTextures.add(feetTexture);
		playerTextures.add(handsTexture);
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

	private void drawBackground(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, drawArea.width, drawArea.height);
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

		Vector2d playfieldOffset = new Vector2d((drawArea.getWidth() - simulator.getPlayFieldSize().width) / 2, 75);
		drawPosition.add(playfieldOffset);

		playerTextures.add(currentPlayer == 1 ? blueFighter : redFighter);

		if (fighter.isCrouching()) {
			drawPosition.y += 20;
		}

		if (fighter.isJumping()) {
			drawPosition.y -= 20;
		}

		chooseTextures(currentPlayer, fighter, playerTextures);

		for (Image texture : playerTextures) {
			g.drawImage(texture, (int) drawPosition.x, (int) drawPosition.y, null);
		}
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

	@Override
	public JComponent getSurface() {
		return surface;
	}

	@Override
	public void join() throws InterruptedException {
		if (renderThread != null) {
			renderThread.join();
		}
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

		blueIdleHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueNoPunch.png"));
		redIdleHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedNoPunch.png"));

		blueLowPunchHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueLowPunch.png"));
		redLowPunchHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedLowPunch.png"));

		blueHighPunchHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueHighPunch.png"));
		redHighPunchHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedHighPunch.png"));

		blueBlockLowHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueBlockLow.png"));
		redBlockLowHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedBlockLow.png"));

		blueBlockHighHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterBlueBlockHigh.png"));
		redBlockHighHands = Toolkit.getDefaultToolkit().createImage(
				Renderer.class.getResource("/nl/uva/saf/data/FighterRedBlockHigh.png"));
	}

	@Override
	public void redraw() {
		if (surface != null) {
			surface.repaint();
		}
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

	@Override
	public void start(boolean threaded) {
		stopRunning = false;

		if (threaded) {
			if (renderThread == null) {
				renderThread = new Thread(this);
				renderThread.setName("Renderer");
			}

			renderThread.start();
		}
	}

	@Override
	public void stop() {
		stopRunning = true;

		if (renderThread != null) {
			renderThread.interrupt();
		}

		renderThread = null;
	}

	@Override
	public void unbindRenderSurface() {
		surface = null;
	}

	@Override
	public void updateDrawArea() {
		if (surface != null) {
			surface.getSize(drawArea);
		}
	}
}
