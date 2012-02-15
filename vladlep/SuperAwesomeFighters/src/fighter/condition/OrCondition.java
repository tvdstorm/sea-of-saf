package fighter.condition;

public class OrCondition implements ICondition {
	private ICondition firstCondition;
	private ICondition secondCondition;

	public OrCondition(ICondition firsCondition, ICondition secondCondition)
	{
		this.firstCondition = firsCondition;
		this.secondCondition = secondCondition;
	}
	
	@Override
	public boolean testCondition() {
		return firstCondition.testCondition()
				|| secondCondition.testCondition();
	}
}
