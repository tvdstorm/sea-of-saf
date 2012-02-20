package safcr.check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import safcr.ast.*;

public class Check {
	private final List<String> errors;
	private String[] characteristicTypes = {"punchPower", "kickPower", "punchReach", "kickReach","speed"};
	private int charsMinValue = 1;
	private int charsMaxValue = 10;
	
	private String currentBot = "";
	
	public Check(){
		errors = new ArrayList<String>();
	}
	
	public void setCurrentBot(String bot){
		currentBot = bot;
	}
	
	public void addErrorMessage(String s){
		errors.add("(" + currentBot + ") - " + s);
	}
	
	public void countCheck(String type, List<Node> nodes){
		String message = "";
		if(type.equals("bots") && nodes.size() < 2)
			message = "At least 2 bots are needed. Bots counted: " + nodes.size();
		
		if(type.equals("rules") && nodes.isEmpty()){
			message = "No behavior rules are defined.";
		}
		
		addErrorMessage(message);
	}
	
	public void checkCharacteristics(List<Node> characteristic){
		for(Node n : characteristic){
			Characteristic c = (Characteristic) n;
			if(!Arrays.asList(characteristicTypes).contains(c.getName()))
				addErrorMessage(c.getName() + "is not a valid characteristic.");
		}
	}
	
	public void checkCharacteristicValue(String name, int value){
		if(value < charsMinValue || value > charsMaxValue)
			addErrorMessage("Value of " + name + ": " + value + 
			" is invalid. Min. value: " + charsMinValue +
			". Max. value: " + charsMaxValue);
	}
	
	public void printErrors(){
		if(!errors.isEmpty()){
			for(String s : errors)
				System.err.println(s);
		}
	}
}
