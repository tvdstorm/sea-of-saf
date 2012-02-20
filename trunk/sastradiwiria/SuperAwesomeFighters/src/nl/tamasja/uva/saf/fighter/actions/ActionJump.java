package nl.tamasja.uva.saf.fighter.actions;

import nl.tamasja.uva.saf.fighter.action.ActionClass;
import nl.tamasja.uva.saf.fighter.action.ActionOptions;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.Height;

//import nl.tamasja.uva.saf.fighter.action.FightAction_old.Height;

public class ActionJump extends ActionClass {

	@Override
	public Height getMovementHeight() {
			return Height.HIGH;
	}

}
