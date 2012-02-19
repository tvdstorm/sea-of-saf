package saf.simulation;

import java.util.ArrayList;
import java.util.List;

import saf.structure.Fighter;
import saf.structure.Rule;

public class FighterAI 
{
	private ArrayList<Rule> possibleRules;
	
	public FighterAI()
	{
		possibleRules = new ArrayList<Rule>();
	}
	
	public void determineActions(FighterState left, FighterState right)
	{
		determineAction(left, right);
		determineAction(right, left);
	}
	
	private void determineAction(FighterState fighterState, FighterState otherFighterState)
	{
		if(fighterState.getState() == State.standing)
		{
			ArrayList<Rule> rules = (ArrayList<Rule>) fighterState.getFighter().getBehaviour().getRules();
			for(Rule rule : rules)
			{
				if(LogicalAI.computeLogical(fighterState, otherFighterState, rule.getLogical()));
					possibleRules.add(rule);
			}
			
		}
	}
}
