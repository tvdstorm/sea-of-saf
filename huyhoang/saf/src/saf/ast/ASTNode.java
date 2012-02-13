package saf.ast;

public interface ASTNode {
	public void accept(FighterVisitor visitor);
}