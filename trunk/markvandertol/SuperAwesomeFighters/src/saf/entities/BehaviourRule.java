package saf.entities;

public class BehaviourRule {
	private FightActionType fightAction;
	private MoveActionType moveAction;
	private Condition condition;
	
	/**
	 * @return the fightAction
	 */
	public FightActionType getFightAction() {
		return fightAction;
	}
	/**
	 * @param fightAction the fightAction to set
	 */
	public void setFightAction(FightActionType fightAction) {
		this.fightAction = fightAction;
	}
	/**
	 * @return the moveAction
	 */
	public MoveActionType getMoveAction() {
		return moveAction;
	}
	/**
	 * @param moveAction the moveAction to set
	 */
	public void setMoveAction(MoveActionType moveAction) {
		this.moveAction = moveAction;
	}
	
	public Condition getCondition() {
		return condition;
	}
	
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
}
