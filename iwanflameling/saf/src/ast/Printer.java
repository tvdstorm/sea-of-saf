/**
 * 
 */
package ast;

import ast.condition.And;
import ast.condition.Condition;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.prop.Id;

/**
 * @author iwan
 *
 */
public class Printer implements Visitor {
	
	public static String print(ASTNode node){
		Printer printer = new Printer();
		node.accept(printer);
		return printer.sb.toString();
	}
	
	private StringBuilder sb = new StringBuilder();
	
	private void append(String append){
		sb.append(append);
	}
	
	public void visit(And and){
		append(and.toString() + "-and");
	}
	
	public void visit(Object obj){
		append(obj.toString() + "-obj");
	}

	@Override
	public void visit(Leaf leaf) {
		append(leaf.toString() + "-leaf");
		
	}

	@Override
	public void visit(Or or) {
		Condition lhs = or.getLhs();
		Condition rhs = or.getRhs();
		lhs.accept(this);
		append(or.toString() + "-or");
		rhs.accept(this);
		
	}

	@Override
	public void visit(Id id) {
		append(id.toString() + "-id");
		
	}

}
