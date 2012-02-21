package saf.structure;

import saf.Checker.Check;

public abstract class LogicalClause extends Logical 
{
	private final Logical leftHandSide;
	private final Logical rightHandSide;
	
	protected LogicalClause(Logical leftHandSide, Logical rightHandSide)
	{
		this.leftHandSide = leftHandSide;
		this.rightHandSide = rightHandSide;
	}
	
	public abstract boolean computeClause(boolean left, boolean right);
	
	public Logical getLeftHandSide() 
	{
		return leftHandSide;
	}
	public Logical getRightHandSide() 
	{
		return rightHandSide;
	}
	
	@Override
	public void check(Check checker)
	{		
		checkSide(leftHandSide, checker);
		checkSide(rightHandSide, checker);	
	}
	
	private void checkSide(Logical side, Check checker)
	{
		side.check(checker);
		
		if(side instanceof LogicalSimple && ((LogicalSimple) side).getConditionString().equals(Condition.always.name()))
			checker.addError("Found an 'always' statement in a LogicalClause");
	}
}