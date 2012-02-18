package saf.structure;

import java.util.List;

public class Behaviour extends Check {
	
	public Behaviour(List<Rule> behaviour)
	{
		this.behaviour = behaviour;
	}
	
	//Behaviour
	private List<Rule> behaviour;
	
	public List<Rule> getBehaviour() {
		return behaviour;
	}

	@Override
	public List<String> check(){
		boolean alwaysImplemented = false;
		
		if(this.behaviour.size() == 0)
			addError("There aren't any rules specified to define behaviour");
		
		for(Rule rule : behaviour)
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