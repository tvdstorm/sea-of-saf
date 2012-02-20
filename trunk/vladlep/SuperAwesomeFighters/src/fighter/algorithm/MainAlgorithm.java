package fighter.algorithm;

import fighter.IFighter;

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
		do {
			// select next move phase
			leftFighterDesc.updateDistAcceptedCond();
			rightFighterDesc.updateDistAcceptedCond();
			
			leftFighterDesc.pickNextMoves();
			rightFighterDesc.pickNextMoves();
			// leftFighterDesc.selectMove();

			// do move, calculate new position and health

			// commit health

			// update graphics
		} while (leftFighterDesc.getHealth() != 0
				|| rightFighterDesc.getHealth() != 0);
	}
}
