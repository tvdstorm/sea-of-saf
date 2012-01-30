package saf.ast;

import saf.checker.*;
import Game.Interpreter;

public class LogicalExpression implements Statement 
{
	public enum ConditionalOperators 
	{ 
		AndOperator, 
		OrOperator 
	}
	
	private ConditionalOperators conditionalOperator;
	private Statement leftExpression;
	private Statement rightExpression;

	public ConditionalOperators getConditionalOperator()
	{
		return conditionalOperator;
	}
	
	public Statement getLeftExpression() 
	{
		return leftExpression;
	}
	
	public Statement getRightExpression() 
	{
		return rightExpression;
	}
	
	public LogicalExpression(ConditionalOperators operator, Statement leftExpression, Statement rightExpression )
	{
		this.conditionalOperator = operator;
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
	public void accept(Checker visitor) 
	{
		visitor.visit(this);
	}

	@Override
	public void accept(Interpreter visitor)
	{
		visitor.visit(this);
	}
}
