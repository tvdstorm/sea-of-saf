package saf.ast;
import saf.ast.action.*;
import saf.utils.*;

public interface INodeVisitor {
	public void visit(Bot bot);
	public void visit(Characterstics characterstics);
	public void visit(Rule rule);
	public void visit(Behaviour behaviour);
	public void visit(Personality personality);
	public void visit(Choose choose);
	public void visit(Int integer);
	public void visit(Function function);
	public void visit(Parameters parameters);
	public void visit(Ident ident);
	public void visit(Operator operator);
}
