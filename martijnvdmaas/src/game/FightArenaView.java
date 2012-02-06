package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class FightArenaView extends JPanel implements Observer {

	private String leftAttack;
	private String rightAttack;
	private final String imagePath = "C:\\Users\\martijn.van.der.maas\\workspace\\SAF-Martijn\\images\\";

	public FightArenaView(FightEngine fightEngine) {
		setPreferredSize(new Dimension(400, 300));
		setBackground(Color.WHITE);

		fightEngine.addObserver(this);
		System.out.println(" nu ");

		leftAttack 		= fightEngine.getLeftCurrentAttack();
		rightAttack 	= fightEngine.getRightCurrentAttack();
	}

	public Image loadImage(File f) {
		Image image = getToolkit().getImage(f.getPath());
		return image;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image leftFighterImage = loadImage(new File(imagePath + leftAttack + " - left.png"));
		Image rightFighterImage = loadImage(new File(imagePath + rightAttack + ".png"));
		
		g.drawRect(-10, -10, 600,500);
		if (leftFighterImage != null) 	g.drawImage(leftFighterImage, 125, 75, this);
		if (rightFighterImage != null) 	g.drawImage(rightFighterImage, 350, 75, this);
	}

	@Override
	public void update(Observable fightEngine, Object arg1) {
		FightEngine fightEngineObserverable = (FightEngine) fightEngine;

		leftAttack = fightEngineObserverable.getLeftCurrentAttack();
		rightAttack = fightEngineObserverable.getRightCurrentAttack();

		repaint();
	}
}
