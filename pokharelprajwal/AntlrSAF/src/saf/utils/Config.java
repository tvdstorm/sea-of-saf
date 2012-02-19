package saf.utils;

import java.util.Arrays;
import java.util.List;

public class Config {
	
	final protected List<String> CONDITIONTYPE =
			Arrays.asList("near", "even", "far", "always", "stronger", "weaker", "much_stronger", "much_weaker");

	final protected List<String> MOVEACTIONTYPE =
			Arrays.asList("jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away");

	final protected List<String> FIGHTSACTOINTYPE =
			Arrays.asList("punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high");

	final protected List<String> Characterstics =
			Arrays.asList("punchReach", "kickReach", "kickPower", "punchPower");

	final protected Integer MIN_STRENGTH = 1;
	final protected Integer MAX_STRENGTH = 10;
	final protected Integer DEFAULT_STRENGTH = 5;

}
