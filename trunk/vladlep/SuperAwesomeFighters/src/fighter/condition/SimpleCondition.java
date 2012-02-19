package fighter.condition;

import fighter.ASTNode;
import fighter.checker.Visitor;

public class SimpleCondition implements ICondition, ASTNode {

	private ConditionType condition;

	public SimpleCondition(String cond) {
		this.condition = ConditionType.valueOf(cond);
	}

	// TODO think what to test based on the upper algorithm
	@Override
	public boolean testCondition() {
		return false;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String toString() {
		return condition.toString();
	}
}
