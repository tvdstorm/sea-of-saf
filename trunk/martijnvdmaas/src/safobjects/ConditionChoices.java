package safobjects;

import java.util.ArrayList;

public class ConditionChoices {
	private ArrayList<ConditionGroup> conditionChoices;
	
	public ConditionChoices() {
		conditionChoices = new ArrayList<ConditionGroup>();
	}
	
	public void addConditionGroup(ConditionGroup conditionGroup) {
		this.conditionChoices.add(conditionGroup);
	}
	
	public ConditionGroup getLastCondition() {
		int conditionAmount = conditionChoices.size();
		return conditionChoices.get(conditionAmount -1);
	}
	
	public String toString() {
		String output ="";
		for(int i = 0; i < conditionChoices.size(); i++) {
			output += conditionChoices.get(i).toString();
		}
		
		return "      Class: " + this.getClass().getName() + "\n" + output ;
	}
}
