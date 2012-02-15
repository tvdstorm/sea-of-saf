package saf.game;

import java.awt.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GameConstant {

	public static final String CONDITION_TYPE_ALWAYS = "always";
	public static final String CONDITION_TYPE_NEAR = "near";
	public static final String CONDITION_TYPE_FAR = "far";
	public static final String CONDITION_TYPE_MUCHSTRONGER = "much_stronger";
	public static final String CONDITION_TYPE_STRONGER = "stronger";
	public static final String CONDITION_TYPE_EVEN = "even";
	public static final String CONDITION_TYPE_WEAKER = "weaker";
	public static final String CONDITION_TYPE_MUCHWEAKER = "much_weaker";

	public static final List<String> ConditionTypes = Arrays.asList(CONDITION_TYPE_ALWAYS, CONDITION_TYPE_NEAR, CONDITION_TYPE_FAR,
			CONDITION_TYPE_MUCHSTRONGER, CONDITION_TYPE_STRONGER, CONDITION_TYPE_EVEN, CONDITION_TYPE_WEAKER, CONDITION_TYPE_MUCHWEAKER);
	public static final Map<String, Integer> CONDITION_STRENGHTS_HP_DIFFERENCE =
			Collections.unmodifiableMap(new HashMap<String, Integer>() {{
				put(CONDITION_TYPE_MUCHSTRONGER, 40);
				put(CONDITION_TYPE_STRONGER, 10);
				// even is between stronger and weaker
				put(CONDITION_TYPE_WEAKER, -10);
				put(CONDITION_TYPE_MUCHWEAKER, -40);
			}});
	
	public static final int CONDITION_NEAR_DISTANCE = 50;
	
	
	public static final String MOVE_TYPE_WALKTOWARDS = "walk_towards";
	public static final String MOVE_TYPE_WALKAWAY = "walk_away";
	public static final String MOVE_TYPE_RUNTOWARDS = "run_towards";
	public static final String MOVE_TYPE_RUNAWAY = "run_away";
	public static final String MOVE_TYPE_JUMP = "jump";
	public static final String MOVE_TYPE_CROUCH = "crouch";
	public static final String MOVE_TYPE_STAND = "stand";
	
	public static final List<String> MOVE_TYPES = Arrays.asList(MOVE_TYPE_WALKTOWARDS, MOVE_TYPE_WALKAWAY,
			MOVE_TYPE_RUNTOWARDS, MOVE_TYPE_RUNAWAY, MOVE_TYPE_JUMP, MOVE_TYPE_CROUCH, MOVE_TYPE_STAND);
	public static final Map<String, Integer> MOVEACTION_DISTANCE = 
			Collections.unmodifiableMap(new HashMap<String,Integer>() {{
				put(MOVE_TYPE_RUNTOWARDS, 100);
				put(MOVE_TYPE_WALKTOWARDS, 50);
				put(MOVE_TYPE_WALKAWAY, -50);
				put(MOVE_TYPE_RUNAWAY, -100);
			}});
	

	public static final String FIGHT_TYPE_LOW = "low";
	public static final String FIGHT_TYPE_HIGH = "high";
	public static final String FIGHT_TYPE_KICK = "kick";
	public static final String FIGHT_TYPE_PUNCH = "punch";
	public static final String FIGHT_TYPE_BLOCK = "block";
	public static final String FIGHT_TYPE_BLOCKLOW = "block_low";
	public static final String FIGHT_TYPE_BLOCKHIGH = "block_high";
	public static final String FIGHT_TYPE_PUNCHLOW = "punch_low";
	public static final String FIGHT_TYPE_PUNCHHIGH = "punch_high";
	public static final String FIGHT_TYPE_KICKLOW = "kick_low";
	public static final String FIGHT_TYPE_KICKHIGH = "kick_high";
	public static final List<String> FIGHT_TYPES = Arrays.asList(FIGHT_TYPE_BLOCKLOW, FIGHT_TYPE_BLOCKHIGH,
			FIGHT_TYPE_PUNCHLOW, FIGHT_TYPE_PUNCHHIGH, FIGHT_TYPE_KICKLOW, FIGHT_TYPE_KICKHIGH);

	public static final double FIGHTACTION_BASERANGE = 5;
	public static final double FIGHTACTION_BASEPOWER = 5;
	
	
	public static final String CHAR_TYPE_PUNCHREACH = "punchReach";
	public static final String CHAR_TYPE_PUNCHPOWER = "punchPower";
	public static final String CHAR_TYPE_KICKREACH = "kickReach";
	public static final String CHAR_TYPE_KICKPOWER = "kickPower";
	public static final List<String> CHAR_TYPES = Arrays.asList(CHAR_TYPE_PUNCHREACH, CHAR_TYPE_PUNCHPOWER, CHAR_TYPE_KICKREACH,
			CHAR_TYPE_KICKPOWER);
	
	public static final String WINNER_MESSAGE = "And the winner of the awesome battle is ";
	
	public static final boolean DEBUG_STATUS = true;
	
	
	//GUI CONSTANTS
	public static final String SPRITE_BACKGROUND = "Sprites/background.png";
	public static final String SPRITE_LEFT = "Sprites/Left/";
	public static final String SPRITE_RIGHT = "Sprites/Right/";
	public static final String SPRITES_IDLE = "idle.png";

	public static final String CONST_LEFT = "left";
	public static final String CONST_RIGHT = "right";
	public static final Point CONST_LEFTBOTSTART = new Point(100, 80);
	public static final Point CONST_RIGHTBOTSTART = new Point(450, 80);
	public static final int CONST_JUMP_PIXELS = 80;
	public static final int CONST_STARTING_DISTANCE = 350;
	
}