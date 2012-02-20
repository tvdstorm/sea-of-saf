package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.conditions.NearCondition;

public abstract class FightActionPunch extends FightAction_old {
	
	/*
	@Override
	protected boolean evaluate(FighterBot self) {
		int value = self.getStat("punchReach"); 
		return new NearCondition().evaluate(self, value);
	}


	@Override
	public void executeFightAction(FighterBot self) {
		System.out.println( self.getName() + " punch_low "+self.getEnemyFighter().getName());
		self.getEnemyFighter().takeHit(self.getStat("punchPower"), getHeight());
	}
	 */
}
