package saf.simulator;

import org.lwjgl.LWJGLException;

import saf.simulator.base.BaseSimulationFighter;

public class FightSimulatorAttacks {
	public static void draw(BaseSimulationFighter fighter) throws LWJGLException {
		int x = fighter.getCurrentX();
		int y = fighter.getCurrentY();
		for(int[] coords : fighter.getAttackCoords()){
			if(coords.length == 3){
				FightSimulatorShapes.circle(x + coords[0], y + coords[1], coords[2]);
			} else {
				FightSimulatorShapes.line(x + coords[0], y + coords[1], x + coords[2], y + coords[3]);
			}
		}
	}
}