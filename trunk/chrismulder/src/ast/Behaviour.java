package ast;

import java.util.List;
import java.util.Map;

public class Behaviour implements Validator {
	private Condition c;
	private Move m;
	private Attack a;
	
	public Behaviour(Condition c, Move m, Attack a) {
		this.setCondition(c);
		this.setMove(m);
		this.setAttack(a);
	}

	public Attack getAttack() {
		return a;
	}

	public Condition getCondition() {
		return c;
	}

	public Move getMove() {
		return m;
	}

	public boolean isMatching(Map<AtomType, Boolean> conditions) {
		return c.evaluate(conditions);
	}

	public void setAttack(Attack a) {
		this.a = a;
	}

	public void setCondition(Condition c) {
		this.c = c;
	}

	public void setMove(Move m) {
		this.m = m;
	}
	
	@Override
	public void validate(List<String> messages) {
		getCondition().validate(messages);
		getMove().validate(messages);
		getAttack().validate(messages);
	}

}
