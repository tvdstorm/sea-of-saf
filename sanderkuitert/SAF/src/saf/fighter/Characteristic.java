package saf.fighter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Characteristic {

	private final static Set<String> validProperties = new HashSet<String>(Arrays.asList(
            "punchReach","punchPower","kickReach","kickPower"
    ));
	private final static int lowerBound = 1;  //inclusive
	private final static int upperBound = 10; //inclusive	
	
	public Characteristic(String property, int value) {
		// TODO Auto-generated constructor stub
	}

	public static String validValues(){
		return "The only valid properties are: "+validProperties+". "+
			   "These can have values between "+lowerBound+"and"+upperBound+".";
	}
	
	public static boolean isValid(String property, int value) {
		return validProperties.contains(property) && 
				value >= lowerBound && value <= upperBound;
	}
	
}
