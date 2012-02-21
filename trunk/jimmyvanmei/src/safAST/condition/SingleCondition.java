package safAST.condition;

import safVisitor.ISAFVisitable;
import safVisitor.ISAFVisitor;

public class SingleCondition extends Condition implements ISAFVisitable{
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
	public void accept(ISAFVisitor visitor) {
		visitor.visit(this);
	}
}
