package constants;


import java.util.Arrays;
import java.util.List;


public class CorrectValues {

	public static final List<String> conditions = Arrays.asList("far", "near", "always","even", "muchStronger", "stronger", "weaker", "muchWeaker");
	public static final List<String> moves = Arrays.asList("jump","crouch","stand","runTowards","runAway","walkTowards","walkAway");
	public static final List<String> attacks = Arrays.asList("punchLow","punchHigh","kickLow","kickHigh","blockLow","blockHigh");
	public static final List<String> strengths = Arrays.asList("punchReach","kickReach","kickPower","punchPower");
	
	
	public CorrectValues(){
		
	}
	
	public List<String> getConditions(){
		return conditions;
	}
	
	public List<String> getMoves(){
		return moves;
	}
	
	public List<String> getAttacks(){
		return attacks;
	}
	
	public List<String> getStrengths(){
		return strengths;
	}
}
