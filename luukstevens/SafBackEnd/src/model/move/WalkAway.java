package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class WalkAway extends Move {
private static final int DISTANCE = 20;
	
	@Override
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY, boolean left) {
		if(left) {
			g.drawImage(image, baseX, baseY + DISTANCE, null); 
		} else {
			g.drawImage(image, baseX, baseY - DISTANCE, null); 
		}
	}
}
