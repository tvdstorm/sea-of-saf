package saf.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import parser.ParseException;
import parser.SAFParser;

import saf.IArenaEngine;
import saf.astnodes.Fighter;
import saf.configuration.SAFConstants;
import saf.engine.SimpleArenaEngine;
import saf.mvc.models.SimpleFighterModel;

public class TestSimpleEngine {
	private static final int START_X = 0;
	private static final int START_HEALTH = 100;
	@Test
	public void test_moveActions(){
		List<String> possibleActions = SAFConstants.getAvailableMoveActions();

		for(String moveAction: possibleActions){
			SimpleFighterModel currentFighter = new SimpleFighterModel(START_X, 100,"stand","stand", null);
			SimpleFighterModel enemyFighter = new SimpleFighterModel(START_X+20, 100,"stand","stand", null);
			IArenaEngine engine = new SimpleArenaEngine(currentFighter, enemyFighter);
			
			engine.doMoveAction(moveAction);
			if(moveAction.equals("stand") || moveAction.equals("jump") || moveAction.equals("crouch")){
				assertTrue(engine.getCurrentFighter().getX() == START_X);
				assertTrue(engine.getCurrentFighter().getCurrentMoveState().equals(moveAction));
			}
			else{
				assertTrue(engine.getCurrentFighter().getX() != START_X);
				assertTrue(engine.getCurrentFighter().getCurrentMoveState().equals("stand"));
			}
		}
	}
	
	@Test
	public void test_fightActions(){
		List<String> possibleActions = SAFConstants.getAvailableFightActions();

		for(String fightAction: possibleActions){
			SAFParser parser = FileLoader.loadFile(FileLoader.testFileDirectory + "AllStatements.saf");
			SimpleFighterModel currentFighter = null;
			SimpleFighterModel enemyFighter = null;
			Fighter fighter = null;
			try {			
				fighter = parser.Fighter();
			} catch (ParseException e) {
				assertTrue(false);//because exception throwing is not OK for this test.
			}

			currentFighter = new SimpleFighterModel(START_X, START_HEALTH,"stand","stand", fighter);
			enemyFighter = new SimpleFighterModel(START_X+1, START_HEALTH,"stand","stand", fighter);

			IArenaEngine engine = new SimpleArenaEngine(currentFighter, enemyFighter);
			
			assertTrue(engine.getCurrentFighter().getHealth() == START_HEALTH);
			engine.doFightAction(fightAction);
			assertTrue(engine.getCurrentFighter().getHealth() == START_HEALTH);
			
			assertTrue(engine.getCurrentFighter().getCurrentFightState().equals(fightAction));
			
			//Get next fighter
			while(engine.getCurrentFighter() == currentFighter)
				engine.nextTurn();
			
			if(fightAction.startsWith("block")){
				assertTrue(engine.getCurrentFighter().getHealth() == START_HEALTH);
			}
			else {
				assertTrue(engine.getCurrentFighter().getHealth() != START_HEALTH);
			}
		}
	}
}