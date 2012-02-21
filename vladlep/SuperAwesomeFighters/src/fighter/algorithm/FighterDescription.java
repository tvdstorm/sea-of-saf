package fighter.algorithm;

import java.util.ArrayList;
import java.util.List;

import fighter.IFighter;
import fighter.Personality;
import fighter.Rule;
import fighter.condition.ConditionType;

public class FighterDescription {

	private List<ConditionType> acceptedConditions;
	private IFighter fighter;

	private FighterState fighterState;

	public FighterDescription(IFighter fighter, int positionX, int positionY,
			int direction) {
		this.fighter = fighter;
		fighterState = new FighterState(fighter,
				BattleConstants.startingHealth, positionX, positionY, direction);
		acceptedConditions = new ArrayList<ConditionType>();
		acceptedConditions.add(ConditionType.always);
	}

	public int calculateFigterDistance(FighterState oponentState) {
		return fighterState.calculateFigterDistance(oponentState);
	}

	// if he has no move to do he picks a new one, otherwise he does nothing
	public void calculateNextMove() {
		if (fighterState.finishedPerformingActions()) {
			Rule nextRule = fighter.getBehaviour().getNextRule(
					acceptedConditions);

			fighterState.setSelectedMoveAction(nextRule.getNextMoveAction());
			fighterState.setSelectedFightAction(nextRule.getNextFightAction());
		}

	}

	public IFighter getFighter() {
		return fighter;
	}

	public FighterState getFighterState() {
		return fighterState;
	}

	public int getHealth() {
		return fighterState.getHealth();

	}

	public void performActions(FighterState oponentState) {
		fighterState.performActions(fighter.getPersonality(), oponentState);
	}

	public void updateAcceptedPowerCond(Personality oponent) {
		double oponentPower = oponent.getPower();
		double myPower = fighter.getPersonality().getPower();
		double percentageDifference = myPower / oponentPower;

		if (percentageDifference < BattleConstants.veryUnballacedThreash) {
			acceptedConditions.add(ConditionType.much_weaker);
		} else if (percentageDifference < BattleConstants.unballacedThreash) {
			acceptedConditions.add(ConditionType.weaker);
		} else if (1 / percentageDifference > BattleConstants.veryUnballacedThreash) {
			acceptedConditions.add(ConditionType.much_stronger);
		} else if (1 / percentageDifference > BattleConstants.unballacedThreash) {
			acceptedConditions.add(ConditionType.stronger);
		} else {
			acceptedConditions.add(ConditionType.even);
		}
	}

	public void updateDistAcceptedCond(ConditionType newAcceptedCond) {

		acceptedConditions.remove(ConditionType.near);
		acceptedConditions.remove(ConditionType.far);
		acceptedConditions.add(newAcceptedCond);

	}
}
