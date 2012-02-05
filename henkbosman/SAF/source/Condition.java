import java.util.List;

public class Condition 
{
	public enum Conditions {
		stronger,weaker,much_stronger,much_weaker,even,near,far,always
	}
	public enum Operators {
		and,or
	}

	private Conditions _condition;
	private Operators _operator;
	private Condition _subCondition;
	private Condition _mainCondition;
	
	
	public Condition(String name)
	{
		_condition = Conditions.valueOf(name);
	}
	
	public Condition(Condition condition)
	{
		_mainCondition = condition;
	}
	
	public void addSubCondition(String operator, Condition condition)
	{
		_operator = Operators.valueOf(operator);
		_subCondition = condition;
	}
	
	public boolean checkCondition(List<Condition.Conditions> conditions)
	{
		if (_operator==null)
			return true;
		switch (_operator)
		{
			case and:
				return getFirstCondition(conditions) && getSecondCondition(conditions);
			case or:
				return getFirstCondition(conditions) || getSecondCondition(conditions);
		}

		return true;
	}
	
	private boolean getFirstCondition(List<Condition.Conditions> conditions)
	{
		if (_mainCondition!=null)
			return _mainCondition.checkCondition(conditions);
		
		for (Condition.Conditions c : conditions)
		{
			if (c.equals(_condition))
				return true;
		}
		
		return false;
	}
	
	private boolean getSecondCondition(List<Condition.Conditions> conditions)
	{
		return _subCondition.checkCondition(conditions);
	}
	
	
	
}