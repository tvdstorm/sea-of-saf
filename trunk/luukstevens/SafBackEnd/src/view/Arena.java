package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import state.Game;

import ast.Bot;

public class Arena extends JPanel {
	private static final int X_POSITION = 75;
	private static final int Y_POSITION = 40;
	
	private static final int WIDTH = 450;
	private static final int HIGHT = 250;
	
	private static final int LEFT_BOT_XPOS = 145;
	private static final int LEFT_BOT_YPOS = 75;
	
	private static final int RIGHT_BOT_XPOS = 255;
	private static final int RIGHT_BOT_YPOS = 75;
	
	private Game game;
	private Bot left;
	private Bot right;
	private BotDrawer botDrawer;
	private boolean endGame = false;
	
	public Arena(Game game, Bot left, Bot right) {
		this.game = game;
		this.left = left;
		this.right = right;
	
		botDrawer = new BotDrawer();
		
		setBounds(X_POSITION, Y_POSITION, WIDTH, HEIGHT);
		setSize(WIDTH, HIGHT);
		setOpaque(false);
	}
	
    public void paint(Graphics g) {
    	if(game.getLeftBot().getHealth() <= 0 || game.getRightBot().getHealth() <= 0) {
    		endGame = true;
    	}
    	
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, WIDTH, HIGHT);
    	try {
    		botDrawer.draw(g, game.getLeftBot(), LEFT_BOT_XPOS, LEFT_BOT_YPOS);
    		botDrawer.draw(g, game.getRightBot(), RIGHT_BOT_XPOS, RIGHT_BOT_YPOS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	 
    	if(endGame) {
    		addWinsText(g, game, left, right, WIDTH, HEIGHT);
    	}
    }
    
	private void addWinsText(Graphics g, Game game, Bot left, Bot right, int arenaWith, int arenaHeight) {
		g.setColor(Color.RED);
    	Font font = new Font("Calibri", Font.BOLD, 35);
    	g.setFont(font);
    	
    	if(game.getLeftBot().getHealth() <= 0) {
    		addCenteredText(g, right.getName() + " WINS!", arenaWith, arenaHeight, 130);
    	}
    	
    	if(game.getRightBot().getHealth() <= 0) {
    		addCenteredText(g, left.getName() + " WINS!", arenaWith, arenaHeight, 130);
    	}
	}
	
	private void addCenteredText(Graphics g, String s, int width, int XPos, int YPos){  
        int stringLen = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();  
        int start = width/2 - stringLen/2;  
        g.drawString(s, start + XPos, YPos);  
	} 
}
