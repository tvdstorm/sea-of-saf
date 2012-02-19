package saf.logic;

import java.util.HashMap;

import saf.evaluators.BehaviourActionType;

public class MoveActionIntelligence extends BehaviourActionTypeIntelligence{
	private final static int positionMoveValue = 5;
	private final static int walkValue = 1;
	private final static int runValue = 2;
	
	@SuppressWarnings("serial")
	HashMap<String, Integer> moveActionValues = new HashMap<String, Integer>(){{ 
		put("walk_towards", walkValue * positionMoveValue);
		put("walk_away", -1 * walkValue * positionMoveValue);
		put("run_towards", runValue *  positionMoveValue);
		put("run_away", -1 * runValue * positionMoveValue);
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

	public static BehaviourActionType getDefaultActionType() {
		return new BehaviourActionType("stand");
	}
	
	public boolean isMovingAway(int distanceToOpponent){
		return moveActionValues.get(actionTypeName) < 0;
	}

	public boolean isTowardsAway(int distanceToOpponent){
		return moveActionValues.get(actionTypeName) > 0;
	}
	
	public boolean isOutOfRange(int range){
		return range > (runValue * positionMoveValue);
	}
}
