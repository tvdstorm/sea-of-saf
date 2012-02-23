package saf.simulator;

import java.util.List;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import saf.ast.Fighter;
import saf.simulator.base.BaseSimulationFighter;
import saf.simulator.enums.FighterStatus;

public class FightSimulator {
	public static final int FPS = 24;
	
	public static final int WINDOW_HEIGHT = 400;
	public static final int WINDOW_WIDTH = 800;
	
	public static final int FIGHTER_OFFSET_X = 100;
	public static final int FIGHTER_OFFSET_Y = 75;
	
	private Fight fight;
	
	public FightSimulator(List<Fighter> fighters){
		fight = new Fight(fighters,WINDOW_WIDTH,FIGHTER_OFFSET_X,WINDOW_HEIGHT,FIGHTER_OFFSET_Y);
	}
	public String Simulate() throws SimulationException, LWJGLException {
		initializeDisplay();
		initializeOpenGL();
		
		while (!Display.isCloseRequested() && !fight.hasEnded()) {
			updateTimeInTitle();
			clearScreen();
			drawHealth();
			
			fight.assess();
			draw(fight.getLeft());
			draw(fight.getRight());
			
			Display.update();
			Display.sync(FPS);
		}
		Display.destroy();
		return this.fight.getWinnersName();
	}
	private void draw(BaseSimulationFighter fighter) throws LWJGLException{
		if(FightSimulatorMoves.draw(fighter)){
			fighter.setStatus(FighterStatus.OCCUPIED);
		} else {
			FightSimulatorAttacks.draw(fighter);
			fighter.setStatus(FighterStatus.READY);
		}
	}
	private void initializeDisplay() throws LWJGLException {
		Display.setDisplayMode(new DisplayMode(FightSimulator.WINDOW_WIDTH,FightSimulator.WINDOW_HEIGHT));
		Display.create();
	}
	private void initializeOpenGL() throws LWJGLException {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, FightSimulator.WINDOW_WIDTH, FightSimulator.WINDOW_HEIGHT, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glHint(GL11.GL_POINT_SMOOTH_HINT | GL11.GL_LINE_SMOOTH_HINT | GL11.GL_POLYGON_SMOOTH_HINT, GL11.GL_DONT_CARE);
	}
	private void clearScreen() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}
	private void updateTimeInTitle() throws LWJGLException {
		Display.setTitle(fight.getLeft().getName() + " VS " + fight.getRight().getName() + " " + fight.getCountDown());
	}
	private void drawHealth() throws LWJGLException {
		FightSimulatorShapes.rectangle(20, 20, fight.getLeft().getHealth(), 10);
		FightSimulatorShapes.rectangle(WINDOW_WIDTH - 20, 20, -fight.getRight().getHealth(), 10);
	}
}
