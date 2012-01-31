package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;

import model.Bot;
import model.move.*;

public class Arena extends JPanel {
	
	//Constants
	private static final int X_POSITION = 40;
	private static final int Y_POSITION = 40;
	
	private static final int WIDTH = 400;
	private static final int HIGHT = 300;
	
	private static final int LEFT_BOT_XPOS = 50;
	private static final int LEFT_BOT_YPOS = 50;
	
	private static final int RIGHT_BOT_XPOS = 200;
	private static final int RIGHT_BOT_YPOS = 50;
	
	//Instance variables
	private Bot left;
	private Bot right;
	
	public Arena(Bot left, Bot right) {
		this.left = left;
		this.right = right;
		
		setBounds(X_POSITION, Y_POSITION, WIDTH, HEIGHT);
		setSize(WIDTH, HIGHT);
	}
	
    public void paint(Graphics g) {
    	g.clearRect(X_POSITION, Y_POSITION, WIDTH, HIGHT);
    	drawLeftBot(g, left);
    	drawRightBot(g, right);
    }
	
	public void update() {
		repaint();
	}
    
    private void drawLeftBot(Graphics g, Bot bot) {
    	BufferedImage image = null;
		
    	try {
			image = bot.getCurrentAttack().getImage(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	bot.getCurrentMove().draw(g, image, LEFT_BOT_XPOS, LEFT_BOT_YPOS);
    }
    
    private void drawRightBot(Graphics g, Bot bot) {
    	BufferedImage image = null;
		
    	try {
			image = bot.getCurrentAttack().getImage(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	bot.getCurrentMove().draw(g, image, RIGHT_BOT_XPOS, RIGHT_BOT_YPOS);
    }
}
