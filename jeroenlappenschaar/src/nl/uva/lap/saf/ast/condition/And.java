package nl.uva.lap.saf.ast.condition;

import nl.uva.lap.saf.ast.Visitor;

public class And extends Connector
{
	public And(Condition lhs, Condition rhs)
	{
		super(lhs, rhs);
	}
	
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
}
