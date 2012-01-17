package safobjects;

import java.util.ArrayList;

public class ConditionGroup {
	private ArrayList<String> conditionTypes;
	
	public ConditionGroup() {
		conditionTypes = new ArrayList<String>();
	}
	
	public void addConditionType(String type) {
		this.conditionTypes.add(type);
	}
	
	public String toString() {
		String output = "";
		for(int i = 0; i < conditionTypes.size(); i++) {
			output += output == "" ? conditionTypes.get(i): " && " + conditionTypes.get(i);
		}
		output = "          conditionTypes: " + output;
		return "        Class: " + this.getClass().getName() + "\n" + output + "\n";
	}
}
