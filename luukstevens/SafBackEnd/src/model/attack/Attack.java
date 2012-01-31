package model.attack;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Attack {
	public static final String imageFolder = "data/sprites/";
	
	public BufferedImage getImage(boolean left) throws IOException {
		BufferedImage image;
    	String imagePath =  imageFolder + getText();
    	
    	if(left) {
    		imagePath += "_left";
    	}
    	
    	imagePath += ".png";           
    	return ImageIO.read(new File(imagePath));
	}
	
	public abstract String getText();
}
