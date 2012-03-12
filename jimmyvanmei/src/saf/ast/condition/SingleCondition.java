package saf.ast.condition;

import saf.fight.validate.IConditionVisitable;
import saf.fight.validate.IConditionVisitor;
import saf.visitor.IVisitable;
import saf.visitor.IVisitor;

public class SingleCondition extends Condition implements IVisitable, IConditionVisitable{
	private String condName;
	
	public SingleCondition()
	{
		condName = null;
	}
	
	public SingleCondition(String cond)
	{
		condName = cond;
	}
	
	public String getConditionName()
	{
		return condName;
	}
	
	public void setConditionName(String cond)
	{
		condName = cond;
	}
	
	public String toString()
	{
		return "(" + condName + ")";
	}
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public boolean accept(IConditionVisitor visitor) {
		return visitor.validateCondition(this);
	}
}
