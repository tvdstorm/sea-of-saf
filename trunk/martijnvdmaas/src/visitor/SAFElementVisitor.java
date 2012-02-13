package visitor;

import astelements.Behaviour;
import astelements.Bot;
import astelements.Bots;
import astelements.Characteristic;
import astelements.ConditionChoices;
import astelements.ConditionGroup;

public interface SAFElementVisitor {
	void visit(Behaviour behaviour)  throws Exception;
	void visit(Bot bot) throws Exception;
	void visit(Bots bots) throws Exception;
	void visit(Characteristic characteristic)  throws Exception;
	void visit(ConditionGroup conditionGroup)  throws Exception;
}
