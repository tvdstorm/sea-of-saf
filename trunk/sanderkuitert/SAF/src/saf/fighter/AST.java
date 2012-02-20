package saf.fighter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface AST {
	
	//Property
	final int DEFAULT_PROPERTY_MIN = 1;
	final int DEFAULT_PROPERTY_MAX = 10;
	final int DEFAULT_PROPERTY_VALUE = (DEFAULT_PROPERTY_MIN+DEFAULT_PROPERTY_MAX)/2;
	final String ASPECT_RANGE = "Reach";
	final String ASPECT_POWER = "Power";
	final Set<String> VALID_ASPECTS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
		"block"+ASPECT_POWER,"punch"+ASPECT_RANGE,"punch"+ASPECT_POWER,"kick"+ASPECT_RANGE,"kick"+ASPECT_POWER)));

	//Condition
	final double LITTLE_STRENGTH_DIFFERENCE = 1.0;
	final double MUCH_STRENGTH_DIFFERENCE = 5.0;
	final String ALWAYS_CONDITION = "always";
	final Set<String> VALID_CONDITIONS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
					ALWAYS_CONDITION,"near","far","much_stronger","stronger","even","weaker","much_weaker")));
	
	//Move
	final double NEAR_ZONE_DISTANCE_PERCENTAGE = 0.05;
	final String TOWARDS = "towards";
	final String AWAY = "away";
	final String WALK = "walk";
	final double WALK_DISTANCE_PERCENTAGE = 0.10;
	final String RUN = "run";
	final int RUN_STEPS = 2;
	final double RUN_DISTANCE_PERCENTAGE = 0.30;
	final String JUMP = "jump";
	final int JUMP_STEPS = 3;
	final double JUMP_DISTANCE_PERCENTAGE = 0.20;
	final Set<String> VALID_MOVES = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
    	    		WALK+"_"+TOWARDS,WALK+"_"+AWAY,RUN+"_"+TOWARDS,RUN+"_"+AWAY,JUMP,"crouch","stand")));
	
	//Attack
	final String BLOCK = "block_";
	final Set<String> VALID_ATTACKS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
					BLOCK+"low",BLOCK+"high","punch_low","punch_high","kick_low","kick_high")));
	
	
	String getName();
	List<AST> getChildren();
	boolean equals(Object other);
	
}
