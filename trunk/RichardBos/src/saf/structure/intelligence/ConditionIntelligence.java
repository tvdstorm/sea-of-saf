package saf.structure.intelligence;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import saf.game.BotState;
import saf.game.GameConstant;
import saf.game.GameState;
import saf.structure.ConditionSimple;

public abstract class ConditionIntelligence {

	private static final int CONDITION_NEAR_DISTANCE = 50;

	private static final Map<String, Integer> CONDITION_STRENGHTS_HP_DIFFERENCE;
	static {
		Map<String, Integer> initMap = new HashMap<String, Integer>();
		initMap.put("much_stronger", 40);
		initMap.put("stronger", 10);
		// even is between stronger and weaker
		initMap.put("weaker", -10);
		initMap.put("much_weaker", -40);
		CONDITION_STRENGHTS_HP_DIFFERENCE = Collections.unmodifiableMap(initMap);
	}

	public static boolean checkConditionSimple(ConditionSimple conditionSimple, BotState botState, GameState gameState) {
		String value = conditionSimple.getValue();

		int myHp = botState.getHitpoints();
		int otherHp = 0;
		for (BotState state : gameState.getBotStates()) {
			if (!state.equals(botState)) {
				otherHp = state.getHitpoints();
			}
		}

		int hpDifference = myHp - otherHp;

		int distance = gameState.getDistance();

		if (value.equals(GameConstant.CONDITION_ALWAYS))
			return true;

		if (value.equals(GameConstant.CONDITION_FAR))
			return distance >= CONDITION_NEAR_DISTANCE;

		if (value.equals(GameConstant.CONDITION_NEAR))
			return distance < CONDITION_NEAR_DISTANCE;

		// HP > much_stronger
		// HP > stronger
		if (value.equals(GameConstant.CONDITION_MUCH_STRONGER) || value.equals(GameConstant.CONDITION_STRONGER))
			return hpDifference > CONDITION_STRENGHTS_HP_DIFFERENCE.get(value);

		// weaker >= HP <= stronger
		if (value.equals(GameConstant.CONDITION_EVEN)) 
			return hpDifference >= CONDITION_STRENGHTS_HP_DIFFERENCE.get(GameConstant.CONDITION_WEAKER)
					&& hpDifference <= CONDITION_STRENGHTS_HP_DIFFERENCE.get(GameConstant.CONDITION_STRONGER);
		
		
		// HP < weaker
		// HP < much_weaker
		if (value.equals(GameConstant.CONDITION_WEAKER) || value.equals(GameConstant.CONDITION_MUCH_WEAKER))
			return hpDifference >= CONDITION_STRENGHTS_HP_DIFFERENCE.get(value);

		return false;
	}
}