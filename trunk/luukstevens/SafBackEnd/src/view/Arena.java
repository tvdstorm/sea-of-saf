package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Bot;
import model.enums.MoveType;

public class Arena extends JPanel {
	
	//Constants
	private static final int WIDTH = 400;
	private static final int HIGHT = 300;
	
	private static final int LEFT_BOT_XPOS = 50;
	private static final int LEFT_BOT_YPOS = 50;
	
	private static final int RIGHT_BOT_XPOS = 200;
	private static final int RIGHT_BOT_YPOS = 50;
	
	//Instance variables
	private Bot left;
	private Bot right;
	private Graphics g;
	
	public Arena(Bot left, Bot right) {
		this.left = left;
		this.right = right;
		
		setSize(WIDTH, HIGHT);
	}
	
    public void paint(Graphics g) {
    	this.g = g;
    	drawLeftBot(g, left);
    	drawRightBot(g, right);
    }
	
	public void update() {
		if(g != null) {
			g.clearRect(0, 0, WIDTH, HIGHT);
			drawLeftBot(g, left);
	    	drawRightBot(g, right);
		    repaint();
		}
	}
    
    private void drawLeftBot(Graphics g, Bot bot) {
    	BufferedImage image = null;
		
    	try {
			image = bot.getCurrentAttack().getImage(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	g.drawImage(image, LEFT_BOT_XPOS, LEFT_BOT_YPOS, null); 
    }
    
    private void drawRightBot(Graphics g, Bot bot) {
    	BufferedImage image = null;
		
    	try {
			image = bot.getCurrentAttack().getImage(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	g.drawImage(image, RIGHT_BOT_XPOS, RIGHT_BOT_YPOS, null); 
    }
}
