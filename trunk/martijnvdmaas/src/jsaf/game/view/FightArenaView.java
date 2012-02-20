package jsaf.game.view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import jsaf.game.FightEngine;

public class FightArenaView extends JPanel implements Observer {

	private String leftAttack;
	private String rightAttack;
	private int fighterDistance;
	private final String imagePath = "C:\\Users\\martijn.van.der.maas\\workspace\\SAF-Martijn\\images\\";

	public FightArenaView(FightEngine fightEngine) {
		setPreferredSize(new Dimension(400, 300));
		setBackground(Color.WHITE);

		fightEngine.addObserver(this);
		fighterDistance = fightEngine.getDistance();

		leftAttack 		= fightEngine.getLeftCurrentAttack();
		rightAttack 	= fightEngine.getRightCurrentAttack();
	}

	private Image loadImage(File f) {
		Image image = getToolkit().getImage(f.getPath());
		return image;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image leftFighterImage 	= loadImage(new File(imagePath + leftAttack + "_left.png"));
		Image rightFighterImage = loadImage(new File(imagePath + rightAttack + "_right.png"));
		
		g = clearGraphic(g);
		
		g.drawImage(loadImage(new File(imagePath + "arena.jpg")), 0, 0, this);
		System.out.println(fighterDistance);
		if (leftFighterImage != null) 	g.drawImage(leftFighterImage, 135 + (fighterDistance * 8) , 100, this);
		if (rightFighterImage != null) 	g.drawImage(rightFighterImage, 280 - (fighterDistance * 8) , 100, this);
	}

	private Graphics clearGraphic(Graphics g) {
		g.drawRect(-10, -10, 600,500);
		return g;
	}

	@Override
	public void update(Observable fightEngine, Object arg1) {
		FightEngine fightEngineObserverable = (FightEngine) fightEngine;
		
		fighterDistance = fightEngineObserverable.getDistance();

		leftAttack = fightEngineObserverable.getLeftCurrentAttack();
		rightAttack = fightEngineObserverable.getRightCurrentAttack();

		repaint();
	}
}
