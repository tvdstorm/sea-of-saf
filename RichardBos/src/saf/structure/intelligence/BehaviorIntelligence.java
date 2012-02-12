package saf.structure.intelligence;

import saf.game.BotState;
import saf.game.GameState;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Characteristic;

public abstract class BehaviorIntelligence {

	public static boolean checkBehaviorInGameState(Behavior behavior, BotState botState, GameState gameState) {

		return behavior.getCondition().checkCondition(botState, gameState);
	}

	public static int getCharacteristic(Bot bot, String name)
	{
		Characteristic characteristic = BotIntelligence.getCharacteristic(bot, name); 
		return characteristic.getValue();
	}	
}
