package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.FightChoice;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.ast.MoveAction;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;

public abstract class TreeVisitor implements ITreeVisitor {

	@Override
	public void visit(Fighter node) {	
		for(ITreeNode attribute : node.getAttributes()) {
			attribute.accept(this);
		}
	}

	@Override
	public void visit(Characteristic node) {}

	@Override
	public void visit(Behaviour node) {
		node.getCondition().accept(this);
		node.getRule().accept(this);		
	}

	@Override
	public void visit(ConditionAlways node) {}

	@Override
	public void visit(FightAction node) {}

	@Override
	public void visit(FightChoice node) {
		for(ITreeNode action : node.getActions()) {
			action.accept(this);
		}
		
	}

	@Override
	public void visit(MoveAction node) {}

	@Override
	public void visit(MoveChoice node) {
		for(ITreeNode action : node.getActions()) {
			action.accept(this);
		}
		
	}

	@Override
	public void visit(Rule node) {
		node.getFightChoice().accept(this);
		node.getMoveChoice().accept(this);
	}
	
	
}
