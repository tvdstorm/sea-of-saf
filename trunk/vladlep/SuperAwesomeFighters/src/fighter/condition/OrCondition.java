package fighter.condition;

import java.util.List;

import fighter.ASTNode;
import fighter.checker.Visitor;

public class OrCondition implements ICondition, ASTNode {
	private ICondition firstCondition;
	private ICondition secondCondition;

	public OrCondition(ICondition firsCondition, ICondition secondCondition) {
		this.firstCondition = firsCondition;
		this.secondCondition = secondCondition;
	}

	@Override
	public boolean testCondition(List<ConditionType> acceptedConditions) {
		return firstCondition.testCondition(acceptedConditions)
				|| secondCondition.testCondition(acceptedConditions);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String toString() {

		return "(" + firstCondition.toString() + " OR "
				+ secondCondition.toString() + ")";
	}

	public ICondition getFirstCond() {
		return firstCondition;
	}

	public ICondition getSecondCond() {
		return secondCondition;
	}
}
