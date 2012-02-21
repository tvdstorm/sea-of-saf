package jsaf.game.fighter;

import java.util.ArrayList;
import java.util.List;

public class FighterBehaviour
{
	private FighterConditionChoices conditionChoices;

	private List<String>  moveChoices;
	private List<String> attackChoices;
	
	public FighterBehaviour() 
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
	
	public FighterConditionChoices getConditionChoices() 
	{
		return conditionChoices;
	}

	public void setConditionChoices(FighterConditionChoices conditionChoices) 
	{
		this.conditionChoices = conditionChoices;
	}
	
	public List<String> getMoveChoices() 
	{
		return moveChoices;
	}

	public void setMoveChoices(List<String> moveChoices) 
	{
		this.moveChoices = moveChoices;
	}

	public List<String> getAttackChoices() 
	{
		return attackChoices;
	}

	public void setAttackChoices(List<String> attackChoices) 
	{
		this.attackChoices = attackChoices;
	}
}
