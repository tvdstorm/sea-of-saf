package saf.ast;

public interface Statement
{
	public void accept(FighterVisitor visitor);
}
