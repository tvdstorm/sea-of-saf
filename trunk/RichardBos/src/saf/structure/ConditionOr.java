package saf.structure;

import saf.checker.Element;
import saf.checker.ElementVisitor;
import saf.game.BotState;
import saf.game.GameState;

public class ConditionOr extends ConditionClause implements Element {
	public ConditionOr(Condition firstCondition, Condition secondCondition)
	{
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

		returnString += this.getFirstCondition().toString();
		returnString += " or ";
		returnString += this.getSecondCondition().toString();
		
		return returnString;
	}
	public boolean checkCondition(BotState botState,GameState gameState) {
		return firstCondition.checkCondition(botState, gameState) 
			|| secondCondition.checkCondition(botState, gameState);
	}
}
