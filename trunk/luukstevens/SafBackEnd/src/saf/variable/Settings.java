package saf.variable;

public interface Settings {
	
	//Bot
	static final int LEFT_BOT_XPOS = 145;
	static final int LEFT_BOT_YPOS = 75;
	
	static final int RIGHT_BOT_XPOS = 255;
	static final int RIGHT_BOT_YPOS = 75;
	
	static final int DEFAULT_CHARACTERISTIC_VALUE = 5;
	static final int DEFAULT_HEALTH = 100;
	
	//Logic
	static final int THRESHOLD_MUCH_WEAKER_STRONGER = 20;
	static final int THRESHOLD_REACH_BOTH_FAR = 10;
	static final int THRESHOLD_REACH_ONE_FAR = 5;
	static final int DELAY = 300;
	
	//View
	static final int APPLICATION_WIDTH = 600;
	static final int APPLICATION_HEIGHT = 350; 
	static final int APPLICATION_X_POSITION = 100;
	static final int APPLICATION_Y_POSITION = 100;
	
	static final int ARENA_WIDTH = 450;
	static final int ARENA_HEIGHT = 250;
	static final int ARENA_X_POSITION = 75;
	static final int ARENA_Y_POSITION = 40;
	
	static final String SPRITE_FOLDER = "data/sprites/";
	static final String SPRITE_EXTENSION = ".png";
	static final String SPRITE_LEFT_SUFFIX = "_left";
}
