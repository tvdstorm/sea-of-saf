package ast;

public abstract class Atom {
	private String type;
	
	public Atom(String type) {
		this.type = type;
	}

	protected abstract boolean validateType(String type);
	
	public boolean validate() {
		return validateType(type);
	}
}
