package AST;

import AST.Actions.FightActions.IFightAction;
import AST.Actions.MoveActions.IMoveAction;

public class Rule{
	private ICondition condition;
	private IAction moveAction;
	private IAction fightAction;
	
	public IAction getMoveAction() {
		return this.moveAction;
	}
	public void setMoveAction(IAction moveAction) {
		this.moveAction = moveAction;
	}
	
	public IAction getFightAction() {
		return this.fightAction;
	}
	public void setFightAction(IAction fightAction) {
		this.fightAction = fightAction;
	}
	
	public ICondition getCondition() {
		return this.condition;
	}
	public void setCondition(ICondition condition) {
		this.condition = condition;
	}
	
	@Override
	public String toString(){
		return this.condition.toString() + " [ " + this.moveAction.toString() + " " + this.fightAction.toString() + " ]" + "\n"; 
	}
}