package safobjects;

import java.util.ArrayList;

public class ConditionChoices {
	private ArrayList<ConditionGroup> conditionGroups;
	
	public ConditionChoices() {
		conditionGroups = new ArrayList<ConditionGroup>();
	}
	
	public void addConditionGroup(ConditionGroup conditionGroup) {
		this.conditionGroups.add(conditionGroup);
	}
	
	public ConditionGroup getLastCondition() {
		int conditionAmount = conditionGroups.size();
		return conditionGroups.get(conditionAmount -1);
	}
	
	public String toString() {
		String output ="";
		for(int i = 0; i < conditionGroups.size(); i++) {
			output += conditionGroups.get(i).toString();
		}
		
		return "      Class: " + this.getClass().getName() + "\n" + output ;
	}
	
	public ArrayList<ConditionGroup> getConditionGroups() {
		return conditionGroups;
	}

	public void setConditionGroups(ArrayList<ConditionGroup> conditionGroups) {
		this.conditionGroups = conditionGroups;
	}
}
