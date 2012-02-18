package nl.uva.lap.saf.ast;

import nl.uva.lap.saf.ast.action.Action;
import nl.uva.lap.saf.ast.action.Ident;
import nl.uva.lap.saf.ast.fighter.Behaviour;
import nl.uva.lap.saf.ast.fighter.Fighter;
import nl.uva.lap.saf.ast.fighter.Personality;

public interface Visitor
{
	public void visit(Ident ident);
	public void visit(Action action);
	public void visit(Personality personality);
	public void visit(Fighter fighter);
	public void visit(Behaviour behaviour);
}
