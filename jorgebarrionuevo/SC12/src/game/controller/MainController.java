package game.controller;

import game.FighterStatus;
import graphic.ArenaConfiguration;
import graphic.GameGraphicController;
import model.Fighter;

public class MainController implements ArenaConfiguration{
	//responsibility: run the fight, contains all the controllers
	
	private FighterController fighterCtrlLeft; 
	private FighterController fighterCtrlRight;
	private GameGraphicController gameGraphicController;
	
	public MainController(Fighter fighterL, Fighter fighterR) {
		System.out.println("Creating mainController");
		FighterStatus fighterStatusLeft =  new FighterStatus(fighterL, "LEFT");
		FighterStatus fighterStatusRight =  new FighterStatus(fighterR, "RIGHT");
		this.fighterCtrlLeft = new FighterController(fighterStatusLeft, fighterStatusRight);
		this.fighterCtrlRight = new FighterController(fighterStatusRight, fighterStatusLeft);
		this.gameGraphicController = new GameGraphicController(this); 
	}

	public void startFight() throws InterruptedException{

		while(fighterCtrlLeft.life() && fighterCtrlRight.life()){
			//attack left
 			fighterCtrlLeft.fight();
 			//attack right
 			fighterCtrlRight.fight();
		}
	
		//define winner
		System.out.println("And the winner is: " + getWinner());
	}	
	
	private String getWinner(){
		if (fighterCtrlRight.life()){return fighterCtrlRight.getFighterName();}
		else{return fighterCtrlLeft.getFighterName();}
	}
	
}
