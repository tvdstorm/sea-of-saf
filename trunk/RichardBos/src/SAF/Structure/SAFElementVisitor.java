package SAF.Structure;

interface SAFElementVisitor {
	void visit(Action action) throws Exception;
	void visit(ActionChoose actionChoose) throws Exception;
	void visit(Behavior behavior) throws Exception;
	void visit(Bot bot) throws Exception;
	void visit(Bots bots) throws Exception;
	void visit(Characteristic characteristic) throws Exception;
	void visit(ChoiceCondition choiceCondition) throws Exception;
	void visit(Condition condition) throws Exception;
	void visit(StringCondition stringCondition) throws Exception;
}

interface SAFElement{
	void accept(SAFElementVisitor visitor) throws Exception;
}
