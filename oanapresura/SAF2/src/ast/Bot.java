package ast;

public class Bot {
	
	private String botName;
	private Behaviour botBehaviour;
	private Personality botPersonality;
	
	
	public void setName(String name){
		this.botName = name;
	}
	
	public String getName(){
		return this.botName;
	}
		
	
	public void setBehaviour(Behaviour b){
		this.botBehaviour = b;
	}
	
	public Behaviour getBehavior(){
		return this.botBehaviour;
	}
	
	public void setPersonality(Personality p){
		this.botPersonality = p;
	}
	
	public Personality getPersonality(){
		return this.botPersonality;
	}
}
