package saf.interpreter;

import java.util.List;

import saf.ast.*;

public class SafInterpreter {
	
	private List<Fighter> fighters;
	
	private static final String[] availableConditions = { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	private static final String[] availableMoves = { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private static final String[] availableAttacks = { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private static final String[] availableStrengths = { "punchReach", "kickReach", "kickPower", "punchPower" };
	
	public SafInterpreter(List<Fighter> f){
		fighters = f;
	}
	
	public boolean interpret(){
		for (Fighter fighter : fighters){
			for (Strength strength : fighter.getStrengths()){
				if(!identifierIsValid(strength, availableStrengths)){
					System.out.println("ERROR: \"" + strength.getName() + "\" is not a recognised SAF strength. \nFighter: " + fighter.getName());
					return false;
				}
				if(!valueIsValid(strength)){
					System.out.println("ERROR: Strength value must be between 1 and 10 inclusive. \nFighter: " + fighter.getName() + "\nStrength: " + strength.getName());
					return false;
				}
			}
			for (Behavior behavior : fighter.getBehaviors()){
				if(!identifierIsValid(behavior.getCondition(), availableConditions)){
					System.out.println("ERROR: \"" + behavior.getCondition().getName() + "\" is not a recognised SAF condition. \nFighter: " + fighter.getName());
					return false;
				}
				if(!identifierIsValid(behavior.getMove(), availableMoves)){
					System.out.println("ERROR: \"" + behavior.getMove().getName() + "\" is not a recognised SAF move. \nFighter: " + fighter.getName());
					return false;
				}
				if(!identifierIsValid(behavior.getAttack(), availableAttacks)){
					System.out.println("ERROR: \"" + behavior.getAttack().getName() + "\" is not a recognised SAF attack. \nFighter: " + fighter.getName());
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean identifierIsValid(SafObject object, String[] keywords) {
		boolean keywordFound = false;
		for (String keyword : keywords){
			if (object.getName().equals(keyword)){
				keywordFound = true;
				break;
			}
		}
		if (keywordFound){
			return true;
		}
		return false;
	}
	
	private boolean valueIsValid(Strength s){
		return (s.getValue() <= 10 && s.getValue() >= 1);
	}
}
