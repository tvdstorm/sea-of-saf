package saf.fighter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Characteristic implements AST {

	private Set<Property> properties;
	
	//TODO move
	private Set<String> validProperties = new HashSet<String>(Arrays.asList(
            "punchReach","punchPower","kickReach","kickPower"
    ));
	private int lowerBound = 1;  //inclusive
	private int upperBound = 10; //inclusive	

	public Characteristic(){
		properties = new HashSet<Property>();
	}
	
	public Characteristic(String property, int value) {
		this();
//		properties.add(new Property(property,value));
	}

	public String validPropertyValues(){
		return "The only valid properties are: "+validProperties+". "+
			   "These can have values between "+lowerBound+"and"+upperBound+".";
	}
	
	public boolean isValid(String property) {
//		return isValid(properties.get(property));
		return true; //TODO
	}
	
	public boolean isValid(Integer value) {
		return value >= lowerBound && value <= upperBound;
	}
	
}
