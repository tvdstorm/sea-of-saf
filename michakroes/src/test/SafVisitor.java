package test;

import saf.*;

public interface SafVisitor {
	 void visit(Saf saf);
	 void visit(Behaviour b);
	 void visit(Personality p);
	 void visit(Strength s);
	 void visit(BehaviourRule br);
	 void visit(ConditionAction c);
	 void visit(WalkAction wa);
	 void visit(FightAction fa);
	 void visit(ConditionConnective conditionConnective);
	 void visit(ConditionAnd conditionAnd);
	 void visit(ConditionOr conditionOr);
	 void visit(Condition c);
}
