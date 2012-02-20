package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClassBlock;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;

public class ActionBlockHigh extends ActionClassBlock {
	@Override
	public Height getStrikeHeight() {
		return Height.HIGH;
	}
}