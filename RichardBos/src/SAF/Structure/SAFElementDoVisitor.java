package SAF.Structure;

import SAF.Structure.ChoiceCondition.ConditionType;

public class SAFElementDoVisitor implements SAFElementVisitor{

	public void visit(Action action) throws Exception
	{
		
	}
	public void visit(ActionChoose actionChoose) throws Exception
	{
		
	}
	public void visit(Behavior behavior) throws Exception
	{
		
	}
	public void visit(Bot bot) throws Exception
	{
		
	}
	public void visit(Bots bots) throws Exception
	{
		if(bots.getBots().size() == 0)
			throw new Exception("No bots were found.");
	}
	public void visit(Characteristic characteristic) throws Exception
	{
		try
		{
			Behavior.CharacteristicType.valueOf(characteristic.getName());
		}
		catch(Exception ex)
		{
			throw new Exception("The characteristic '" + characteristic.getName() + "' not found.");
		}
		
		int value = characteristic.getValue();
		if (value < 0 || value > 10)
		{
			throw new Exception("The characteristic '" + characteristic.getName() + "' has an invalid value:'" + characteristic.getValue() + ".");
		}
	}
	public void visit(ChoiceCondition choiceCondition) throws Exception
	{
		if(choiceCondition.getType() == ConditionType.AND)
		{
			StringCondition stringCondition = null;
			if(choiceCondition.getCondition() instanceof StringCondition)
			{
				stringCondition = (StringCondition)choiceCondition.getCondition();
				if(stringCondition.getValue() == "always")
					throw new Exception("always is not a valid option in an AND clause.");
			}
			if(choiceCondition.getSecondCondition() instanceof StringCondition)
			{
				stringCondition = (StringCondition)choiceCondition.getSecondCondition();
				if(stringCondition.getValue() == "always")
					throw new Exception("always is not a valid option in an AND clause.");
			}			
		}
	}
	public void visit(Condition condition) throws Exception
	{
		
	}
	public void visit(StringCondition stringCondition) throws Exception
	{
		String value = stringCondition.getValue();
		Behavior.ConditionType.valueOf(value);
	}
}
