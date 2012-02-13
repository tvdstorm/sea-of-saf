package saf.ast.condition;

import saf.ast.FighterVisitor;

public class AndOperator extends LogicalCondition {
	public AndOperator(Condition leftExpression, Condition rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
