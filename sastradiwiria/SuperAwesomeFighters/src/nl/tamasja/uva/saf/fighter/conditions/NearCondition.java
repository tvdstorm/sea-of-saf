package nl.tamasja.uva.saf.fighter.conditions;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

public class NearCondition implements IBehaviourCondition {


	@Override
	public boolean evaluate(FighterBot self) {
		return evaluate(self, Math.min(self.getStat(Strength.PUNCH_REACH), self.getStat(Strength.KICK_REACH)));
	}

	@Override
	public boolean evaluate(FighterBot self, int value) {
		//return Math.abs(self.getPosition() - self.getEnemyFighter().getPosition()) <= value;
		return self.getDistance() <= value;
	}
}
