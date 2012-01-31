package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class RunTowards extends Move {
	private static final int DISTANCE = 30;
	
	@Override
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void draw(Graphics g, BufferedImage image, int baseX, int baseY, boolean left) {
		if(left) {
			g.drawImage(image, baseX + DISTANCE, baseY, null); 
		} else {
			g.drawImage(image, baseX - DISTANCE, baseY, null); 
		}
	}
}
