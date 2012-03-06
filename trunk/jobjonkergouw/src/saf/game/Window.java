package saf.game;

import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import saf.game.EnumTypes.AttackType;
import saf.game.EnumTypes.MoveType;
import saf.game.EnumTypes.Orientation;

public class Window extends JFrame
{
	private static final long serialVersionUID = 1L;

	private Color skyColor = new Color(135, 206, 250);
	private Color grassColor = new Color(50, 205, 50);
	
	private final int WINDOW_WIDTH = 1200;
	private final int WINDOW_HEIGHT = 400;
	private final int GRASS_HEIGHT = 100;
	
	private double scaleFactor = 50;

	// current bot states
	private int bot1X;
	private int bot1Y = WINDOW_HEIGHT - GRASS_HEIGHT - 200;
	private AttackType bot1Attack;
	private MoveType bot1Move;
	private Orientation bot1Orientation;

	private int bot2X;
	private int bot2Y = WINDOW_HEIGHT - GRASS_HEIGHT - 200;
	private AttackType bot2Attack;
	private MoveType bot2Move;
	private Orientation bot2Orientation;	

	public Window(double gameWidth, Bot bot1, Bot bot2)	{
		super("SAF game");
		
		// determine the conversion factor between the game logic and pixels
		scaleFactor = ((double)WINDOW_WIDTH - 160.) / gameWidth;
		
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(300, 300);
	    this.setLocation(500, 250);
	    this.setBounds(30, 30, WINDOW_WIDTH, WINDOW_HEIGHT);
	    this.setBackground(skyColor);
	    this.setResizable ( false );
	    
	    setBotStates(bot1, bot2);
	    
		GameScreen canvas = new GameScreen();
		this.getContentPane().add(canvas);
		this.setVisible(true);
	}
	
	public void setBotStates(Bot bot1, Bot bot2) {
		bot1X = (int)(scaleFactor * bot1.getCurrentPosition());
		if (bot1.isDead()) {
			bot1Y += 120;
		}
		bot1Attack = bot1.getCurrentAttack();
		bot1Move = bot1.getCurrentMove();
		bot1Orientation = bot2.orientationFromOther(bot1);
		
		bot2X = (int)(scaleFactor * bot2.getCurrentPosition());
		if (bot2.isDead()) {
			bot2Y += 120;
		}
		bot2Attack = bot2.getCurrentAttack();
		bot2Move = bot2.getCurrentMove();
		bot2Orientation = bot1.orientationFromOther(bot2);		
	}
	
	public void updateScreen() {
		getContentPane().getComponent(0).repaint();
	}
	
	private class GameScreen extends JComponent {
		
		private static final long serialVersionUID = 2;
	
		public void paint(Graphics g)  {
			g.setColor(grassColor);
			g.fillRect (0, WINDOW_HEIGHT - GRASS_HEIGHT, WINDOW_WIDTH, GRASS_HEIGHT);  

			Image bot1 = loadFighterImage(bot1Attack, bot1Move, bot1Orientation);
			g.drawImage(bot1, bot1X, bot1Y, bot1.getWidth(this), bot1.getHeight(this), this);

			Image bot2 = loadFighterImage(bot2Attack, bot2Move, bot2Orientation);
			g.drawImage(bot2, bot2X, bot2Y, bot2.getWidth(this), bot2.getHeight(this), this);

		}
		
		private Image loadFighterImage(AttackType attackType, MoveType moveType, Orientation orientation) {
			String filePath = "src/saf/pics/";
			
			if (moveType == MoveType.JUMP) {
				filePath += "jump";
			} else if (moveType == MoveType.CROUCH) {
				filePath += "crouch";
			} else if (moveType == MoveType.DEAD) {
				filePath += "dead";
			} else {
				if (attackType == AttackType.IDLE) {
					filePath += "idle";
				} else if (attackType == AttackType.PUNCH_LOW) {
					filePath += "low_punch";
				} else if (attackType == AttackType.PUNCH_HIGH) {
					filePath += "high_punch";
				} else if (attackType == AttackType.KICK_LOW) {
					filePath += "low_punch";
				} else if (attackType == AttackType.KICK_HIGH) {
					filePath += "high_kick";
				} else if (attackType == AttackType.BLOCK_LOW) {
					filePath += "block_low";
				} else if (attackType == AttackType.BLOCK_HIGH) {
					filePath += "block_high";
				} else {
					filePath += "idle";
				}
			}			
			if (orientation == Orientation.RIGHT) {
				filePath += "_right.png";			
			} else {
				filePath += "_left.png";
			}
			
			File sourceFile = new File(filePath);
		    try {
		    	return ImageIO.read(sourceFile);
		    } catch (IOException e) {
		    	java.lang.System.exit(1);
		    	e.printStackTrace();
	           	return null;
		    }
		}
	}
	
	
}

