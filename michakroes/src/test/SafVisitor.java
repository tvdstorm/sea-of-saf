package test;

import saf.*;

public interface SafVisitor {
	 void visit(Saf saf);
	 void visit(Behaviour b);
	 void visit(Personality p);
	 void visit(Strength s);
	 void visit(Condition c);
	 void visit(WalkAction wa);
	 void visit(FightAction fa);
	 void visit(BehaviourRule br);
	 void visit(Type t);	 
}
