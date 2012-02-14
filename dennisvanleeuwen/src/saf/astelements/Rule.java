package saf.astelements;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class Rule implements ISAFElement {
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
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);		
	}
}