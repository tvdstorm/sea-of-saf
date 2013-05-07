/**
 * 
 */
package ast.fighter;

import ast.Visitor;
import ast.action.Action;
import ast.condition.Condition;

/**
 * @author iwan
 *
 */
public class Behavior extends FighterProp {
	
	private Condition condition;
	private Action moveAction;
	private Action fightAction;

	public Behavior(Condition condition, Action moveAction, Action fightAction){
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}

	/**
	 * @return the condition
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * @return the moveAction
	 */
	public Action getMoveAction() {
		return moveAction;
	}

	/**
	 * @return the fightAction
	 */
	public Action getFightAction() {
		return fightAction;
	}
	
}
