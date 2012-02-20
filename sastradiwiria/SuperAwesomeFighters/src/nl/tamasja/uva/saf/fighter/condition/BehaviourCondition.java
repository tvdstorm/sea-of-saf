package nl.tamasja.uva.saf.fighter.condition;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.action.IBehaviourAction;

public abstract class BehaviourCondition implements IBehaviourCondition {
	
	protected IBehaviourAction fightAction;
	protected IBehaviourAction moveAction;
	
	public BehaviourCondition(IBehaviourAction fightAction,IBehaviourAction moveAction) {
		this.fightAction = fightAction;
		this.moveAction = moveAction;
	}
	
	@Override
	public boolean evaluate(FighterBot self) {
		return false;
	}

}
