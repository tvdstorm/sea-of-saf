package saf.evaluator;

public interface INodeVisitor {
	public void visit(Bot bot);
	public void visit(Characterstics characterstics);
	public void visit(Rule rule);
	public void visit(Behaviour behaviour);
	public void visit(Personality personality);
}
