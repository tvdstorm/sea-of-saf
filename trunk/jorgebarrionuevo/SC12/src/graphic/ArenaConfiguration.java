package graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

public interface ArenaConfiguration {
	static final int WIDTH = 700;
	static final int HEIGHT = 600;
	static final Dimension SIZE_ARENA = new Dimension(WIDTH, HEIGHT);
	static final Color BACKGROUND_COLOR = Color.white;	
	static final String TITLE = "Super Awsome Fighters Battle";
	static final int NEAR = 10;
	static final int FAR = 11;
	
	String PATH_IMAGES = "D:/SAF/workspace/SC12/images/";
	String BLOCK_HIGH_L = "block_high_l.jpg";
	String BLOCK_LOW_L = "block_low_l.jpg";
	String KICK_HIGH_L = "kick_high_l.jpg";
	String KICK_LOW_L = "kick_low_l.jpg";
	String PUNCH_HIGH_L = "punch_high_l.jpg";
	String PUNCH_LOW_L = "punch_low_l.jpg";
	String BLOCK_HIGH_R = "block_high_r.jpg";
	String BLOCK_LOW_R = "block_low_r.jpg";
	String KICK_HIGH_R = "kick_high_r.jpg";
	String KICK_LOW_R = "kick_low_r.jpg";
	String PUNCH_HIGH_R = "punch_high_r.jpg";
	String PUNCH_LOW_R = "punch_low_r.jpg";
	String RELAXED = "relaxed.jpg";
	
	File blockHighL = new File (PATH_IMAGES + BLOCK_HIGH_L);
	File blockLowL = new File (PATH_IMAGES + BLOCK_LOW_L);
	File kickHighL = new File (PATH_IMAGES + KICK_HIGH_L);
	File kickLowL = new File (PATH_IMAGES + KICK_LOW_L);
	File punchkHighL = new File (PATH_IMAGES + PUNCH_HIGH_L);
	File punchLowL = new File (PATH_IMAGES + PUNCH_LOW_L);
	
	File blockHighR = new File (BLOCK_HIGH_R + BLOCK_HIGH_R);
	File blockLowR = new File (PATH_IMAGES + BLOCK_LOW_R);
	File kickHighR = new File (PATH_IMAGES + KICK_HIGH_R);
	File kickLowR = new File (PATH_IMAGES + KICK_LOW_R);
	File punchkHighR = new File (PATH_IMAGES + PUNCH_HIGH_R);
	File punchLowR = new File (PATH_IMAGES + PUNCH_LOW_R);
	
	File relaxed = new File (PATH_IMAGES + RELAXED);
}
