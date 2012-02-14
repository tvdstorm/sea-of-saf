package saf;

import java.util.Arrays;
import java.util.List;

public class SAFConstants {
	public static final List<String> availableCharacteristics = Arrays.asList("punchReach", 
																			  "punchPower", 
																			  "kickReach", 
																			  "kickPower");

	public static final List<String> availableConditions = Arrays.asList("always",
																		 "near", 
																		 "far",
																		 "much_weaker",
																		 "weaker",
																		 "even",
																		 "stronger",
																		 "much_stronger");

	public static final List<String> availableMoveActions = Arrays.asList("");//TODO	
	public static final List<String> availableFightActions = Arrays.asList("");//TODO
//	public static final List<String> availableActions = Arrays.SAFConstants.availableMoveActions. + 
//														SAFConstants.availableFightActions;
}
