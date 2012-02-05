package saf.ast;

public abstract class Expression {
	private boolean expressionValue;
	
	public void setExpressionValue(boolean expressionValue) {
		this.expressionValue = expressionValue;
	}
	
	public boolean getExpressionValue() {
		return this.expressionValue;
	}
}
