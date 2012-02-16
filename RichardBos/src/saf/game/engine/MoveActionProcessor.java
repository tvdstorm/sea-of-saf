package saf.game.engine;

import java.awt.Point;

import saf.game.GameConstant;

public class MoveActionProcessor implements GameConstant {

	private final int distance;
	private final String moveAction;
	private final int distanceFromWall;
	private final Boolean isJumping;
	private final Point outcome;
	
	public MoveActionProcessor(int distance, String moveAction, int distanceFromWall, boolean isJumping) {
		this.distance = distance;
		this.moveAction = moveAction;
		this.distanceFromWall = distanceFromWall;
		this.isJumping = isJumping;
		this.outcome = processMoveAction();
	}

	public Point getOutcome()
	{
		return this.outcome;
	}
	
	private Point processMoveAction() {

		int dXDistance = 0;
		int dYDistance = 0;

		if (moveAction.equals(MOVE_ACTION_WALKTOWARDS) 
				|| moveAction.equals(MOVE_ACTION_WALKAWAY)
				|| moveAction.equals(MOVE_ACTION_RUNTOWARDS)
				|| moveAction.equals(MOVE_ACTION_RUNAWAY)) {
			dXDistance = MOVEACTION_DISTANCE.get(moveAction);
		}

		// The distance cannot become negative
		if (distance < dXDistance)
			dXDistance = distance;

		if (moveAction.equals(MOVE_ACTION_JUMP)) {
			if (!isJumping)
				dYDistance = CONST_JUMP_PIXELS;
		} else {
			if (isJumping)
				dYDistance = -CONST_JUMP_PIXELS;
		}

		if (moveAction.equals(MOVE_ACTION_STAND) || 
			moveAction.equals(MOVE_ACTION_CROUCH)) {
			if (isJumping)
				dYDistance = -CONST_JUMP_PIXELS;
		}

		// check if Bot isn't moving outside of the screen
		if (dXDistance < 0 && -dXDistance > distanceFromWall)
			dXDistance = -distanceFromWall;

		return new Point(dXDistance, dYDistance);
	}
}
