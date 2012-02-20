package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class Behaviour implements IProperty {

	private final ICondition condition;
	private final IAction moveAction;
	private final IAction fightAction;
	
	public Behaviour(ICondition condition, IAction moveAction, IAction fightAction) {
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
	
	
	@Override
	public void accept(IFighterVisitor visitor) {
		
		if(condition != null) condition.accept(visitor);
		if(moveAction != null) moveAction.accept(visitor);
		if(fightAction != null) fightAction.accept(visitor);
		
		visitor.visit(this);
	}


	public ICondition getCondition() {
		return condition;
	}


	public IAction getMoveAction() {
		return moveAction;
	}


	public IAction getFightAction() {
		return fightAction;
	}



}
