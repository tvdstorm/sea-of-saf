package astelements;

import java.util.ArrayList;
import java.util.List;

public class ConditionChoices
{
	private List<ConditionGroup> conditionGroups;
	
	public ConditionChoices() 
	{
		conditionGroups = new ArrayList<ConditionGroup>();
	}
	
	public void addConditionGroup(ConditionGroup conditionGroup) 
	{
		this.conditionGroups.add(conditionGroup);
	}
	
	public ConditionGroup getLastCondition() 
	{
		int conditionAmount = conditionGroups.size();
		return conditionGroups.get(conditionAmount -1);
	}
	
	public String toString() 
	{
		return "Class: " + this.getClass().getName();
	}
	
	public List<ConditionGroup> getConditionGroups() 
	{
		return conditionGroups;
	}

	public void setConditionGroups(List<ConditionGroup> conditionGroups) 
	{
		this.conditionGroups = conditionGroups;
	}
}
