package saf.ast.definition;

import java.util.*;

import saf.ast.ASTNode;
import saf.ast.FighterVisitor;
import saf.ast.condition.Condition;
import saf.checker.*;
import saf.interpreter.*;

public class Behaviour implements ASTNode {
	private Condition condition;
	private ASTNode move;	
	private ASTNode attack;
	
	public Condition getCondition() {
		return this.condition;
	}
	
	public Action getMove() {
		return (Action)this.move;
	}
	
	public Action getAttack() {
		return (Action)this.attack;
	}
	
	public Behaviour(Condition condition, ASTNode move, ASTNode attack) {
		this.condition = condition;
		this.move = move;
		this.attack = attack;
	}

	@Override
	public void accept(FighterVisitor visitor) {
		visitor.visit(this);
	}
}
