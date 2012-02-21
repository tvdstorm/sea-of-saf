/**
 * 
 */
package ast.fighter;

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
		
}
