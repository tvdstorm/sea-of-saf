package saf.ast;

import java.util.List;

public class Bot implements INodeVisitable {

	private final String _name;
	private final Personality _personality;
	private final Behaviour _behaviour;
	
	public Bot(String name, Personality personality, Behaviour behaviour) {
		this._name = name;
		this._personality = personality;
		this._behaviour = behaviour;
	}
	
	public Behaviour getBehaviour() {
		return _behaviour;
	}

	public Personality getPersonality() {
		return _personality;
	}

	public String getName() {
		return _name;
	}
	
	public List<Characterstics> getCharacterstics(){
		return _personality.getCharacterstics();
	}
	
	public List<Rule> getRules(){		
		return _behaviour.getRules();
	}

	@Override
	public void accept(INodeVisitor v) {
		getBehaviour().accept(v);
		getPersonality().accept(v);
		v.visit(this);
	}
	

}
