package SAF.Checker;

import SAF.Structure.Action;
import SAF.Structure.Behavior;
import SAF.Structure.Bot;
import SAF.Structure.Bots;
import SAF.Structure.Characteristic;
import SAF.Structure.ChoiceCondition;
import SAF.Structure.Condition;
import SAF.Structure.StringCondition;

public interface SAFElementVisitor {
	void visit(Action action) throws SAFValidationException;
	void visit(Behavior behavior) throws SAFValidationException;
	void visit(Bot bot) throws SAFValidationException;
	void visit(Bots bots) throws SAFValidationException;
	void visit(Characteristic characteristic) throws SAFValidationException;
	void visit(ChoiceCondition choiceCondition) throws SAFValidationException;
	void visit(Condition condition) throws SAFValidationException;
	void visit(StringCondition stringCondition) throws SAFValidationException;
}
