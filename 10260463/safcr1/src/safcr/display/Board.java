package safcr.display;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel{
	private static final long serialVersionUID = 1L;
	private BotChar bot;
	private BotChar bot2;
	private MediaTracker mt;
	private Image bg;
	private String resourcePath = System.getProperty("user.dir") + "\\resources\\";
	Timer timer;
	
	public Board(){
        mt = new MediaTracker(this);
        bg = new ImageIcon(resourcePath + "bg3.gif").getImage();
        createBots();
	}
	
	public void createBots(){
		bot = new BotChar(100,330);
		bot2 = new BotChar(700,330);
		
		bot.loadImages(mt);
		bot.setCurrentImage("stand");
		
		bot2.setImages(bot.getImages());
		bot2.setCurrentImage("stand");
		repaint();
	}
	
	public BotChar getBot1(){
		return bot;
	}
	
	public BotChar getBot2(){
		return bot2;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bg, 0, 0, this.getWidth(), this.getHeight(), this);
		
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.drawImage(bot.getImage(), bot.getX(), bot.getY(), this);
	    
	    g2d.drawImage(bot2.getImage(), bot2.getX(), bot2.getY(), this);

	    Toolkit.getDefaultToolkit().sync();
	        
	    g.dispose();
	}
	 
	public void reloadDisplay(){
		repaint();
	}
}
