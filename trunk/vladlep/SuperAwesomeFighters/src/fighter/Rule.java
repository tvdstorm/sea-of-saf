package fighter;

import java.util.List;
import java.util.Random;

import fighter.action.*;
import fighter.checker.Visitor;
import fighter.condition.ConditionType;
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

	public boolean checkCondition(List<ConditionType> acceptedConditions) {
		return condition.testCondition(acceptedConditions);

	}

	public MoveActionType getNextMoveAction() {
		int index;
		index = generatRandomIndex(moveActions.size());
		return moveActions.get(index);
	}

	public FightActionType getNextFightAction() {
		int index;
		index = generatRandomIndex(fightActions.size());
		return fightActions.get(index);
	}

	private int generatRandomIndex(int maxSize) {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(maxSize);
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
