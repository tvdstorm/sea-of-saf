package behaviours;
import java.util.LinkedList;
import java.util.List;

public class Condition 
{
	public enum Conditions {
		stronger,weaker,much_stronger,much_weaker,even,near,far,always
	}
	public enum Operators {
		and,or
	}

	private List<String> _errorList;
	
	private Conditions _condition;
	private Operators _operator;
	private Condition _subCondition;
	private Condition _mainCondition;
	
	
	public Condition(String name)
	{
		_errorList = new LinkedList<String>();
		
		try
		{
			_condition = Conditions.valueOf(name);
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+name+"\". Possible options:";
			for (Conditions c : Conditions.values())
			{
				msg+=" "+c+" ";
			}
			_errorList.add(msg);
		}
	}
	
	public Condition(Condition condition)
	{
		_errorList = new LinkedList<String>();
		_mainCondition = condition;
	}
	
	public void addSubCondition(String operator, Condition condition)
	{
		try
		{
			_operator = Operators.valueOf(operator);
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+operator+"\". Possible options:";
			for (Operators o : Operators.values())
			{
				msg+=" "+o+" ";
			}
			_errorList.add(msg);
		}

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
	
	public List<String> getErrors()
	{
		List<String> list = new LinkedList<String>();
		if (_subCondition!=null)
			list.addAll(_subCondition.getErrors());
		if (_mainCondition!=null)
			list.addAll(_mainCondition.getErrors());
		list.addAll(_errorList);
		
		return list;

	}
	
	
}