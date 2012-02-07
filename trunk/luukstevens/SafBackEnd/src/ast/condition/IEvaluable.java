package ast.condition;

import java.util.List;

import enums.Condition;

public interface IEvaluable {
	boolean evaluate(List<Condition> conditions);
}
