package fighter.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import fighter.algorithm.BattleConstants;
import fighter.algorithm.FighterState;
import fighter.gui.images.FightImagesContainer;

@SuppressWarnings("serial")
public class ScenePanel extends JPanel {

	private final int leftRotationX = 0;
	private final int rightRotateAngle = 90;
	private FighterState leftFighter;
	private FighterState rightFighter;

	public ScenePanel(FighterState leftFighter, FighterState rightFighter) {
		setBackground(Color.RED);
		this.leftFighter = leftFighter;
		this.rightFighter = rightFighter;
		setSize(ArenaConstants.ARENA_WIDTH, ArenaConstants.ARENA_HEIGHT);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		drawFigter(g2, leftFighter, leftRotationX);
		drawFigter(g2, rightFighter, rightRotateAngle);
	}

	private void drawFigter(Graphics2D g2, FighterState figterState,
			int rotateAngle) {
		BufferedImage image;
		image = FightImagesContainer.getImage(
				figterState.getSelectedFightAction(), rotateAngle);

		int positionX, positionY;
		positionX = figterState.getPositionX();
		positionX = mapCoordinateX(positionX,image.getWidth());
		positionY = figterState.getPositionY();
		positionY = mapCoordinateY(positionY);

		g2.drawImage(image, positionX - image.getWidth() / 2,
				positionY - image.getHeight() / 2, null);
	}

	private int mapCoordinateX(int battlePositionX, int pictureWidht) {
		int panelPosition;
		panelPosition = (int) (battlePositionX * (double) ((ArenaConstants.ARENA_WIDTH - pictureWidht/2)/ BattleConstants.arenaLength));

		return panelPosition;
	}

	private int mapCoordinateY(int battlePositionY) {
		int panelPosition;
		panelPosition = ((ArenaConstants.ARENA_HEIGHT / BattleConstants.arenaHeight) * (BattleConstants.arenaHeight - battlePositionY));
		return panelPosition;
	}

}
