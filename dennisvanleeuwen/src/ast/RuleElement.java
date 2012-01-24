package ast;

import saf.ISAFElement;
import saf.ISAFElementVisitor;

public class RuleElement implements ISAFElement {
	private IConditionElement condition;
	private IActionElement moveAction;
	private IActionElement fightAction;
	
	public IActionElement getMoveAction() {
		return this.moveAction;
	}
	public void setMoveAction(IActionElement moveAction) {
		this.moveAction = moveAction;
	}
	
	public IActionElement getFightAction() {
		return this.fightAction;
	}
	public void setFightAction(IActionElement fightAction) {
		this.fightAction = fightAction;
	}
	
	public IConditionElement getCondition() {
		return this.condition;
	}
	public void setCondition(IConditionElement condition) {
		this.condition = condition;
	}
	
	@Override
	public void accept(ISAFElementVisitor visitor){
		visitor.visit(this);
		this.condition.accept(visitor);
		this.moveAction.accept(visitor);
		this.fightAction.accept(visitor);		
	}
}