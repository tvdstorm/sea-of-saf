package jsaf.game.fighter;

import java.util.ArrayList;
import java.util.List;

public class FighterConditionGroup
{
	private List<String> conditionTypes;
	
	public FighterConditionGroup() 
	{
		conditionTypes = new ArrayList<String>();
	}

	public void addConditionType(String type) 
	{
		this.conditionTypes.add(type);
	}
	
	
	public List<String> getConditionTypes() 
	{
		return conditionTypes;
	}

	public void setConditionTypes(List<String> conditionTypes) 
	{
		this.conditionTypes = conditionTypes;
	}
}
