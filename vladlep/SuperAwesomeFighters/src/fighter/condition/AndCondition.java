package fighter.condition;

import fighter.ASTNode;
import fighter.checker.Visitor;

public class AndCondition implements ICondition, ASTNode {

	private ICondition firstCondition;
	private ICondition secondCondition;

	public AndCondition(ICondition firstCondition, ICondition secondCondition) {
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
	}

	@Override
	public boolean testCondition() {
		return firstCondition.testCondition()
				&& secondCondition.testCondition();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String toString() {

		return "(" + firstCondition.toString() + " AND "
				+ secondCondition.toString() + ")";
	}

	public ICondition getFirstCond() {
		return firstCondition;
	}

	public ICondition getSecondCond() {
		return secondCondition;
	}
}
