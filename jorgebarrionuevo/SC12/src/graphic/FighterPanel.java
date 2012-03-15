package graphic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class FighterPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	
	public FighterPanel() {
	       try {                
	          this.image = ImageIO.read(ArenaConfiguration.relaxed);	
	       } 
	       catch (IOException exception) {
	            
	       }
	    }

	public void SetImage(File file) {
       try {                
          this.image = ImageIO.read(file);
       } 
       catch (IOException exception) {
            
       }
    }
	
	public BufferedImage getImage() { 
	    return this.image;
	}
	
	  public void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, 0, 0, this);
	    System.out.println("paintComponent()");
	  }
	  
}
