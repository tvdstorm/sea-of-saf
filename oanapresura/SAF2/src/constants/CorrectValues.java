package constants;

import java.util.Arrays;
import java.util.List;

public interface CorrectValues {

	public static final int CONDITION_TYPE = 100;
	public static final int MOVE_TYPE = 101;
	public static final int ATTACK_TYPE = 102;
	public static final int STRENGTH_TYPE = 103;
	public static final int SINGLE = 110;
	public static final int CHOICE = 111;
	public static final int NEAR = 14;

	public static final int START_LEFT = 15;
	public static final int START_RIGHT = 90;
	public static final int LEFT_SAFETY_BORDER_RUN = 23;
	public static final int LEFT_SAFETY_BORDER_WALK = 17;
	public static final int RIGHT_SAFETY_BORDER_RUN = 82;
	public static final int RIGHT_SAFETY_BORDER_WALK = 88;
	public static final int RUN_INC = 8;
	public static final int WALK_INC = 2;

	public static final int LEFT = 1000;
	public static final int RIGHT = 1001;
	
	public static final int JUMP = 0;
	public static final int CROUCH = 1;
	public static final int STAND = 2;
	public static final int RUN_TOWARDS = 3;
	public static final int RUN_AWAY = 4;
	public static final int WALK_TOWARDS = 5;
	public static final int WALK_AWAY = 6;			

	public static final List<String> conditions = Arrays.asList("far", "near",
			"always", "even", "muchStronger", "stronger", "weaker",
			"muchWeaker");
	public static final List<String> moves = Arrays.asList("jump", "crouch",
			"stand", "runTowards", "runAway", "walkTowards", "walkAway");
	public static final List<String> attacks = Arrays.asList("punchLow",
			"punchHigh", "kickLow", "kickHigh", "blockLow", "blockHigh");
	public static final List<String> strengths = Arrays.asList("punchReach",
			"kickReach", "kickPower", "punchPower");

	public static final List<String> movesPicturesLeft = Arrays.asList(
			"pics/baronesse/VJUMP05.png", "pics/baronesse/CROUCH1.png",
			"pics/baronesse/HIP1.png", "pics/baronesse/HIP1.png",
			"pics/baronesse/HIP1.png", "pics/baronesse/HIP1.png",
			"pics/baronesse/HIP1.png");
	public static final List<String> movesPicturesRight = Arrays.asList(
			"pics/bred/JUMP03.png", "pics/bred/SQUAT.png",
			"pics/bred/JUMP01.png", "pics/bred/JUMP01.png",
			"pics/bred/JUMP01.png", "pics/bred/JUMP01.png",
			"pics/bred/JUMP01.png");
	public static final List<String> attacksPicturesLeft = Arrays.asList(
			"pics/baronesse/PALM7.png", "pics/baronesse/PALM4.png",
			"pics/baronesse/HITB2.png", "pics/baronesse/JKICKA.png",
			"pics/baronesse/HITHI5.png", "pics/baronesse/HITHI5.png");
	public static final List<String> attacksPicturesRight = Arrays.asList(
			"pics/bred/PUNCHA5.png", "pics/bred/PUNCHA4.png",
			"pics/bred/JKICKA02.png", "pics/bred/KICKA03.png",
			"pics/bred/JUMP01.png", "pics/bred/JUMP01.png");

}
