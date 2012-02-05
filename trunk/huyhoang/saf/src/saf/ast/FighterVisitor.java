package saf.ast;

public interface FighterVisitor {

	public void visit(AndOperator andOperator);
	public void visit(OrOperator orOperator);
	public void visit(Condition state);
	public void visit(Behaviour behaviour);
	public void visit(Function function);
	public void visit(StrengthAssignment strengthAssignment);
	
}
