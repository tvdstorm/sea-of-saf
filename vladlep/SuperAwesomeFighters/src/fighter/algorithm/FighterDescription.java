package fighter.algorithm;

import java.util.ArrayList;
import java.util.List;

import main.Config;
import fighter.IFighter;
import fighter.Personality;
import fighter.Rule;
import fighter.condition.ConditionType;

public class FighterDescription {

	private IFighter fighter;
	private FighterState fighterState;

	private List<ConditionType> acceptedConditions;

	public FighterDescription(IFighter fighter) {
		this.fighter = fighter;
		fighterState = new FighterState(Config.startingHealth);
		acceptedConditions = new ArrayList<ConditionType>();
		acceptedConditions.add(ConditionType.always);
	}

	public void updateAcceptedPowerCond(Personality oponent) {
		double oponentPower = oponent.getPower();
		double myPower = fighter.getPersonality().getPower();
		double percentageDifference = myPower / oponentPower;

		if (percentageDifference < Config.veryUnballacedThreash) {
			acceptedConditions.add(ConditionType.much_weaker);
		} else if (percentageDifference < Config.unballacedThreash) {
			acceptedConditions.add(ConditionType.weaker);
		} else if (1 / percentageDifference > Config.veryUnballacedThreash) {
			acceptedConditions.add(ConditionType.much_stronger);
		} else if (1 / percentageDifference > Config.unballacedThreash) {
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

	public FighterState getFighterState() {
		return fighterState;
	}

	public int getHealth() {
		return fighterState.getHealth();

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
}
