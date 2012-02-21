package saf.structure;

import java.util.List;

import saf.Checker.Check;

public class Behaviour extends Node 
{	
	private final List<Rule> rules;
	
	public Behaviour(List<Rule> rules)
	{
		this.rules = rules;
	}
	
	public List<Rule> getRules() 
	{
		return rules;
	}

	@Override
	public void check(Check checker) 
	{
		boolean alwaysImplemented = false;
		if(this.rules.size() == 0)
			checker.addError("There aren't any rules specified to define behaviour");
		
		for(Rule rule : rules)
		{
			rule.check(checker);
			if(rule.getLogical() instanceof LogicalSimple && ((LogicalSimple) rule.getLogical()).getConditionString().equals(Condition.always.name()))
			{
				alwaysImplemented = true;
			}
		}
		
		if(!alwaysImplemented)
			checker.addError("A Rule with 'always' isn't implemented, this is required");
		
	}
}