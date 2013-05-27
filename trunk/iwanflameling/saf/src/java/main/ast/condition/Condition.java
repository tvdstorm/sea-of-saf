/**
 * 
 */
package ast.condition;

import ast.ASTNode;
import ast.AstVisitor;

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
	public void accept(AstVisitor astVisitor) {
		astVisitor.visit(this);
	}

}
