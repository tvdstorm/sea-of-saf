package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Characteristic implements Node{
	private final String name;
	private int value;
	private int minValue = 1;
	private int maxValue = 10;
	private List<String> errors;
	
	public Characteristic(String charName, int charValue){
		errors = new ArrayList<String>();
		name = charName;
		value = charValue;		
		if(value < minValue || value > maxValue) 
			errors.add("Value of " + name + " must be between " + minValue + " and " + maxValue + ".");
	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int v){
		value = v;
		if(value < minValue || value > maxValue) 
			errors.add("Value of " + name + " must be between " + minValue + " and " + maxValue + ".");
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + name + 
			   '\n' + indent + "  " +  value;
	}

	@Override
	public List<String> getErrors() {
		return errors;
	}
}
