package objects;

import java.util.List;

public class SimpleCondition extends Condition {
	private String conditionName;
	
	public SimpleCondition()
	{
		this.conditionName=new String();
	}
	public SimpleCondition(String c)
	{
		this.conditionName=c;
	}
	public void setConditionName(String c)
	{
		conditionName=c;
	}
	public String getConditionName()
	{
		return conditionName;
	}
	public boolean isValid()
	{
		try 
		{
			ConditionsNames.valueOf(conditionName);
			return true;
		}
		catch(Exception e)
	 	{
	 	    System.out.println("Invalid Condition Name");
			return false;
		}
	}
	public boolean eval(List<String> currentConditions)
	{
		return currentConditions.contains(conditionName);
	}
}
