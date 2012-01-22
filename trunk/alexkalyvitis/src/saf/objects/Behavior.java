package saf.objects;

public class Behavior {
	private Condition condition;
	private Move move;
	private Attack attack;
	
	public Behavior(){
		this.condition = new Condition();
		this.move = new Move();
		this.attack = new Attack();
	}
	
	public Behavior(Condition c, Move m, Attack a){
		this.condition = c;
		this.move = m;
		this.attack = a;
	}
	
	public Condition GetCondition(){ return this.condition; }
	public Move GetMove(){ return this.move; }
	public Attack GetAttack(){ return this.attack; }
}
