/**
 * 
 */
package ast.condition;

import ast.AstVisitor;

/**
 * @author iwan
 *
 */
public class Or extends Connective {

	/**
	 * 
	 */
	public Or(Condition lhs, Condition rhs) {
		super(lhs, rhs);
	}

	@Override
	public void accept(AstVisitor astVisitor) {
		astVisitor.visit(this);
		
	}

}
