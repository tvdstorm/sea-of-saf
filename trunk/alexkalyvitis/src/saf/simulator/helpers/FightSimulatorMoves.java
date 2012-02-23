package saf.simulator.helpers;

import org.lwjgl.LWJGLException;
import saf.simulator.base.BaseSimulationFighter;

public class FightSimulatorMoves {
	public static boolean draw(BaseSimulationFighter fighter) throws LWJGLException {
		switch(fighter.getMove()) {
		case JUMP			: 
			drawFigure(fighter);
			return false;
		case CROUCH			: 
			drawFigure(fighter);
			return false;
		case STAND			: 
			drawFigure(fighter);
			return false;
		case RUN_TOWARDS	: 
			if (!fighter.canMoveForward()) 
				return false;
			fighter.runForward();
			drawFigure(fighter);
			return true;
		case RUN_AWAY		: 
			if (!fighter.canMoveBackward()) 
				return false;
			fighter.runBackward();
			drawFigure(fighter);
			return true;
		case WALK_TOWARDS	: 
			if (!fighter.canMoveForward()) 
				return false;
			fighter.walkForward();
			drawFigure(fighter);
			return true;
		case WALK_AWAY		: 
			if (!fighter.canMoveBackward()) 
				return false;
			fighter.walkBackward();
			drawFigure(fighter);
			return true;
		}
		assert false: "FightSimulatorMoves.draw() : Out of \"Moves\" in the switch statement";
		return false;
	}
	private static void drawFigure(BaseSimulationFighter fighter) throws LWJGLException {
		for(int[] coords : fighter.getStandCoords()){
			int x = fighter.getCurrentX();
			int y = fighter.getCurrentY();
			if(coords.length == 3){
				FightSimulatorShapes.circle(x + coords[0], y + coords[1], coords[2]);
			} else {
				FightSimulatorShapes.line(x + coords[0], y + coords[1], x + coords[2], y + coords[3]);
			}
		}
	}
}