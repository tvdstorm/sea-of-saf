package saf.structure;

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
			condition2  = Condition.always;
			addError("Illegal condition");
		}
		this.condition = condition2;
	}
	
	@Override
	public void check(){

	}
}
