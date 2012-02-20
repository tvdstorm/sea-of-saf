package fighter.algorithm;

import fighter.action.FightActionType;
import fighter.action.MoveActionType;

public class FighterState {
	// http://docs.oracle.com/javase/1.5.0/docs/guide/language/enums.html
	private int position;
	private MoveActionType selectedMoveAction;
	private FightActionType selectedFightAction;
	// remaining time until all actions are completed
	private int remainingTime;
	private int health;

	public FighterState(int health) {
		this.health = health;
	}

	public boolean finishedPerformingActions() {
		if (remainingTime == 0)
			return true;
		return false;
	}

	public int getHealth() {
		return health;
	}

	public int getPosition() {
		return position;
	}

	public void setSelectedFightAction(FightActionType selectedFightAction) {
		this.selectedFightAction = selectedFightAction;
	}

	public void setSelectedMoveAction(MoveActionType selectedMoveAction) {
		this.selectedMoveAction = selectedMoveAction;
	}
}
