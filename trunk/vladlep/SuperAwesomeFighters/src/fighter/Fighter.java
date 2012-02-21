package fighter;

import fighter.checker.Visitor;

public class Fighter implements IFighter {

	private String name;
	private Behaviour behaviour;
	private Personality personality;

	public Fighter(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.behaviour = behaviour;
		this.personality = personality;
		personality.updatePower();
		personality.updateSpeed();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Behaviour getBehaviour() {
		return behaviour;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Personality getPersonality() {
		return personality;
	}

}
