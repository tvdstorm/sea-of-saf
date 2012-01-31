package model.enums;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public enum MoveType {
	JUMP("jump"), CROUCH("crouch"), STAND("stand"), RUN_TOWARDS("run_towards"), RUN_AWAY(
			"run_away"), WALK_TOWARDS("walk_towards"), WALK_AWAY("walk_away");

	private String text;

	MoveType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public static void draw(Graphics g, BufferedImage image, MoveType type,
			int xBase, int yBase) {
		switch (type) {
		case JUMP:
			drawJump(g, image, yBase, yBase);
			break;
		case CROUCH:
			drawCrouch(g, image, xBase, yBase);
			break;
		case STAND:
			drawStand(g, image, xBase, yBase);
			break;
		case RUN_TOWARDS:
			drawRunTowards(g, image, xBase, yBase);
			break;
		case RUN_AWAY:
			drawRunAway(g, image, xBase, yBase);
			break;
		case WALK_TOWARDS:
			drawRunTowards(g, image, xBase, yBase);
			break;
		case WALK_AWAY:
			drawWalkAway(g, image, yBase, yBase);
			break;
		default:
			drawStand(g, image, xBase, yBase);
		}
	}

	private static void drawJump(Graphics g, BufferedImage image, int xBase,
			int yBase) {
		g.drawImage(image, xBase, yBase, image.getWidth(),
				image.getHeight() / 2, null);
	}

	private static void drawCrouch(Graphics g, BufferedImage image, int xBase,
			int yBase) {
		g.drawImage(image, xBase, yBase + (image.getHeight() / 2),
				image.getWidth(), image.getHeight() / 2, null);
	}

	private static void drawStand(Graphics g, BufferedImage image, int xBase,
			int yBase) {
		g.drawImage(image, xBase, yBase, null);
	}

	private static void drawRunTowards(Graphics g, BufferedImage image, int xBase,
			int yBase) {

	}

	private static void drawRunAway(Graphics g, BufferedImage image, int xBase,
			int yBase) {

	}

	private static void drawWalkTowards(Graphics g, BufferedImage image, int xBase,
			int yBase) {

	}

	private static void drawWalkAway(Graphics g, BufferedImage image, int xBase,
			int yBase) {

	}
}
