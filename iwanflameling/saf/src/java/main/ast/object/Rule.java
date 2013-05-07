/**
 * 
 */
package ast.object;

import ast.fighter.Fighter;

/**
 * Describes what a {@link Fighter} does in a particular condition the {@link Fighter}
 * finds itself in.
 * 
 * @author Iwan Flameling
 */
public class Rule {
	/**
	 * action performed by the {@link Fighter}.
	 */
	private MoveActionType moveAction;
	/**
	 * FightAction performed by the {@link Fighter}.
	 */
	private FightActionType fightAction;
	/**
	 * Condition in which the {@link Fighter} is in.
	 */
	private ConditionType condition;
}
