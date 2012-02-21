package safcr.display;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class BotChar {
	private int x;
	private int y;
	private String resourcePath = System.getProperty("user.dir") + "\\resources\\";
	private Map<String,Image> images;
	private String imageExt = ".png";
	private String[] allImages = {	"block_high_left", "block_high_right", "block_low_left",
									"block_low_right", "kick_high_left", "kick_high_right",
									"kick_low_left", "kick_low_right", "punch_high_left",
									"punch_high_right", "punch_low_left", "punch_low_right",
									"stand" };
	
	public BotChar(int x, int y){
		images = new HashMap<String,Image>();
		this.x = x;
		this.y = y;
	}
	
	public void loadImages(MediaTracker mt){
		int i = 0;
		for(String s : allImages){
			ImageIcon ic = new ImageIcon(resourcePath + s + imageExt);
			Image img = ic.getImage();
			
			mt.addImage(img,i);

			if(mt.checkID(i)) images.put(s, img);
		}
	}
	
	public Image getImage(String s){
		return images.get(s);
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
}
