package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Move {
	
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY) {
		g.drawImage(image, baseX, baseY, null); 
	}
	
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY, boolean left) {
		draw(g, image, baseX, baseY);
	}
}
