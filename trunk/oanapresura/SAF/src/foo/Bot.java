package foo;

public class Bot {
	String botName;
	Behaviour botBehaviour;
	Personality botPersonality;
	
	void setName(String name){
		this.botName = name;
	}
	
	String getName(){
		return this.botName;
	}
	
	void setBehaviour(Behaviour b){
		this.botBehaviour = b;
	}
	
	Behaviour getBehavior(){
		return this.botBehaviour;
	}
	
	void setPersonality(Personality p){
		this.botPersonality = p;
	}
	
	Personality getPersonality(){
		return this.botPersonality;
	}
}
