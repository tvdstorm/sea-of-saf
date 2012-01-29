package saf.evaluator;
public class Bot implements INodeVisitable {

	private String _name;
	private Personality _personality;
	private Behaviour _behaviour;
	
	public Bot(String name) {
		set_Name(name);
		set_Personality(new Personality());
		set_Behaviour(new Behaviour());
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

	public Behaviour get_Behaviour() {
		return _behaviour;
	}

	public void set_Behaviour(Behaviour _behaviour) {
		this._behaviour = _behaviour;
	}

	public Personality get_Personality() {
		return _personality;
	}

	public void set_Personality(Personality _personality) {
		this._personality = _personality;
	}

	public String get_Name() {
		return _name;
	}

	public void set_Name(String _name) {
		this._name = _name;
	}

}
