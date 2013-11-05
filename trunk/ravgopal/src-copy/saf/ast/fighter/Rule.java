package saf.ast.fighter;

import saf.ast.ASTNode;
import saf.ast.action.FightAction;
import saf.ast.action.MoveAction;
import saf.ast.condition.Condition;
import saf.ast.util.Visitor;

public class Rule extends ASTNode {
	private Condition condition;
	private MoveAction move;
	private FightAction fight;

	public Rule(Condition condition, MoveAction move, FightAction fight) {
		this.condition = condition;
		this.move = move;
		this.fight = fight;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Condition getCondition() {
		return condition;
	}

	public MoveAction getMoveAction() {
		return move;
	}

	public FightAction getFightAction() {
		return fight;
	}

}
