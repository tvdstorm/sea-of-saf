package safcr.ast;

import java.util.List;

public class Bot implements Node{
	private final String name;
	private final Personality personality;
	private final Behaviour behaviour;
	
	public Bot(String botName, Personality botPersonality, Behaviour botBehaviour){
		super();
		name = botName;
		personality = botPersonality;
		behaviour = botBehaviour;
	}
	
	public String getName(){
		return name;
	}
	
	public Personality getPersonality(){
		return personality;
	}
	
	public Behaviour getBehaviour(){
		return behaviour;
	}
	
	public List<Characteristic> getCharacteristic(){
		return personality.getCharacteristic();
	}
	
	public List<Rule> getRules(){
		return behaviour.getRules();
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
