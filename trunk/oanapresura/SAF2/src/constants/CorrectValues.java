package constants;


import java.util.Arrays;
import java.util.List;


public interface CorrectValues {
	
	public static final int CONDITION_TYPE = 0;
	public static final int MOVE_TYPE = 1;
	public static final int ATTACK_TYPE = 2;
	public static final int STRENGTH_TYPE = 3;
	public static final int SINGLE = 10;
	public static final int CHOICE = 11;

	public static final List<String> conditions = Arrays.asList("far", "near", "always","even", "muchStronger", "stronger", "weaker", "muchWeaker");
	public static final List<String> moves = Arrays.asList("jump","crouch","stand","runTowards","runAway","walkTowards","walkAway");
	public static final List<String> attacks = Arrays.asList("punchLow","punchHigh","kickLow","kickHigh","blockLow","blockHigh");
	public static final List<String> strengths = Arrays.asList("punchReach","kickReach","kickPower","punchPower");
	
	
	
}
