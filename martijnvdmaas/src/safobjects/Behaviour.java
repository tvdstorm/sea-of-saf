package safobjects;

import java.util.HashSet;
import java.util.Iterator;

public class Behaviour 
{
	private ConditionChoices conditionChoices;

	private HashSet<String>  moveChoices;
	private HashSet<String> attackChoices;
	
	public Behaviour() 
	{
		moveChoices 	= new HashSet<String>();
		attackChoices 	= new HashSet<String>();
	}

	public void addMoveChoice(String moveChoice) 
	{
		this.moveChoices.add(moveChoice);
	}
	
	public void addAttackChoice(String attackChoice) 
	{
		this.attackChoices.add(attackChoice);
	}
	
	public String toString() 
	{
		String output = conditionChoices.toString();
		
		String moves = "";
		Iterator<String> moveIterator = moveChoices.iterator();
		while (moveIterator.hasNext()) 
		{
			moves += moves == "" ? "      Moves: " + moveIterator.next() : " or " + moveIterator.next();
		}

		String attacks = "";
		Iterator<String> attackIterator = attackChoices.iterator();
		while (attackIterator.hasNext()) 
		{
			attacks += attacks == "" ? "      Attacks: " + attackIterator.next() : " or " + attackIterator.next();
		}
		output += moves + "\n";
		output += attacks + "\n";
		return "    Class: " + this.getClass().getName() + "\n" + output;
	}
	
	public ConditionChoices getConditionChoices() 
	{
		return conditionChoices;
	}

	public void setConditionChoices(ConditionChoices conditionChoices) 
	{
		this.conditionChoices = conditionChoices;
	}
	
	public HashSet<String> getMoveChoices() 
	{
		return moveChoices;
	}

	public void setMoveChoices(HashSet<String> moveChoices) 
	{
		this.moveChoices = moveChoices;
	}

	public HashSet<String> getAttackChoices() 
	{
		return attackChoices;
	}

	public void setAttackChoices(HashSet<String> attackChoices) 
	{
		this.attackChoices = attackChoices;
	}
	
}
