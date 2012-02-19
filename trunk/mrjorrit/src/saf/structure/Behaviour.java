package saf.structure;

import java.util.List;

import saf.Checker.Check;

public class Behaviour extends Check {
	
	public Behaviour(List<Rule> rules)
	{
		this.rules = rules;
	}
	
	//Behaviour
	private final List<Rule> rules;
	
	public List<Rule> getRules() {
		return rules;
	}

	@Override
	public List<String> check(){
		boolean alwaysImplemented = false;
		
		if(this.rules.size() == 0)
			addError("There aren't any rules specified to define behaviour");
		
		for(Rule rule : rules)
		{
			addErrors(rule.check());
			if(rule.getLogical() instanceof LogicalSimple && ((LogicalSimple) rule.getLogical()).getCondition() == Condition.always)
			{
				alwaysImplemented = true;
			}
		}
		
		if(!alwaysImplemented)
			addError("A Rule with 'always' isn't implemented, this is required");
		
		return getErrors();
	}
}