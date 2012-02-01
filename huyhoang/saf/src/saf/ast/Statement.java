package saf.ast;

public interface Statement<T> 
{
	public void accept(FighterVisitor visitor);
}
