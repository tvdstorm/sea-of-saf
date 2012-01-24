package saf.classes;

public class Fighter implements Strict {
	
	//Constructor
	public Fighter(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}
	
	//Name
	private String name = null;
	
	public String getName() {
		return name;
	}

	
	//Personality
	private Personality personality;
	
	public Personality getPersonality() {
		return personality;
	}
	
	//Behaviour
	private Behaviour behaviour;
	
	public Behaviour getBehaviour() {
		return behaviour;
	}

	@Override
	public void check() throws Exception{
		if(name == null || name.isEmpty()) throw new Exception("Undefined name!");
		personality.check();
		behaviour.check();
	}

}

