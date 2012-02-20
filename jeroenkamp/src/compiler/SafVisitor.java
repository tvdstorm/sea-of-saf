package compiler;

import compiler.types.*;

public interface SafVisitor {
	void visit(SafObject o);
	void visit(VariableStatement st);
	void visit(ActionStatement st);
	void visit(ChooseAction a);
	void visit(Action a);
	void visit(Condition c);
	void visit(BinCondition c);
	void visit(IntValue i);
	void visit(StringValue s);
}
