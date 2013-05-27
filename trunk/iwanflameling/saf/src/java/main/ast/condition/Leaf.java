/**
 * 
 */
package ast.condition;

import ast.AstVisitor;


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
	public void accept(AstVisitor astVisitor) {
		astVisitor.visit(this);
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
}
