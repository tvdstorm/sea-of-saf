package astelements;

import java.util.ArrayList;

import visitor.SAFElement;
import visitor.SAFElementVisitor;

public class ConditionChoices
{
	private ArrayList<ConditionGroup> conditionGroups;
	
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
	
	public ArrayList<ConditionGroup> getConditionGroups() 
	{
		return conditionGroups;
	}

	public void setConditionGroups(ArrayList<ConditionGroup> conditionGroups) 
	{
		this.conditionGroups = conditionGroups;
	}
}