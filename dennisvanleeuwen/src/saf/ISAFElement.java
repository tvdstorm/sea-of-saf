package saf;

public interface ISAFElement {
	public void accept(ISAFElementVisitor visitor) throws Exception;
}
