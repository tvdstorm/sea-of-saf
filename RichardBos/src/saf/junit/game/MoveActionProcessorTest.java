package saf.junit.game;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import saf.game.GameConstant;
import saf.game.engine.MoveActionProcessor;

public class MoveActionProcessorTest implements GameConstant {

	@Test
	public void processMoveActionTest() {

		assertEquals("Error in processMoveActionTest", new Point(100, 0),
				getMoveActionPoint(200, 100, MOVE_TYPE_RUNTOWARDS, false));
		
		assertEquals("Error in processMoveActionTest", new Point(50, -80), 
				getMoveActionPoint(200, 100, MOVE_TYPE_WALKTOWARDS, true));
		
		assertEquals("Error in processMoveActionTest", new Point(0, -80), 
				getMoveActionPoint(200, 100, MOVE_TYPE_STAND, true));
		
		assertEquals("Error in processMoveActionTest", new Point(-50, 0), 
				getMoveActionPoint(200, 100, MOVE_TYPE_WALKAWAY, false));
		
		assertEquals("Error in processMoveActionTest", new Point(-100, 0), 
				getMoveActionPoint(200, 100, MOVE_TYPE_RUNAWAY, false));
		
		assertEquals("Error in processMoveActionTest", new Point(0, 80), 
				getMoveActionPoint(200, 100, MOVE_TYPE_JUMP, false));
		
		assertEquals("Error in processMoveActionTest", new Point(0, 0), 
				getMoveActionPoint(200, 100, MOVE_TYPE_JUMP, true));
		
		assertEquals("Error in processMoveActionTest", new Point(-15, 0), 
				getMoveActionPoint(200, 15, MOVE_TYPE_RUNAWAY, false));
		
		assertEquals("Error in processMoveActionTest", new Point(25, 0),
				getMoveActionPoint(25, 0, MOVE_TYPE_RUNTOWARDS, false));
	}

	private Point getMoveActionPoint(int distance, int wallDistance, String moveAction, boolean isJumping) {
		MoveActionProcessor actionProcessor = new MoveActionProcessor(distance, moveAction, wallDistance, isJumping);
		return actionProcessor.getOutcome();
	}

}
