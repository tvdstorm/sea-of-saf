package ast;

import ast.condition.And;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.prop.Id;

/**
 * 
 * @author iwan
 *
 */
public interface Visitor {
	public void visit(And and);
	public void visit(Leaf leaf);
	public void visit(Or or);
	public void visit(Id id);
}
