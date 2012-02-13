package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;
import saf.game.state.BotState;
import saf.game.state.GameState;

public class ConditionAnd extends ConditionClause implements Element {
	public ConditionAnd(Condition firstCondition, Condition secondCondition) {
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
	}

	public void accept(ElementVisitor visitor) {
		visitor.visit(this);
		this.firstCondition.accept(visitor);
		this.secondCondition.accept(visitor);
	}

	public String toString() {
		String returnString = "";

		returnString = "(";
		returnString += this.getFirstCondition().toString();
		returnString += " and ";
		returnString += this.getSecondCondition().toString();
		returnString += ")";

		return returnString;
	}
	
	public boolean checkCondition(BotState botState,GameState gameState) {
		return firstCondition.checkCondition(botState, gameState) 
			&& secondCondition.checkCondition(botState, gameState);
	}
}
