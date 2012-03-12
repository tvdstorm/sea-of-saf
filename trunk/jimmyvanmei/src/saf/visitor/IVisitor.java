package saf.visitor;

import saf.ast.*;
import saf.ast.action.Action;
import saf.ast.action.ChooseAction;
import saf.ast.action.SingleAction;
import saf.ast.condition.AndCondition;
import saf.ast.condition.CombineCondition;
import saf.ast.condition.Condition;
import saf.ast.condition.OrCondition;
import saf.ast.condition.SingleCondition;

public interface IVisitor {
	void visit(Bot fighter);
	void visit(Personality personality);
	void visit(Behaviour behaviour);
	void visit(Condition condition);
	void visit(CombineCondition combineCondition);
	void visit(OrCondition orCondition);
	void visit(AndCondition andCondition);
	void visit(SingleCondition singleCondition);
	void visit(Action action);
	void visit(ChooseAction chooseAction);
	void visit(SingleAction singleAction);
}
