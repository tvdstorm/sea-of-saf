package saf.ast;

import java.util.List;

/**
 * A rule for behavior. 
 */

public class BehaviourRule {

	private FightAction fightAction;
	private MoveAction moveAction;
	private Condition condition;
	
	public FightAction getFightAction() {
		return fightAction;
	}

	public void setFightAction(FightAction fightAction) {
		this.fightAction = fightAction;
	}

	public MoveAction getMoveAction() {
		return moveAction;
	}

	public void setMoveAction(MoveAction moveAction) {
		this.moveAction = moveAction;
	}
	
	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	public void validate(List<String> errorList) {
		if (fightAction == null)
			errorList.add("Fightaction not set");
		if (moveAction == null)
			errorList.add("Moveaction not set");
		if (condition == null)
			errorList.add("Condition not set");
		else
			condition.validate(errorList);
	}
	
}
