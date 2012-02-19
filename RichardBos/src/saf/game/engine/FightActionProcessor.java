package saf.game.engine;

import saf.game.GameConstant;
import saf.game.state.BotState;
import saf.structure.intelligence.BehaviorIntelligence;

public class FightActionProcessor implements GameConstant {

	private final BotState otherBotState;
	private final int distance;
	private final String fightAction;
	private final Boolean isJumping;
	private final double outcome;
	private final BotState botState;

	private double attackPower = FIGHTACTION_BASEPOWER;
	private double attackReach = FIGHTACTION_BASERANGE;

	public FightActionProcessor(BotState botState, BotState otherBotState,
			int distance, String fightAction, boolean isJumping) {
		this.botState = botState;
		this.otherBotState = otherBotState;
		this.distance = distance;
		this.fightAction = fightAction;
		this.isJumping = isJumping;

		this.outcome = processFightAction();
	}

	public double getOutcome() {
		return this.outcome;
	}

	private double processFightAction() {

		if (fightAction.isEmpty() || otherBotState == null || isJumping == null)
			throw new IllegalArgumentException();

		if (fightAction.contains(FIGHT_ACTION_BLOCK)) {
			return 0.0;
		}

		calcPowerAndReach();

		if (attackReach < distance)
			return 0.0;

		if (fightAction.contains(FIGHT_ACTION_HIGH)) {

			attackPower = checkFightActionHigh();

		} else if (fightAction.contains(FIGHT_ACTION_LOW)) {

			attackPower = checkFightActionLow();
		}

		return attackPower;
	}

	private void calcPowerAndReach() {

		if (fightAction.contains(FIGHT_ACTION_PUNCH)) {

			attackReach *= getCharacteristicValue(CHARACTERISTIC_PUNCHREACH);
			attackPower *= getCharacteristicValue(CHARACTERISTIC_PUNCHPOWER);

		} else if (fightAction.contains(FIGHT_ACTION_KICK)) {

			attackReach *= getCharacteristicValue(CHARACTERISTIC_KICKREACH);
			attackPower *= getCharacteristicValue(CHARACTERISTIC_KICKPOWER);
		}

	}

	private double checkFightActionHigh() {
		if (!isJumping && otherBotState.isJumping()) {

			if (otherBotState.getLastFightAction()
					.equals(FIGHT_ACTION_BLOCKLOW))

				return 0.0;

		} else if (isJumping && !otherBotState.isJumping()) {

			return 0.0;

		} else { // Both are jumping or there is no jumping

			if (otherBotState.getLastMoveAction().equals(MOVE_ACTION_CROUCH)
					|| otherBotState.getLastFightAction().equals(
							FIGHT_ACTION_BLOCKHIGH)
					|| otherBotState.getLastFightAction().equals(
							FIGHT_ACTION_BLOCKLOW))

				return 0.0;
		}

		return attackPower;
	}

	private double checkFightActionLow() {

		if (!isJumping && otherBotState.isJumping()) {

			return 0.0;

		} else if (isJumping && !otherBotState.isJumping()) {

			if (otherBotState.getLastMoveAction().equals(MOVE_ACTION_CROUCH)
					|| otherBotState.getLastFightAction().equals(
							FIGHT_ACTION_BLOCKHIGH))

				return 0.0;

		} else { // Both are jumping or there is no jumping

			if (otherBotState.getLastFightAction()
					.equals(FIGHT_ACTION_BLOCKLOW))

				return 0.0;
		}
		return attackPower;
	}

	private int getCharacteristicValue(String name) {
		return BehaviorIntelligence.getCharacteristic(botState.getBot(), name);
	}

}
