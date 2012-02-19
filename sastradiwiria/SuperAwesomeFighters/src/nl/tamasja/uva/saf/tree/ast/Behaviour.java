package nl.tamasja.uva.saf.tree.ast;

import nl.tamasja.uva.saf.tree.IFighterVisitor;

public class Behaviour implements Property {

	private final Condition condition;
	private final Action moveAction;
	private final Action fightAction;
	
	public Behaviour(Condition condition, Action moveAction, Action fightAction) {
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}
	
	
	@Override
	public void accept(IFighterVisitor visitor) {
		
		condition.accept(visitor);
		moveAction.accept(visitor);
		fightAction.accept(visitor);
		
		visitor.visit(this);
	}


	public Condition getCondition() {
		return condition;
	}


	public Action getMoveAction() {
		return moveAction;
	}


	public Action getFightAction() {
		return fightAction;
	}



}
