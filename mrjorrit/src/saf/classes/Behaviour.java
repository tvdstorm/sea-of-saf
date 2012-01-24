package saf.classes;

import java.util.Vector;

public class Behaviour implements Strict {
	
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
	public void check() throws Exception {
		//TODO: check if always is implemented
		//boolean alwaysImplemented = false;
		for(Rule rule : behaviour)
		{
			rule.check();
		}
	}
}
