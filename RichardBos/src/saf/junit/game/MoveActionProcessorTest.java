package saf.junit.game;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import saf.game.GameConstant;
import saf.game.engine.MoveActionProcessor;

public class MoveActionProcessorTest implements GameConstant {

	@Test
	public void processMoveActionTest() {

		String moveActionError = "Error in processMoveActionTest";
		assertEquals(moveActionError, new Point(100, 0),
				getMoveActionPoint(200, 100, MOVE_ACTION_RUNTOWARDS, false));
		
		assertEquals(moveActionError, new Point(50, -80), 
				getMoveActionPoint(200, 100, MOVE_ACTION_WALKTOWARDS, true));
		
		assertEquals(moveActionError, new Point(0, -80), 
				getMoveActionPoint(200, 100, MOVE_ACTION_STAND, true));
		
		assertEquals(moveActionError, new Point(-50, 0), 
				getMoveActionPoint(200, 100, MOVE_ACTION_WALKAWAY, false));
		
		assertEquals(moveActionError, new Point(-100, 0), 
				getMoveActionPoint(200, 100, MOVE_ACTION_RUNAWAY, false));
		
		assertEquals(moveActionError, new Point(0, 80), 
				getMoveActionPoint(200, 100, MOVE_ACTION_JUMP, false));
		
		assertEquals(moveActionError, new Point(0, 0), 
				getMoveActionPoint(200, 100, MOVE_ACTION_JUMP, true));
		
		assertEquals(moveActionError, new Point(-15, 0), 
				getMoveActionPoint(200, 15, MOVE_ACTION_RUNAWAY, false));
		
		assertEquals(moveActionError, new Point(25, 0),
				getMoveActionPoint(25, 0, MOVE_ACTION_RUNTOWARDS, false));
	}

	private Point getMoveActionPoint(int distance, int wallDistance, String moveAction, boolean isJumping) {
		MoveActionProcessor actionProcessor = new MoveActionProcessor(distance, moveAction, wallDistance, isJumping);
		return actionProcessor.getOutcome();
	}

}
