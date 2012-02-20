package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClassPunch;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;

public class ActionPunchLow extends ActionClassPunch {

	@Override
	public Height getStrikeHeight() {
		return Height.LOW;
	}

}