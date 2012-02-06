/**
 * 
 */
package ast.condition;

/**
 * @author iwan
 *
 */
public abstract class Connective extends Condition {

	private Condition lhs;
	private Condition rhs;
	/**
	 * 
	 */
	public Connective(Condition lhs, Condition rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	/**
	 * @return the lhs
	 */
	public Condition getLhs() {
		return lhs;
	}
	/**
	 * @return the rhs
	 */
	public Condition getRhs() {
		return rhs;
	}
	
	

}
