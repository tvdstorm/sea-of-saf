package saf.structure;

import saf.Checker.Check;

public class LogicalSimple extends Logical{
	
	private final String conditionString;
	
	public LogicalSimple(String conditionString)
	{
		this.conditionString = conditionString; 
	}
	
	public Condition getCondition() 
	{
		return Condition.valueOf(getConditionString());
	}
	
	public String getConditionString() {
		return conditionString;
	}
	
	
	@Override
	public void check(Check checker)
	{
		boolean conditionExists = false;
		for(Condition condition : Condition.values())
		{
			if(getConditionString().equals(condition.name()))
				conditionExists = true;
		}
		
		if(!conditionExists)
			checker.addError("'" + getConditionString() + "' isn't a valid condition");
	}

}
