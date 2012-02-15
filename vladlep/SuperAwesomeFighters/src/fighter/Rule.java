package fighter;

import java.awt.Desktop.Action;

import fighter.action.*;
import fighter.condition.ICondition;

public class Rule {

	private ICondition condition;
	private Actions<MoveActionType> moveAction;
	private Actions<FightActionType> fightAction;

	public Rule(ICondition condition, Actions<MoveActionType> moveActions,
		Actions<FightActionType> fightAction) {
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}

}
