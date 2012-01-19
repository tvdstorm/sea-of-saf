package ast;

import ast.actions.fightActions.IFightAction;
import ast.actions.moveActions.IMoveAction;

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
		return this.condition.toString() + 
				" [ " + ((this.moveAction == null)?"":this.moveAction.toString()) + 
				" " + ((this.fightAction == null)?"":this.fightAction.toString()) + " ]" + "\n"; 
	}
}