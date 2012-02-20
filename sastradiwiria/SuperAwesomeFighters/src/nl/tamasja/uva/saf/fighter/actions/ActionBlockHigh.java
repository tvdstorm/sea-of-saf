package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClassBlock;
import nl.tamasja.uva.saf.fighter.action.ActionOptions;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.fighter.conditions.AlwaysCondition;
import nl.tamasja.uva.saf.fighter.conditions.NearCondition;

public class ActionBlockHigh extends ActionClassBlock {
	@Override
	public Height getStrikeHeight() {
		return Height.HIGH;
	}
}