package saf;

public interface ISAFElement {
	public abstract void accept(ISAFElementVisitor visitor);
}
