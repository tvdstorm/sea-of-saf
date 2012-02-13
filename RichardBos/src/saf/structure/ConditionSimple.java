package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.structure.intelligence.ConditionIntelligence;

public class ConditionSimple extends Condition implements Element {
	public ConditionSimple(String Value)
	{
		this.value = Value;
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
	
	private final String value;
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return this.value;
	}
	public boolean checkCondition(BotState botState, GameState gameState) {
		return ConditionIntelligence.checkConditionSimple(this, botState, gameState);
	}
}
