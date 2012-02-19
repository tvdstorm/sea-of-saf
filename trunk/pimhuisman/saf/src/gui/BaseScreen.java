package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public abstract class BaseScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private BaseFrame baseFrame;
	private String backgroundFilename;
	private BufferedImage backgroundImage;
	private Boolean backgroundLoaded;

	public BaseScreen(BaseFrame baseFrame, String backgroundFilename) {
		this.baseFrame = baseFrame;
		this.backgroundFilename = backgroundFilename;
	}
	
	public BaseFrame getBaseFrame() {
		return baseFrame;
	}
	
	public void initialize() {
       try {                
           backgroundImage = ImageIO.read(new File(backgroundFilename));
           backgroundLoaded = true;
        } catch (IOException ex) {
        	backgroundLoaded = false;
        }
       onInitialize();
	}
	
	public void destroy() {
		onDestroy();
	
	}
	
   // @Override
    public void paintComponent(Graphics g) {
    	if ( backgroundLoaded ) {
    		g.drawImage(backgroundImage, 0, 0, null);
    	}
    }
	
	protected abstract void onInitialize();
	protected abstract void onDestroy();
	public abstract void handleButtonPress(int buttonId);
	
}
