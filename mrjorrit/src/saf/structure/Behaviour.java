package saf.structure;

import java.util.Vector;

public class Behaviour extends Check {
	
	public Behaviour(Vector<Rule> behaviour)
	{
		this.behaviour = behaviour;
	}
	
	//Behaviour
	private Vector<Rule> behaviour;
	
	public Vector<Rule> getBehaviour() {
		return behaviour;
	}

	@Override
	public void check(){
		//TODO: check if always is implemented
		//boolean alwaysImplemented = false;
		for(Rule rule : behaviour)
		{
			rule.check();
		}
	}
}
