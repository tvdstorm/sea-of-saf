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
	final Set<String> VALID_MOVES = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
    	    		"walk_towards","walk_away","run_towards","run_away","jump","crouch","stand")));
	
	//Attack
	final String BLOCK = "block_";
	final Set<String> VALID_ATTACKS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
					BLOCK+"low",BLOCK+"high","punch_low","punch_high","kick_low","kick_high")));
	
	
	String getName();
	List<AST> getChildren();
	
}
