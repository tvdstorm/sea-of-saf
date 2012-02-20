package fighter.algorithm;

import fighter.IFighter;
import fighter.condition.ConditionType;

public class MainAlgorithm {

	public static final int direction = 1;
	private FighterDescription leftFighterDesc;
	private FighterDescription rightFighterDesc;

	public void setUpFight(IFighter leftFighter, IFighter rightFighter) {
		leftFighterDesc = new FighterDescription(leftFighter,
				BattleConstants.leftFighterStartPositionX,
				BattleConstants.groundPositionY, direction);
		rightFighterDesc = new FighterDescription(rightFighter,
				BattleConstants.rightFighterStartPositionX,
				BattleConstants.groundPositionY, -direction);
		leftFighterDesc.updateAcceptedPowerCond(rightFighter.getPersonality());
		rightFighterDesc.updateAcceptedPowerCond(leftFighter.getPersonality());
	}

	public void simulateFight() {
		int fightersDistance;
		do {
			// select next move phase
			fightersDistance = leftFighterDesc
					.calculateFigterDistance(rightFighterDesc.getFighterState());
			updateDistanceConditions(fightersDistance);

			leftFighterDesc.calculateNextMove();
			rightFighterDesc.calculateNextMove();

			// do move, calculate new position and health

			// update drawing and commit changes
		} while (leftFighterDesc.getHealth() != 0
				|| rightFighterDesc.getHealth() != 0);
	}

	private void updateDistanceConditions(int distance) {
		if (distance < BattleConstants.farDistanceThreshold) {
			leftFighterDesc.updateDistAcceptedCond(ConditionType.near);
			rightFighterDesc.updateDistAcceptedCond(ConditionType.near);
		} else {
			leftFighterDesc.updateDistAcceptedCond(ConditionType.far);
			rightFighterDesc.updateDistAcceptedCond(ConditionType.far);
		}

	}

}
