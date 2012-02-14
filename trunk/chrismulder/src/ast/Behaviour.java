package ast;

import java.util.HashMap;

import ast.ConditionAtom.Type;

public class Behaviour implements Validator {
	private Condition c;
	private Move m;
	private Attack a;
	
	public Behaviour(Condition c, Move m, Attack a) {
		this.setCondition(c);
		this.setMove(m);
		this.setAttack(a);
	}

	@Override
	public boolean validate() {
		return getCondition().validate() && getMove().validate() && getAttack().validate();
	}

	public Condition getCondition() {
		return c;
	}

	public void setCondition(Condition c) {
		this.c = c;
	}

	public Move getMove() {
		return m;
	}

	public void setMove(Move m) {
		this.m = m;
	}

	public Attack getAttack() {
		return a;
	}

	public void setAttack(Attack a) {
		this.a = a;
	}
	
	public boolean isMatching(HashMap<Type, Boolean> conditions) {
		return c.evaluate(conditions);
	}

}
