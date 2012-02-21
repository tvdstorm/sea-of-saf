package graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import config.settings;

public class Sprite {

	public final int[] stand = { 0, 0, 160, 200 };
	public final int[] crouch = { 160, 0, 160, 200 };
	public final int[] punch_high = { 320, 0, 240, 200 };
	
	public final int[] walk_away = { 0, 200, 160, 200 };
	public final int[] block_high = { 160, 200, 160, 200 };
	public final int[] punch_low = { 320, 200, 240, 200 };
	
	public final int[] walk_towards = { 0, 400, 160, 200 };
	public final int[] block_low = { 160, 400, 160, 200 };
	public final int[] kick_high = { 320, 400, 240, 200 };

	public final int[] jump = { 0, 600, 160, 200 };
	public final int[] kick_low = { 320, 600, 240, 200 };
	
	private final String image_url = "sprites/fighter.png";
	
	private BufferedImage bi;
	
	public Sprite() {
		URL imageSrc = null;
	     
		try {
			imageSrc = ((new File(image_url)).toURI()).toURL();
			bi = ImageIO.read(imageSrc);
		} catch (MalformedURLException e) {
			System.err.println("Wrong url");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Image could not be read");
			System.exit(1);
		}
	}
	
	public int[] getSprite(String move) {
		if (move.equals(settings.BLOCK_LOW)) return this.block_low;
		if (move.equals(settings.BLOCK_HIGH)) return this.block_high;
		if (move.equals(settings.PUNCH_LOW)) return this.punch_low;
		if (move.equals(settings.PUNCH_HIGH)) return this.punch_high;
		if (move.equals(settings.KICK_LOW)) return this.kick_low;
		if (move.equals(settings.KICK_HIGH)) return this.kick_high;
		
		return this.stand;
	}
	
	public BufferedImage getImage() {
		return this.bi;
	}
}
