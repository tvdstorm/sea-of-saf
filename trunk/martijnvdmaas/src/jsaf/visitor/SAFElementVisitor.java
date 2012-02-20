package jsaf.visitor;

import jsaf.astelements.Behaviour;
import jsaf.astelements.Bot;
import jsaf.astelements.Bots;
import jsaf.astelements.Characteristic;
import jsaf.astelements.ConditionGroup;

public interface SAFElementVisitor {
	void visit(Behaviour behaviour)  throws Exception;
	void visit(Bot bot) throws Exception;
	void visit(Bots bots) throws Exception;
	void visit(Characteristic characteristic)  throws Exception;
	void visit(ConditionGroup conditionGroup)  throws Exception;
}
