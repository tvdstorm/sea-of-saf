package saf.game;

import java.awt.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GameConstant {

	public static final String CONDITION_ALWAYS = "always";
	public static final String CONDITION_NEAR = "near";
	public static final String CONDITION_FAR = "far";
	public static final String CONDITION_MUCHSTRONGER = "much_stronger";
	public static final String CONDITION_STRONGER = "stronger";
	public static final String CONDITION_EVEN = "even";
	public static final String CONDITION_WEAKER = "weaker";
	public static final String CONDITION_MUCHWEAKER = "much_weaker";

	public static final List<String> CONDITION_TYPES = Arrays.asList(CONDITION_ALWAYS, CONDITION_NEAR, CONDITION_FAR,
			CONDITION_MUCHSTRONGER, CONDITION_STRONGER, CONDITION_EVEN, CONDITION_WEAKER, CONDITION_MUCHWEAKER);
	public static final Map<String, Integer> CONDITION_STRENGHTS_HP_DIFFERENCE =
			Collections.unmodifiableMap(new HashMap<String, Integer>() {
				private static final long serialVersionUID = 8261762797107905830L;
			{
				put(CONDITION_MUCHSTRONGER, 40);
				put(CONDITION_STRONGER, 10);
				// even is between stronger and weaker
				put(CONDITION_WEAKER, -10);
				put(CONDITION_MUCHWEAKER, -40);
			}});



	public static final String MOVE_ACTION_WALKTOWARDS = "walk_towards";
	public static final String MOVE_ACTION_WALKAWAY = "walk_away";
	public static final String MOVE_ACTION_RUNTOWARDS = "run_towards";
	public static final String MOVE_ACTION_RUNAWAY = "run_away";
	public static final String MOVE_ACTION_JUMP = "jump";
	public static final String MOVE_ACTION_CROUCH = "crouch";
	public static final String MOVE_ACTION_STAND = "stand";


	public static final List<String> MOVE_ACTION_TYPES = Arrays.asList(MOVE_ACTION_WALKTOWARDS, MOVE_ACTION_WALKAWAY,
			MOVE_ACTION_RUNTOWARDS, MOVE_ACTION_RUNAWAY, MOVE_ACTION_JUMP, MOVE_ACTION_CROUCH, MOVE_ACTION_STAND);
	public static final Map<String, Integer> MOVEACTION_DISTANCE = 
			Collections.unmodifiableMap(new HashMap<String,Integer>() {
				private static final long serialVersionUID = 4313322031888942791L;
			{
				put(MOVE_ACTION_RUNTOWARDS, 100);
				put(MOVE_ACTION_WALKTOWARDS, 50);
				put(MOVE_ACTION_WALKAWAY, -50);
				put(MOVE_ACTION_RUNAWAY, -100);
			}});


	public static final String FIGHT_ACTION_LOW = "low";
	public static final String FIGHT_ACTION_HIGH = "high";
	public static final String FIGHT_ACTION_KICK = "kick";
	public static final String FIGHT_ACTION_PUNCH = "punch";
	public static final String FIGHT_ACTION_BLOCK = "block";
	public static final String FIGHT_ACTION_BLOCKLOW = "block_low";
	public static final String FIGHT_ACTION_BLOCKHIGH = "block_high";
	public static final String FIGHT_ACTION_PUNCHLOW = "punch_low";
	public static final String FIGHT_ACTION_PUNCHHIGH = "punch_high";
	public static final String FIGHT_ACTION_KICKLOW = "kick_low";
	public static final String FIGHT_ACTION_KICKHIGH = "kick_high";
	public static final List<String> FIGHT_ACTION_TYPES = Arrays.asList(FIGHT_ACTION_BLOCKLOW, FIGHT_ACTION_BLOCKHIGH,
			FIGHT_ACTION_PUNCHLOW, FIGHT_ACTION_PUNCHHIGH, FIGHT_ACTION_KICKLOW, FIGHT_ACTION_KICKHIGH);

	public static final String CHARACTERISTIC_PUNCHREACH = "punchReach";
	public static final String CHARACTERISTIC_PUNCHPOWER = "punchPower";
	public static final String CHARACTERISTIC_KICKREACH = "kickReach";
	public static final String CHARACTERISTIC_KICKPOWER = "kickPower";
	public static final List<String> CHARACTERISTIC_TYPES = Arrays.asList(CHARACTERISTIC_PUNCHREACH, CHARACTERISTIC_PUNCHPOWER, CHARACTERISTIC_KICKREACH,
			CHARACTERISTIC_KICKPOWER);

	public static final String WINNER_MESSAGE = "And the winner of the awesome battle is ";

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
	public static final int CONST_STARTING_HITPOINTS = 100;

	public static final double FIGHTACTION_BASERANGE = 5;
	public static final double FIGHTACTION_BASEPOWER = 5;
	public static final int CONDITION_NEAR_DISTANCE = 50;
	public static final int CONST_MIN_ACTIONCOST = 9;
	public static final int CONST_TIMER_MS = 150;
}