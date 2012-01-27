package AST;

import Evaluator.EvaluationManager;

public class LogicalExpression extends Statement 
{
	public enum ConditionalOperators 
	{ 
		AndOperator, 
		OrOperator 
	}
	
	private Object leftExpression;
	private Object rightExpression;

	public Object getLeftExpression() 
	{
		return leftExpression;
	}
	
	public Object getRightExpression() 
	{
		return rightExpression;
	}
	
	public LogicalExpression(ConditionalOperators operator, Object leftExpression, Object rightExpression )
	{
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	public String toString(String prefix)
	{
		return	prefix + "LogicalExpression\r\n" +
				prefix + "\t" + this.leftExpression.toString() + "\r\n" +
				prefix + "\t" + this.rightExpression.toString() + "\r\n";
	}

	@Override
	public void accept(EvaluationManager visitor) 
	{
		visitor.visit(this);
	}
}
