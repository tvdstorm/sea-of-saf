package nl.uva.lap.saf.ast;

import nl.uva.lap.saf.ast.action.Choose;
import nl.uva.lap.saf.ast.action.SimpleAction;
import nl.uva.lap.saf.ast.condition.And;
import nl.uva.lap.saf.ast.condition.Or;
import nl.uva.lap.saf.ast.condition.SimpleCondition;
import nl.uva.lap.saf.ast.fighter.Behaviour;
import nl.uva.lap.saf.ast.fighter.Fighter;
import nl.uva.lap.saf.ast.fighter.Personality;

public interface Visitor
{
	public void visit(SimpleAction action);
	public void visit(Choose choose);
	public void visit(Personality personality);
	public void visit(Fighter fighter);
	public void visit(Behaviour behaviour);
	public void visit(And andCondition);
	public void visit(Or orCondition);
	public void visit(SimpleCondition simpleCondition);
}
