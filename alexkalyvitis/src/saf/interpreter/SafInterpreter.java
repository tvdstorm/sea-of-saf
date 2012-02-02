package saf.interpreter;

import java.util.List;

import saf.ast.*;
import saf.ast.base.BehaviorItem;

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
				if(!identifierIsValid(fighter, strength, availableStrengths)){ return false; }
				if(!valueIsValid(fighter,strength)){ return false; }
				fighter.setWeight((float)(fighter.getValueOfStrength("punchPower") + fighter.getValueOfStrength("kickPower")) / 2);
				fighter.setHeight((float)(fighter.getValueOfStrength("punchReach") + fighter.getValueOfStrength("kickReach")) / 2);
				fighter.setSpeed((float)Math.abs(fighter.getHeight() - fighter.getWeight()) / 2);
				fighter.setHealth(10);
			}
			for (Behavior behavior : fighter.getBehaviors()){
				if(!identifierIsValid(fighter, behavior.getCondition(), availableConditions)){ return false; }
				if(!identifierIsValid(fighter, behavior.getMove(), availableMoves)){ return false; }
				if(!identifierIsValid(fighter, behavior.getAttack(), availableAttacks)){ return false; }
			}
		}
		return true;
	}
	
	private boolean identifierIsValid(Fighter fighter, BehaviorItem object, String[] keywords) {
		boolean keywordFound = false;
		for (String keyword : keywords){
			if (object.getName().equals(keyword)){
				keywordFound = true;
				break;
			}
		}
		if (!keywordFound){
			System.out.println("ERROR: \"" + object.getName() + "\" is not a recognised SAF behavior attribute. \nFighter: " + fighter.getName());
			return false;
		}
		return true;
	}
	
	private boolean valueIsValid(Fighter f, Strength s){
		if(s.getValue() > 10 || s.getValue() < 1){
			System.out.println("ERROR: Strength value must be between 1 and 10 inclusive. \nFighter: " + f.getName() + "\nStrength: " + s.getName());
			return false;
		}
		return true;
	}
}
