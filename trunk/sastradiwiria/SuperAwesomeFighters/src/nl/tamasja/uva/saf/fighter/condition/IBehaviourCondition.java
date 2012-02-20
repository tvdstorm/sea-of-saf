package nl.tamasja.uva.saf.fighter.condition;

import nl.tamasja.uva.saf.fighter.FighterBot;

public interface IBehaviourCondition {
	//public boolean evaluate(FighterBot self);

	boolean evaluate(FighterBot self);
	boolean evaluate(FighterBot self, int value);
	


}
