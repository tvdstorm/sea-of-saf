package fighter.condition;

public class AndCondition implements ICondition {

	private ICondition firstCondition;
	private ICondition secondCondition;

	public AndCondition(ICondition firstCondition, ICondition secondCondition)
	{
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
	}
	@Override
	public boolean testCondition() {
		return firstCondition.testCondition()
				&& secondCondition.testCondition();
	}

}
