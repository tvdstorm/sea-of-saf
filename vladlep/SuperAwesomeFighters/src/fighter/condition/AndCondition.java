package fighter.condition;

import fighter.ASTNode;
import fighter.checker.Visitor;
import java.util.List;

public class AndCondition implements ICondition, ASTNode {

	private ICondition firstCondition;
	private ICondition secondCondition;

	public AndCondition(ICondition firstCondition, ICondition secondCondition) {
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	};

	public ICondition getFirstCond() {
		return firstCondition;
	}

	public ICondition getSecondCond() {
		return secondCondition;
	}

	@Override
	public boolean testCondition(List<ConditionType> acceptedConditions) {
		return firstCondition.testCondition(acceptedConditions)
				&& secondCondition.testCondition(acceptedConditions);
	}

	@Override
	public String toString() {

		return "(" + firstCondition.toString() + " AND "
				+ secondCondition.toString() + ")";
	}
}
