package SAF.Checker;

import java.util.ArrayList;

import SAF.Structure.Action;
import SAF.Structure.ActionType;
import SAF.Structure.Behavior;
import SAF.Structure.Bot;
import SAF.Structure.Bots;
import SAF.Structure.Characteristic;
import SAF.Structure.ChoiceCondition;
import SAF.Structure.Condition;
import SAF.Structure.FightAction;
import SAF.Structure.MoveAction;
import SAF.Structure.StringCondition;
import SAF.Structure.Behavior.*;
import SAF.Structure.Characteristic.CharacteristicType;
import SAF.Structure.ChoiceCondition.ChoiceType;


public class SAFElementDoVisitor implements SAFElementVisitor{

	public void visit(Bots bots) throws SAFValidationException
	{
		if(bots.getBots().size() == 0)
			throw new SAFValidationException("No bots were found.");
		
		for(Bot bot : bots.getBots())
			bot.accept(this);
	}

	public void visit(Bot bot) throws SAFValidationException
	{
		if(bot.getName().length() == 0)
			throw new SAFValidationException("All bots need a name.");
		
		for(Characteristic characteristic : bot.getCharacteristics())
			characteristic.accept(this);
		
		
		//All separate Characteristics are valid, check for duplicates
		boolean kickPower = false;
		boolean punchPower = false;
		boolean kickReach = false;
		boolean punchReach = false;
		for(Characteristic characteristic : bot.getCharacteristics())
		{	
		    CharacteristicType CharType = CharacteristicType.valueOf(characteristic.getName());
			switch(CharType)
			{
				case kickPower:
					if(kickPower)
						throw new SAFValidationException("Duplicate characteristic found: 'kickPower'.");
					else
						kickPower = true;
					break;
				case kickReach:
					if(kickReach)
						throw new SAFValidationException("Duplicate characteristic found: 'kickReach'.");
					else
						kickReach = true;
					break;
				case punchPower:
					if(punchPower)
						throw new SAFValidationException("Duplicate characteristic found: 'punchPower'.");
					else
						punchPower = true;
					break;
				case punchReach:
					if(punchReach)
						throw new SAFValidationException("Duplicate characteristic found: 'punchReach'.");
					else
						punchReach = true;
					break;
			}
		}
		
		if(bot.getBehaviors().size() == 0)
			throw new SAFValidationException("No behavior rules found in bot: '" + bot.getName() + "'. Atleast one behavior with condition 'always' is required");
		
		for(Behavior behavior : bot.getBehaviors())
			behavior.accept(this);
		
		//All separate Behaviors ara valid, check for duplicates
		
	}
	
	public void visit(Characteristic characteristic) throws SAFValidationException
	{
		try
		{
			CharacteristicType.valueOf(characteristic.getName());
		}
		catch(IllegalArgumentException ex)
		{
			throw new SAFValidationException("The characteristic '" + characteristic.getName() + "' is invalid.");
		}
		
		int value = characteristic.getValue();
		if (value < 0 || value > 10)
		{
			throw new SAFValidationException("The characteristic '" + characteristic.getName() + "' has an invalid value:'" + characteristic.getValue() + "'.");
		}
	}
	
	public void visit(Behavior behavior) throws SAFValidationException
	{
		behavior.getCondition().accept(this);
		
		behavior.getFightAction().accept(this);
		
		behavior.getMoveAction().accept(this);
	}
	
	public void visit(Condition condition) throws SAFValidationException
	{
		visitCondition(condition);
	}
	
	public void visit(ChoiceCondition choiceCondition) throws SAFValidationException
	{
		visitCondition(choiceCondition.getCondition());
		visitCondition(choiceCondition.getSecondCondition());
		
		//Check for "always"-condition inside an AND clause
		
		if(choiceCondition.getCondition() instanceof StringCondition)
		{

			if(checkStringConditionForAlways((StringCondition)choiceCondition.getCondition()))
				throw new SAFValidationException("Invalid behavior condition found, 'always' is not a valid option in an " + choiceCondition.getType() + " clause.");
		}
		
		if(choiceCondition.getSecondCondition() instanceof StringCondition)
		{

			if(checkStringConditionForAlways((StringCondition)choiceCondition.getSecondCondition()))
				throw new SAFValidationException("Invalid behavior condition found, 'always' is not a valid option in an " + choiceCondition.getType() + " clause.");
		}
		
	}
	
	public void visit(StringCondition stringCondition) throws SAFValidationException
	{
		String value = stringCondition.getValue();
		
		try 
		{
			ConditionType.valueOf(value);	
		}
		catch(IllegalArgumentException ex)
		{
			throw new SAFValidationException("The behavior condition '" + value + "' is invalid.");
		}
	}
	
	public void visit(Action action) throws SAFValidationException
	{
		ArrayList<ActionType> actionTypes = action.getValues();
		
		for(ActionType actionType : actionTypes)
		{
			if(actionType instanceof FightAction)
				CheckFightActionType(actionType);
			else if(actionType instanceof MoveAction)
				CheckMoveActionType(actionType);
		}
		
	}
	
	

	
//// Helper functions
	private void visitCondition(Condition condition) throws SAFValidationException
	{
		if(condition instanceof StringCondition)
			((StringCondition)condition).accept(this);
		else
			((ChoiceCondition)condition).accept(this);
	}

	private boolean checkStringConditionForAlways(StringCondition stringCondition)
	{		
		ConditionType conditionType = ConditionType.valueOf(stringCondition.getValue());
		
		if(conditionType == ConditionType.always)
			return true;
		else
			return false;
	}
	
	private void CheckFightActionType(ActionType actionType) throws SAFValidationException
	{
		
		FightAction fightAction = (FightAction)actionType;
		
		try 
		{
			FightType.valueOf(fightAction.getFightAction());	
		}
		catch(IllegalArgumentException ex)
		{
			throw new SAFValidationException("The behavior fight-action '" + fightAction.getFightAction() + "' is invalid.");
		}
		
	}
	
	private void CheckMoveActionType(ActionType actionType) throws SAFValidationException
	{
		
		MoveAction moveAction = (MoveAction)actionType;
		
		try 
		{
			MoveType.valueOf(moveAction.getMoveAction());	
		}
		catch(IllegalArgumentException ex)
		{
			throw new SAFValidationException("The behavior fight-action '" + moveAction.getMoveAction() + "' is invalid.");
		}
		
	}
}
