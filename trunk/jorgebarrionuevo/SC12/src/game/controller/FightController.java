package game.controller;

import model.Fighter;

public class FightController {
	//responsibility: run the fight, contains all the controllers
	
	FighterController fighterCtrlLeft; 
	FighterController fighterCtrlRight;
	
	public FightController(Fighter fighterL, Fighter fighterR) {
		this.fighterCtrlLeft = new FighterController(fighterL);
		this.fighterCtrlRight = new FighterController(fighterR);
	}

	public void startFight(){
		
	}	
}
