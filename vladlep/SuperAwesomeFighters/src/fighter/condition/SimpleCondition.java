package fighter.condition;

public class SimpleCondition implements ICondition {

	private ConditionType condition;

	public SimpleCondition(String cond)
	{
		this.condition = ConditionType.valueOf(cond);
	}
	
	// TODO think what to test based on the upper algorithm
	@Override
	public boolean testCondition() {
		return false;
	}
}
