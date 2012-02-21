package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private Image img;
    private int x=20,y=20;
    private static String stage = "src/com/mike/SAF/Resources/Sprites/stage.png";
    private static String healthBox = "src/com/mike/SAF/Resources/Sprites/healthBox.png";
    private JLabel p1Avatar;
    private JLabel p2Avatar;
    private int count=0;
    private JLabel p1Health;
    private JLabel p1Percentage;
    private JLabel p1Name;
    private JLabel p2Health;
    private JLabel p2Percentage;
    private JLabel p2Name;
    private JLabel healthBackground;
    private boolean gameEnded;
    private String winner;
    
    public Board() {
    	gameEnded = false;
    	this.img = new ImageIcon(stage).getImage(); 
        setFocusable(true);
        setBackground(Color.BLACK);
        setSize(600,300);
        setDoubleBuffered(true);
        setLayout(null);
        timer = new Timer(50, this);
        timer.start();
    	p1Avatar = new JLabel();
    	p1Avatar.setLocation(50, 100);
    	p1Avatar.setBounds(0,160,120,116);
        p2Avatar = new JLabel();
        p2Avatar.setBounds(440, 160, 120, 116);
//        player2.setLocation(50, 100);
//        add(player1);
        p1Health = new JLabel();
//        p1HealthP.setForeground(Color.BLACK);
        p1Health.setBounds(50,20,200,20);
        p1Health.setIcon(new ImageIcon(healthBox));
        p1Percentage = new JLabel("100%");
        p1Percentage.setBounds(200,40,50,20);
        p2Health = new JLabel();
        p2Health.setIcon(new ImageIcon(healthBox));
        p2Health.setBounds(400,20,200,20);
        p2Percentage = new JLabel("100%");
        p2Percentage.setBounds(420,40,50,20);
        add(p1Avatar);
        add(p1Health);
        add(p1Percentage);
        add(p2Avatar);
        add(p2Health);
        add(p2Percentage);
    }
    
    public JLabel getP1Avatar() {
		return p1Avatar;
	}
    
    public JLabel getP1Health() {
		return p1Health;
	}
    
    public JLabel getP2Health() {
		return p2Health;
	}
    
    public JLabel getP2Avatar() {
		return p2Avatar;
	}
    
    public void setP1Name(String name) {
        p1Name = new JLabel(name);
        p1Name.setForeground(Color.green);
        p1Name.setBounds(50,0,200,20);
        add(p1Name);
	}
    
    public void updateHealth(int player,int amount){
    	Rectangle r = new Rectangle();
    	if(player==1)
    		r = p1Health.getBounds();
    	else
    		r = p2Health.getBounds();
    	int previousHealth = r.width;
    	int newHealth = previousHealth-amount;
    	if(newHealth<=0){
    		gameEnded = true;
    		if(player==1)
    			winner = p2Name.getText();
    		else
    			winner = p1Name.getText();
    	}
    	
    	r.width = newHealth;
    	if(player==1){
        	p1Percentage.setText(Integer.toString(r.width/2)+"%");
        	p1Health.setBounds(r);	
    	}
    	else{
    		p2Percentage.setText(Integer.toString(r.width/2)+"%");
    		p2Health.setBounds(r);
    	}
    		
    }
    
    public boolean getGameEnded() {
		return this.gameEnded;
	}
    
    public String getWinner() {
		return winner;
	}
    
    public void updateP2Health(int amount){
    	Rectangle r = p2Health.getBounds();
    	int previousHealth = r.width;
    	int newHealth = previousHealth-amount;
    	r.width = newHealth;
    }
    
    public void setP2Name(String name) {
        p2Name = new JLabel(name);
        p2Name.setBounds(550,0,200,20);
        p2Name.setForeground(Color.YELLOW);
        p2Name.setBounds(550,0,200,20);
        add(p2Name);
	}
    
    

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
      }
    
    public void actionPerformed(ActionEvent e) {
    
//    	if(count/10==1)
//    		repaint();
//    	
//    	count++;
//        x += 10;
//
//        if (y > 240) {
//            y = -45;
//            x = -45;
//        }
//    	repaint();
    }
    public void update( Graphics g ) {

        // draw the background of your animation

        // use graphics to draw the animation

        g.drawImage(img, 0, 0, this);
    }

    

}
