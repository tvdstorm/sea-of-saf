package game;

import ast.fighter.Fighter;

public class Arena {

	private FighterAI fighterOne;
	private FighterAI fighterTwo;
	
	public Arena(Fighter fighterOne, Fighter fighterTwo){
		this.fighterOne = new FighterAI(fighterOne);
		this.fighterTwo = new FighterAI(fighterTwo);
	}
	
	public void startFight(){
		
	}
	
}
