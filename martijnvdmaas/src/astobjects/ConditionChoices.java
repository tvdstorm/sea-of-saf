package astobjects;

import java.util.ArrayList;

public class ConditionChoices {
	public ArrayList<ConditionGroup> conditionChoices;
	
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
}
