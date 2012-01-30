package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Bot;

public class Arena extends JPanel {
	private static final int WIDTH = 400;
	private static final int HIGHT = 300;
	
	private static final int LEFT_BOT_XPOS = 50;
	private static final int LEFT_BOT_YPOS = 50;
	
	private static final int RIGHT_BOT_XPOS = 200;
	private static final int RIGHT_BOT_YPOS = 50;
	
	private Bot left;
	private Bot right;
	
	private Graphics g;
	
	public Arena(Bot left, Bot right) {
		this.left = left;
		this.right = right;
		
		setSize(WIDTH, HIGHT);
	}
	
	public void update() {
		if(g != null) {
			g.clearRect(0, 0, WIDTH, HIGHT);
			drawLeftBot(g, left);
	    	drawRightBot(g, right);
		    repaint();
		}
	}

    public void paint(Graphics g) {
    	this.g = g;
    	drawLeftBot(g, left);
    	drawRightBot(g, right);
    }
    
    private void drawLeftBot(Graphics g, Bot bot) {
    	BufferedImage image;
    	String imagePath = "data/sprites/" + bot.getCurrentAttack().getText() + "_left.png";

    	try {                
    		image = ImageIO.read(new File(imagePath));
    		g.drawImage(image, LEFT_BOT_XPOS, LEFT_BOT_YPOS, null);
    	} catch (IOException ex) {
    		//TODO: Handle exception.
    		System.out.println("Image not found!");
    	}  
    }
    
    private void drawRightBot(Graphics g, Bot bot) {
    	BufferedImage image;
    	String imagePath = "data/sprites/" + bot.getCurrentAttack().getText() + ".png";

    	try {                
    		image = ImageIO.read(new File(imagePath));
    		g.drawImage(image, RIGHT_BOT_XPOS, RIGHT_BOT_YPOS, null);
    	} catch (IOException ex) {
    		//TODO: Handle exception.
    		System.out.println("Image not found!");
    	}  
    }
}
