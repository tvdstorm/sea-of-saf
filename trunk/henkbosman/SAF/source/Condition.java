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
	
	public void AddSubCondition(String operator, Condition condition)
	{
		_operator = Operators.valueOf(operator);
		_subCondition = condition;
	}
	
	public void outputData()
	{
		if (_mainCondition!=null)
		{
			_mainCondition.outputData();
		}
		
		if (_subCondition!=null)
		{
			_subCondition.outputData();
		}
		if (_operator!=null)
		{
			System.out.print(" "+_operator);
		}
		
		if (_condition!=null)
		{
			System.out.print(" "+_condition);
		}

	}
	
}