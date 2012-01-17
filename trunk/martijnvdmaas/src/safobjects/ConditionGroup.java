package safobjects;

import java.util.ArrayList;

public class ConditionGroup {
	public ArrayList<String> conditionTypes;
	
	public ConditionGroup() {
		conditionTypes = new ArrayList<String>();
	}
	
	public void addConditionType(String type) {
		this.conditionTypes.add(type);
	}
}
