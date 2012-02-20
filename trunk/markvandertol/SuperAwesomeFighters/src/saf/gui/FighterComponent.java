package saf.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import saf.Arena;
import saf.Fighter;
import saf.ast.FightAction;
import saf.ast.Stance;

public class FighterComponent extends JComponent {
	private static final String FONT_FACE = "Arial";
	private static final Font GAME_RESULT_FONT = new Font(FONT_FACE, Font.BOLD, 56);
	private static final Font DEFAULT_FONT = new Font(FONT_FACE, Font.PLAIN, 14);
	
	private static final String TEXT_PLAYER_STANCE_CROUCHING = "Crouching";
	private static final String TEXT_PLAYER_STANCE_JUMPING = "Jumping";
	private static final String TEXT_PLAYER_WON = "Winner!";
	private static final String TEXT_PLAYER_FAR = "Far";
	private static final String TEXT_PLAYER_NEAR = "Near";
	
	private static final BasicStroke STROKE_STICKMAN = new BasicStroke(3.0f);
	
	private static final Color COLOR_STICKMAN_ATTACK = Color.red;
	private static final Color COLOR_STICKMAN_BLOCK = Color.orange;
	private static final Color COLOR_STICKMAN = Color.black;
	private static final Color COLOR_WINTEXT = Color.green;
	private static final Color COLOR_HUD_TEXT = Color.darkGray;
	private static final Color COLOR_BACKGROUND = Color.white;
		
	private static final int HEAD_DIAMETER = 75;
	private static final int BODY_HEIGHT = 125;
	private static final int ARM_WIDTH = 40;
	private static final int LEG_WIDTH =  35;
	private static final int LEG_HEIGHT = 35;
	
	private static final int Y_OFFSET_TOP = 10;
	private static final int Y_OFFSET_BODY = Y_OFFSET_TOP + HEAD_DIAMETER;
	private static final int Y_OFFSET_ARM = Y_OFFSET_TOP + HEAD_DIAMETER + 30;
	private static final int Y_OFFSET_LEG =  Y_OFFSET_TOP + HEAD_DIAMETER + BODY_HEIGHT;
	private static final int Y_OFFSET_PUNCH = 15;
	
	private static final int COMPONENT_WIDTH = 250;
	private static final int COMPONENT_HEIGHT = 300;
	
	private final int playerIndex;
	private final Arena arena;
	private final boolean mirrorImage;
	
	public FighterComponent(Arena arena, int playerIndex, boolean mirrorImage) {
		this.playerIndex = playerIndex;
		this.arena = arena;
		this.mirrorImage = mirrorImage;
		
		setPreferredSize(new Dimension(COMPONENT_WIDTH, COMPONENT_HEIGHT));
	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		Graphics2D g = (Graphics2D)graphics;
		g.setColor(COLOR_BACKGROUND);
		g.fillRect(0, 0, COMPONENT_WIDTH, COMPONENT_HEIGHT);
		
		Fighter player = arena.getFighterOfPlayer(playerIndex);
		if (player == null)
			return;
		
		paintStickMan(g, player.getLastFightAction());
		paintHud(g, player, arena);
	}
	
	private int getStringWidth(Graphics2D g, String str) {
		FontMetrics fm = getFontMetrics(g.getFont());
		return fm.stringWidth(str);
	}
	
	private void paintHud(Graphics2D g, Fighter player, Arena arena) {
		g.setColor(COLOR_HUD_TEXT);
		g.setFont(DEFAULT_FONT);
		
		g.drawString(player.getName(), 0, 25);
		g.drawString(player.getHealth() + "/100", 0, 50);
		
		paintHudStance(g, player);				
		paintHudDistance(g, player, arena);		
		paintHudLastMoveAction(g, player);		
		paintHudRoundWon(g, player);
	}

	private void paintHudStance(Graphics2D g, Fighter player) {
		if (Stance.jumping.equals(player.getStance()))
			g.drawString(TEXT_PLAYER_STANCE_JUMPING, 0, 75);
		if (Stance.crouching.equals(player.getStance()))
			g.drawString(TEXT_PLAYER_STANCE_CROUCHING, 0, 75);
	}

	private void paintHudRoundWon(Graphics2D g, Fighter player) {
		if (player.hasWonRound()) {
			g.setFont(GAME_RESULT_FONT);
			g.setColor(COLOR_WINTEXT);


			int xpos = getWidth() / 2 - getStringWidth(g, TEXT_PLAYER_WON) / 2;
			g.drawString(TEXT_PLAYER_WON, xpos , 175);
		}
	}

	private void paintHudLastMoveAction(Graphics2D g, Fighter player) {
		String lastMove = (player.getLastMoveAction() != null) ? player.getLastMoveAction().toString() : "";
		g.drawString(lastMove , 250 - getStringWidth(g, lastMove) - 25, 275);
	}

	private void paintHudDistance(Graphics2D g, Fighter player, Arena arena) {
		boolean near = player.getSpeed() > arena.getDistanceBetweenPlayers();
		
		if (near)
			g.drawString(TEXT_PLAYER_NEAR, 0, 275);
		else
			g.drawString(TEXT_PLAYER_FAR, 0, 275);
	}

	private int getTransformedWidth(int width) {
		return (mirrorImage) ? -width : width;
	}

	
	private void paintStickMan(Graphics2D g, FightAction state) {
		int centerXOffset = getSize().width / 2;		
		
		g.setColor(COLOR_STICKMAN);
		g.setStroke(STROKE_STICKMAN);		
		
		paintHead(g, centerXOffset);
		paintBody(g, centerXOffset);
		paintArms(g, centerXOffset, state);
		paintLegs(g, centerXOffset, state);
	}

	private void paintLegs(Graphics2D g, int centerXOffset, FightAction state) {
		Color restoreColor = g.getColor();
		g.drawLine(centerXOffset, Y_OFFSET_LEG, centerXOffset - getTransformedWidth(LEG_WIDTH), Y_OFFSET_LEG + LEG_HEIGHT);
		
		boolean legHigh = FightAction.block_low.equals(state) || FightAction.kick_high.equals(state);
		
		if (state != null) {
			if (state.isBlock())
				g.setColor(COLOR_STICKMAN_BLOCK);
			if (state.isKick())
				g.setColor(COLOR_STICKMAN_ATTACK);
		}
		g.drawLine(centerXOffset, Y_OFFSET_LEG, centerXOffset + getTransformedWidth(LEG_WIDTH), Y_OFFSET_LEG + ((legHigh) ? -LEG_HEIGHT /2 : LEG_HEIGHT));
		g.setColor(restoreColor);
	}

	private void paintHead(Graphics2D g, int centerXOffset) {
		g.drawOval(centerXOffset - (HEAD_DIAMETER / 2), Y_OFFSET_TOP, HEAD_DIAMETER, HEAD_DIAMETER);
	}

	private void paintBody(Graphics2D g, int centerXOffset) {
		g.drawLine(centerXOffset, Y_OFFSET_BODY, centerXOffset, Y_OFFSET_BODY + BODY_HEIGHT);
	}

	private void paintArms(Graphics2D g, int centerXOffset, FightAction state) {
		Color restoreColor = g.getColor();
		
		int armDiag = 0;
		if (state != null && state.isPunch()) {
			if (state.isHigh())
				armDiag = -Y_OFFSET_PUNCH;
			else
				armDiag = Y_OFFSET_PUNCH;
		}
		g.drawLine(centerXOffset, Y_OFFSET_ARM, centerXOffset - getTransformedWidth(ARM_WIDTH), Y_OFFSET_ARM - armDiag);
			
		if (state != null) {
			if (state.isBlock() && state.isHigh())
				g.setColor(COLOR_STICKMAN_BLOCK);
			if (state.isPunch())
				g.setColor(COLOR_STICKMAN_ATTACK);
		}
		
		g.drawLine(centerXOffset, Y_OFFSET_ARM, centerXOffset + getTransformedWidth(ARM_WIDTH), Y_OFFSET_ARM + armDiag);	
		
		g.setColor(restoreColor);
	}
}
