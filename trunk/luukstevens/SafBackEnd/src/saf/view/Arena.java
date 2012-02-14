package saf.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import saf.ast.Bot;
import saf.state.Game;
import saf.variable.ISettings;

public class Arena extends JPanel implements ISettings {
	
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
		
		setBounds(ARENA_X_POSITION, ARENA_Y_POSITION, ARENA_WIDTH, ARENA_HEIGHT);
		setSize(ARENA_WIDTH, ARENA_HEIGHT);
		setOpaque(false);
	}
	
    public void paint(Graphics g) {
    	
    	if(game.getLeftBot().getHealth() <= 0 || game.getRightBot().getHealth() <= 0) {
    		endGame = true;
    	}
    	
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, ARENA_WIDTH, ARENA_HEIGHT);
    	
    	try {
    		botDrawer.draw(g, game.getLeftBot(), LEFT_BOT_XPOS, LEFT_BOT_YPOS);
    		botDrawer.draw(g, game.getRightBot(), RIGHT_BOT_XPOS, RIGHT_BOT_YPOS);
		} catch (IOException e) {
			// Can't add trowsclause so print stacktrace.
			e.printStackTrace();
		}
    	 
    	if(endGame) {
    		addWinsText(g);
    	}
    }
    
	private void addWinsText(Graphics g) {
		
		g.setColor(Color.RED);
    	Font font = new Font("Calibri", Font.BOLD, 35);
    	g.setFont(font);
    	
    	String text = "";
    	
    	if(game.getLeftBot().getHealth() <= 0) {
    		text += right.getName();
    	}
    	
    	if(game.getRightBot().getHealth() <= 0) {
    		text += left.getName();
    	}
    	
    	if(!text.equals("")) {
    		text += " wins!";
    		addCenteredText(g, text, 0, ARENA_WIDTH / 2, ARENA_HEIGHT / 2);
    	}
	}
	
	private void addCenteredText(Graphics g, String s, int width, int XPos, int YPos){  
        
		int stringLength = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();  
        int start = width/2 - stringLength/2;  
        g.drawString(s, start + XPos, YPos);  
	} 
}