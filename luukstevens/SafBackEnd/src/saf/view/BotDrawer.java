package saf.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import java.util.HashMap;
import java.util.Map;

import saf.state.Bot;
import saf.variable.IEnums;
import saf.variable.ISettings;

public class BotDrawer implements ISettings, IEnums {

	public final Map<Move, IDrawer> moveDrawers;

	public BotDrawer() {
		
		moveDrawers = new HashMap<Move, IDrawer>();

		moveDrawers.put(Move.CROUCH, new CrouchDrawer());
		moveDrawers.put(Move.JUMP, new JumpDrawer());
		moveDrawers.put(Move.RUN_AWAY, new RunAwayDrawer());
		moveDrawers.put(Move.RUN_TOWARDS, new RunTowardsDrawer());
		moveDrawers.put(Move.STAND, new StandDrawer());
		moveDrawers.put(Move.WALK_AWAY, new WalkAwayDrawer());
		moveDrawers.put(Move.WALK_TOWARDS, new WalkTowardsDrawer());
	}

	public void draw(Graphics g, Bot bot, int baseX, int baseY) throws IOException {
		
		BufferedImage attack = getAttackImage(bot);
		drawMove(g, attack, bot, baseX, baseY);
	}

	private BufferedImage getAttackImage(Bot bot) throws IOException {
		
		String imagePath = SPRITE_FOLDER + bot.getCurrentAttack().getValue();

		if (bot.getPosition().equals(Bot.Position.LEFT)) {
			imagePath += SPRITE_LEFT_SUFFIX;
		}

		imagePath += SPRITE_EXTENSION;
		return ImageIO.read(new File(imagePath));
	}

	private void drawMove(Graphics g, BufferedImage image, Bot bot, int baseX, int baseY) {
		
		Move move = bot.getCurrentMove().getMove();
		IDrawer drawer = moveDrawers.get(move);
		drawer.draw(bot, g, image, baseX, baseY);
	}

	private class CrouchDrawer implements IDrawer {

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			int newHeight = image.getHeight() / 2;
			g.drawImage(image, baseX, baseY + newHeight, image.getWidth(),
					newHeight, null);

		}
	}

	private class JumpDrawer implements IDrawer {

		public static final int DISTANCE = 50;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
			
			g.drawImage(image, baseX, baseY - DISTANCE, null);
		}
	}

	private class RunAwayDrawer implements IDrawer {

		private static final int DISTANCE = 30;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
			
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			}
		}
	}

	private class RunTowardsDrawer implements IDrawer {
		private static final int DISTANCE = 30;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
			
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			}
		}
	}

	private class StandDrawer implements IDrawer {

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
			
			g.drawImage(image, baseX, baseY, null);
		}
	}

	private class WalkAwayDrawer implements IDrawer {
		
		private static final int DISTANCE = 20;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
			
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			}
		}
	}

	private class WalkTowardsDrawer implements IDrawer {

		private static final int DISTANCE = 20;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX, int baseY) {
			
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			}
		}
	}
}
