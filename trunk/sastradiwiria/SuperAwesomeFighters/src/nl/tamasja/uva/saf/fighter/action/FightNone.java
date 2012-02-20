package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;

public class FightNone extends FightAction_old {

	@Override
	protected boolean evaluate(FighterBot self) {
		return false;
	}

	@Override
	protected Height getHeight() {
		return null;
	}

	@Override
	public void executeFightAction(FighterBot self) {
	}

}
