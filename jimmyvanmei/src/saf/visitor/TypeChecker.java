package saf.visitor;

import java.util.*;

import saf.ast.*;
import saf.ast.action.Action;
import saf.ast.action.ChooseAction;
import saf.ast.action.SingleAction;
import saf.ast.condition.AndCondition;
import saf.ast.condition.CombineCondition;
import saf.ast.condition.Condition;
import saf.ast.condition.OrCondition;
import saf.ast.condition.SingleCondition;
import saf.ast.enumType.Characteristics;
import saf.ast.enumType.ConditionType;
import saf.ast.enumType.FightActionType;
import saf.ast.enumType.MoveActionType;

public class TypeChecker implements IVisitor{
	private List<String> typeErrorMessage;
	private boolean hasAlawysBehaviour;
	private boolean isMoveAct;
	private boolean isFightAct;
	
	public TypeChecker()
	{
		typeErrorMessage = new ArrayList<String>();
		hasAlawysBehaviour = false;
		isMoveAct = false;
		isFightAct = false;
	}
	
	@Override
	public void visit(Bot fighter) 
	{
		for(Personality p : fighter.getPersonality())
			p.accept(this);
		for(Behaviour b : fighter.getBehaviour())
			b.accept(this);
		
		if (!hasAlawysBehaviour)
			typeErrorMessage.add("ERROR: No Always Condition");
		
		if (hasDuplicatedPersonality(fighter))
			typeErrorMessage.add("ERROR: Exist Duplicated Personality");
	}
	
	private boolean hasDuplicatedPersonality(Bot fighter)
	{
		boolean isDuplicated = false;
		List<String> tempNames = new ArrayList<String>();
		
		for (Personality p : fighter.getPersonality())
			tempNames.add(p.getCharacterName());
		for (Personality p : fighter.getPersonality())
		{
			int count = 0;
			for (String s : tempNames)
				if (p.getCharacterName().equalsIgnoreCase(s))
					count += 1;
			if (count > 1)
			{
				isDuplicated = true;
				break;
			}
		}
		
		return isDuplicated;
	}

	@Override
	public void visit(Personality personality) {
		String charaName = personality.getCharacterName();
		
		try
		{
			Characteristics.valueOf(charaName);
		}
		catch (Exception e)
		{
			typeErrorMessage.add("ERROR: Invalid Personality Name: " + personality.getCharacterName());
		}
		
		checkValue(personality);
	}
	
	private void checkValue(Personality personality)
	{
		int value = personality.getCharacterValue();
		
		if (value > 10 || value < 1)
			typeErrorMessage.add("ERROR: " + "The value of " + personality.getCharacterName() + " is invalid: " + value);
	}
		
	@Override
	public void visit(Behaviour behaviour) {
		Condition condition = behaviour.getCondition();
		Action action = behaviour.getAction();
		
		try
		{
			if (((SingleCondition)condition).getConditionName().equalsIgnoreCase("always"))
				hasAlawysBehaviour = true;
			condition.accept(this);
		}
		catch (Exception e)
		{
			condition.accept(this);
		}
		action.accept(this);
	}

	@Override
	public void visit(Condition condition) {
		condition.accept(this);
	}

	@Override
	public void visit(CombineCondition combineCondition) {
		combineCondition.accept(this);
	}

	@Override
	public void visit(OrCondition orCondition) {
		Condition[] cond = orCondition.getCombineConditions();
		cond[0].accept(this);
		cond[1].accept(this);
	}

	@Override
	public void visit(AndCondition andCondition) {
		Condition[] cond = andCondition.getCombineConditions();
		cond[0].accept(this);
		cond[1].accept(this);
	}
	
	@Override
	public void visit(SingleCondition singleCondition) {
		try
		{
			ConditionType.valueOf(singleCondition.getConditionName());
		}
		catch (Exception e)
		{
			typeErrorMessage.add("ERROR: Invalid Condition: " + singleCondition.getConditionName());
		}
	}

	
	@Override
	public void visit(Action action) {
		visitMoveAct(action.getMoveAction());
		visitFightAct(action.getFightAction());
	}
	
	
	private void visitMoveAct(Action action)
	{
		isMoveAct = true;
		try{
			((SingleAction)action).accept(this);
			isMoveAct = false;
		}
		catch (Exception e)
		{
			action.accept(this);
		}
	}
	
	private void visitFightAct(Action action)
	{
		isFightAct = true;
		try{
			((SingleAction)action).accept(this);
			isFightAct = false;
		}
		catch (Exception e)
		{
			action.accept(this);
		}
	}

	@Override
	public void visit(ChooseAction chooseAction) {
		for (Action a : chooseAction.getActions())
			a.accept(this);
		isMoveAct = false;
		isFightAct = false;
	}

	@Override
	public void visit(SingleAction singleAction) {
		if (isMoveAct)
			visitSingleMoveAct(singleAction);
		if (isFightAct)
			visitSingleFightAct(singleAction);
	}
	
	private void visitSingleMoveAct(SingleAction singleAction)
	{
		try
		{
			MoveActionType.valueOf(singleAction.getSingleAct());
		}
		catch (Exception e)
		{
			typeErrorMessage.add("ERROR: Invalid Move Action: " + singleAction.getSingleAct());
		}
	}
	
	private void visitSingleFightAct(SingleAction singleAction)
	{
		try
		{
			FightActionType.valueOf(singleAction.getSingleAct());
		}
		catch (Exception e)
		{
			typeErrorMessage.add("ERROR: Invalid Fight Action: " + singleAction.getSingleAct());
		}
	}
	
	public List<String> getTypeErrorMessage()
	{
		return typeErrorMessage;
	}
}