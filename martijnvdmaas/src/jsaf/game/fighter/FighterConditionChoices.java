package jsaf.game.fighter;

import java.util.ArrayList;
import java.util.List;

public class FighterConditionChoices
{
	private List<FighterConditionGroup> conditionGroups;
	
	public FighterConditionChoices() 
	{
		conditionGroups = new ArrayList<FighterConditionGroup>();
	}
	
	public void addConditionGroup(FighterConditionGroup conditionGroup) 
	{
		this.conditionGroups.add(conditionGroup);
	}
	
	public FighterConditionGroup getLastCondition() 
	{
		int conditionAmount = conditionGroups.size();
		return conditionGroups.get(conditionAmount -1);
	}
	
	public List<FighterConditionGroup> getConditionGroups() 
	{
		return conditionGroups;
	}

	public void setConditionGroups(List<FighterConditionGroup> conditionGroups) 
	{
		this.conditionGroups = conditionGroups;
	}
}
