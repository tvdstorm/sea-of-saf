package saf.ast;

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
	
	public Condition getCondition(){ return this.condition; }
	public Move getMove(){ return this.move; }
	public Attack getAttack(){ return this.attack; }
	
	@Override
	public String toString(){
		return condition.toString() + "\n\t\tMove: " + move.getName() + "\n\t\tAttack: " + attack.getName();
	}
}
