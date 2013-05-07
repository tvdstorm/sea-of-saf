/**
 * 
 */
package ast;

/**
 * @author iwan
 *
 */
public abstract class ASTNode {

	public abstract void accept(Visitor visitor);
	
}
