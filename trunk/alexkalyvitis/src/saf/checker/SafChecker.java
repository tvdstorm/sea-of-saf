package saf.checker;

import java.util.List;

import saf.ast.*;
import saf.ast.identifiers.*;
import saf.ast.base.Identifier;

public class SafChecker {
	
	private static final int MIN_POWER = 1;
	private static final int MAX_POWER = 10;
	private List<Fighter> fighters;
	
	public SafChecker(List<Fighter> f){
		fighters = f;
	}
	
	public void check() throws CheckException{
		for (Fighter fighter : fighters){
			for (Strength strength : fighter.getStrengths()){
				identifierIsValid(fighter, strength);
				valueIsValid(fighter,strength);
			}
			boolean alwaysClauseFound = false;
			for (Behavior behavior : fighter.getBehaviors()){
				identifierIsValid(fighter, behavior.getCondition());
				identifierIsValid(fighter, behavior.getMove());
				identifierIsValid(fighter, behavior.getAttack());
				if(behavior.getCondition().equals(new Condition(Conditions.ALWAYS))) alwaysClauseFound = true;
			}
			if(!alwaysClauseFound) throw new CheckException("\"" + fighter.getName() + "\" has no always clause defined");
		}
	}

	private void identifierIsValid(Fighter fighter, Identifier identifier) throws CheckException {
		if (!identifier.isValid()){
			throw new CheckException("Unknown identifier \"" + identifier.toString() + "\". Fighter \"" + fighter.getName() + "\"");
		}
	}
	
	private void valueIsValid(Fighter f, Strength s) throws CheckException{
		if(s.getValue() > MAX_POWER || s.getValue() < MIN_POWER){
			throw new CheckException("Strength value must be between " + MIN_POWER + " and " + MAX_POWER + " inclusive. \nFighter: " + f.getName() + "\nStrength: " + s.getName());
		}
	}
}
