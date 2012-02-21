package safAST.condition;

import safVisitor.ISAFVisitable;
import safVisitor.ISAFVisitor;

public class OrCombineCondition extends CombineCondition implements ISAFVisitable{

	public OrCombineCondition(Condition a, Condition b)
	{
		super(a, b);
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
		return "(" + condOne + " || " + condTwo + ")";
	}
}
