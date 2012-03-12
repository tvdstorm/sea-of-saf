package saf.ast.condition;

import saf.fight.validate.IConditionVisitable;
import saf.fight.validate.IConditionVisitor;
import saf.visitor.IVisitable;
import saf.visitor.IVisitor;

public class AndCondition extends CombineCondition implements IVisitable, IConditionVisitable{
	
	public AndCondition(Condition a, Condition b)
	{
		super(a, b);
	}
	
	@Override
	public void accept(IVisitor visitor)
	{
		visitor.visit(this);
	}
	
	public String toString()
	{
		return "(" + condOne + " AND " + condTwo + ")";
	}
	
	@Override
	public boolean accept(IConditionVisitor visitor) {
		return visitor.validateCondition(this);
	}
}
