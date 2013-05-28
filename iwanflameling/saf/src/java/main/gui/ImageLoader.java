package gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import ast.TypeValues;

public class ImageLoader {
	private static ImageLoader singleton;
	
	private Map<String, Map<String, Image>> images;
	
	private ImageLoader(){
		this.images = loadImages();
	}
	
	private synchronized static void createInstance(){
		if(singleton == null){
			singleton = new ImageLoader();
		}
	}
	
	public static ImageLoader getInstance(){
		if(singleton == null)
			createInstance();
		return singleton;
	}
	
	public Image getImage(String moveAction, String fightAction){
		return images.get(moveAction).get(fightAction);
	}

	private Image loadImage(String path){
		URL url = getClass().getResource(path);
		Image image = Toolkit.getDefaultToolkit().getImage(url);
		return image;
	}
	
	private String constructImagePath(String moveAction, String fightAction){
		moveAction = moveAction.toLowerCase();
		fightAction = fightAction.toLowerCase();
		String filename = moveAction + "-" + fightAction + ".PNG";
		String path = "/" + filename;
		return path;
	}
	
	private String getImagePath(String moveAction, String fightAction){
		if(moveAction.contains("run")){
			moveAction = "run";
		}
		if(moveAction.contains("walk")){
			moveAction = "walk";
		}
		String path = constructImagePath(moveAction, fightAction);
		return path;
	}
	
	private Map<String, Map<String, Image>> loadImages(){
		Map<String, Map<String, Image>> moveFightImages = new HashMap<String, Map<String, Image>>();
		for(String moveAction : TypeValues.MOVES){
			Map<String, Image> fightImages = getFightImages(moveAction);
			moveFightImages.put(moveAction, fightImages);
		}
		return moveFightImages;
	}
	
	private Map<String, Image> getFightImages(String moveAction){
		Map<String, Image> fightImages = new HashMap<String, Image>();
		for(String fightAction : TypeValues.ATTACKS){
			Image image = loadImage(getImagePath(moveAction, fightAction));
			fightImages.put(fightAction, image);
		}
		return fightImages;
	}
	
}
