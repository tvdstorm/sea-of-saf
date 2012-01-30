package saf.checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import saf.structure.Action;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Bots;
import saf.structure.Characteristic;
import saf.structure.Condition;
import saf.structure.ConditionAnd;
import saf.structure.ConditionOr;
import saf.structure.*;

public class ElementChecker implements ElementVisitor{
	
	private ElementChecker()
	{
		this.Errors = new ArrayList<String>();
	}
	public static void check(Bots bots)
	{
		ElementChecker checker = new ElementChecker();
		bots.accept(checker);
	}
	
	private final List<String> Errors;
	
	private boolean ConditionAlwaysFound = false;
	private static final List<String> ConditionTypes = 
			Arrays.asList( 	"always",
							"near",
							"far",
							"much_stronger",
							"stronger",
							"even",
							"weaker",
							"much_weaker");
	private static final List<String> MoveTypes = 
			Arrays.asList( 	"walk_towards",
							"walk_away",
							"run_towards",
							"run_away",
							"jump",
							"crouch",
							"stand");
	private static final List<String> FightType = 
			Arrays.asList( 	"block_low",
							"block_high",
							"punch_low",
							"punch_high",
							"kick_low",
							"kick_high");	
	private static final List<String> CharacteristicTypes = 
			Arrays.asList(	"punchReach",
							"punchPower",
							"kickReach",
							"kickPower");
	
	 
	public void visit(Bots bots)
	{
		if(bots.getBots().size() == 0)
			Errors.add("No bots were found.");
		
		for(Bot bot : bots.getBots())
		{	
			ConditionAlwaysFound = false;
			bot.accept(this);
		}
	}

	public void visit(Bot bot)
	{
		if(bot.getName().length() == 0)
		 	Errors.add("All bots need a name.");
		
		//Keep track of the found characteristics to ensure no duplicates exist
		boolean kickPower = false;
		boolean punchPower = false;
		boolean kickReach = false;
		boolean punchReach = false;
		for(Characteristic characteristic : bot.getCharacteristics())
		{
			characteristic.accept(this);
		
			
			//todo duplicatie detectie
			/*CharacteristicType CharType = CharacteristicType.valueOf(characteristic.getName());
			switch(CharType)
			{
				case kickPower:
					if(kickPower)
						Errors.add("Duplicate characteristic found: 'kickPower'.");
					else
						kickPower = true;
					break;
				case kickReach:
					if(kickReach)
						Errors.add("Duplicate characteristic found: 'kickReach'.");
					else
						kickReach = true;
					break;
				case punchPower:
					if(punchPower)
						Errors.add("Duplicate characteristic found: 'punchPower'.");
					else
						punchPower = true;
					break;
				case punchReach:
					if(punchReach)
						Errors.add("Duplicate characteristic found: 'punchReach'.");
					else
						punchReach = true;
					break;
			}*/
		}
		
		if(bot.getBehaviors().size() == 0)
			Errors.add("No behavior rules found in bot: '" + bot.getName() + "'. Atleast one behavior with condition 'always' is required");
		
		for(Behavior behavior : bot.getBehaviors())
			behavior.accept(this);
		
		if(!ConditionAlwaysFound)
			Errors.add("Behavior condition 'always' was not found in bot: '" + bot.getName() + "'. Atleast one behavior with condition 'always' is required");
		
	}
	
	public void visit(Characteristic characteristic)
	{
		if( ! CharacteristicTypes.contains(characteristic.getName()))
			Errors.add("The characteristic '" + characteristic.getName() + "' is invalid.");
		
		
		int value = characteristic.getValue();
		if (value < 0 || value > 10)
			Errors.add("The characteristic '" + characteristic.getName() + "' has an invalid value:'" + characteristic.getValue() + "'.");
		
	}
	
	public void visit(Behavior behavior)
	{
		behavior.getCondition().accept(this);
		
		try
		{
			behavior.getFightAction().accept(this);
		}
		catch(SAFValidationException ex)
		{
			Errors.add("Duplicate Fightaction found in choose clause, please remove the duplicates.");
		}
		
		try
		{
			behavior.getMoveAction().accept(this);
		}
		catch(SAFValidationException ex)
		{
			Errors.add("Duplicate Moveaction found in choose clause, please remove the duplicates.");
		}
	}
	
	public void visit(Condition condition)
	{
		visitCondition(condition);
	}
	
	public void visit(ConditionClause conditionClause)
	{
		visitCondition(conditionClause.getFirstCondition());
		visitCondition(conditionClause.getSecondCondition());
		
		//Check for "always"-condition inside a clause
		if(conditionClause.getFirstCondition() instanceof ConditionSimple)
		{

			if(checkStringConditionForAlways((ConditionSimple)conditionClause.getFirstCondition()))
				Errors.add("Invalid behavior condition found, 'always' is not a valid option in a clause.");
		}
		
		if(conditionClause.getSecondCondition() instanceof ConditionSimple)
		{

			if(checkStringConditionForAlways((ConditionSimple)conditionClause.getSecondCondition()))
				Errors.add("Invalid behavior condition found, 'always' is not a valid option in a clause.");
		}
		
	}
	
	public void visit(ConditionSimple conditionSimple)
	{
		String value = conditionSimple.getValue();
		
		if( ! ConditionTypes.contains(value))
			Errors.add("The behavior condition '" + value + "' is invalid.");
		
		if(value.toLowerCase().equals("always"))
			ConditionAlwaysFound = true;
	}
	
	public void visit(Action action)
	{
		ArrayList<ActionType> actionTypes = action.getValues();
		HashSet<String> uniqueActionTypes = new HashSet<String>();
		
		for(ActionType actionType : actionTypes)
		{

			if(actionType instanceof FightAction)
				uniqueActionTypes.add(CheckFightActionType(actionType));
			else if(actionType instanceof MoveAction)
				uniqueActionTypes.add(CheckMoveActionType(actionType));
		}
		
		if(actionTypes.size() != uniqueActionTypes.size())
		{
			Errors.add("duplicate");
		}
		
	}
	
	

	
//// Helper functions
	private void visitCondition(Condition condition)
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
	
	private String CheckFightActionType(ActionType actionType)
	{
		
		FightAction fightAction = (FightAction)actionType;
		
		try 
		{
			FightType.valueOf(fightAction.getFightAction());	
		}
		catch(IllegalArgumentException ex)
		{
			Errors.add("The behavior fight-action '" + fightAction.getFightAction() + "' is invalid.");
		}
		return fightAction.getFightAction();
		
	}
	
	private String CheckMoveActionType(ActionType actionType)
	{
		
		MoveAction moveAction = (MoveAction)actionType;
		
		try 
		{
			MoveType.valueOf(moveAction.getMoveAction());	
		}
		catch(IllegalArgumentException ex)
		{
			Errors.add("The behavior fight-action '" + moveAction.getMoveAction() + "' is invalid.");
		}
		return moveAction.getMoveAction();
	}

	@Override
	public void visit(ConditionOr conditionOr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ConditionAnd onditionAnd) {
		// TODO Auto-generated method stub
		
	}
}
