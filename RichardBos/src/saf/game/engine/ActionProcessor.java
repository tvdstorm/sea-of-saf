package saf.game.engine;

import saf.game.BotState;
import saf.game.GameConstant;
import saf.structure.intelligence.BehaviorIntelligence;

public abstract class ActionProcessor {
	private static final double FIGHTACTION_BASERANGE = 5;
	private static final double FIGHTACTION_BASEPOWER = 5;

	public static double processFightAction(BotState botState, BotState otherBotState, int distance, String moveAction, String fightAction) {

		if (fightAction.contains(GameConstant.CONST_BLOCK)) {
			return 0.0;
		}

		double attackPower = FIGHTACTION_BASEPOWER;
		double attackRange = FIGHTACTION_BASERANGE;
		boolean botJumping = moveAction.equals(GameConstant.MOVETYPE_JUMP);
		
		int punchRange = getCharacteristicValue(botState, GameConstant.Characteristic_punchReach);
		int punchPower = getCharacteristicValue(botState, GameConstant.Characteristic_punchPower);
		int kickRange = getCharacteristicValue(botState, GameConstant.Characteristic_kickReach);
		int kickPower = getCharacteristicValue(botState, GameConstant.Characteristic_kickPower);

		if (fightAction.contains(GameConstant.CONST_PUNCH)) {
			attackRange *= punchRange;
			attackPower *= punchPower;
		}
		if (fightAction.contains(GameConstant.CONST_KICK)) {
			attackRange *= kickRange;
			attackPower *= kickPower;
		}

		if (attackRange <= distance)
			return 0.0;

		if (fightAction.contains(GameConstant.CONST_HIGH)) {
			if (!botJumping && otherBotState.isJumping()) {
				if (otherBotState.getLastFightAction().equals(GameConstant.FIGHTTYPE_BLOCK_LOW))
					return 0.0;
			} else if (botJumping && !otherBotState.isJumping()) {
				return 0.0; // missed
			} else { // Both are jumping or there is no jumping
				if (otherBotState.getLastMoveAction().equals(GameConstant.MOVETYPE_CROUCH)
						|| otherBotState.getLastFightAction().equals(GameConstant.FIGHTTYPE_BLOCK_HIGH)
						|| otherBotState.getLastFightAction().equals(GameConstant.FIGHTTYPE_BLOCK_LOW))
					return 0.0; // missed
			}
		}

		if (fightAction.contains(GameConstant.CONST_LOW)) {

			if (!botJumping && otherBotState.isJumping()) {
				return 0.0; // missed
			} else if (botJumping && !otherBotState.isJumping()) {
				if (otherBotState.getLastMoveAction().equals(GameConstant.MOVETYPE_CROUCH)
						|| otherBotState.getLastFightAction().equals(GameConstant.FIGHTTYPE_BLOCK_HIGH))
					return 0.0; // missed
			} else { // Both are jumping or there is no jumping
				if (otherBotState.getLastFightAction().equals(GameConstant.FIGHTTYPE_BLOCK_LOW))
					return 0.0; // missed
			}
		}

		return attackPower;
	}

	private static int getCharacteristicValue(BotState botState, String name) {
		return BehaviorIntelligence.getCharacteristic(botState.getBot(), name);
	}

}
