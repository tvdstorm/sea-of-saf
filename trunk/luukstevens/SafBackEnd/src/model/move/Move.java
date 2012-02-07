package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import ast.Bot;


public abstract class Move {
	public boolean isMove(Class move) {
		return this.getClass().equals(move);
	}
	
	public abstract void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY);
}
