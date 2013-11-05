package saf;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public interface Config {
	public final String ALWAYS = "always";
	public final String PUNCH_REACH = "punchReach";
	public final String PUNCH_POWER = "punchPower";
	public final String KICK_REACH = "kickReach";
	public final String KICK_POWER = "kickPower";
	
	public final List<String> ATOMS = 
			Arrays.asList("near", "far", "even", "always", "stronger", "weaker", "much_stronger", "much_weaker");
	public final List<String> STRENGTHS = 
			Arrays.asList(PUNCH_REACH, PUNCH_POWER, KICK_REACH, KICK_POWER);
	public final List<String> MOVES =
			Arrays.asList("jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away");
	public final List<String> STRIKES =
			Arrays.asList("punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high");
	
	public enum Atoms { near, far, even, always, stronger, weaker, much_stronger, much_weaker }
	public enum Strengths { punch_reach, punch_power, kick_reach, kick_power }
	public enum Moves { jump, crouch, stand, run_towards, run_away, walk_towards, walk_away }
	public enum Strikes { punch_low, punch_high, kick_low, kick_high, block_low, block_high }
	
	public final int MIN_STRENGTH = 1;
	public final int MAX_STRENGTH = 10;
	public final int HEALTH = 100;
	public final int DEFAULT_STRENGTH = 5;
	public final int STRENGTH_THRESHOLD = 5;
	public final int DISTANCE_THRESHOLD = 7;
	public final int WALK_DISTANCE = 2;
	public final int RUN_DISTANCE = 4;
	public final double POWER_THRESHOLD = 0.5;
	public final double SPEED_THRESHOLD = 1.5;
	
	public final String RESOURCE_URL = "." + File.separator + "resources" + File.separator; 
	public final String MODEL_URL = RESOURCE_URL + "models" + File.separator;
	public final String IMG_URL = RESOURCE_URL + "img" + File.separator;
	
	public final int STAGE_WIDTH = 640;
	public final int STAGE_HEIGHT = 453;
	public final int SCALE = 100;
	
}
