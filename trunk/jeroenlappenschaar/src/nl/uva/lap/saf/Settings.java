package nl.uva.lap.saf;

import java.util.Arrays;
import java.util.List;

public interface Settings
{
	final List<String> CONDITIONS = Arrays.asList("near", "even", "far", "always", "stronger", "weaker", "much_stronger", "much_weaker");
	final List<String> MOVES = Arrays.asList("jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away");
	final List<String> ACTIONS = Arrays.asList("punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high");
	final List<String> STRENGTHS = Arrays.asList("punchReach", "kickReach", "kickPower", "punchPower");

	final int MIN_STRENGTH = 1;
	final int MAX_STRENGTH = 10;
}
