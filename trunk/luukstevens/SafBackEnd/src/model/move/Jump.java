package model.move;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import ast.Bot;


public class Jump extends Move {
	public static final int DISTANCE = 50;
	
//	
//	Map<String, IDrawMove> moveDrawers;
//	
//	static {
//		moveDrawers.put("jump", new AbstractDrawMove(bot) {
//			@Override
//			public void draw(Graphics g, BufferedImage image, int baseX, int baseY) {
//				g.drawImage(image, baseX, baseY - DISTANCE, null); 
//			}
//		})
//	}
//	
//	movedrawer.get(move).draw(bot, g, load(attack), baseX, baseY);
	
	@Override
	public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
		g.drawImage(image, baseX, baseY - DISTANCE, null); 
	}
}
