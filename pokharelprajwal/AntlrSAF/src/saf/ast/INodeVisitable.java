package saf.ast;

public interface INodeVisitable {
	
	public void accept(INodeVisitor v);

}