package safcr.display;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	private BotChar bot;
	private MediaTracker mt;
	Timer timer;
	
	public Board(){
		bot = new BotChar(100,400);
        mt = new MediaTracker(this);
        bot.loadImages(mt);
        
        timer = new Timer(500, this);
        timer.start();
	}
	
	 public void paint(Graphics g) {
	        super.paint(g);

	        Graphics2D g2d = (Graphics2D)g;
	        g2d.drawImage(bot.getImage("stand"), bot.getX(), bot.getY(), this);

	        Toolkit.getDefaultToolkit().sync();
	        
	        g.dispose();
	 }
	 
	 public void executeMove(){
		 bot.move(200, 450);
		 repaint();
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		bot.move(600, 450);
		repaint();
	}
}
