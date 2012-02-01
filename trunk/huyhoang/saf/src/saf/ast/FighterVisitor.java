package saf.ast;

public interface FighterVisitor {

	public void visitExpr(AndOperator andOperator);
	public void visitExpr(OrOperator orOperator);
	public void visitExpr(State state);
	public void visit(Behaviour behaviour);
	public void visit(Function function);
	public void visit(StrengthAssignment strengthAssignment);
	
}
