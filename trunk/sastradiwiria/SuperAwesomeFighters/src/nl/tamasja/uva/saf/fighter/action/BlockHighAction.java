package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.fighter.conditions.AlwaysCondition;

public class BlockHighAction extends FightAction_old {
	

	
	@Override
	public void executeFightAction(FighterBot self) {
		// TODO Auto-generated method stub
		setBlockHeight(getHeight());
		System.out.println( self.getName() + " block_high");
		
	}
	
	@Override
	protected Height getHeight() {
		return Height.HIGH;
	}

	@Override
	protected boolean evaluate(FighterBot self) {
		return new AlwaysCondition().evaluate(self);
	}

}
