package ast;

import java.util.List;

public abstract class Atom {
	protected String typeName;
	protected AtomType type;
	
	public Atom(String typeName) {
		this.typeName = typeName;
	}

	public AtomType getType() {
		return type;
	}

	public abstract void setTypeFromTypeName() throws IllegalArgumentException;

	public void validate(List<String> messages) {
		try {
			setTypeFromTypeName();
		} catch (IllegalArgumentException e) {
			messages.add("'" + typeName + "' is not a valid value for " + this.getClass() + ".");
		}
	}
	
}
