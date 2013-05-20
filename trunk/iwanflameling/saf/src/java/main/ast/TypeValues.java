package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class TypeValues {
	
	public static final Set<String> CONDITIONS = new HashSet<String>(Arrays.asList(
			"stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far",
			"always"
			));

	public static final Set<String> STRENGHTS = new HashSet<String>(Arrays.asList(
			"punchReach", "kickReach", "kickPower", "punchPower"
			));
	
	public static final Set<String> ATTACKS = new HashSet<String>(Arrays.asList(
			"punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high"
			));
	
	public static final Set<String> MOVES = new HashSet<String>(Arrays.asList(
			"walk_away", "walk_towards", "run_away", "jump", "crouch", "stand",
			"run_towards"
			));
	
	public static final int MAX_STRENGTH = 10;
	public static final int MIN_STRENGTH = 1;
	public static final int DEFAULT_STRENGTH = 5;
	public static final String DEFAULT_CONDITION = "always";
	
}
