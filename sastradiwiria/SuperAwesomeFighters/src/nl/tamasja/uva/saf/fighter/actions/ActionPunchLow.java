package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClassPunch;
import nl.tamasja.uva.saf.fighter.action.ActionOptions;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Type;

public class ActionPunchLow extends ActionClassPunch {

	@Override
	public Height getStrikeHeight() {
		return Height.LOW;
	}

}