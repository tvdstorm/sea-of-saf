package saf.ast;

import saf.checker.*;
import Game.Interpreter;

/**
 * This class holds a Boolean Expression, consisting of a "left operand", "right operand", and the "operator".
 * 
 * @author huyhoang
 */
public class BoolExpression implements Statement
{
	public enum ComparisonOperators
	{
		equalsOperator
	}
	
	private Statement leftOperand;
	public Statement getLeftOperand()
	{
		return leftOperand;
	}
	
	// this may need refactoring... change it to Statement instead of Object.
	private Object rightOperand;
	public Object getRightOperand()
	{
		return rightOperand;
	}
	
	private ComparisonOperators comparisonOperator;
	public ComparisonOperators getComparisonOperator() 
	{
		return comparisonOperator;
	}
	
	public BoolExpression(ComparisonOperators comparisonOperator, Statement leftOperand, Object rightOperand)
	{
		this.leftOperand 		= leftOperand;
		this.rightOperand		= rightOperand;
		this.comparisonOperator = comparisonOperator;
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
