package saf.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * A rule for behavior. 
 */

public class BehaviourRule {

	private final List<String> fightActions;	
	private final List<String> moveActions;
	private final Condition condition;

	public BehaviourRule(Condition condition, List<String> moveActions, List<String> fightActions) {
		this.fightActions = fightActions;
		this.moveActions = moveActions;
		this.condition = condition;
	}
	
	public List<FightAction> getFightActions() {
		List<FightAction> result = new ArrayList<FightAction>();
		for (String fightAction : fightActions) {
			result.add(getFightAction(fightAction));
		}
		return result;
	}
	
	public List<MoveAction> getMoveActions() {
		List<MoveAction> result = new ArrayList<MoveAction>();
		for (String moveAction : moveActions) {
			result.add(getMoveAction(moveAction));
		}
		return result;
	}

	private FightAction getFightAction(String fightAction) {	
		try {
			return FightAction.valueOf(fightAction);
		} catch(IllegalArgumentException ex) {
			return null;
		}

	}

	private MoveAction getMoveAction(String moveAction) {
		try {
			return MoveAction.valueOf(moveAction);
		} catch(IllegalArgumentException ex) {
			return null;
		}
	}

	
	public Condition getCondition() {
		return condition;
	}

	
	public void validate(List<String> errorList) {
		for (String fightAction : fightActions) {
			if (getFightAction(fightAction) == null)
				errorList.add("Unknown fight action: " + fightAction);
		}
		for (String moveAction : moveActions) {
			if (getMoveAction(moveAction) == null)
				errorList.add("Unknown move action: " + moveAction);
		}
		
		if (condition == null)
			errorList.add("Condition not set");
		else
			condition.validate(errorList);
	}
	
}
