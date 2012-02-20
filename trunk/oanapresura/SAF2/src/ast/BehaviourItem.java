package ast;

public class BehaviourItem {
	public Condition condition;
	public Move move;
	public Attack attack;
	
	public BehaviourItem(){
		this.condition = new Condition();
		this.move = new Move();
		this.attack = new Attack();				
	}
	
	public BehaviourItem(Condition condition, Move move, Attack attack){
		this.condition = condition;
		this.move = move;
		this.attack = attack;				
	}
	
	public void setCondition(Condition condition){
		this.condition = condition;
	}
	
	public void setMove(Move move){
		this.move = move;
	}
	
	public void setAttack(Attack attack){
		this.attack = attack;
	}
}
