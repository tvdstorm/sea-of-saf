package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import ast.Bot;


public class Crouch extends Move {
	
	@Override
	public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
		int newHeight = image.getHeight() / 2;
		g.drawImage(image, baseX, baseY + newHeight, image.getWidth(), newHeight, null); 
	}
}
