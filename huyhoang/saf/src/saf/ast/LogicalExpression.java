package saf.ast;

public abstract class LogicalExpression implements Statement {
	private Statement leftExpression;
	private Statement rightExpression;

	public Statement getLeftExpression() {
		return leftExpression;
	}
	
	public Statement getRightExpression() {
		return rightExpression;
	}
	
	public LogicalExpression(Statement leftExpression, Statement rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
}
