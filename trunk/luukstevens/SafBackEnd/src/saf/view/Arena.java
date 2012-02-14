package saf.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import saf.ast.Bot;
import saf.state.BotState;
import saf.variable.ISettings;

@SuppressWarnings("serial")
public class Arena extends JPanel implements ISettings {
	
	private Bot left;
	private BotState leftState;
	private Bot right;
	private BotState rightState;
	private BotDrawer botDrawer;
	private boolean endGame = false;
	
	public Arena(Bot left, BotState leftState, Bot right, BotState rightState) {
		
		this.left = left;
		this.leftState = leftState;
		this.right = right;
		this.rightState = rightState;
	
		botDrawer = new BotDrawer();
		
		setBounds(ARENA_X_POSITION, ARENA_Y_POSITION, ARENA_WIDTH, ARENA_HEIGHT);
		setSize(ARENA_WIDTH, ARENA_HEIGHT);
		setOpaque(false);
	}
	
    public void paint(Graphics g) {
    	
    	if(leftState.getHealth() <= 0 || rightState.getHealth() <= 0) {
    		endGame = true;
    	}
    	
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, ARENA_WIDTH, ARENA_HEIGHT);
    	
    	try {
    		botDrawer.draw(g, leftState, LEFT_BOT_XPOS, LEFT_BOT_YPOS);
    		botDrawer.draw(g, rightState, RIGHT_BOT_XPOS, RIGHT_BOT_YPOS);
		} catch (IOException e) {
			throw new RuntimeException(e);
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
    	
    	if(leftState.getHealth() <= 0) {
    		text += right.getName();
    	}
    	
    	if(rightState.getHealth() <= 0) {
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
