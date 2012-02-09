package saf.game.gui.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameArena extends JPanel {

	private static final String SPRITE_LEFT = "Sprites/Left/";
	private static final String SPRITE_RIGHT = "Sprites/Right/";
	private static final String SPRITES_IDLE = "idle.png";
	private static final String SPRITES_BLOCK_HIGH = "block_high.png";

	private static final String CONST_LEFT = "left";
	private static final String CONST_RIGHT = "right";

	private static final Point CONST_LEFTBOTSTART = new Point(50, 80);
	private static final Point CONST_RIGHTBOTSTART = new Point(500, 80);
	
	public GameArena() {
		this.setBackground(Color.white);
		
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage( leftBot, leftBotPosition.x ,leftBotPosition.y, null);
		g.drawImage( rightBot, rightBotPosition.x, rightBotPosition.y, null);
	}
	
	BufferedImage leftBot = null;
	BufferedImage rightBot = null;
	
	private Point leftBotPosition = CONST_LEFTBOTSTART;
	private Point rightBotPosition = CONST_RIGHTBOTSTART;
	
	public void createNewBot(String side) {
		if (side.equals(CONST_LEFT))
			leftBot = loadSprite(SPRITE_LEFT + SPRITES_IDLE);
		else
			rightBot = loadSprite(SPRITE_RIGHT + SPRITES_IDLE);
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
	
}