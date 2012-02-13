package visitor;

import elements.Behaviour;
import elements.Bot;
import elements.Bots;
import elements.Characteristic;
import elements.ConditionChoices;
import elements.ConditionGroup;

public interface SAFElementVisitor {
	void visit(Behaviour behaviour)  throws Exception;
	void visit(Bot bot) throws Exception;
	void visit(Bots bots) throws Exception;
	void visit(Characteristic characteristic)  throws Exception;
	void visit(ConditionGroup conditionGroup)  throws Exception;
}
