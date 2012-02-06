package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Bot;
import model.move.*;

public class Arena extends JPanel {
	
	//Constants
	private static final int X_POSITION = 75;
	private static final int Y_POSITION = 40;
	
	private static final int WIDTH = 450;
	private static final int HIGHT = 250;
	
	private static final int LEFT_BOT_XPOS = 145;
	private static final int LEFT_BOT_YPOS = 75;
	
	private static final int RIGHT_BOT_XPOS = 255;
	private static final int RIGHT_BOT_YPOS = 75;
	
	//Instance variables
	private Bot left;
	private Bot right;
	private boolean endGame = false;
	
	public Arena(Bot left, Bot right) {
		this.left = left;
		this.right = right;
		
		setBounds(X_POSITION, Y_POSITION, WIDTH, HEIGHT);
		setSize(WIDTH, HIGHT);
		setOpaque(false);
	}
	
    public void paint(Graphics g) {
    	if(left.getHealth() <= 0 || right.getHealth() <= 0) {
    		endGame = true;
    	}
    	
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, WIDTH, HIGHT);
    	drawLeftBot(g, left);
    	drawRightBot(g, right);
    	 
    	if(endGame) {
    		addWinsText(g, left, right, WIDTH, HEIGHT);
    	}
    }
    
	public void update() {
		repaint();
	}
    
	private void addWinsText(Graphics g, Bot left, Bot right, int arenaWith, int arenaHeight) {
		g.setColor(Color.RED);
    	Font font = new Font("Calibri", Font.BOLD, 35);
    	g.setFont(font);
    	
    	if(left.getHealth() <= 0) {
    		addCenteredString(g, right.getName() + " WINS!", arenaWith, arenaHeight, 130);
    	}
    	
    	if(right.getHealth() <= 0) {
    		addCenteredString(g, left.getName() + " WINS!", arenaWith, arenaHeight, 130);
    	}
	}
	
	private void addCenteredString(Graphics g, String s, int width, int XPos, int YPos){  
        int stringLen = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();  
        int start = width/2 - stringLen/2;  
        g.drawString(s, start + XPos, YPos);  
	} 
	
    private void drawLeftBot(Graphics g, Bot bot) {
    	BufferedImage image = null;
		
    	try {
			image = bot.getCurrentAttack().getImage(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	bot.getCurrentMove().draw(g, image, LEFT_BOT_XPOS, LEFT_BOT_YPOS, true);
    }
    
    private void drawRightBot(Graphics g, Bot bot) {
    	BufferedImage image = null;
		
    	try {
			image = bot.getCurrentAttack().getImage(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	bot.getCurrentMove().draw(g, image, RIGHT_BOT_XPOS, RIGHT_BOT_YPOS, false);
    }
}
