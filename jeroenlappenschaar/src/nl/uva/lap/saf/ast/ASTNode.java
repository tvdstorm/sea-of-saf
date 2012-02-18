package nl.uva.lap.saf.ast;

public abstract class ASTNode
{
	public abstract void accept(Visitor visitor);

	@Override
	public String toString()
	{
		return Printer.print(this);
	}
}