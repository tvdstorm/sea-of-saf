package safVisitor;

import java.util.*;
import safAST.*;
import safAST.action.Action;
import safAST.action.SelectAction;
import safAST.action.SingleAction;
import safAST.condition.AndCombineCondition;
import safAST.condition.CombineCondition;
import safAST.condition.Condition;
import safAST.condition.OrCombineCondition;
import safAST.condition.SingleCondition;
import safAST.enumType.ConditionType;
import safAST.enumType.FightActionType;
import safAST.enumType.MoveActionType;

public class SAFTypeCheckerVisitor implements ISAFVisitor{
	private ArrayList<Personality> invalidPersonalities;
	private ArrayList<SingleCondition> invalidConditions;
	private ArrayList<SingleAction> invalidActions;
	private String errorMessage;
	
	public SAFTypeCheckerVisitor()
	{
		invalidPersonalities  = new ArrayList<Personality>();
		invalidConditions = new ArrayList<SingleCondition>();
		invalidActions = new ArrayList<SingleAction>();
		errorMessage = "";
	}
	
	@Override
	public void visit(Bot fighter) 
	{}
	
	@Override
	public void visit(Personality personality) {
		boolean isCharacteristic = false;
		String[] charaNameArray = {"punchReach", "punchPower", "kickReach", "kickPower"};
		String charaName = personality.getCharacterName();
		
		for (String s : charaNameArray)
			if (s.equalsIgnoreCase(charaName))
			{
				isCharacteristic = true;
				break;
			}
		if (!isCharacteristic)
		{
			errorMessage += "ERROR: Invalid personalities:\n" + personality.getCharacterName() + " = " + personality.getCharacterValue() + "\n";
			invalidPersonalities.add(personality);
		}
	}
	
	@Override
	public void visit(SingleAction singleAction) {
		boolean validActionType = false;
		for (MoveActionType mat : MoveActionType.values())
			if (mat.toString().equalsIgnoreCase(singleAction.getActionName()))
			{
				validActionType = true;
				break;
			}
		for (FightActionType fat : FightActionType.values())
			if (fat.toString().equalsIgnoreCase(singleAction.getActionName()))
			{
				validActionType = true;
				break;
			}
		if (!validActionType)
		{
			errorMessage += "ERROR: Invalid Actions:\n" + singleAction.getActionName() + "\n";
			invalidActions.add(singleAction);
		}
	}

	@Override
	public void visit(SingleCondition singleCondition) {
	    boolean validConditionType = false;
		for (ConditionType ct : ConditionType.values())
			if (ct.toString().equalsIgnoreCase(singleCondition.getConditionName()))
			{
				validConditionType = true;
				break;
			}
		if (!validConditionType)
		{
			errorMessage += "ERROR: Invalid conditions:\n" + singleCondition.getConditionName() + "\n";
			invalidConditions.add(singleCondition);
		}
	}

	@Override
	public void visit(Behaviour behaviour) {}

	@Override
	public void visit(Condition condition) {}

	@Override
	public void visit(CombineCondition combineCondition) {}

	@Override
	public void visit(OrCombineCondition orCombineCondition) {}

	@Override
	public void visit(AndCombineCondition andCombineCondition) {}

	@Override
	public void visit(Action action) {}

	@Override
	public void visit(SelectAction selectAction) {}
	
	public ArrayList<Personality> getInvalidPersonalities()
	{
		return invalidPersonalities;
	}
	
	public ArrayList<SingleCondition> getInvalidConditions()
	{
		return invalidConditions;
	}
	
	public ArrayList<SingleAction> getInvalidActions()
	{
		return invalidActions;
	}
	
	public String getTypeCheckMessage()
	{
		return errorMessage;
	}
}