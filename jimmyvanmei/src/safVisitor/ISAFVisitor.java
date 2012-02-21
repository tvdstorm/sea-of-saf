package safVisitor;

import safAST.*;
import safAST.action.Action;
import safAST.action.SelectAction;
import safAST.action.SingleAction;
import safAST.condition.AndCombineCondition;
import safAST.condition.CombineCondition;
import safAST.condition.Condition;
import safAST.condition.OrCombineCondition;
import safAST.condition.SingleCondition;

public interface ISAFVisitor {
	void visit(Bot fighter);
	void visit(Personality personality);
	void visit(Behaviour behaviour);
	void visit(Condition condition);
	void visit(CombineCondition combineCondition);
	void visit(OrCombineCondition orCombineCondition);
	void visit(AndCombineCondition andCombineCondition);
	void visit(SingleCondition singleCondition);
	void visit(Action action);
	void visit(SelectAction selectAction);
	void visit(SingleAction singleAction);
}
