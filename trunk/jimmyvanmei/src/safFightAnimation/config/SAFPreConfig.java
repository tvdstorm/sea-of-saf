package safFightAnimation.config;

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
import safAST.enumType.FightActionType;
import safAST.enumType.MoveActionType;
import safVisitor.ISAFVisitor;

public class SAFPreConfig implements ISAFVisitor{
	private boolean hasAlawysBehaviour;
	private String warningMessage;
	
	public SAFPreConfig()
	{
		hasAlawysBehaviour = false;
		warningMessage = "";
	}
	
	public String getWarningMessage()
	{
		return warningMessage;
	}
	
	@Override
	public void visit(Bot fighter) {
		String[] charaNames = {"punchReach", "punchPower", "kickReach", "kickPower"};
		
		removeDuplicatedPersonality(fighter);
		addMissingPersonality(charaNames, fighter);
		for (Behaviour b : fighter.getBehaviour())
			visit(b);
		if (!hasAlawysBehaviour)
			fighter.addBehaviour(addAlwaysBehaviour());
		
	}
	
	private void addMissingPersonality(String[] charaNames, Bot fighter)
	{
		ArrayList<String> tempCharaNameList = new ArrayList<String>();
		
		if (fighter.getPersonality().size() != charaNames.length)
		{
			for (Personality p : fighter.getPersonality())
				tempCharaNameList.add(p.getCharacterName());
			for (String outS : charaNames)
			{
				boolean isExist = false;
				for (String inS : tempCharaNameList)
					if (outS.equalsIgnoreCase(inS))
					{
						isExist = true;
						break;
					}
				if (!isExist)
				{
					warningMessage += "This " + outS + " is missing and will be added. The value will be set to 5.\n";
					fighter.addPersonality(new Personality(outS, 5));
				}
			}
		}
	}

	private void removeDuplicatedPersonality(Bot fighter)
	{
		ArrayList<String> tempCharaNames = new ArrayList<String>();
		ArrayList<Personality> removePersonalities = new ArrayList<Personality>();
		
		for (Personality p : fighter.getPersonality())
			tempCharaNames.add(p.getCharacterName());
		for (Personality p : fighter.getPersonality())
		{
			int count = 0;
			boolean isExist = false;
			for (String s : tempCharaNames)
				if (p.getCharacterName().equalsIgnoreCase(s))
					count++;
			for(Personality rp : removePersonalities)
				if (rp.getCharacterName().equalsIgnoreCase(p.getCharacterName()))
				{
					isExist = true;
					break;
				}
			if (count > 1 && !isExist)
				removePersonalities.add(p);
		}
		for (Personality p : removePersonalities)
		{
			warningMessage += "This " + p.getCharacterName()+ " = " + p.getCharacterValue() + " is duplicated and will be moved.\n";
			fighter.removePersonality(p);
		}
	}

	@Override
	public void visit(Personality personality) {
		int value = personality.getCharacterValue();
		
		if (value > 10)
		{
			warningMessage += "The " + personality.getCharacterName() + " value is invalid: " + value + "\nThis value will be set to 10.\n";
			personality.setCharacterValue(10);
		}
		else if (value < 1)
		{
			warningMessage += "The " + personality.getCharacterName() + " value is invalid: " + value + "\nThis value will be set to 1.\n";
			personality.setCharacterValue(1);
		}
	}

	@Override
	public void visit(Behaviour behaviour) {
		visit(behaviour.getCondition());
	}

	@Override
	public void visit(Condition condition) {
		if (condition instanceof SingleCondition)
			visit((SingleCondition)condition);
	}

	@Override
	public void visit(SingleCondition singleCondition) {
		if (singleCondition.getConditionName().equalsIgnoreCase("always"))
			hasAlawysBehaviour = true;
	}

	private Behaviour addAlwaysBehaviour() {
		Random r = new Random();
		SingleAction moveAct, fightAct;
		SingleCondition cond = new SingleCondition("always");
		
		moveAct = new SingleAction(MoveActionType.values()[r.nextInt(MoveActionType.values().length)].toString());
		fightAct = new SingleAction(FightActionType.values()[r.nextInt(FightActionType.values().length)].toString());
		warningMessage += "Always behaviour is missing and will be generated randomly.\n"+"always ["+moveAct.getActionName()+" "+fightAct.getActionName()+"]\n";
		return new Behaviour(cond, new Action(moveAct, fightAct));
	}

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

	@Override
	public void visit(SingleAction singleAction) {}
}

		
