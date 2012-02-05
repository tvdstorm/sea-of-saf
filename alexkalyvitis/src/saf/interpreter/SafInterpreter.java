package saf.interpreter;

import java.util.List;

import saf.ast.*;
import saf.ast.base.BehaviorItem;

public class SafInterpreter {
	
	private List<Fighter> fighters;
	
	public SafInterpreter(List<Fighter> f){
		fighters = f;
	}
	
	public boolean interpret(){
		for (Fighter fighter : fighters){
			for (Strength strength : fighter.getStrengths()){
				if(!identifierIsValid(fighter, strength)){ return false; }
				if(!valueIsValid(fighter,strength)){ return false; }
				fighter.setWeight((float)(fighter.getValueOfStrength("punchPower") + fighter.getValueOfStrength("kickPower")) / 2);
				fighter.setHeight((float)(fighter.getValueOfStrength("punchReach") + fighter.getValueOfStrength("kickReach")) / 2);
				fighter.setSpeed((float)Math.abs(fighter.getHeight() - fighter.getWeight()) / 2);
				fighter.setHealth(100);
			}
			for (Behavior behavior : fighter.getBehaviors()){
				if(!identifierIsValid(fighter, behavior.getCondition())){ return false; }
				if(!identifierIsValid(fighter, behavior.getMove())){ return false; }
				if(!identifierIsValid(fighter, behavior.getAttack())){ return false; }
			}
		}
		return true;
	}
	
	private boolean identifierIsValid(Fighter fighter, BehaviorItem object) {
		boolean keywordFound = false;
		for (String keyword : object.getKeywords()){
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
