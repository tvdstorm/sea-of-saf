package nl.tamasja.uva.saf.fighter.action;

//import nl.tamasja.uva.saf.fighter.action.FightAction_old.Height;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.fighter.action.ActionOptions.*;

public interface IAction {

	//String getKey();
	
	//String getRangeStatisticName();
	//String getPowerStatisticName();
	
	IBehaviourCondition getCondition();
	
	Height getStrikeHeight();
	Type getStrikeType();
	
	//Height getBlockHeight();
	
	Height getMovementHeight();
	int getMovement();
	
}
