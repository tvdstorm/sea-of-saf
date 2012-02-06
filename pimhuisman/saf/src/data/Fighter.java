package data;
import core.BaseTreeVisitor;

public class Fighter extends BaseData {

	private final String name;
	private final Personality personality;
	private final Behaviour behaviour;
	
	public Fighter(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}
	
	public String getName() {
		return name;
	}
	
	public Personality getPersonality() {
		return personality;
	}
	
	public Behaviour getBehaviour() {
		return behaviour;
	}

	@Override
	public void acceptTreePrinter(BaseTreeVisitor treePrinter) {
		treePrinter.visit(this);
		personality.acceptTreePrinter(treePrinter);
		behaviour.acceptTreePrinter(treePrinter);
	}
	
}
