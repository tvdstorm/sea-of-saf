package saf.ast;

import saf.checker.*;
import Game.Interpreter;

public class AndOperator extends LogicalExpression {
	public AndOperator(Statement leftExpression, Statement rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
