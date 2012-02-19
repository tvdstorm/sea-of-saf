package nl.uva.lap.saf.ast.condition;

import nl.uva.lap.saf.ast.Visitor;

public class Or extends Connector
{
	public Or(Condition lhs, Condition rhs)
	{
		super(lhs, rhs);
	}
	
	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

}
