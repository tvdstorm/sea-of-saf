package saf.fightclub;

import java.io.InputStream;
import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import saf.ast.action.Action;
import saf.simulation.Fighter;

public class Graphics implements Configuration {
	
	private final Dictionary<String, ImageIcon> imageMap;
	private final ClassLoader loader;
	private ImageIcon kickLow;

	public Graphics() {
		this.imageMap =  new Hashtable<String, ImageIcon>();
		this.loader = Thread.currentThread().getContextClassLoader();
		cacheVisualisations();
	}

	private void cacheVisualisations() {
		imageMap.put("A_block_high", loadImage("A_block_high.png"));
		imageMap.put("A_block_low", loadImage("A_block_low.png"));
		imageMap.put("A_crouch", loadImage("A_crouch.png"));
		imageMap.put("A_defeated", loadImage("A_defeated.png"));
		imageMap.put("A_jump", loadImage("A_jump.png"));
		imageMap.put("A_kick_high", loadImage("A_kick_high.png"));
		imageMap.put("A_kick_low", loadImage("A_kick_low.png"));
		imageMap.put("A_punch_high", loadImage("A_punch_high.png"));
		imageMap.put("A_punch_low", loadImage("A_punch_low.png"));
		imageMap.put("A_run_towards", loadImage("A_run.png"));
		imageMap.put("A_run_away", loadImage("A_run.png"));
		imageMap.put("A_stand", loadImage("A_stand.png"));
		imageMap.put("A_walk_towards", loadImage("A_walk.png"));
		imageMap.put("A_walk_away", loadImage("A_walk.png"));
		
		imageMap.put("B_block_high", loadImage("B_block_high.png"));
		imageMap.put("B_block_low", loadImage("B_block_low.png"));
		imageMap.put("B_crouch", loadImage("B_crouch.png"));
		imageMap.put("B_defeated", loadImage("B_defeated.png"));
		imageMap.put("B_jump", loadImage("B_jump.png"));
		imageMap.put("B_kick_high", loadImage("B_kick_high.png"));
		imageMap.put("B_kick_low", loadImage("B_kick_low.png"));
		imageMap.put("B_punch_high", loadImage("B_punch_high.png"));
		imageMap.put("B_punch_low", loadImage("B_punch_low.png"));
		imageMap.put("B_run_towards", loadImage("B_run.png"));
		imageMap.put("B_run_away", loadImage("B_run.png"));
		imageMap.put("B_stand", loadImage("B_stand.png"));
		imageMap.put("B_walk_towards", loadImage("B_walk.png"));
		imageMap.put("B_walk_away", loadImage("B_walk.png"));
	}

	private ImageIcon loadImage(String item){
		String location = "saf/simulation/graphics/";
		URL uri = this.loader.getResource(location + item);
		return new ImageIcon(uri);
	}
	
	public ImageIcon getPicture(String actionType) {
		return imageMap.get(actionType);
	}
}