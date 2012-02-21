package fighter.algorithm;

import javax.swing.JPanel;

public class ScenePanel extends JPanel {

	private FighterDescription leftFighter;
	private FighterDescription rightFighter;

	public ScenePanel(FighterDescription leftFighter,
			FighterDescription rightFighter) {
		this.leftFighter = leftFighter;
		this.rightFighter = rightFighter;
	}

//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		Graphics2D g2 = (Graphics2D) g;
//		BufferedImage img; 
//		img = FightImagesContainer.getImage(leftFighter.getFighterState().getSelectedFightAction());
//		g2.drawImage(img, leftFighter.getFighterState().getPositionX(), leftFighter.getFighterState().getPositionY(), null);
//		
//	}
}
