package game;

import ast.fighter.Fighter;

public class Arena {
	
	public static final int MIN_FLOOR_POSITION = 1;
	public static final int MAX_FLOOR_POSITION = 200;
	FighterAI fighterOne;
	FighterAI fighterTwo;
	
	public Arena(Fighter fighterOne, Fighter fighterTwo){
		this.fighterOne = new FighterAI(fighterOne, MIN_FLOOR_POSITION);
		this.fighterTwo = new FighterAI(fighterTwo, MAX_FLOOR_POSITION);
		init();
	}
	
	private void init(){
		this.fighterOne.setOpponent(this.fighterTwo);
		this.fighterTwo.setOpponent(this.fighterOne);
	}
	
	public void startFight(){
		fighterOne.takeAction();
	}

}
