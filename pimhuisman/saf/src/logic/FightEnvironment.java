package logic;

import java.util.LinkedList;
import java.util.List;

import data.Actions;
import data.Behaviour;
import data.Fighter;
import data.Personality;

public class FightEnvironment {
	
	public FightEnvironment() {
		
	}

	private String getRelativeStrength(Personality personality1, Personality personality2) {
		int strength1 = personality1.getCharacteristic("punchPower").getValue() + personality1.getCharacteristic("kickPower").getValue();
		int strength2 = personality2.getCharacteristic("punchPower").getValue() + personality2.getCharacteristic("kickPower").getValue();
		if ( strength1 >= strength2+3 ) {
			return "much_stronger";
		} else if ( strength1 > strength2 ) {
			return "stronger";
		} else if ( strength1+3 <= strength2 ) {
			return "much_weaker";
		} else if ( strength1 < strength2 ) {
			return "weaker";
		}
		return "even";
	}
	
	public Actions getValidActions(FighterModel currentFighter, FighterModel otherFighter) {
		Fighter currentFighterData = currentFighter.getFighterData();
		Fighter otherFighterData = otherFighter.getFighterData();
		Behaviour currentBehaviour = currentFighterData.getBehaviour();
		List<String> environmentValues = new LinkedList<String>();
		environmentValues.add(getRelativeStrength(currentFighterData.getPersonality(), otherFighterData.getPersonality()));
		int distance = currentFighter.distanceBetween(otherFighter);
		if ( distance <= 60 ) {
			environmentValues.add("near");
		} else if ( distance > 200 ) {
			environmentValues.add("far");
		}
		environmentValues.add("always");
		return currentBehaviour.getValidActions(environmentValues);
	}
	
}
