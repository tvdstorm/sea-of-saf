package saf.evaluators;

import java.util.HashMap;

public class MoveActionIntelligence extends BehaviourActionTypeIntelligence{
	private final int positionMoveValue = 5;
	
	@SuppressWarnings("serial")
	HashMap<String, Integer> moveActionValues = new HashMap<String, Integer>(){{ 
		put("walk_towards", 1 * positionMoveValue);
		put("walk_away", -1 * positionMoveValue);
		put("run_towards", 2 * positionMoveValue);
		put("run_away", -2 * positionMoveValue);
		put("jump", 0);
		put("crouch", 0);
		put("stand", 0);
	}};
	
	public MoveActionIntelligence(BehaviourActionType actionType) {
		super(actionType);
	}
	
	public Integer getPositionChange(){
		return moveActionValues.get(actionTypeName);
	}
	
	public Boolean isJump(){
		return actionType.nameEquals("jump");
	}
	
	public Boolean isCrouch(){
		return actionType.nameEquals("crouch");
	}
}
