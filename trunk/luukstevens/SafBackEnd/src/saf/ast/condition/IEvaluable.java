package saf.ast.condition;

import java.util.List;

import saf.enums.Condition;


public interface IEvaluable {
	boolean evaluate(List<Condition> conditions);
}
