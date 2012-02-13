package elements;

import java.util.ArrayList;

import visitor.SAFElement;
import visitor.SAFElementVisitor;

public class Behaviour implements SAFElement
{
	private ConditionChoices conditionChoices;

	private ArrayList<String>  moveChoices;
	private ArrayList<String> attackChoices;
	
	public Behaviour() 
	{
		moveChoices 	= new ArrayList<String>();
		attackChoices 	= new ArrayList<String>();
	}

	public void addMove(String moveChoice) 
	{
		this.moveChoices.add(moveChoice);
	}
	
	public void addAttack(String attackChoice) 
	{
		this.attackChoices.add(attackChoice);
	}
	
	public String toString() 
	{
		String output = "";
		
		String moves = "";
		for(String moveChoice : moveChoices) 
		{
			moves += moves == "" ? "      Moves: " + moveChoice : " or " + moveChoice;
		}

		String attacks = "";
		for(String attackChoice : attackChoices) 
		{
			attacks += attacks == "" ? "      Attacks: " + attackChoice : " or " + attackChoice;
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
	
	public ArrayList<String> getMoveChoices() 
	{
		return moveChoices;
	}

	public void setMoveChoices(ArrayList<String> moveChoices) 
	{
		this.moveChoices = moveChoices;
	}

	public ArrayList<String> getAttackChoices() 
	{
		return attackChoices;
	}

	public void setAttackChoices(ArrayList<String> attackChoices) 
	{
		this.attackChoices = attackChoices;
	}

	@Override
	public void accept(SAFElementVisitor visitor) throws Exception {
		for (ConditionGroup conditionGroup : conditionChoices.getConditionGroups()) {
			conditionGroup.accept(visitor);
		}
		
		visitor.visit(this);
	}
	
}
