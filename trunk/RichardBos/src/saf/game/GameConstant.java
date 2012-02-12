package saf.game;

import java.util.Arrays;
import java.util.List;

public abstract class GameConstant {
	
	public static final List<String> ConditionTypes = 
			Arrays.asList("always", "near", "far", 
						  "much_stronger", "stronger", 
						  "even", "weaker", "much_weaker");
	
	public static final String CONDITION_ALWAYS = "always";
	public static final String CONDITION_NEAR = "near";
	public static final String CONDITION_FAR = "far";
	public static final String CONDITION_MUCH_STRONGER = "much_stronger";
	public static final String CONDITION_STRONGER = "stronger";
	public static final String CONDITION_EVEN = "even";
	public static final String CONDITION_WEAKER = "weaker";
	public static final String CONDITION_MUCH_WEAKER = "much_weaker";
	
	
	
	public static final List<String> MoveTypes = 
			Arrays.asList("walk_towards", "walk_away", "run_towards", 
					      "run_away", "jump", "crouch", "stand");
	
	public static final String MOVETYPE_WALK_TOWARDS = "walk_towards";
	public static final String MOVETYPE_WALK_AWAY = "walk_away";
	public static final String MOVETYPE_RUN_TOWARDS = "run_towards";
	public static final String MOVETYPE_RUN_AWAY = "run_away";
	public static final String MOVETYPE_JUMP = "jump";
	public static final String MOVETYPE_CROUCH = "crouch";
	public static final String MOVETYPE_STAND = "stand";
		
	
	
	public static final List<String> FightTypes = 
			Arrays.asList("block_low", "block_high", "punch_low", 
					      "punch_high", "kick_low", "kick_high");
	
	public static final String FIGHTTYPE_BLOCK_LOW = "block_low";
	public static final String FIGHTTYPE_BLOCK_HIGH = "block_high";
	public static final String FIGHTTYPE_PUNCH_LOW = "punch_low"; 
	public static final String FIGHTTYPE_PUNCH_HIGH = "punch_high";
	public static final String FIGHTTYPE_KICK_LOW = "kick_low";
	public static final String FIGHTTYPE_KICK_HIGH = "kick_high";
	
	
	
	public static final List<String> CharacteristicTypes = Arrays.asList(
			"punchReach", "punchPower", "kickReach", "kickPower");
	
	public static final String Characteristic_punchReach = "punchReach";
	public static final String Characteristic_punchPower = "punchPower";
	public static final String Characteristic_kickReach = "kickReach";
	public static final String Characteristic_kickPower = "kickPower";
	
	public static final String WINNER_MESSAGE = "And the winner of the awesome battle is ";
	
	public static final String CONST_LOW = "low";
	public static final String CONST_HIGH = "high";
	public static final String CONST_KICK = "kick";
	public static final String CONST_PUNCH = "punch";
	public static final String CONST_BLOCK = "block";
	
	public static final boolean DEBUG_STATUS = true;
}
