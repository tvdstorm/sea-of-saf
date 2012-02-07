package ast.condition;

import java.util.List;

import enums.Condition;

public interface Evaluable {
	boolean evaluate(List<Condition> conditions);
}
