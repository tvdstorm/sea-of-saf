package saf;

public interface ISAFNode {
	public abstract void accept(ISAFNodeVisitor visitor);
}
