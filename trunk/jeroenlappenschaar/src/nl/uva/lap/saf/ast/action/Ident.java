package nl.uva.lap.saf.ast.action;

import nl.uva.lap.saf.ast.ASTNode;
import nl.uva.lap.saf.ast.Visitor;

public class Ident extends ASTNode
{
	private final String text;

	public String getText()
	{
		return text;
	}

	public Ident(String text)
	{
		this.text = text;
	}

	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
}
