package data;

import core.BaseTreeVisitor;

public class Rule extends BaseData {

	private Actions action;

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treePrinter) {
		treePrinter.visit(this);
	}
	
	/*private MoveActionType moveAction;
	private FightActionType fightAction;
	private ConditionType condition;
	
	public Rule(MoveActionType moveAction, FightActionType fightAction, ConditionType condition) {
		this.moveAction = moveAction;
		this.fightAction = fightAction;
		this.condition = condition;
	}
	
	public MoveActionType getMoveAction() {
		return moveAction;
	}
	
	public FightActionType getFightAction() {
		return fightAction;
	}
	
	public ConditionType getCondition() {
		return condition;
	}*/
	
}
