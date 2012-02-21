package safVisitor;

import safAST.Behaviour;
import safAST.Bot;
import safAST.Personality;
import safAST.action.Action;
import safAST.action.SelectAction;
import safAST.action.SingleAction;
import safAST.condition.AndCombineCondition;
import safAST.condition.CombineCondition;
import safAST.condition.Condition;
import safAST.condition.OrCombineCondition;
import safAST.condition.SingleCondition;

public class SAFTreeVisitor implements ISAFVisitor{

	@Override
	public void visit(Bot fighter) {
		System.out.println(fighter);
	}

	@Override
	public void visit(Personality personality) {
		System.out.println(personality);
	}

	@Override
	public void visit(Behaviour behaviour) {
		System.out.println(behaviour);
	}

	@Override
	public void visit(Action action) {
		System.out.println(action);
	}

	@Override
	public void visit(SelectAction selectAction) {
		System.out.println(selectAction);
	}

	@Override
	public void visit(SingleAction singleAction) {
		System.out.println(singleAction);
	}

	@Override
	public void visit(Condition condition) {
		System.out.println(condition);
	}

	@Override
	public void visit(CombineCondition combineCondition) {
		System.out.println(combineCondition);
	}

	@Override
	public void visit(OrCombineCondition orCombineCondition) {
		System.out.println(orCombineCondition);
	}

	@Override
	public void visit(AndCombineCondition andCombineCondition) {
		System.out.println(andCombineCondition);
	}
	
	@Override
	public void visit(SingleCondition singleCondition) {
		System.out.println(singleCondition);
	}
}
