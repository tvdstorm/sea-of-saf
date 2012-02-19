package fighter.condition;

import fighter.ASTNode;

public interface ICondition extends ASTNode {

	/**
	 * test weather the condition holds in the current situation of the game
	 */
	public boolean testCondition();

	@Override
	public String toString();
}
