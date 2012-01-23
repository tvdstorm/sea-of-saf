public class Condition 
{
	public enum Conditions {
		stronger,weaker,much_stronger,much_weaker,even,near,far,always
	}
	public enum Operators {
		and,or
	}

	private Conditions _condition; 
	public Conditions getCondition()
	{
		return _condition;
	}

	private Operators _operator; 
	public Operators getOperator()
	{
		return _operator;
	}
	
	public Condition(String condition)
	{
		_condition = Conditions.valueOf(condition);
	}
	
	public Condition(String condition, String operator)
	{
		_condition = Conditions.valueOf(condition);
		_operator = Operators.valueOf(operator);
	}
	
	public void outputData()
	{
		if (_operator!=null)
		{
			System.out.print(_operator+" "+_condition+" ");
		}
		else
		{
			System.out.print(_condition+" ");
		}
	}
	
}