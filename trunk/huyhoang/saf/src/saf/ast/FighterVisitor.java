package saf.ast;

import saf.ast.condition.Condition;
import saf.ast.condition.OrOperator;
import saf.ast.condition.AndOperator;
import saf.ast.definition.Behaviour;
import saf.ast.definition.Choose;
import saf.ast.definition.Strength;
import saf.ast.definition.Action;
import saf.ast.definition.Procedure;

public interface FighterVisitor {
	public void visit(AndOperator andOperator);
	public void visit(OrOperator orOperator);
	public void visit(Condition state);
	public void visit(Behaviour behaviour);
	public void visit(Action function);
	public void visit(Strength strengthAssignment);
	public void visit(Choose choose);
	public void visit(Procedure procedure);
}