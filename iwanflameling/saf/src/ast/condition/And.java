/**
 * 
 */
package ast.condition;

import ast.Visitor;

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
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
