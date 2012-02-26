package model;

public class Behaviour {
	private final Condition guard;
	private final Action move;
	private final Action fight;

	public Behaviour(Condition guard, Action move, Action fight) {
		this.guard = guard;
		this.move = move;
		this.fight = fight;
	}
	
	public void addToFighter(Fighter fighter) {
		fighter.addBehavior(this);
	}
	
	public Action getFight() {
		return fight;
	}
	
	public Condition getGuard() {
		return guard;
	}
	
	public Action getMove() {
		return move;
	}
}
