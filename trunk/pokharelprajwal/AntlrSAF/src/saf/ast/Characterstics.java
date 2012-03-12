package saf.ast;

public class Characterstics implements INodeVisitable {

	private final String _name;
	private final String _value;
	
	public Characterstics(String name, String value){
		this._name = name;
		this._value = value;
	}
	
	public void AddToPersonality(Personality personality){
		personality.addCharacterstics(this);
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

	public String getName() {
		return _name;
	}

	public String getValue() {
		return _value;
	}


}
