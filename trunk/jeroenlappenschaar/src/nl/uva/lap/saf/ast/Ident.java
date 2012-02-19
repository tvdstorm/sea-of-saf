package nl.uva.lap.saf.ast;


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
