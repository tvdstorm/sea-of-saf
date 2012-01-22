package objects;

import java.util.ArrayList;

public class Interpreter {
	private String[] conditions = new String[]{"stronger","weaker"," much_stronger","much_weaker","even","near","far","always"};
	private String[] moves = new String[]{"jump", "crouch","stand","run_towards","run_away","walk_towards","walk_away"};
	private String[] attacks = new String[]{"punch_low","punch_high","kick_low","kick_high","block_low","block_high"};
	private String[] strengths = new String[]{"punchReach","kickReach","kickPower","punchPower"};

}
