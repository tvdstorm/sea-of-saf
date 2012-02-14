package constants;

import java.util.Arrays;
import java.util.List;

public interface SAFConstants {

	public static final String CONDITION_TYPE_ALWAYS 			= "always"; 
	public static final String CONDITION_TYPE_NEAR 				= "near";
	public static final String CONDITION_TYPE_FAR 				= "far"; 
	public static final String CONDITION_TYPE_MUCHSTRONGER 		= "much_stronger";
	public static final String CONDITION_TYPE_STRONGER 			= "stronger"; 
	public static final String CONDITION_TYPE_EVEN 				= "even";
	public static final String CONDITION_TYPE_WEAKER 			= "weaker"; 
	public static final String CONDITION_TYPE_MUCHWEAKER 		= "much_weaker";

	public static final String CHARACTERISTIC_TYPE_KICK_REACH 	= "kickReach"; 
	public static final String CHARACTERISTIC_TYPE_KICK_POWER 	= "kickPower";
	public static final String CHARACTERISTIC_TYPE_PUNCH_REACH 	= "punchReach"; 
	public static final String CHARACTERISTIC_TYPE_PUNCH_POWER 	= "punchPower";

	public static final String MOVE_TYPE_JUMP					= "jump"; 
	public static final String MOVE_TYPE_CROUCH 				= "crouch";
	public static final String MOVE_TYPE_STAND					= "stand"; 
	public static final String MOVE_TYPE_RUN_TOWARDS 			= "run_towards";
	public static final String MOVE_TYPE_RUN_AWAY				= "run_away"; 
	public static final String MOVE_TYPE_WALK_TOWARDS 			= "walk_towards";
	public static final String MOVE_TYPE_WALK_AWAY 				= "walk_away";


	public static final String ATTACK_TYPE_STAND				= "stand"; 	
	public static final String ATTACK_TYPE_PUNCH_LOW			= "punch_low"; 
	public static final String ATTACK_TYPE_PUNCH_HIGH			= "punch_high"; 
	public static final String ATTACK_TYPE_KICK_LOW				= "kick_low"; 
	public static final String ATTACK_TYPE_KICK_HIGH			= "kick_high"; 
	public static final String ATTACK_TYPE_BLOCK_LOW			= "block_low"; 
	public static final String ATTACK_TYPE_BLOCK_HIGH			= "block_high"; 
	
	public static final List<String> ConditionTypes = Arrays.asList(CONDITION_TYPE_ALWAYS, CONDITION_TYPE_NEAR, CONDITION_TYPE_FAR,
			CONDITION_TYPE_MUCHSTRONGER, CONDITION_TYPE_STRONGER, CONDITION_TYPE_EVEN, CONDITION_TYPE_WEAKER, CONDITION_TYPE_MUCHWEAKER);	

	public static final List<String> CharacteristicTypes = Arrays.asList(CHARACTERISTIC_TYPE_KICK_POWER, CHARACTERISTIC_TYPE_KICK_REACH, CHARACTERISTIC_TYPE_PUNCH_POWER, 
			CHARACTERISTIC_TYPE_PUNCH_REACH);
	

	public static final List<String> MoveTypes = Arrays.asList(MOVE_TYPE_JUMP, MOVE_TYPE_CROUCH, MOVE_TYPE_STAND, 
			MOVE_TYPE_RUN_TOWARDS, MOVE_TYPE_RUN_AWAY, MOVE_TYPE_WALK_TOWARDS, MOVE_TYPE_WALK_AWAY);
	
	public static final List<String> AttackTypes = Arrays.asList(ATTACK_TYPE_STAND, ATTACK_TYPE_PUNCH_LOW, ATTACK_TYPE_PUNCH_HIGH, ATTACK_TYPE_KICK_LOW, 
			ATTACK_TYPE_KICK_HIGH, ATTACK_TYPE_BLOCK_LOW, ATTACK_TYPE_BLOCK_HIGH);
	
}
