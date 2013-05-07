/**
 * 
 */
package ast.condition;

import ast.Visitor;

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
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
