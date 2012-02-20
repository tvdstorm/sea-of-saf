package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClassKick;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;
public class ActionKickLow extends ActionClassKick {
	
	@Override
	public Height getStrikeHeight() {
		return Height.LOW;
	}
}