package saf.checker;

import saf.structure.*;

public interface ElementVisitor {
	void visit(Action action);
	void visit(Behavior behavior);
	void visit(Bot bot);
	void visit(Bots bots);
	void visit(Characteristic characteristic);
	void visit(ConditionSimple conditionSimple);
	void visit(ConditionOr conditionOr);
	void visit(ConditionAnd conditionAnd);
}
