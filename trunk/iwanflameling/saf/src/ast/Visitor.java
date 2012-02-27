package ast;

import ast.action.Choose;
import ast.action.SimpleAction;
import ast.condition.And;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.Behavior;
import ast.fighter.Strength;
import ast.fighter.prop.Id;
import ast.object.Fighter;

/**
 * 
 * @author iwan
 *
 */
public interface Visitor {
	public void visit(And and);
	public void visit(Leaf leaf);
	public void visit(Or or);
	public void visit(SimpleAction action);
	public void visit(Choose choose);
	public void visit(Strength strength);
	public void visit(Behavior behavior);
	public void visit(Fighter fighter);
}
