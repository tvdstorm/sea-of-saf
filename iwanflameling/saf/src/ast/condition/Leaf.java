/**
 * 
 */
package ast.condition;

import ast.Visitor;


/**
 * @author iwan
 *
 */
public class Leaf extends Condition {
	
	private String id;

	/**
	 * 
	 */
	public Leaf(String id) {
		this.id = id;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
}
