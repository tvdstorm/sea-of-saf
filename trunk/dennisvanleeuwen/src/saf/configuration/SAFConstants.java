package saf.configuration;

import java.util.Arrays;
import java.util.List;

public class SAFConstants {
	private static final List<String> availableCharacteristics = Arrays.asList("punchReach", 
																			   "punchPower", 
																			   "kickReach", 
																			   "kickPower");

	private static final List<String> availableConditions = Arrays.asList("always",
																		  "near", 
																		  "far",
																		  "much_weaker",
																		  "weaker",
																		  "even",
																		  "stronger",
																		  "much_stronger");

	private static final List<String> availableMoveActions = Arrays.asList("jump", 
																		   "crouch", 
																		   "stand", 
																		   "run_towards", 
																		   "run_away", 
																		   "walk_towards", 
																		   "walk_away");
	
	private static final List<String> availableFightActions = Arrays.asList("punch_low", 
																			"punch_high", 
																			"kick_low", 
																			"kick_high", 
																			"block_low", 
																			"block_high");
	
	public static List<String> getAvailableCharacteristics(){
		return SAFConstants.availableCharacteristics;
	}

	public static List<String> getAvailableConditions(){
		return SAFConstants.availableConditions;
	}
	
	public static List<String> getAvailableMoveActions(){
		return SAFConstants.availableMoveActions;
	}
	
	public static List<String> getAvailableFightActions(){
		return SAFConstants.availableFightActions;
	}
}
