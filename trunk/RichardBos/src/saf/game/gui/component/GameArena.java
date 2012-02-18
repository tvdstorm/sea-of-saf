package saf.game.gui.component;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import saf.game.GameConstant;

@SuppressWarnings("serial")
public class GameArena extends JPanel implements GameConstant {
	
	public GameArena() {
		this.backGround = loadSprite(SPRITE_BACKGROUND);
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(backGround, 0, -80, null);
		g.drawImage(leftBot, leftBotPosition.x, leftBotPosition.y, null);
		g.drawImage(rightBot, rightBotPosition.x, rightBotPosition.y, null);
	}

	private BufferedImage backGround = null;
	private BufferedImage leftBot = null;
	private BufferedImage rightBot = null;

	private Point leftBotPosition = CONST_LEFTBOTSTART;
	private Point rightBotPosition = CONST_RIGHTBOTSTART;

	public void createNewBot(String side) {
		if (side.equals(CONST_LEFT))
			leftBot = loadSprite(SPRITE_LEFT + SPRITES_IDLE);
		else
			rightBot = loadSprite(SPRITE_RIGHT + SPRITES_IDLE);
		this.repaint();
	}

	public void updateBot(String side, Point dPosition, String fightAction)
	{
		if(side.equals(CONST_LEFT))
		{	
			leftBotPosition.translate(dPosition.x, -dPosition.y);
			leftBot = loadSprite(SPRITE_LEFT + fightAction + ".png");
		}
		else
		{
			//Reverse the dPosition for Right bot 
			rightBotPosition.translate(-dPosition.x, -dPosition.y);
			rightBot = loadSprite(SPRITE_RIGHT + fightAction + ".png");
		}
		this.repaint();
	}

	private BufferedImage loadSprite(String pathSprite) {
		File input = new File(pathSprite);
		BufferedImage sprite = null;
		try {
			sprite = ImageIO.read(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sprite;
	}

	public void resetGame() {
		
		Point a = new Point(100, 80);
		Point b = new Point(450, 80);
		leftBotPosition = a;
		rightBotPosition = b;
		
// TODO	Dit werkt niet?!?!?!
//		leftBotPosition = CONST_LEFTBOTSTART;
//		rightBotPosition = CONST_RIGHTBOTSTART;
		leftBot = null;
		rightBot = null;
		this.repaint();
	}

}