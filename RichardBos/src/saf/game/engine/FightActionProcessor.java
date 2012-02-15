package saf.game.engine;

import java.awt.Point;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

	
	public FightActionProcessor(BotState botState, BotState otherBotState, int distance, String fightAction, boolean isJumping) {
		this.botState = botState;
		this.otherBotState = otherBotState;
		this.distance = distance;
		this.fightAction = fightAction;
		this.isJumping = isJumping;
		
		this.outcome = processFightAction();
	}

	public double getOutcome()
	{
		return this.outcome;
	}

	private double processFightAction() {
		
		if(fightAction.isEmpty() || otherBotState == null || isJumping == null)
			throw new IllegalArgumentException();

		if (fightAction.contains(FIGHT_TYPE_BLOCK)) {
			return 0.0;
		}

		calcPowerAndReach();

		if (attackReach <= distance)
			return 0.0;

		if (fightAction.contains(FIGHT_TYPE_HIGH)) {

			if (!isJumping && otherBotState.isJumping()) {
				
				if (otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKLOW))
					
					return 0.0;
				
			} else if (isJumping && !otherBotState.isJumping()) {
				
				return 0.0; // missed
				
			} else { // Both are jumping or there is no jumping
				
				if (otherBotState.getLastMoveAction().equals(MOVE_TYPE_CROUCH)	
						|| otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKHIGH)
						|| otherBotState.getLastFightAction().equals(FIGHT_TYPE_BLOCKLOW))
					
					return 0.0; // missed
				
			}

		} else if (fightAction.contains(FIGHT_TYPE_LOW)) {

			if (!isJumping && otherBotState.isJumping()) {

				return 0.0; // missed

			} else if (isJumping && !otherBotState.isJumping()) {

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