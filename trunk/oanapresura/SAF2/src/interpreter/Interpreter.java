package interpreter;

import ast.Attack;
import ast.Behaviour;
import ast.BehaviourItem;
import ast.Bot;
import ast.Condition;
import ast.Move;
import ast.Personality;
import ast.Strength;
import constants.CorrectValues;



public class Interpreter{
	
	public Bot fighterLeft;
	public Bot fighterRight;
	CorrectValues cv;
	
	public Interpreter(Bot bot1, Bot bot2){
		
		this.cv = new CorrectValues();
		this.fighterLeft = bot1;
		this.fighterRight = bot2;
	}
	
	public boolean interpret(){
				
		//return (testBot(fighterLeft) && testBot(fighterRight));		
		return testBot(fighterLeft);
	}
	
	public boolean testBot(Bot bot){
				
		Behaviour b = bot.getBehavior();
		Personality p = bot.getPersonality();
				
		for (BehaviourItem i : b.a)
			if (!testBehaviourItem(i,bot))
				return false;
		for (Strength s : p.strengths)
			if (!testStrength(s,bot))
				return false;				
		return true;
	}
	
	private boolean testBehaviourItem(BehaviourItem i, Bot b){
				
		return ( testCondition(i.condition,b) && testMove(i.move,b) && testAttack(i.attack,b) );
	}
	
	private boolean testValue(int value, Bot b){
		
		if (! (value >= 1 && value <= 10 )){
			System.out.println("[Interpreter]ERROR: Value " + value + " inserted for " + b.botName + "strength should be between 1 and 10!");
			return false;
		}
			
		return true;
		
	}
	
	private boolean testStrength(Strength s, Bot b){
				
		if (!cv.getStrengths().contains(s.name))
		{
			System.out.println("[Interpreter]ERROR: " + s.name + " is not a valid SAF strength for fighter " + b.botName + "!");
			return false;
		}	
		if (!testValue(s.value,b))
			return false;
		return true;
	}
	
	private boolean testCondition(Condition c, Bot b){
						
		
		if (!cv.getConditions().contains(c.type))		
		{			
			System.out.println("[Interpreter]ERROR: " + c.type + " is not a valid SAF condition for fighter " + b.botName + "!");
			return false;
		}
					
		return true;			
		
			
	}
	
	private boolean testAttack(Attack a, Bot b){
		
		if (!a.hasChoices)
		{
			if (!cv.getAttacks().contains(a.type))
			{
				System.out.println("[Interpreter]ERROR: " + a.type + " is not a valid SAF attack for fighter " + b.botName + "!");	
				return false;
			}
		}
		else
		{
			if (!cv.getAttacks().contains(a.choice1))
			{
				System.out.println("[Interpreter]ERROR: " + a.choice1 + " is not a valid SAF attack for fighter " + b.botName + "!");	
				return false;
			}
			if (!cv.getAttacks().contains(a.choice2))
			{
				System.out.println("[Interpreter]ERROR: " + a.choice2 + " is not a valid SAF attack for fighter " + b.botName + "!");	
				return false;
			}
			
		}
	
		return true;
	}
	
	private boolean testMove(Move m, Bot b){
		
		if (!m.hasChoices)
		{
			if (!cv.getMoves().contains(m.type))
			{
				System.out.println("[Interpreter]ERROR: " + m.type + " is not a valid SAF move for fighter " + b.botName + "!");	
				return false;
			}	
		}
		else
		{
			if (!cv.getMoves().contains(m.choice1))
			{
				System.out.println("[Interpreter]ERROR: " + m.choice1 + " is not a valid SAF move for fighter " + b.botName + "!");	
				return false;
			}
			if (!cv.getMoves().contains(m.choice2))
			{
				System.out.println("[Interpreter]ERROR: " + m.choice2 + " is not a valid SAF move for fighter " + b.botName + "!");	
				return false;
			}
			
		}
		return true;
	}
}
