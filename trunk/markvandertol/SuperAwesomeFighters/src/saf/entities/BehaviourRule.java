package saf.entities;

import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

/**
 * A rule for behavior. 
 */
@Guarded
public class BehaviourRule {
	@NotNull
	private FightAction fightAction;
	@NotNull
	private MoveAction moveAction;
	@NotNull
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
