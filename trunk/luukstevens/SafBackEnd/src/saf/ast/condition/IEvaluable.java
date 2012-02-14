package saf.ast.condition;

import java.util.List;

import saf.variable.Options;

public interface IEvaluable extends Options {
	boolean evaluate(List<Condition> conditions);
}
