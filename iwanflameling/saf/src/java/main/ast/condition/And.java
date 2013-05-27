/**
 * 
 */
package ast.condition;

import ast.AstVisitor;

/**
 * @author iwan
 *
 */
public class And extends Connective {
	
	/**
	 * 
	 */
	public And(Condition lhs, Condition rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public void accept(AstVisitor astVisitor) {
		astVisitor.visit(this);
	}

}
