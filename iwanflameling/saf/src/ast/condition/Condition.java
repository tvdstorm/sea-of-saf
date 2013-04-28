/**
 * 
 */
package ast.condition;

import ast.ASTNode;
import ast.Visitor;

/**
 * @author iwan
 *
 */
public abstract class Condition extends ASTNode {

	/**
	 * 
	 */
	public Condition() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
