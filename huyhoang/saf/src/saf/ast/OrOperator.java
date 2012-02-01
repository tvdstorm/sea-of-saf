package saf.ast;

import saf.checker.*;
import Game.Interpreter;

public class OrOperator extends LogicalExpression {
	public OrOperator(Statement leftExpression, Statement rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visitExpr(this);
	}
}
