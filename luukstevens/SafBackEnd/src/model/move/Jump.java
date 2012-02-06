package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import model.Bot;

public class Jump extends Move {
	public static final int DISTANCE = 50;
	
	@Override
	public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
		g.drawImage(image, baseX, baseY - DISTANCE, null); 
	}
}
