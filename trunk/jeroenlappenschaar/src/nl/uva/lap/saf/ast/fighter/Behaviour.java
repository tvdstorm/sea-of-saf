package nl.uva.lap.saf.ast.fighter;

import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;
import nl.uva.lap.saf.ast.action.Ident;

public class Behaviour extends ASTNode
{
	private final String name;
	private final Integer value;

	public Behaviour(Ident name, int value)
	{
		this.name = name.getText();
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
}
