package saf.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import saf.state.Bot;

public interface IDrawer {
	
	void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY);
}