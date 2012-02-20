package fighter.condition;

import java.util.List;

import fighter.ASTNode;

public interface ICondition extends ASTNode {

	/**
	 * test weather the condition holds in the current situation of the game
	 * @param acceptedConditions 
	 */
	public boolean testCondition(List<ConditionType> acceptedConditions);

	@Override
	public String toString();
}
