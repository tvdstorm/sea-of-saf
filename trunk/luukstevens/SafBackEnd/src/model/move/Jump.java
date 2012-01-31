package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Jump extends Move {
	@Override
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY) {
		int newHeight = image.getHeight() / 2;
		g.drawImage(image, baseX, baseY, image.getWidth(), newHeight, null); 
	}
}
