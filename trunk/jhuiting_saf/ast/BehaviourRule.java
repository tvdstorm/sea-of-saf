package ast;

import visitor.FighterVisitor;

public class BehaviourRule implements FighterNode {
	
	protected Identifier condition;

	protected Action moveAction;

	protected Action fightAction;

	public Identifier getCondition() {
		return condition;
	}

	public Action getMoveAction() {
		return moveAction;
	}

	public Action getFightAction() {
		return fightAction;
	}
	
	public BehaviourRule(Identifier cond, Action move, Action fight)
	{
		this.condition = cond;
		this.moveAction = move;
		this.fightAction = fight;
	}

	public void accept(FighterVisitor v) {
	     v.visit(this);
	}
	
	public String toString()
	{
		return this.condition + "[" + this.moveAction + " " + this.fightAction;
	}
}