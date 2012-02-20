package nl.tamasja.uva.saf.fighter.conditions;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

public class AndCondition implements IBehaviourCondition {
	
	private IBehaviourCondition leftCondition;
	private IBehaviourCondition rightCondition;
	
	
	public AndCondition(IBehaviourCondition leftCondition, IBehaviourCondition rightCondition) {
		this.leftCondition = leftCondition;
		this.rightCondition = rightCondition;
	}

	@Override
	public boolean evaluate(FighterBot self) {
		return leftCondition.evaluate(self) && rightCondition.evaluate(self);
	}

	@Override
	public boolean evaluate(FighterBot self, int value) {
		return leftCondition.evaluate(self,value) && rightCondition.evaluate(self,value);
	}
}