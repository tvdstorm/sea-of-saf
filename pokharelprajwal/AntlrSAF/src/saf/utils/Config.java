package saf.utils;

import java.util.Arrays;
import java.util.List;

public class Config {
	
	static public List<String> CONDITIONTYPE =
			Arrays.asList("near", "even", "far", "always", "stronger", "weaker", "much_stronger", "much_weaker");

	static public List<String> MOVEACTIONTYPE =
			Arrays.asList("jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away");

	static public List<String> FIGHTSACTOINTYPE =
			Arrays.asList("punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high");

	static public List<String> Characterstics =
			Arrays.asList("punchReach", "kickReach", "kickPower", "punchPower");

	static public Integer MIN_STRENGTH = 0;
	static public Integer MAX_STRENGTH = 10;
	static public Integer DEFAULT_STRENGTH = 5;
	static public String ImagePath = "D:\\SAF\\AntlrSAF\\src\\saf\\evaluator\\images\\";
	static public String INITIALCONDITION = "far";
	static public String DEFAULTCONDITION = "always";
	static public Integer INITIALPOSITION = 300;
	static public Integer DEFAULTHEALTH = 100;
	static public Integer DEFAULTBLOCKHEALTH = 2;

}
