package saf.fighter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface AST {
	
	//Property
	final String ASPECT_RANGE = "Reach";
	final String ASPECT_POWER = "Power";
	final Set<String> VALID_ASPECTS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
		"block"+ASPECT_POWER,"punch"+ASPECT_RANGE,"punch"+ASPECT_POWER,"kick"+ASPECT_RANGE,"kick"+ASPECT_POWER)));
	final int DEFAULT_PROPERTY_MIN = 1;
	final int DEFAULT_PROPERTY_MAX = 10;
	final int DEFAULT_PROPERTY_VALUE = (DEFAULT_PROPERTY_MIN+DEFAULT_PROPERTY_MAX)/2;

	//Condition
	final String ALWAYS_CONDITION = "always";
	final Set<String> VALID_CONDITIONS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
					ALWAYS_CONDITION,"near","far","much_stronger","stronger","even","weaker","much_weaker")));
	
	//Move
	final String TOWARDS = "_towards";
	final String AWAY = "_away";
	final String WALK = "walk_";
	final double WALK_DISTANCE = 5.0;
	final String RUN = "run_";
	final int RUN_STEPS = 2;
	final double RUN_DISTANCE = 15.0;
	final String JUMP = "jump";
	final int JUMP_STEPS = 3;
	final double JUMP_DISTANCE = 10.0;
	final Set<String> VALID_MOVES = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
    	    		WALK+TOWARDS,WALK+AWAY,RUN+TOWARDS,RUN+AWAY,JUMP,"crouch","stand")));
	
	//Attack
	final String BLOCK = "block_";
	final Set<String> VALID_ATTACKS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
					BLOCK+"low",BLOCK+"high","punch_low","punch_high","kick_low","kick_high")));
	
	
	String getName();
	List<AST> getChildren();
	
}
