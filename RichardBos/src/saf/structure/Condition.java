package saf.structure;


import saf.checker.Element;
import saf.game.state.BotState;
import saf.game.state.GameState;

public abstract class Condition implements Element {
	public Condition()
	{}

	public boolean checkCondition(BotState botState, GameState gameState) {
		//overriden in subclasses
		return false;
	}
}