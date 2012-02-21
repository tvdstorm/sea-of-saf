package fighter.algorithm;

import fighter.IFighter;
import fighter.Personality;
import fighter.action.FightActionType;
import fighter.action.MoveActionType;

public class FighterState {

	private int health;
	private IFighter myFigter;
	private int positionX;
	private int positionY;
	private int predefDirection;
	// remaining time until all actions are completed
	private int remainingTime = 0;
	private FightActionType selectedFightAction;
	private MoveActionType selectedMoveAction;

	public FighterState(IFighter myFighter, int health, int positionX,
			int positionY, int direction) {
		this.myFigter = myFighter;
		this.health = health;
		this.positionX = positionX;
		this.positionY = positionY;
		this.predefDirection = direction;
		selectedMoveAction = MoveActionType.stand;
		selectedFightAction = FightActionType.stand;
	}

	public int calculateFigterDistance(FighterState oponentState) {
		return Math.abs(this.positionX - oponentState.positionX);

	}

	
	private boolean checkInFrame(int newPositionX) {
		if (newPositionX <= 0)
			return false;
		if (newPositionX > BattleConstants.arenaLength)
			return false;
		return true;
	}

	public int computeNewPositionX(int moveDirection) {
		int newPositionX = predefDirection * moveDirection
				* BattleConstants.stepSize;
		if (checkInFrame(newPositionX)) {
			return newPositionX;
		}
		return positionX;
	}

	public boolean finishedPerformingActions() {
		if (remainingTime == 0)
			return true;
		return false;
	}

	public int getHealth() {
		return health;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public int getRemainingTime() {
		return remainingTime;
	}

	public FightActionType getSelectedFightAction() {
		return selectedFightAction;
	}

	public double getSpeed() {
		return myFigter.getPersonality().getSpeed();
	}

	public void performActions(Personality myPersonality,
			FighterState oponentState) {
		// TODO in progress
		selectedMoveAction.doAction(this, oponentState);
		selectedFightAction.doAction(this, oponentState);

		remainingTime--;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void setRemainingTime(int remainingTime) {
		this.remainingTime = remainingTime;
	}

	public void setSelectedFightAction(FightActionType selectedFightAction) {
		this.selectedFightAction = selectedFightAction;
	}

	public void setSelectedMoveAction(MoveActionType selectedMoveAction) {
		this.selectedMoveAction = selectedMoveAction;
	}
}
