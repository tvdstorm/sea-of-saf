package saf.fighter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Aspect implements AST {
	private final static Set<String> VALID_ASPECTS = new HashSet<String>(Arrays.asList(
										"punchReach","punchPower","kickReach","kickPower"));

	private String name;
	
	public Aspect(String name) {
		this.name = name;
	}

	public String getValue() {
		return name;
	}
	
	public List<AST> getChildren(){
		return new LinkedList<AST>();
	}
	
	public static String describeValidValues() {
		return "The only valid aspects are: "+VALID_ASPECTS;
	}
	
	public static boolean isValidValue(String aspect) {
		return VALID_ASPECTS.contains(aspect);
	}


	public static class Value implements AST {
		private final static int LOWER_BOUND = 1;  	//inclusive
		private final static int UPPER_BOUND = 10; 	//inclusive
		private final static int DEFAULT = 5;
		
		private int value;
		
		
		public Value(int value) {
			this.value = value;
		}
		
		public String getValue() {
			return Integer.toString(value);
		}
		
		public int getIntValue() {
			return value;
		}
		
		public List<AST> getChildren() {
			return new LinkedList<AST>();
		}

		public static String describeValidValues() {
			return "Aspects can have values between "+LOWER_BOUND+"and"+UPPER_BOUND+".";
		}

		public static boolean isValidValue(String aspect, int value) {
			return value >= LOWER_BOUND && value <= UPPER_BOUND;
		}

		public static int getDefault() {
			return DEFAULT;
		}

	}

}
