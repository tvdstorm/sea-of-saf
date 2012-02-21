package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public abstract class BaseScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	private final BaseFrame baseFrame;
	private final String backgroundFilename;
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
	
	public boolean update() {
		return onUpdate();
	}
	
	public void destroy() {
		onDestroy();
	}
	
	@Override
    public void paintComponent(Graphics g) {
    	if ( backgroundLoaded ) {
    		g.drawImage(backgroundImage, 0, 0, null);
    	}
    	onDraw(g);
    }
	
	protected abstract void onInitialize();
	protected abstract boolean onUpdate();
	protected abstract void onDraw(Graphics g);
	protected abstract void onDestroy();
	protected abstract void handleButtonPress(int buttonId);
	
}
