package saf.fighter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


interface AST {

	public final static Set<String> VALID_ASPECTS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
														"punchReach","punchPower","kickReach","kickPower")));
	public final static int DEFAULT_PROPERTY_MIN = 1;
	public final static int DEFAULT_PROPERTY_MAX = 10;
	public final static int DEFAULT_PROPERTY_VALUE = (DEFAULT_PROPERTY_MIN+DEFAULT_PROPERTY_MAX)/2;
	public final static String ALWAYS_CONDITION = "always";
	public final static Set<String> VALID_CONDITIONS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
					ALWAYS_CONDITION,"near","far","much_stronger","stronger","even","weaker","much_weaker")));
	public final static Set<String> VALID_ATTACKS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
    	    					"block_low","block_high","punch_low","punch_high","kick_low","kick_high")));
	public final static Set<String> VALID_MOVES = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(
    	    				"walk_towards","walk_away","run_towards","run_away","jump","crouch","stand")));
	
	
	public String getName();
	public List<AST> getChildren();
	
}
