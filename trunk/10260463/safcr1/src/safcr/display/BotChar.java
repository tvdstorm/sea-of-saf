package safcr.display;

import java.awt.Image;
import java.awt.MediaTracker;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class BotChar {
	private int x;
	private int y;
	private String currentImage;
	private int speed;
	private String strenghtCondition;
	private int hp = 100;
	private Boolean jumped = false;
	
	private String resourcePath = System.getProperty("user.dir") + "\\resources\\";
	private Map<String,Image> images;
	private String imageExt = ".png";
	private String[] allImages = {	"block_high_left", "block_high_right", "block_low_left",
									"block_low_right", "kick_high_left", "kick_high_right",
									"kick_low_left", "kick_low_right", "punch_high_left",
									"punch_high_right", "punch_low_left", "punch_low_right",
									"stand", "dead" };
	
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
	
	public Map<String,Image> getImages(){
		return images;
	}
	
	public void setImages(Map<String,Image> imgs){
		images = imgs;
	}
	
	public void setCurrentImage(String img){
		currentImage = img;
	}
	
	public String getCurrentImage(){
		return currentImage;
	}
	
	public Image getImage(){
		return images.get(currentImage);
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	
	public void jump(){
		y -= 50;
		jumped = true;
	}
	
	public void fall(){
		y += 50;
		jumped = false;
	}
	
	public void setSpeed(int sp){
		speed = sp;
	}
	
	public void setStrenghtCondition(String sc){
		strenghtCondition = sc;
	}
	
	public String getCondition(){
		return strenghtCondition;
	}
	
	public int getHp(){
		if(hp < 0) return 0;
		return hp;
	}
	
	public void decreaseHp(int d){
		hp -= d;
	}
	
	public Boolean isJumped(){
		return jumped;
	}
	
	public int getSpeed(){
		return speed;
	}
	
}
