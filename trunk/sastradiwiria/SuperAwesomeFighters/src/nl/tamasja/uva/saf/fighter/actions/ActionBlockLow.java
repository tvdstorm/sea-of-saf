package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClassBlock;
import nl.tamasja.uva.saf.fighter.action.ActionOptions;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;

public class ActionBlockLow extends ActionClassBlock {
	@Override
	public Height getStrikeHeight() {
		return Height.LOW;
	}
}