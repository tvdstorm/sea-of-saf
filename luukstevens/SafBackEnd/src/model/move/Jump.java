package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Jump extends Move {
	public static final int DISTANCE = 50;
	
	@Override
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY) {
		g.drawImage(image, baseX, baseY - DISTANCE, null); 
	}
}
