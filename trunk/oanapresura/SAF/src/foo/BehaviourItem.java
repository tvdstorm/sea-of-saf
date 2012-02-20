package foo;

public class BehaviourItem {
	String condition;
	String move;
	String attack;
	
	public BehaviourItem(){
		this.condition = new String();
		this.move = new String();
		this.attack = new String();				
	}
	
	public BehaviourItem(String condition, String move, String attack){
		this.condition = condition;
		this.move = move;
		this.attack = attack;				
	}
	
	void setCondition(String condition){
		this.condition = condition;
	}
	
	void setMove(String move){
		this.move = move;
	}
	
	void setAttack(String attack){
		this.attack = attack;
	}
}
