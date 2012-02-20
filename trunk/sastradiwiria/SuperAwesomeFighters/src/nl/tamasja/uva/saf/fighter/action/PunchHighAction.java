package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.fighter.conditions.NearCondition;

//TODO: old
public class PunchHighAction extends FightAction_old {
	
	/*
	@Override
	public void execute(FighterBot self, FighterBot target) {
		
		
		NearCondition near = new NearCondition();
		
		if(near.evaluate(self, target)) {
			target.takeHit(self.getStat("punchPower"), Target.HIGH);
			System.out.println( self.getName() + " punch_high "+target.getName());
		} else{ 
			System.out.println( self.getName() + " tries to punch_high "+ target.getName() + " but is too far");
		}

	}
	 */
	


	@Override
	public void executeFightAction(FighterBot self) {
		
		//BehaviourCondition bc = new NearCondition();
		
		//bc.evaluate(self, 1);
		System.out.println( self.getName() + " punch_high "+self.getEnemyFighter().getName());
		//self.getEnemyFighter().takeHit(self.getStat("punchPower"), getHeight());
		
	}

	@Override
	protected Height getHeight() {
		return Height.HIGH;
	}

	@Override
	protected boolean evaluate(FighterBot self) {
		//int value = self.getStat("punchReach"); 
		//return new NearCondition().evaluate(self, value);
		return false;
	}
	/*
	@Override
	public void execute(FighterBot self) {
		if(evaluate(self)) {
			executeFightAction(self);
		}
		
	}
	 */


}
