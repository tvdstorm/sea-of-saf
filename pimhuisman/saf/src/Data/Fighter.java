package Data;

public class Fighter {

	private String name;
	private float weight;
	private float height;
	private float speed;
	private Personality personality;
	private Behaviour behaviour;
	
	public Fighter(String name, Personality personality, Behaviour behaviour) {
		this.name = name;
		this.personality = personality;
		this.behaviour = behaviour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getSpeed() {
		return speed;
	}
	
	public Personality getPersonality() {
		return personality;
	}
	
	public Behaviour getBehaviour() {
		return behaviour;
	}
	
}
