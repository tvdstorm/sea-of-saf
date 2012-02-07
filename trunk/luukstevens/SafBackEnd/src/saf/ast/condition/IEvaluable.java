package saf.ast.condition;

import java.util.List;

import saf.variable.IEnums;

public interface IEvaluable extends IEnums {
	boolean evaluate(List<Condition> conditions);
}
