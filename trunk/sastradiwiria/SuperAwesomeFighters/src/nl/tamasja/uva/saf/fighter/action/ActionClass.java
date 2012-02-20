package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Type;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.fighter.conditions.AlwaysCondition;

public abstract class ActionClass implements IAction {

	@Override
	public IBehaviourCondition getCondition() {
		return new AlwaysCondition();
	}

	@Override
	public Height getStrikeHeight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type getStrikeType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	@Override
	public Height getBlockHeight() {
		// TODO Auto-generated method stub
		return null;
	}
	 */
	
	@Override
	public Height getMovementHeight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMovement() {
		// TODO Auto-generated method stub
		return 0;
	}



}
