package ast;

public class Choice implements Validator {

	protected Atom c1;
	protected Atom c2;

	public Choice(Atom c1, Atom c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean validate() {
		return c1.validate() && c2.validate();
	}

}