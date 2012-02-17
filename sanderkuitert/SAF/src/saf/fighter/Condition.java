package saf.fighter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Condition implements AST {
	private final static String ALWAYS = "always";
	private final static Set<String> VALID_CONDITIONS = new HashSet<String>(Arrays.asList(
			ALWAYS,"near","far","much_stronger","stronger","even","weaker","much_weaker"
    )); 

	private String condition;
	
	/** @require isValidValue(condition) */
	public Condition(String condition) {
		assert isValidValue(condition): "Requirement broken";
		
		this.condition = condition;
	}
	
	/** @require isValidValue(conditions.get(0)) */
	public Condition(List<String> conditions) {
		this(conditions.get(0));
		//TODO for now, all further conditions are ignored...
	}

	public String getValue() {
		return condition;
	}
	
	public List<AST> getChildren() {
		return new LinkedList<AST>();
	}
	
	public static String describeValidValues() {
		return "Valid conditions are: "+VALID_CONDITIONS;
	}

	public static boolean isValidValue(String condition) {
		return VALID_CONDITIONS.contains(condition);
	}

	public static String getAlwaysCondition() {
		return ALWAYS;
	}
	
}
