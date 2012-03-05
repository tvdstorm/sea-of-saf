package ast;

public class BehaviourItem {
	
	private Condition condition;
	
	private Action move;
	private Action attack;		
	
	public BehaviourItem(Condition condition, Action move, Action attack){
		this.condition = condition;
		this.move = move;
		this.attack = attack;				
	}
	
	public Condition getCondition() {
		return condition;
	}

	public Action getMove() {
		return move;
	}

	public Action getAttack() {
		return attack;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}
	
	public void setMove(Action move){
		this.move = move;
	}
	
	public void setAttack(Action attack){
		this.attack = attack;
	}
}
