package saf.ast.definition;

import saf.ast.ASTNode;
import saf.ast.FighterVisitor;
import saf.ast.condition.Condition;

public class Behaviour implements ASTNode {
	private Condition condition;
	private Procedure move;	
	private Procedure attack;
	
	public Condition getCondition() {
		return this.condition;
	}
	
	public Procedure getMove() {
		return this.move;
	}
	
	public Procedure getAttack() {
		return this.attack;
	}
	
	public Behaviour(Condition condition, Procedure move, Procedure attack) {
		this.condition = condition;
		this.move = move;
		this.attack = attack;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
