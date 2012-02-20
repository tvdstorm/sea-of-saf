package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClass;
import nl.tamasja.uva.saf.fighter.action.ActionOptions;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;

public class ActionCrouch extends ActionClass {

	
	@Override
	public Height getMovementHeight() {
			return Height.LOW;
	}

}
