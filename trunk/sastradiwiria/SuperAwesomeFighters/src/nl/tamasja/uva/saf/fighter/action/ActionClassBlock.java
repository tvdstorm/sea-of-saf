package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.action.ActionOptions.Type;

public abstract class ActionClassBlock extends ActionClass implements IFightAction {
	@Override
	public Type getStrikeType() {
		return Type.BLOCK;
	}
}
