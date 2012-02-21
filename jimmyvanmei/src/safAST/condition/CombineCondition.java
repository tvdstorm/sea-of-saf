package safAST.condition;

import safVisitor.*;

public class CombineCondition extends Condition implements ISAFVisitable{
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
	public void accept(ISAFVisitor visitor)
	{
		condOne.accept(visitor);
		condTwo.accept(visitor);
		visitor.visit(this);
	}
	
	public String toString()
	{
		return "(" + condOne + " " + condTwo + ")";
	}
}
