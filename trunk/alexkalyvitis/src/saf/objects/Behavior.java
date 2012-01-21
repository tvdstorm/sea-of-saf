package saf.objects;

public class Behavior {
	private String name;
	private Condition condition;
	private Move move;
	private Attack attack;
	
	public Behavior(){
		this.name = "";
		this.condition = new Condition();
		this.move = new Move();
		this.attack = new Attack();
	}
	
	public Behavior(String n, Condition c, Move m, Attack a){
		this.name = n;
		this.condition = c;
		this.move = m;
		this.attack = a;
	}
	
	public String GetName(){ return this.name; }
	public Condition GetCondition(){ return this.condition; }
	public Move GetMove(){ return this.move; }
	public Attack GetAttack(){ return this.attack; }
}
