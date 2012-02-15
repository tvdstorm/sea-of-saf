package test;

import saf.*;

public interface SafVisitor {
	 void visit(Saf saf);
	 void visit(Behaviour b);
	 void visit(Personality p);
	 void visit(Condition c);
	 void visit(BehaviourRule br);
	 void visit(Type t);
	// void visit(Personality p);
	// void visit(Personality p);
}
