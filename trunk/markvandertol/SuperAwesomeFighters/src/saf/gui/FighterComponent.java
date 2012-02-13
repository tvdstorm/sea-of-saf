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
import saf.Stance;
import saf.ast.FightAction;

public class FighterComponent extends JComponent {
	private final int playerIndex;
	private final Arena arena;
	
	private final int width = 250;
	private final int height = 300;
	
	private final boolean mirrorImage;
	
	public FighterComponent(Arena arena, int playerIndex, boolean mirrorImage) {
		this.playerIndex = playerIndex;
		this.arena = arena;
		this.mirrorImage = mirrorImage;
		
		setPreferredSize(new Dimension(width, height));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D graphics = (Graphics2D)g;
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, width, height);
		
		Fighter player = arena.getFighter(playerIndex);
		if (player == null)
			return;
		
		paintStickMan(graphics, player.getLastFightAction());
		
		boolean near = player.getSpeed() > arena.getDistanceBetweenPlayers();
		String move = (player.getLastMoveAction() != null) ? player.getLastMoveAction().toString() : "";
		paintStats(graphics, player.getName(), move, player.getHealth(), near, player.hasWonRound(), player.getStance());
	}
	
	private void paintStats(Graphics2D g, String name, String move, int health, boolean near, boolean winner, Stance stance) {
		g.setColor(Color.darkGray);
		Font font = new Font("Arial", Font.PLAIN, 14);
		g.setFont(font);
		g.drawString(name, 0, 25);
		g.drawString(health + "/100", 0, 50);
		
		if (Stance.jumping.equals(stance))
			g.drawString("Jumping", 0, 75);
		if (Stance.crouching.equals(stance))
			g.drawString("Crouching", 0, 75);
			
		
		if (near)
			g.drawString("Near", 0, 275);
		else
			g.drawString("Far", 0, 275);
		
		FontMetrics fm = getFontMetrics(font);
		g.drawString(move, 250 - fm.stringWidth(move), 275);
		
		if (winner) {
			Font winnerFont = new Font("Arial", Font.BOLD, 56);
			g.setFont(winnerFont);
			g.setColor(Color.green);
			FontMetrics fm2 = getFontMetrics(winnerFont);
			final String winnerText= "Winner!";
			int xpos = getWidth() / 2 - fm2.stringWidth(winnerText) / 2;
			g.drawString(winnerText, xpos , 175);
		}
	}


	
	private void paintStickMan(Graphics2D g, FightAction state) {
		int center = getSize().width / 2;
		final int offsetTop = 10;
		
		final int headSize = 75;
		final int bodyLength = 125;
		final int bodyYOffset = offsetTop + headSize;
		final int armWidth = (mirrorImage) ? -40 : 40;
		final int armYOffset = offsetTop + headSize + 30;
		final int legWidth = (mirrorImage) ? -35 : 35;
		final int legHeight = 35;
		final int legYOffset =  offsetTop + headSize + bodyLength;
		
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(3.0f));		
		
		//Draw head:
		g.drawOval(center - (headSize / 2), offsetTop, headSize, headSize);
		
		//Draw body:
		g.drawLine(center, bodyYOffset, center, bodyYOffset + bodyLength);
		
		//Draw arms:
		int armDiag = 0;
		if (FightAction.punch_high.equals(state))
			armDiag = -15;
		if (FightAction.punch_low.equals(state))
			armDiag = 15;
		g.drawLine(center, armYOffset, center - armWidth, armYOffset - armDiag);
			
		if (FightAction.block_high.equals(state))
			g.setColor(Color.orange);
		if (FightAction.punch_high.equals(state) || FightAction.punch_low.equals(state))
			g.setColor(Color.red);
		
		g.drawLine(center, armYOffset, center + armWidth, armYOffset + armDiag);	
		
		g.setColor(Color.black);
		
		//Draw legs:
		g.drawLine(center, legYOffset, center - legWidth, legYOffset + legHeight);
		
		boolean legHigh = FightAction.block_low.equals(state) || FightAction.kick_high.equals(state);
		
		if (FightAction.block_low.equals(state))
			g.setColor(Color.orange);
		if (FightAction.kick_high.equals(state) || FightAction.kick_low.equals(state))
			g.setColor(Color.red);
		g.drawLine(center, legYOffset, center + legWidth, legYOffset + ((legHigh) ? -legHeight /2 : legHeight));
	}
}
