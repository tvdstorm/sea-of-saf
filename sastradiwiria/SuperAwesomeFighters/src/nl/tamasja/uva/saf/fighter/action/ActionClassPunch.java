package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.action.ActionOptions.Type;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.fighter.conditions.NearCondition;

public abstract class ActionClassPunch extends ActionClass implements IFightAction {
	
	@Override
	public Type getStrikeType() {
		return Type.PUNCH;
	}
	
	@Override
	public IBehaviourCondition getCondition() {
		return new NearCondition();
	}	

}
