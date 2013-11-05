package saf.ast.util;

import saf.ast.action.FightAction;
import saf.ast.action.MoveAction;
import saf.ast.condition.And;
import saf.ast.condition.Atom;
import saf.ast.condition.Or;
import saf.ast.fighter.Behaviour;
import saf.ast.fighter.Fighter;
import saf.ast.fighter.Personality;
import saf.ast.fighter.Rule;

public interface Visitor {
	
	public void visit(Fighter fighter);
	public void visit(Personality personality);
	public void visit(Behaviour behaviour);
	public void visit(Rule rule);
	public void visit(Atom atom);
	public void visit(And and);
	public void visit(Or or);
	public void visit(MoveAction move);
	public void visit(FightAction fight);
	
}
