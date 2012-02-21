package fighter.condition;

import java.util.List;

import fighter.ASTNode;
import fighter.checker.Visitor;

public class SimpleCondition implements ICondition, ASTNode {

	private ConditionType condition;

	public SimpleCondition(String cond) {
		this.condition = ConditionType.valueOf(cond);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ICondition)
			if (toString().equals(obj))
				return true;
		return false;
	}

	@Override
	public boolean testCondition(List<ConditionType> acceptedConditions) {
		if (acceptedConditions.contains(condition))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return condition.toString();
	}
}
