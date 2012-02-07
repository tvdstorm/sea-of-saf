package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import enums.Move;

import java.util.HashMap;
import java.util.Map;

import state.Bot;

public class BotDrawer {
	public static final String IMAGE_FOLDER = "data/sprites/";
	public static final String EXTENSION = ".png";
	public static final String LEFT_SUFFIX = "_left";

	public final Map<Move, Drawer> moveDrawers;

	public BotDrawer() {
		moveDrawers = new HashMap<Move, Drawer>();

		moveDrawers.put(Move.CROUCH, new CrouchDrawer());
		moveDrawers.put(Move.JUMP, new JumpDrawer());
		moveDrawers.put(Move.RUN_AWAY, new RunAwayDrawer());
		moveDrawers.put(Move.RUN_TOWARDS, new RunTowardsDrawer());
		moveDrawers.put(Move.STAND, new StandDrawer());
		moveDrawers.put(Move.WALK_AWAY, new WalkAwayDrawer());
		moveDrawers.put(Move.WALK_TOWARDS, new WalkTowardsDrawer());
	}

	public void draw(Graphics g, Bot bot, int baseX, int baseY)
			throws IOException {
		BufferedImage attack = getAttackImage(bot);
		drawMove(g, attack, bot, baseX, baseY);
	}

	public BufferedImage getAttackImage(Bot bot) throws IOException {
		String imagePath = IMAGE_FOLDER + bot.getCurrentAttack().getValue();

		if (bot.getPosition().equals(Bot.Position.LEFT)) {
			imagePath += LEFT_SUFFIX;
		}

		imagePath += EXTENSION;
		return ImageIO.read(new File(imagePath));
	}

	public void drawMove(Graphics g, BufferedImage image, Bot bot, int baseX,
			int baseY) {
		Move move = bot.getCurrentMove().getMove();
		Drawer drawer = moveDrawers.get(move);
		drawer.draw(bot, g, image, baseX, baseY);
	}

	private class CrouchDrawer implements Drawer {

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			int newHeight = image.getHeight() / 2;
			g.drawImage(image, baseX, baseY + newHeight, image.getWidth(),
					newHeight, null);

		}
	}

	private class JumpDrawer implements Drawer {

		public static final int DISTANCE = 50;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			g.drawImage(image, baseX, baseY - DISTANCE, null);

		}
	}

	private class RunAwayDrawer implements Drawer {

		private static final int DISTANCE = 30;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			}

		}
	}

	private class RunTowardsDrawer implements Drawer {
		private static final int DISTANCE = 30;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			}

		}
	}

	private class StandDrawer implements Drawer {

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			g.drawImage(image, baseX, baseY, null);

		}
	}

	private class WalkAwayDrawer implements Drawer {
		private static final int DISTANCE = 20;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX + DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			}

		}
	}

	private class WalkTowardsDrawer implements Drawer {

		private static final int DISTANCE = 20;

		@Override
		public void draw(Bot bot, Graphics g, BufferedImage image, int baseX,
				int baseY) {
			if (bot.getPosition().equals(Bot.Position.LEFT)) {
				g.drawImage(image, baseX - DISTANCE, baseY, null);
			} else {
				g.drawImage(image, baseX + DISTANCE, baseY, null);

			}
		}
	}
}
