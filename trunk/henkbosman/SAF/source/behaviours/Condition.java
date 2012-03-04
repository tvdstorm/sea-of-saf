package behaviours;
import java.util.LinkedList;
import java.util.List;

public class Condition 
{
	public enum EnumConditions {
		stronger,weaker,much_stronger,much_weaker,even,near,far,always
	}
	public enum EnumOperators {
		and,or, none
	}

	private List<String> _errorList;
	
	private String _condition;
	private String _operator;
	private Condition _subCondition;
	
	private EnumConditions parseCondition()
	{
		try
		{
			return EnumConditions.valueOf(_condition);
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+_condition+"\". Possible options:";
			for (EnumConditions c : EnumConditions.values())
			{
				msg+=" "+c+" ";
			}
			_errorList.add(msg);
		}
		return null;
	}
	
	private EnumOperators parseOperator()
	{
		try
		{
			return EnumOperators.valueOf(_operator);
		} catch (IllegalArgumentException e) {
			String msg = "Error parsing \""+_condition+"\". Possible options:";
			for (EnumOperators c : EnumOperators.values())
			{
				msg+=" "+c+" ";
			}
			_errorList.add(msg);
		}
		return null;
	}
	
	public Condition(String name)
	{
		_errorList = new LinkedList<String>();
		_condition=name;
		_operator="none";
	}
	
	public void addSubCondition(String operator, Condition condition)
	{
		_operator = operator;
		_subCondition = condition;
	}
	
	public boolean checkCondition(List<EnumConditions> conditions)
	{
		switch (parseOperator())
		{
			case and:
				return matchConditions(conditions) && _subCondition.checkCondition(conditions);
			case or:
				return matchConditions(conditions) || _subCondition.checkCondition(conditions);
			default:
				return matchConditions(conditions);
		}
	}
	
	private boolean matchConditions(List<EnumConditions> conditions)
	{
		for (EnumConditions c : conditions)
		{
			if (c.equals(parseCondition()))
				return true;
		}
		
		return false;
	}
	
	public List<String> getErrors()
	{
		List<String> list = new LinkedList<String>();
		parseCondition();
		parseOperator();
		
		if (_subCondition!=null)
		{
			list.addAll(_subCondition.getErrors());
		}
		list.addAll(_errorList);
		
		return list;

	}
}