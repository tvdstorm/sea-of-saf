package game;

import ast.*;

public class GameState {

	private final int NEAR = 5;
	private final int FAR = 25;
	
	private final int START_LEFT = 15;
	private final int START_RIGHT = 90;
	
	private FighterState fighter1;
	private FighterState fighter2;
	
	public GameState(Bot bot1, Bot bot2){
		
		this.fighter1 = new FighterState(bot1,this.START_LEFT);
		this.fighter2 = new FighterState(bot2,this.START_RIGHT);
		
	}
	
	
	public FighterState getFighter1() {
		return fighter1;
	}

	public void setFighter1(FighterState fighter1) {
		this.fighter1 = fighter1;
	}

	public FighterState getFighter2() {
		return fighter2;
	}

	public void setFighter2(FighterState fighter2) {
		this.fighter2 = fighter2;
	}

	
	
	
}
