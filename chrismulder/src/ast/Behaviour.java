package ast;

public class Behaviour implements Validator {
	private Condition c;
	private Move m;
	private Attack a;
	
	public Behaviour(Condition c, Move m, Attack a) {
		this.c = c;
		this.m = m;
		this.a = a;
	}

	@Override
	public boolean validate() {
		return c.validate() && m.validate() && a.validate();
	}

}
