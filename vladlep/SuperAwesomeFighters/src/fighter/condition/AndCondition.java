package fighter.condition;

public class AndCondition implements ICondition {

	private ICondition firstCondition;
	private ICondition secondCondition;

	@Override
	public boolean testCondition() {
		return firstCondition.testCondition()
				&& secondCondition.testCondition();
	}

}
