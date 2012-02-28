package util;

import model.*;

public interface Visitor {
	public void visit(Choose choose);
	public void visit(Simple simple);
	public void visit(Behaviour behavior);
	public void visit(Strength strength);
	public void visit(Fighter fighter);
	public void visit(Ident ident);
	public void visit(Type type);
	public void visit(And and);
	public void visit(Or or);
	public void visit(Personality personality);
}	