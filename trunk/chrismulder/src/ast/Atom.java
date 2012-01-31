package ast;

public abstract class Atom {
	protected String typeName;
	protected AtomType type;
	
	public Atom(String typeName) {
		this.typeName = typeName;
	}

	public abstract void setTypeFromTypeName() throws IllegalArgumentException;

	public boolean validate() {
		try {
			setTypeFromTypeName();
		} catch (IllegalArgumentException e) {
			System.out.println(typeName + " is not a valid value for " + this.getClass() + ".");
			return false;
		}
		return true;
	}

	public AtomType getType() {
		return type;
	}
	
}
