package saf.structure;


import saf.checker.Element;
import saf.game.BotState;
import saf.game.GameState;

public abstract class Condition implements Element {
	public Condition()
	{}

	public boolean checkCondition(BotState botState, GameState gameState) {
		//overriden in subclasses
		return false;
	}
}