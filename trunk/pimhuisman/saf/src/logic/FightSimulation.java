package logic;

import java.awt.Graphics;
import logic.HealthBar.HealthBarOrientation;
import data.Actions;

public class FightSimulation {

	enum PlayerTurn { PLAYER_ONE, PLAYER_TWO };
	
	private boolean matchStarted;
	private FighterModel fighter1;
	private FighterModel fighter2;
	private PlayerTurn turn;
	private HealthBar h1;
	private HealthBar h2;
	private int nextMove;
	private String currentMoveAction;
	private FightEnvironment environment;
	
	public FightSimulation() {
		matchStarted = false;
		fighter1 = new FighterModel("data\\textures\\fighter1\\", "data/fighters/jackiechan.saf");
		fighter2 = new FighterModel("data\\textures\\fighter2\\", "data/fighters/fighter.saf");
		
		h1 = new HealthBar(fighter1, HealthBarOrientation.ORIENTATION_LEFT);
		h1.setPosition(20, 20);
		h2 = new HealthBar(fighter2, HealthBarOrientation.ORIENTATION_RIGHT);
		h2.setPosition(1260, 20);
		currentMoveAction = "";
		environment = new FightEnvironment();
	}
	
	private void checkWinCondition() {
		if ( fighter1.getHealth() == 0 ) {
			// Fighter 2 wins.
			matchStarted = false;
		} else if ( fighter2.getHealth() == 0 ) {
			// Fighter 1 wins.
			matchStarted = false;
		}
	}
	
	public boolean isMatchStarted() {
		return matchStarted;
	}
	
	private void switchTurns() {
		if ( turn == PlayerTurn.PLAYER_ONE ) {
			turn = PlayerTurn.PLAYER_TWO;
		} else {
			turn = PlayerTurn.PLAYER_ONE;
		}
	}
	
	public void start() {
		fighter1.initialize();
		fighter2.initialize();
		h1.initialize();
		h2.initialize();
	 	fighter1.setPosition(20, 500);
	 	fighter2.setPosition(1200, 500);
	 	turn = PlayerTurn.PLAYER_TWO;
	 	nextMove = 10;
	 	matchStarted = true;
	}
	
	public void stop() {
		matchStarted = false;
		h1.destroy();
		h2.destroy();
		fighter1.destroy();
		fighter2.destroy();
	}
	
	public boolean update() {
		if ( !matchStarted ) return true;
		nextMove -= 1;
		
		FighterModel currentFighter = null;
		FighterModel otherFighter = null;
		if ( turn == PlayerTurn.PLAYER_ONE ) {
			currentFighter = fighter1;
			otherFighter = fighter2;
		} else if ( turn == PlayerTurn.PLAYER_TWO ) {
			currentFighter = fighter2;
			otherFighter = fighter1;
		}
		
		Actions actions = null;
		if ( nextMove == 0 && currentFighter != null ) {
			switchTurns();
			if ( otherFighter.isAggressive() ) {
				otherFighter.setState(FighterState.FIGHTER_STANDING);
			}
			actions = environment.getValidActions(currentFighter, otherFighter);
			currentMoveAction = actions.getRandomMoveOption();
			int bla = 0;
			if ( bla > 1 ) ;
		}		
		currentFighter.performMoveAction(otherFighter, currentMoveAction);
		
		if ( nextMove == 0 && currentFighter != null ) {
			currentFighter.performAttackAction(otherFighter, actions.getRandomAttackOption());
			checkWinCondition();
			nextMove = 10;
		}
		
		return true;
	}
	
	public void draw(Graphics g) {
		fighter1.draw(g);
		fighter2.draw(g);
		h1.draw(g);
		h2.draw(g);
	}
	
}
