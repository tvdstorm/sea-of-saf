package saf.ast.condition;

import saf.fight.validate.IConditionVisitable;
import saf.fight.validate.IConditionVisitor;
import saf.visitor.*;

public class CombineCondition extends Condition implements IVisitable, IConditionVisitable{
	protected Condition condOne;
	protected Condition condTwo;
	
	public CombineCondition()
	{
		condOne = null;
		condTwo = null;
	}
	
	public CombineCondition(Condition condA, Condition condB)
	{
		condOne = condA;
		condTwo = condB;
	}
	
	public Condition[] getCombineConditions()
	{
		return new Condition[] {condOne, condTwo}; 
	}
	
	public void setCombineConditions(Condition condA, Condition condB)
	{
		condOne = condA;
		condTwo = condB;
	}
		
	@Override
	public void accept(IVisitor visitor)
	{
		visitor.visit(this);
	}
	
	public String toString()
	{
		return "(" + condOne + " " + condTwo + ")";
	}
	
	@Override
	public boolean accept(IConditionVisitor visitor) {
		return visitor.validateCondition(this);
	}
}
