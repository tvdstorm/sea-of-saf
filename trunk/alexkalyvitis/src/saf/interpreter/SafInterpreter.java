package saf.interpreter;

import java.util.List;

import saf.ast.*;

public class SafInterpreter {
	
	private List<Fighter> fighters;
	
	private static final String[] availableConditions = { "stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always" };
	private String[] availableMoves = { "jump", "crouch", "stand", "run_towards", "run_away", "walk_towards", "walk_away" };
	private String[] availableAttacks = { "punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high" };
	private String[] availableStrengths = { "punchReach", "kickReach", "kickPower", "punchPower" };
	
	public SafInterpreter(List<Fighter> f){
		fighters = f;
	}
	
	public boolean interpret(){
		for (Fighter fighter : fighters){
			for (Strength strength : fighter.getStrengths()){
				boolean strengthFound = false;
				for (String currentAvailableStrength : this.availableStrengths){
					if (strength.getName().equals(currentAvailableStrength)){
						strengthFound = true;
						break;
					}
				}
				if (strengthFound == false){
					System.out.println("ERROR: \"" + strength.getName() + "\" is not a recognised SAF strength. \nFighter: " + fighter.getName());
					return false;
				}
			}
			for (Behavior behavior : fighter.getBehaviors()){
				boolean behaviorFound = false;
				for (String currentAvailableCondition : availableConditions){
					if (behavior.getCondition().getName().equals(currentAvailableCondition)){
						behaviorFound = true;
						break;
					}
				}
				if (behaviorFound == false){
					System.out.println("ERROR: \"" + behavior.getCondition().getName() + "\" is not a recognised SAF condition. \nFighter: " + fighter.getName());
					return false;
				}
				
				boolean moveFound = false;
				for (String currentAvailableMove : this.availableMoves){
					if (behavior.getMove().getName().equals(currentAvailableMove)){
						moveFound = true;
						break;
					}
				}
				if (moveFound == false){
					System.out.println("ERROR: \"" + behavior.getMove().getName() + "\" is not a recognised SAF move. \nFighter: " + fighter.getName());
					return false;
				}
				
				boolean attackFound = false;
				for (String currentAvailableAttack : this.availableAttacks){
					if (behavior.getAttack().getName().equals(currentAvailableAttack)){
						attackFound = true;
						break;
					}
				}
				if (attackFound == false){
					System.out.println("ERROR: \"" + behavior.getAttack().getName() + "\" is not a recognised SAF attack. \nFighter: " + fighter.getName());
					return false;
				}
			}
		}
		return true;
	}
}
