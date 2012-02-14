package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import ast.Saf;

public class GamePanel extends JPanel implements ActionListener {

	private static int PLAYER_WIDTH = 85, PLAYER_HEIGHT = 150;
	
	private Timer timer;
	private Saf p1, p2;
	private SafState p1state, p2state;
	private HealthPanel healthPanel;
	private JButton button;

    public GamePanel(Saf p1, Saf p2) {
    	this.p1 = p1; 
    	this.p2 = p2; 
		this.p1state = new SafState(SafState.PlayerType.P1, p1);
		this.p2state = new SafState(SafState.PlayerType.P2, p2);
		
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        
        healthPanel = new HealthPanel(p1.getName(), p2.getName());
        add(healthPanel);
        
        button = new JButton("pause");
        button.addActionListener(this);
        add(button);

        timer = new Timer(20, this);
        timer.start();
    }


    public void paint(Graphics g) {
        super.paint(g);

        paintSaf(g, p1state);
        paintSaf(g, p2state);
        
        g.dispose();
    }


    private void paintSaf(Graphics g, SafState state) {
    	URL url;
    	switch (state.getPlayerType()) {
    		case P1:
    			url = ClassLoader.getSystemResource("white.png");
    			break;
    		case P2:
    			url = ClassLoader.getSystemResource("grey.png");
    			break;
			default:
				url = ClassLoader.getSystemResource("white.png");
				break;
    	}
    	
    	
		BufferedImage bimage = null;
		try {
			bimage = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
		Graphics2D g2d = (Graphics2D) g;
		ImageObserver im = null;
		
		int y = getHeight();
		int x = state.getPosition() * getWidth() / SafState.ARENA_SIZE;
		switch (state.getPosture()) {
			case JUMPING:
				y = getHeight() - PLAYER_HEIGHT;
		}
		
		// determine offset in image, all three postures are after each other
		int offsetX = state.getPostureOrdinal() * 6 * PLAYER_WIDTH;
		// determine offset in image, all 6 attacks are after each other
		offsetX += state.getActionOrdinal() * PLAYER_WIDTH;

		// top row is player facing right
		int offsetY = 0;
		switch (state.getDirection()) {
			case LEFT:
				// bottom row is player facing left
				offsetY = PLAYER_HEIGHT;
		}
		
		g2d.drawImage(bimage, 
				// set position
				x, y - PLAYER_HEIGHT,	x + PLAYER_WIDTH, y, 
				// set image from sprite
				offsetX, offsetY, offsetX + PLAYER_WIDTH, offsetY + PLAYER_HEIGHT
		,	im);
        Toolkit.getDefaultToolkit().sync();
		
	}

    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			if (button.getText() == "pause") {
				timer.stop();
				button.setText("play");
			} else if (button.getText() == "play") {
				timer.start();
				button.setText("pause");
			} else if (button.getText() == "replay") {
				this.p1state = new SafState(SafState.PlayerType.P1, p1);
				this.p2state = new SafState(SafState.PlayerType.P2, p2);
				healthPanel.updateHealth(p1state.getHealth(), p2state.getHealth());
				
				timer.start();
				
			}
		} else if (e.getSource() == timer) {
			p1state.nextStep(p2state);
			p2state.nextStep(p1state);
			healthPanel.updateHealth(p1state.getHealth(), p2state.getHealth());
			
		    repaint();
		    
		    if (!p1state.isAlive() || !p2state.isAlive()) {
				timer.stop();
				button.setText("replay");
		    }
		}
    }
}