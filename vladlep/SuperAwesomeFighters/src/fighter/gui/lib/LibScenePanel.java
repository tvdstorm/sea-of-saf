package fighter.gui.lib;

import javax.swing.JPanel;

import fighter.algorithm.FighterDescription;

public class LibScenePanel extends JPanel {

	private final int leftRotationAngle = 0;
	private final int rightRotationAngle = 90;
	private FighterDescription leftFighter;
	private FighterDescription rightFighter;

	public LibScenePanel(FighterDescription leftFighter,
			FighterDescription rightFighter) {
		this.leftFighter = leftFighter;
		this.rightFighter = rightFighter;
	}

	public void draw() {

		StdDraw.setCanvasSize(800, 500);

		StdDraw.picture(
				10,
				10,
				"D:/vlad/serios/master/Software Construction/java_code/SuperAwesomeFighters/pics/block_high.png",
				leftRotationAngle);
	}

	public static void main(String[] args) {
		// StdDraw.setCanvasSize(800, 500);

		StdDraw.picture(
				10,
				10,
				"D:/vlad/serios/master/Software Construction/java_code/SuperAwesomeFighters/pics/block_high.png",
				0);
	}
}
