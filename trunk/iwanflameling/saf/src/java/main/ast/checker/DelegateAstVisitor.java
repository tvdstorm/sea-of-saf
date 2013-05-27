package ast.checker;

import ast.AstVisitor;
import ast.action.Choose;
import ast.action.SimpleAction;
import ast.condition.And;
import ast.condition.Condition;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.Behavior;
import ast.fighter.Fighter;
import ast.fighter.FighterProp;
import ast.fighter.Strength;

public abstract class DelegateAstVisitor implements AstVisitor {

	@Override
	public void visit(And and) {
		and.getLhs().accept(this);
		and.getRhs().accept(this);

	}

	@Override
	public void visit(Leaf leaf) {
		// A leaf can not further delegate to children.
	}

	@Override
	public void visit(Or or) {
		or.getLhs().accept(this);
		or.getRhs().accept(this);

	}

	@Override
	public void visit(SimpleAction action) {
		// An action can not further delegate to children.

	}

	@Override
	public void visit(Choose choose) {
		for(SimpleAction action : choose.getChoices()){
			action.accept(this);
		}
	}

	@Override
	public void visit(Strength strength) {
		// strength can not further delegate to children.
	}

	@Override
	public void visit(Behavior behavior) {
		behavior.getCondition().accept(this);
		behavior.getFightAction().accept(this);
		behavior.getMoveAction().accept(this);
	}

	@Override
	public void visit(Fighter fighter) {
		for(FighterProp fighterProp : fighter.getFighterProps()){
			fighterProp.accept(this);
		}
	}
	
	@Override
	public void visit(Condition condition) {
		// Condition is an abstract type. The visits should always be of a subclass of Condition.
	}

}
