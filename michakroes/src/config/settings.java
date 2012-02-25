package config;

import java.util.Arrays;
import java.util.List;

import checker.SafList;

public interface settings {
	
	public final String SCREEN_TITLE = "Expendables";
	
	public final int SCREEN_WIDTH = 600;
	public final int SCREEN_HEIGHT = 650;
	
	public final int SCREEN_PADDING = 50;
	
	public final String PLAYER1_FILE = "expendables/Statham.saf";
	public final String PLAYER2_FILE = "expendables/li.saf";
	
	public final int STEP_MS = 100;
	public final int OFFSET_Y = 50;
	public final int DISTANCE_THRESHOLD = 10;
	public final int HEALTH_THRESHOLD = 30;
	public final double RUN_SPEED_FACTOR = 1.5;
	public final int PLAYER_WIDTH = 200;	
	public final int PLAYER_HEIGHT = 200;	
	public final int REACH_FACTOR = 2;

	public final String PUNCH_REACH = "punchReach";
	public final String PUNCH_POWER = "punchPower";
	public final String KICK_REACH = "kickReach";
	public final String KICK_POWER = "kickPower";
	
	public final String ALWAYS = "always";
	public final String NEAR = "near";
	public final String FAR = "far";
	public final String MUCH_STRONGER = "much_stronger";
	public final String STRONGER = "stronger";
	public final String EVEN = "even";
	public final String WEAKER = "weaker";
	public final String MUCH_WEAKER = "much_weaker";	
	
	public final String WALK_TOWARDS = "walk_towards";
	public final String WALK_AWAY = "walk_away";
	public final String RUN_TOWARDS = "run_towards";
	public final String RUN_AWAY = "run_away";
	public final String JUMP = "jump";	
	public final String CROUCH = "crouch";	
	public final String STAND = "stand";
	
	public final String BLOCK_LOW = "block_low";
	public final String BLOCK_HIGH = "block_high";
	public final String PUNCH_LOW = "punch_low";
	public final String PUNCH_HIGH = "punch_high";
	public final String KICK_LOW = "kick_low";	
	public final String KICK_HIGH = "kick_high";	
	
	public final List<String> Strengths = Arrays.asList(PUNCH_REACH, PUNCH_POWER) ;
			//new SafList("strength", new String[]{ PUNCH_REACH, PUNCH_POWER, KICK_REACH, KICK_POWER } );
	public final SafList Conditions = new SafList("condition", new String[]{ ALWAYS, NEAR, FAR, MUCH_STRONGER, STRONGER, EVEN, WEAKER, MUCH_WEAKER } );
	public final SafList Moves = new SafList("move", new String[]{ WALK_TOWARDS, WALK_AWAY, RUN_TOWARDS, RUN_AWAY, JUMP, CROUCH, STAND } );
	public final SafList Fights = new SafList("fight", new String[]{ BLOCK_LOW, BLOCK_HIGH, PUNCH_LOW, PUNCH_HIGH, KICK_LOW, KICK_HIGH } );
	
	public final int minStrength = 1;
	public final int maxStrength = 9;
}
