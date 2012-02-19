/**
 * 
 */
package ast.fighter.prop;

import ast.ASTNode;
import ast.Visitor;

/**
 * @author iwan
 *
 */
public class Id extends ASTNode {
	
	private String name;

	/**
	 * 
	 */
	public Id(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	

}
