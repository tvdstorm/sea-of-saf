package interpreter;

import ast.*;


public class Interpreter{
	
	public Bot fighterLeft;
	public Bot fighterRight;
	
	
	public Interpreter(Bot bot1, Bot bot2){
			
		this.fighterLeft = bot1;
		this.fighterRight = bot2;
	}
	
	public boolean interpret(){
				
		return (testBot(fighterLeft) && testBot(fighterRight));		

	}
	
	private boolean testBot(Bot bot){
				
		Behaviour b = bot.getBehavior();
		Personality p = bot.getPersonality();
				
		for (BehaviourItem i : b.getBehaviourItems())
			if (!testBehaviourItem(i,bot))
				return false;
		for (Strength s : p.getStrengths())
			if (!testStrength(s,bot))
				return false;				
		return true;
	}
	
	private boolean testBehaviourItem(BehaviourItem i, Bot b){
				
		return ( testCondition(i.getCondition(),b) && testAction(i.getAttack(),b) && testAction(i.getMove(),b));
	}
	
	private boolean testCondition(Condition c, Bot b){
		if (!c.isValid()){
			System.out.println("[Interpreter]ERROR: Condition " + c.getCondition() + " inserted for " + b.getName() + " is not a valid condition!");
			return false;
		}
		return true;
	}
	
	private boolean testAction(Action a, Bot b){
		
		if (!a.isValid()){
			System.out.println("[Interpreter]ERROR: Action " + a.getChoice().getChoiceType() + " inserted for " + b.getName() + "is not a valid action!");
			return false;
		}
		return true;
	}
	
	private boolean testValue(int value, Bot b){
		
		if (! (value >= 1 && value <= 10 )){
			System.out.println("[Interpreter]ERROR: Value " + value + " inserted for " + b.getName() + "strength should be between 1 and 10!");
			return false;
		}
			
		return true;
		
	}
	
	private boolean testStrength(Strength s, Bot b){
				
		if (!s.isValid())
		{
			System.out.println("[Interpreter]ERROR: " + s.getStrengthName() + " is not a valid SAF strength for fighter " + b.getName() + "!");
			return false;
		}	
		if (!testValue(s.getValue(),b))
			return false;
		
		return true;
	}
	
}
