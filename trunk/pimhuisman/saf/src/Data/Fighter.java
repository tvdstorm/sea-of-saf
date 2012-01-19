package Data;

public class Fighter {

	private String name;
	private Personality personality;
	private Behaviour behaviour;
	
	public Fighter(String name) {
		this.name = name;
	}
	
	public void SetName(String name) {
		this.name = name;
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
