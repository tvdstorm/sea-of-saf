package saf.simulation;

import java.util.ArrayList;
import java.util.Random;

import saf.structure.Rule;


public class RuleAI 
{
	public static void setPossibleRule(FighterState fighterState, FighterState otherFighterState)
	{
		ArrayList<Rule> possibleRules = new ArrayList<Rule>();
		ArrayList<Rule> rules = (ArrayList<Rule>) fighterState.getFighter().getBehaviour().getRules();
		for(Rule rule : rules)
		{
			if(LogicalAI.computeLogical(fighterState, otherFighterState, rule.getLogical()))
				possibleRules.add(rule);
		}
		
		Random randomGenerator = new Random();
		fighterState.setCurrentRule(possibleRules.get(randomGenerator.nextInt(possibleRules.size())));
	}
}
