package gui;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import logic.FighterState;

public class FighterAnimation {

	private final String imageDirectory;
	private FighterState state;
	private List<FighterImage> images;
	
	public FighterAnimation(String imageDirectory) {
		this.imageDirectory = imageDirectory;
		this.state = FighterState.FIGHTER_STANDING;
		this.images = new LinkedList<FighterImage>();
	}
	
	public void onInitialize() {
		loadImage(FighterState.FIGHTER_STANDING, imageDirectory+"fighter_standing.png");
		loadImage(FighterState.FIGHTER_BLOCK_LOW, imageDirectory+"fighter_blocklow.png");
		loadImage(FighterState.FIGHTER_BLOCK_HIGH, imageDirectory+"fighter_blockhigh.png");
		loadImage(FighterState.FIGHTER_KICK_LOW, imageDirectory+"fighter_kicklow.png");
		loadImage(FighterState.FIGHTER_KICK_HIGH, imageDirectory+"fighter_kickhigh.png");
		loadImage(FighterState.FIGHTER_PUNCH_LOW, imageDirectory+"fighter_punchlow.png");
		loadImage(FighterState.FIGHTER_PUNCH_HIGH, imageDirectory+"fighter_punchhigh.png");
	}
	
	public void draw(Graphics g) {
		FighterImage currentImage = getCurrentImage();
		if ( currentImage != null ) {
			g.drawImage(currentImage.getImage(), 0, 0, null);
		}
	}
	
	public void onDestroy() {
		state = FighterState.FIGHTER_STANDING;
		images.clear();
	}
	
	private void loadImage(FighterState state, String filename) {
		images.add(new FighterImage(state, filename));
	}
	
	private FighterImage getCurrentImage() {
		for ( FighterImage image : images ) {
			if ( image.getState() == state ) {
				return image;
			}
		}
		return null;
	}

	public void setState(FighterState state) {
		this.state = state;
	}
	
	public FighterState getState() {
		return state;
	}
	
}
