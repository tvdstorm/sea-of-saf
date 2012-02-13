package saf.ast.condition;

import saf.ast.ASTNode;

public abstract class LogicalCondition extends Condition implements ASTNode {
	private Condition leftExpression;
	private Condition rightExpression;
	
	public Condition getLeftExpression() {
		return leftExpression;
	}
	
	public Condition getRightExpression() {
		return rightExpression;
	}
	
	public void setLeftExpression(Condition leftExpression) {
		this.leftExpression = leftExpression;
	}
	
	public LogicalCondition(Condition leftExpression, Condition rightExpression) {
		super("");
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
}
