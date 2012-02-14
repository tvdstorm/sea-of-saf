package saf.astelements;

import saf.ISAFNode;
import saf.ISAFNodeVisitor;

public class Rule implements ISAFNode {
	private ICondition condition;
	private IAction moveAction;
	private IAction fightAction;
	
	public Rule(ICondition condition, IAction moveAction, IAction fightAction){
		this.condition = condition;
		this.moveAction = moveAction;
		this.fightAction = fightAction;
	}

	public ICondition getCondition() {
		return this.condition;
	}

	public IAction getMoveAction() {
		return this.moveAction;
	}

	public IAction getFightAction() {
		return this.fightAction;
	}

	@Override
	public void accept(ISAFNodeVisitor visitor){
		visitor.visit(this);		
	}
}