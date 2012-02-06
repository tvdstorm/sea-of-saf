package saf.game.gui.component;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameArena extends JPanel {

	public GameArena()
	{
		try {
			image = ImageIO.read(new File("Sprites/Light/block_low.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	BufferedImage image;
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawImage(image, 100, 100, null);
	}
}
