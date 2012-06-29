package model;

public interface DefaultValues {
	final String[] CONDITION_TYPES =  {"always","stronger", "weaker", "much_stronger", "much_weaker", "near" ,"even" , "far"};
	final String[] MOVE_ACTION_TYPES = {"jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away"};
	final String[] FIGHT_ACTION_TYPES = {"kick_high", "block_low", "block_high", "punch_low", "punch_high", "kick_low"};
	final String[] CHARACTERISTICS = {"punchReach", "kickReach", "kickPower", "punchPower"};
	final Integer LOWEST_RANGE = 1;
	final Integer HIGHEST_RANGE = 10;
}
