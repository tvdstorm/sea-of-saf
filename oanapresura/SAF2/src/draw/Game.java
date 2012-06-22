package draw;

import game.GameState;

import java.awt.Color;

public class Game implements Runnable {

	private Thread runner = null;
	private GameState gs;

	public Game(GameState gs) {
		this.gs = gs;
	}

	private void init() {

		StdDraw.setCanvasSize(800, 450);
		StdDraw.setXscale(0, 100);
		StdDraw.setYscale(0, 100);
	}

	public void start() {

		// user visits the page, create a new thread

		if (runner == null) {

			runner = new Thread(this);
			runner.start();
		}
	}

	@SuppressWarnings("deprecation")
	public void stop() {

		// user leaves the page, stop the thread

		if (runner != null && runner.isAlive())
			runner.stop();

		runner = null;
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */

	public void run() {

		init();
		draw();

		while (runner != null) {

			gs.makeGameUpdate();
			draw();

			try {

				Thread.sleep(100);

			} catch (InterruptedException e) {

				// do nothing
			}
		}
	}

	private void drawFighterLeft() {
		StdDraw.picture(gs.getFighter1().getPosition(), 30, gs.getFighter1()
				.getCurrentPic());
	}

	private void drawFighterRight() {
		StdDraw.picture(gs.getFighter2().getPosition(), 30, gs.getFighter2()
				.getCurrentPic());

	}

	private void drawBackground() {
		StdDraw.picture(50, 50, "pics/eco_background.png");
	}

	private void drawHealth() {
		StdDraw.setFont(StdDraw.getHealthFont());
		StdDraw.setPenColor(Color.DARK_GRAY);
		StdDraw.text(50, 100, gs.getFighter1().getName() + ": "
				+ gs.getFighter1().getHealth() + "    "
				+ gs.getFighter2().getName() + ": "
				+ gs.getFighter2().getHealth());
	}

	public void draw() {

		drawBackground();
		drawFighterLeft();
		drawFighterRight();
		drawHealth();
		if (!((gs.getFighter1().getHealth() > 0) && (gs.getFighter2()
				.getHealth() > 0))) {
			StdDraw.setFont(StdDraw.getDefaultFont());
			StdDraw.setPenColor(Color.YELLOW);
			if (gs.getFighter1().getHealth() > 0) {
				StdDraw.text(50, 60, "Left side wins!");
			} else {
				StdDraw.text(50, 60, "Right side wins!");
			}
			System.out.println("*****GAME OVER*****");
			runner = null;
		}
		StdDraw.show(800);

	}

}
