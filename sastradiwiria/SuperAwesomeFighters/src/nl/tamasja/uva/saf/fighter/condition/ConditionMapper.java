package nl.tamasja.uva.saf.fighter.condition;

import nl.tamasja.uva.saf.fighter.SpecificationMapper.Condition;
import nl.tamasja.uva.saf.fighter.conditions.*;

public class ConditionMapper {
	public IBehaviourCondition Map(Condition condition) {
		
		switch(condition) {
		case STRONGER: return new StrongerCondition();
		case WEAKER: return new WeakerCondition();
		
		case MUCH_STRONGER: return new MuchStrongerCondition();
		case MUCH_WEAKER: return new MuchWeakerCondition();
		
		case EVEN: return new EvenCondition();
		
		case NEAR: return new NearCondition();
		case FAR: return new FarCondition();
		case ALWAYS: return new AlwaysCondition();
		}
		return null;
	}
	
}
