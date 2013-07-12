package com.yennick.fighter.bot;

import java.util.Arrays;
import java.util.List;

public class Constants {
	
	private static final List<String> Characteristics = Arrays.asList("kickPower","kickReach","punchPower","punchReach","color");
	
	private static final List<String> Conditions = Arrays.asList("always","near","far","weaker","much_weaker","even","stronger","much_stronger");
	
	private static final List<String> MoveActions = Arrays.asList("stand","crouch","jump","run_towards","walk_towards","run_away","walk_away");
	private static final List<Integer> MoveDistance = Arrays.asList(0,0,2,2,1,-2,-1);

	private static final List<String> FightActions = Arrays.asList("block_low","block_high","kick_low","kick_high","punch_low","punch_high");
	
	private static final List<String> Colors = Arrays.asList("red","blue","gray","pink","yellow","black");
	
	private static final String def = "always";

	private static int defaultValue = 5;
	
	

	public static List<String> getCharacteristics() {
		return Characteristics;
	}

	public static List<String> getConditions() {
		return Conditions;
	}
	
	public static String getDef(){
		return def;
	}

	public static List<String> getMoveActions() {
		return MoveActions;
	}
	
	public static int getMoveDistance(String moveAction){
		
		for (int i = 0; i < MoveActions.size(); i++) {
			if(moveAction.equals(MoveActions.get(i))){
				return MoveDistance.get(i);
			}
		}
		// would be impossible to come here...
		return 0;
	}
	
	public static List<String> getFightActions() {
		return FightActions;
	}
	
	public static List<String> getColors() {
		return Colors;
	}

	public static Integer getDefaultValue() {
		return defaultValue;
	}

}
