package graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;

public interface ArenaConfiguration {
	static final int WIDTH = 1000;
	static final int HEIGHT = 400;
	static final Dimension SIZE_ARENA = new Dimension(WIDTH, HEIGHT);
	static final Color BACKGROUND_COLOR = Color.white;	
	static final String TITLE = "Super Awsome Fighters Battle";
	static final int NEAR = 10;
	static final int FAR = 11;
	
	String PATH_IMAGES = "D:/Dropbox/Dropbox/Software Construction/workspace/SC12/images/";
	String BLOCK_HIGH_L = "block_high_l.jpg";
	String BLOCK_LOW_L = "block_low_l.jpg";
	String KICK_HIGH_L = "kick_high_l.jpg";
	String KICK_LOW_L = "kick_low_l.jpg";
	String PUNCH_HIGH_L = "punch_high_l.jpg";
	String PUNCH_LOW_L = "punch_low_l.jpg";
	String RELAXED_L = "relaxed_l.jpg";
	String JUMP_L = "jump_l.jpg";
	String CROUCH_L = "crouch_l.jpg";
	String DEAD_L = "dead_l.jpg";
	String BLOCK_HIGH_R = "block_high_r.jpg";
	String BLOCK_LOW_R = "block_low_r.jpg";
	String KICK_HIGH_R = "kick_high_r.jpg";
	String KICK_LOW_R = "kick_low_r.jpg";
	String PUNCH_HIGH_R = "punch_high_r.jpg";
	String PUNCH_LOW_R = "punch_low_r.jpg";
	String RELAXED_R = "relaxed_r.jpg";
	String CROUCH_R = "crouch_r.jpg";
	String JUMP_R = "jump_r.jpg";
	String DEAD_R = "dead_r.jpg";
	String pathBlockHighL = PATH_IMAGES + BLOCK_HIGH_L;
	String pathBlockLowL = PATH_IMAGES + BLOCK_LOW_L;
	String pathKickHighL = PATH_IMAGES + KICK_HIGH_L;
	String pathKickLowL = PATH_IMAGES + KICK_LOW_L;
	String pathPunchkHighL = PATH_IMAGES + PUNCH_HIGH_L;
	String pathPunchLowL = PATH_IMAGES + PUNCH_LOW_L;
	String pathDeadL = PATH_IMAGES + DEAD_L;
	String pathJumpL = PATH_IMAGES + JUMP_L;
	String pathCrouchL = PATH_IMAGES + CROUCH_L;
	String pathBlockHighR = BLOCK_HIGH_R + BLOCK_HIGH_R;
	String pathBlockLowR = PATH_IMAGES + BLOCK_LOW_R;
	String pathKickHighR = PATH_IMAGES + KICK_HIGH_R;
	String pathKickLowR = PATH_IMAGES + KICK_LOW_R;
	String pathPunchkHighR = PATH_IMAGES + PUNCH_HIGH_R;
	String pathPunchLowR = PATH_IMAGES + PUNCH_LOW_R;
	String pathDeadR = PATH_IMAGES + DEAD_R;
	String pathJumpR = PATH_IMAGES + JUMP_R;
	String pathCrouchR = PATH_IMAGES + CROUCH_R;
	String pathRelaxedL = PATH_IMAGES + RELAXED_L;
	String pathRelaxedR = PATH_IMAGES + RELAXED_R;
	File blockHighL = new File (PATH_IMAGES + BLOCK_HIGH_L);
	File blockLowL = new File (PATH_IMAGES + BLOCK_LOW_L);
	File kickHighL = new File (PATH_IMAGES + KICK_HIGH_L);
	File kickLowL = new File (PATH_IMAGES + KICK_LOW_L);
	File punchkHighL = new File (PATH_IMAGES + PUNCH_HIGH_L);
	File punchLowL = new File (PATH_IMAGES + PUNCH_LOW_L);
	File deadL = new File (PATH_IMAGES + DEAD_L);
	File jumpL = new File (PATH_IMAGES + JUMP_L);
	File crouchL = new File (PATH_IMAGES + CROUCH_L);
	File blockHighR = new File (PATH_IMAGES + BLOCK_HIGH_R);
	File blockLowR = new File (PATH_IMAGES + BLOCK_LOW_R);
	File kickHighR = new File (PATH_IMAGES + KICK_HIGH_R);
	File kickLowR = new File (PATH_IMAGES + KICK_LOW_R);
	File punchkHighR = new File (PATH_IMAGES + PUNCH_HIGH_R);
	File punchLowR = new File (PATH_IMAGES + PUNCH_LOW_R);
	File deadR = new File (PATH_IMAGES + DEAD_R);
	File jumpR = new File (PATH_IMAGES + JUMP_R);
	File crouchR = new File (PATH_IMAGES + CROUCH_R);
	File relaxedL = new File (PATH_IMAGES + RELAXED_L);
	File relaxedR = new File (PATH_IMAGES + RELAXED_R);
}
