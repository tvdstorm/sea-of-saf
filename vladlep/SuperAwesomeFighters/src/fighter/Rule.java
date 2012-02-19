package fighter;

import fighter.action.*;
import fighter.checker.Visitor;
import fighter.condition.ICondition;

public class Rule implements ASTNode {

	private ICondition condition;
	private Actions<MoveActionType> moveActions;
	private Actions<FightActionType> fightActions;

	public Rule(ICondition condition, Actions<MoveActionType> moveActions,
			Actions<FightActionType> fightActions) {
		this.condition = condition;
		this.moveActions = moveActions;
		this.fightActions = fightActions;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	public ICondition getCondition() {
		return condition;
	}

	public Actions<MoveActionType> getMoveActions() {
		return moveActions;
	}

	public Actions<FightActionType> getFightActions() {
		return fightActions;
	}

}
