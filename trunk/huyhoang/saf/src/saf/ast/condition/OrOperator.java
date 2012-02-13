package saf.ast.condition;

import saf.ast.FighterVisitor;

public class OrOperator extends LogicalCondition {
	public OrOperator(Condition leftExpression, Condition rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
