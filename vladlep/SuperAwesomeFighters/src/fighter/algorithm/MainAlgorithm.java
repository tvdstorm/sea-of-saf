package fighter.algorithm;

import fighter.IFighter;
import fighter.condition.ConditionType;
import fighter.gui.FightArena;

public class MainAlgorithm {

	public static final int direction = 1;
	private static FightArena fightArena;
	private static FighterDescription leftFighterDesc;
	private static FighterDescription rightFighterDesc;

	public static void setUpFight(IFighter leftFighter, IFighter rightFighter) {
		leftFighterDesc = new FighterDescription(leftFighter,
				BattleConstants.leftFighterStartPositionX,
				BattleConstants.groundPositionY, direction);
		rightFighterDesc = new FighterDescription(rightFighter,
				BattleConstants.rightFighterStartPositionX,
				BattleConstants.groundPositionY, -direction);
		leftFighterDesc.updateAcceptedPowerCond(rightFighter.getPersonality());
		rightFighterDesc.updateAcceptedPowerCond(leftFighter.getPersonality());

		fightArena = FightArena.getFightArena(leftFighterDesc, rightFighterDesc);
		fightArena.intiArena();
		
	}

	public static void simulateFight() {
		int fightersDistance;
		do {
			// select next move phase
			fightersDistance = leftFighterDesc
					.calculateFigterDistance(rightFighterDesc.getFighterState());
			updateDistanceConditions(fightersDistance);

			leftFighterDesc.calculateNextMove();
			rightFighterDesc.calculateNextMove();

			leftFighterDesc.performActions(rightFighterDesc.getFighterState());
			rightFighterDesc.performActions(leftFighterDesc.getFighterState());
			
			fightArena.redrawComponents();
			
		} while (leftFighterDesc.getHealth() != 0
				|| rightFighterDesc.getHealth() != 0);
	}

	private static void updateDistanceConditions(int distance) {
		if (distance < BattleConstants.farDistanceThreshold) {
			leftFighterDesc.updateDistAcceptedCond(ConditionType.near);
			rightFighterDesc.updateDistAcceptedCond(ConditionType.near);
		} else {
			leftFighterDesc.updateDistAcceptedCond(ConditionType.far);
			rightFighterDesc.updateDistAcceptedCond(ConditionType.far);
		}

	}

}
