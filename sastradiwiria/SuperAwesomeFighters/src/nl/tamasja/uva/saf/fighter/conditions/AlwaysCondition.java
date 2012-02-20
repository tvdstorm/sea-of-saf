package nl.tamasja.uva.saf.fighter.conditions;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

public class AlwaysCondition implements IBehaviourCondition {

	@Override
	public boolean evaluate(FighterBot self) {
		return true;
	}

	@Override
	public boolean evaluate(FighterBot self, int value) {
		return evaluate(self);
	}

}
