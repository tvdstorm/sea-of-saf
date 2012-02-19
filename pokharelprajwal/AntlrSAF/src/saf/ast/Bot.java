package saf.ast;
public class Bot implements INodeVisitable {

	private final String _name;
	private final Personality _personality;
	private final Behaviour _behaviour;
	
	public Bot(String name, Personality personality, Behaviour behaviour) {
		this._name = name;
		this._personality = personality;
		this._behaviour = behaviour;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		getBehaviour().accept(v);
		getPersonality().accept(v);
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
	
	@Override
	public String GetTreeString() {
		
		String newLine = System.getProperty("line.separator");
		StringBuilder retStr = new StringBuilder();
		retStr.append(_name);
		retStr.append(newLine);
		retStr.append(_personality.GetTreeString());
		retStr.append(newLine);
		retStr.append(_behaviour.GetTreeString());
		
		return retStr.toString();
	}

}
