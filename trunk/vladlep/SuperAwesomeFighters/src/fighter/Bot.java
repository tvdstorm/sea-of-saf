package fighter;

import fighter.checker.Visitor;

public class Bot implements ASTNode {

	private String name;
	private Behaviour behaviour;
	private Personality personality;

	public Bot(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}

	public String getName() {
		return name;
	}

	public Behaviour getBehaviour() {
		return behaviour;
	}

	public Personality getPersonality() {
		return personality;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
