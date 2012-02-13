package saf.game.engine;

import saf.game.GameConstant;
import saf.game.state.BotState;
import saf.structure.intelligence.BehaviorIntelligence;

public class ActionProcessor implements GameConstant {
	private static final double FIGHTACTION_BASERANGE = 5;
	private static final double FIGHTACTION_BASEPOWER = 5;

	private final BotState botState;
	private final BotState otherBotState;
	private final int distance;
	private final String moveAction;
	private final String fightAction;

	private double attackPower = FIGHTACTION_BASEPOWER;
	private double attackReach = FIGHTACTION_BASERANGE;

	private final double outcome;

	public ActionProcessor(BotState botState, BotState otherBotState, int distance, String moveAction,
			String fightAction) {
		this.botState = botState;
		this.otherBotState = otherBotState;
		this.distance = distance;
		this.moveAction = moveAction;
		this.fightAction = fightAction;

		this.outcome = processFightAction();
	}

	public double getOutcome() {
		return this.outcome;
	}

	private double processFightAction() {

		if (fightAction.contains(FIGHT_TYPE_BLOCK)) {
			return 0.0;
		}

		boolean botJumping = moveAction.equals(MOVE_TYPE_JUMP);

		calcPowerAndReach();

		if (attackReach <= distance)
			return 0.0;

		if (fightAction.contains(FIGHT_TYPE_HIGH)) {

			if (!botJumping && otherBotState.isJumping()) {
				
				if (otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKLOW))
					
					return 0.0;
				
			} else if (botJumping && !otherBotState.isJumping()) {
				
				return 0.0; // missed
				
			} else { // Both are jumping or there is no jumping
				
				if (otherBotState.getLastMoveAction().equals(MOVE_TYPE_CROUCH)	
						|| otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKHIGH)
						|| otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKLOW))
					
					return 0.0; // missed
				
			}

		} else if (fightAction.contains(FIGHT_TYPE_LOW)) {

			if (!botJumping && otherBotState.isJumping()) {

				return 0.0; // missed

			} else if (botJumping && !otherBotState.isJumping()) {

				if (otherBotState.getLastMoveAction().equals(MOVE_TYPE_CROUCH)
						|| otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKHIGH))

					return 0.0; // missed

			} else { // Both are jumping or there is no jumping

				if (otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKLOW))

					return 0.0; // missed
			}
		}

		return attackPower;
	}

	private void calcPowerAndReach() {

		if (fightAction.contains(FIGHT_TYPE_PUNCH)) {
			
			attackReach *= getCharacteristicValue(CHAR_TYPE_PUNCHREACH);
			attackPower *= getCharacteristicValue(CHAR_TYPE_PUNCHPOWER);
			
		} else if (fightAction.contains(FIGHT_TYPE_KICK)) {
			
			attackReach *= getCharacteristicValue(CHAR_TYPE_KICKREACH);
			attackPower *= getCharacteristicValue(CHAR_TYPE_KICKPOWER);
			
		}

	}

	private int getCharacteristicValue(String name) {
		return BehaviorIntelligence.getCharacteristic(botState.getBot(), name);
	}

}
