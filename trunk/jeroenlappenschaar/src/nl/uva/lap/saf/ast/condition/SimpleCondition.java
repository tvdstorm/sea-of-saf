package nl.uva.lap.saf.ast.condition;

import nl.uva.lap.saf.ast.Visitor;

public class SimpleCondition extends Condition
{
	private final String condition;
	
	public SimpleCondition(String condition)
	{
		this.condition = condition;
	}
	
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

	public String getCondition()
	{
		return condition;
	}
}
