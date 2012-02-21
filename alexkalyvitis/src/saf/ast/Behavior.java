package saf.ast;

import saf.ast.base.BaseCondition;

public class Behavior {
	private BaseCondition condition;
	private Move move;
	private Attack attack;
	
	public Behavior(BaseCondition c, Move m, Attack a){
		this.condition = c;
		this.move = m;
		this.attack = a;
	}
	
	public BaseCondition getCondition(){ return this.condition; }
	public Move getMove(){ return this.move; }
	public Attack getAttack(){ return this.attack; }
	
	public String toString(){
		return condition.toString() + " [ " + move.toString() + " " + attack.toString() + " ]";
	}
}
