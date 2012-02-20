package jsaf.visitor;

import jsaf.astelements.Behaviour;
import jsaf.astelements.Bot;
import jsaf.astelements.Bots;
import jsaf.astelements.Characteristic;
import jsaf.astelements.ConditionGroup;

public interface SAFElementVisitor {
	void visit(Behaviour behaviour);
	void visit(Bot bot);
	void visit(Bots bots);
	void visit(Characteristic characteristic);
	void visit(ConditionGroup conditionGroup);
}
