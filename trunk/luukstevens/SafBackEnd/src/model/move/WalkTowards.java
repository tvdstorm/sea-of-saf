package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import model.Bot;

public class WalkTowards extends Move {
	private static final int DISTANCE = 20;
	
	@Override
	public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
		if(bot.getPosition().equals(Bot.Position.LEFT)) {
			g.drawImage(image, baseX - DISTANCE, baseY, null); 
		} else {
			g.drawImage(image, baseX + DISTANCE, baseY, null); 
		}
	}
}