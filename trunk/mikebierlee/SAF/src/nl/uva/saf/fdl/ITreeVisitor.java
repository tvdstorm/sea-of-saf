package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.FightChoice;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.MoveAction;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;

public interface ITreeVisitor {
	public abstract void visit(Fighter node);
	public abstract void visit(Characteristic node);
	public abstract void visit(Behaviour node);
	public abstract void visit(ConditionAlways node);
	public abstract void visit(FightAction node);
	public abstract void visit(FightChoice node);
	public abstract void visit(MoveAction node);
	public abstract void visit(MoveChoice node);
	public abstract void visit(Rule node);
}
