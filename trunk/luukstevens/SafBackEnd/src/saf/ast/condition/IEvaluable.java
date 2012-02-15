package saf.ast.condition;

import saf.state.BotState;

public interface IEvaluable {
	boolean evaluate(BotState botState);
}
