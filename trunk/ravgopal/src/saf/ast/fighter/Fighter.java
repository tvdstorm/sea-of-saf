package saf.ast.fighter;

import saf.ast.ASTNode;
import saf.ast.util.Visitor;

public class Fighter extends ASTNode {
	
	private final String name;
	private Personality personality;
	private Behaviour behaviour;

	public Fighter(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
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
	
}
