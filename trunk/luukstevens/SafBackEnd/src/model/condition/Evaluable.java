package model.condition;

import java.util.List;

import model.enums.ConditionType;

public interface Evaluable {
	boolean evaluate(List<ConditionType> conditions);
}
