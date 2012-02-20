package saf.structure;

import java.util.ArrayList;

public class LogicalSimple extends Logical{
	
	private final Condition condition;
	public Condition getCondition() {
		return condition;
	}
	
	public LogicalSimple(String condition)
	{
		Condition condition2;
		try
		{
			condition2 = Condition.valueOf(condition);
		}
		catch(Exception e)
		{
			//set to default value
			condition2  = null;
			addError("Illegal condition: " + condition);
		}
		this.condition = condition2;
	}
	
	@Override
	public ArrayList<String> check(){
		return getErrors();
	}
}
