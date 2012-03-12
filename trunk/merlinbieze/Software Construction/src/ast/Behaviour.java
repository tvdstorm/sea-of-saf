package saf.ast;

import saf.ast.action.Action;
import saf.ast.condition.Condition;

public class Behaviour {

	private final Condition condition;
	private final Action moveAction;
	private final Action fightAction;

	public Condition getCondition() {
		return this.condition;
	}

	public Action getMoveAction() {
		return this.moveAction;
	}

	public Action getFightAction() {
		return this.fightAction;
	}

	public Behaviour(Condition condition, Action moveAction, Action fightAction) {
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
}