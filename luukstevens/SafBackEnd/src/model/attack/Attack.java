package model.attack;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Bot;

public abstract class Attack {
	public static final String IMAGE_FOLDER = "data/sprites/";
	public static final String EXTENSION = ".png";
	public static final String LEFT_SUFFIX = "_left";
	
	public boolean isAttack(Class attack) {
		return this.getClass().equals(attack);
	}
	
	public BufferedImage getImage(Bot bot) throws IOException {
    	String imagePath =  IMAGE_FOLDER + getText();
    	
    	if(bot.getPosition().equals(Bot.Position.LEFT)) {
    		imagePath += LEFT_SUFFIX;
    	}
    	
    	imagePath += EXTENSION;           
    	return ImageIO.read(new File(imagePath));
	}
	
	public abstract String getText();
}
