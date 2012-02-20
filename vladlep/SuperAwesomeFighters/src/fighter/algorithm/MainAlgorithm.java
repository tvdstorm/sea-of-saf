package fighter.algorithm;

import main.Config;
import fighter.IFighter;
import fighter.condition.ConditionType;

public class MainAlgorithm {

	private FighterDescription leftFighterDesc;
	private FighterDescription rightFighterDesc;

	public void setUpFight(IFighter leftFighter, IFighter rightFighter) {
		leftFighterDesc = new FighterDescription(leftFighter);
		rightFighterDesc = new FighterDescription(rightFighter);
		leftFighterDesc.updateAcceptedPowerCond(rightFighter.getPersonality());
		rightFighterDesc.updateAcceptedPowerCond(leftFighter.getPersonality());
	}

	public void simulateFight() {
		int fightersDistance;
		do {
			// select next move phase
			fightersDistance = calculateFigterDistance();
			updateDistanceConditions(fightersDistance);

			leftFighterDesc.calculateNextMove();
			rightFighterDesc.calculateNextMove();

			// do move, calculate new position and health

			// update drawing and commit changes
		} while (leftFighterDesc.getHealth() != 0
				|| rightFighterDesc.getHealth() != 0);
	}

	private void updateDistanceConditions(int distance) {
		if (distance < Config.farDistanceThreshold) {
			leftFighterDesc.updateDistAcceptedCond(ConditionType.near);
			rightFighterDesc.updateDistAcceptedCond(ConditionType.near);
		} else {
			leftFighterDesc.updateDistAcceptedCond(ConditionType.far);
			rightFighterDesc.updateDistAcceptedCond(ConditionType.far);
		}

	}

	private int calculateFigterDistance() {
		int firstPos = rightFighterDesc.getFighterState().getPosition();
		int secondPos = leftFighterDesc.getFighterState().getPosition();

		return Math.abs(firstPos - secondPos);

	}
}
