package saf.game.gui.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameArena extends JPanel {

	private static final String SPRITE_LEFT = "Sprites/Left/";
	private static final String SPRITE_RIGHT = "Sprites/Right/";
	private static final String SPRITES_IDLE = "idle.png";

	private static final String CONST_LEFT = "left";
	private static final String CONST_RIGHT = "right";

	public GameArena() {
		this.setBackground(Color.white);
	}

	BufferedImage leftBot = null;
	BufferedImage rightBot = null;
	
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

	@Override
	public void paint(Graphics g) {
		g.drawImage( leftBot, 0, 0, null);
		g.drawImage( rightBot, 0, 0, null);
	}
}