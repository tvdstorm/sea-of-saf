package saf.entities;

/**
 * A rule for behavior. 
 */

public class BehaviourRule {

	private FightAction fightAction;
	private MoveAction moveAction;
	private Condition condition;
	
	/**
	 * @return the fightAction
	 */
	public FightAction getFightAction() {
		return fightAction;
	}
	/**
	 * @param fightAction the fightAction to set
	 */
	public void setFightAction(FightAction fightAction) {
		this.fightAction = fightAction;
	}
	/**
	 * @return the moveAction
	 */
	public MoveAction getMoveAction() {
		return moveAction;
	}
	/**
	 * @param moveAction the moveAction to set
	 */
	public void setMoveAction(MoveAction moveAction) {
		this.moveAction = moveAction;
	}
	
	/**
	 * 
	 * @return the condition associated to this rule
	 */
	public Condition getCondition() {
		return condition;
	}
	
	/**
	 * 
	 * @param condition the condition associated to this rule
	 */
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
}
