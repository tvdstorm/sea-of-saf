package fighter.algorithm;

import fighter.IFighter;
import fighter.condition.ConditionType;
import fighter.gui.FightArena;
import fighter.gui.images.FightImagesContainer;

public class MainAlgorithm {

	public static final int direction = 1;
	private static final int sleepTimeMiliS = 1000;
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

		FightImagesContainer.loadAllFightImages();
		fightArena = FightArena
				.getFightArena(leftFighterDesc, rightFighterDesc);
		fightArena.intiArena();

	}

	public static void simulateFight() {
		int fightersDistance;
		do {

			try {
				Thread.sleep(sleepTimeMiliS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// select next move phase
			fightersDistance = leftFighterDesc
					.calculateFigterDistance(rightFighterDesc.getFighterState());
			updateDistanceConditions(fightersDistance);

			leftFighterDesc.calculateNextMove();
			rightFighterDesc.calculateNextMove();

			leftFighterDesc.performActions(rightFighterDesc.getFighterState());
			rightFighterDesc.performActions(leftFighterDesc.getFighterState());

			fightArena.repaint();

			leftFighterDesc.reinit();
			rightFighterDesc.reinit();
		} while (leftFighterDesc.getHealth() > 0
				&& rightFighterDesc.getHealth() > 0);

		String winerName = computeWinner();
		fightArena.showWinner(winerName);
		fightArena.dispose();
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

	private static String computeWinner() {

		if (leftFighterDesc.getHealth() > 0)
			return leftFighterDesc.getFighter().getName();
		else
			return rightFighterDesc.getFighter().getName();
	}

}
