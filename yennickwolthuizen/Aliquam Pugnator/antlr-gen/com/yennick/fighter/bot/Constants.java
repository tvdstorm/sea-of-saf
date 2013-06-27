package com.yennick.fighter.bot;

import java.util.Arrays;
import java.util.List;

public class Constants {
	
	private static final List<String> Characteristics = Arrays.asList("kickPower","kickReach","punchPower","punchReach","color");
	
	private static final List<String> Conditions = Arrays.asList("always","near","far","weaker","much_weaker","even","stronger","much_stronger");
	
	private static final List<String> MoveActions = Arrays.asList("stand","crouch","jump","run_towards","walk_towards","run_away","walk_away");

	private static final List<String> FightActions = Arrays.asList("block_low","block_high","kick_low","kick_high","punch_low","punch_high","shotgun");
	
	private static final List<String> Colors = Arrays.asList("red","blue","gray","pink","yellow","black");

	private static int defaultValue = 5;
	
	

	public static List<String> getCharacteristics() {
		return Characteristics;
	}

	public static List<String> getConditions() {
		return Conditions;
	}

	public static List<String> getMoveActions() {
		return MoveActions;
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
