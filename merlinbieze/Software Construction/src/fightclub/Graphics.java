package saf.fightclub;

import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.ImageIcon;

public class Graphics implements Configuration {

	private final Dictionary<String, ImageIcon> imageMap;
	private final ClassLoader loader;

	public Graphics() {
		this.imageMap = new Hashtable<String, ImageIcon>();
		this.loader = Thread.currentThread().getContextClassLoader();
		cacheVisualisations();
	}

	private void cacheVisualisations() {
		cacheImage("A_block_high_2");
		cacheImage("A_block_high");
		cacheImage("A_block_low_2");
		cacheImage("A_block_low");
		cacheImage("A_crouch");
		cacheImage("A_defeated");
		cacheImage("A_jump_2");
		cacheImage("A_jump");
		cacheImage("A_kick_high_2");
		cacheImage("A_kick_high");
		cacheImage("A_kick_low_2");
		cacheImage("A_kick_low");
		cacheImage("A_punch_high_2");
		cacheImage("A_punch_high");
		cacheImage("A_punch_low_2");
		cacheImage("A_punch_low");
		cacheImage("A_run_away_2");
		cacheImage("A_run_away");
		cacheImage("A_run_towards_2");
		cacheImage("A_run_towards");
		cacheImage("A_stand");
		cacheImage("A_walk_away_2");
		cacheImage("A_walk_away");
		cacheImage("A_walk_towards_2");
		cacheImage("A_walk_towards");

		cacheImage("B_block_high_2");
		cacheImage("B_block_high");
		cacheImage("B_block_low_2");
		cacheImage("B_block_low");
		cacheImage("B_crouch");
		cacheImage("B_defeated");
		cacheImage("B_jump_2");
		cacheImage("B_jump");
		cacheImage("B_kick_high_2");
		cacheImage("B_kick_high");
		cacheImage("B_kick_low_2");
		cacheImage("B_kick_low");
		cacheImage("B_punch_high_2");
		cacheImage("B_punch_high");
		cacheImage("B_punch_low_2");
		cacheImage("B_punch_low");
		cacheImage("B_run_away_2");
		cacheImage("B_run_away");
		cacheImage("B_run_towards_2");
		cacheImage("B_run_towards");
		cacheImage("B_stand");
		cacheImage("B_walk_away_2");
		cacheImage("B_walk_away");
		cacheImage("B_walk_towards_2");
		cacheImage("B_walk_towards");
	}

	private void cacheImage(String imageName) {
		this.imageMap.put(imageName, loadImage(imageName + ".png"));
	}

	private ImageIcon loadImage(String imageName) {
		ImageIcon image = null;
		try {
			String location = "saf/simulation/graphics/";
			URL uri = this.loader.getResource(location + imageName);
			image = new ImageIcon(uri);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return image;
	}

	public ImageIcon getPicture(String actionType) {
		ImageIcon image = null;
		try {
			image = imageMap.get(actionType);
		} catch (Exception e) {
		}
		return image;
	}
}