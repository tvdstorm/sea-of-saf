package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import logic.FighterState;

public class FighterImage {
	
	private FighterState state;
	private BufferedImage image;
	
	public FighterImage(FighterState state, String filename) {
		this.state = state;
		try {                
           	image = ImageIO.read(new File(filename));
        } catch (IOException ex) {
        	image = null;
        }
	}
	
	public FighterState getState() {
		return state;
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
}
