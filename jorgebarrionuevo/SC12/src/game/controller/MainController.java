package game.controller;

import game.FighterStatus;
import game.FighterStatusLeft;
import game.FighterStatusRight;
import graphic.GameGraphicController;
import model.Fighter;

public class MainController {
	//responsibility: run the fight, contains all the controllers
	
	private FighterController fighterCtrlLeft; 
	private FighterController fighterCtrlRight;
	private FighterStatusLeft fighterStatusLeft; 
	private FighterStatusRight fighterStatusRight;
	private GameGraphicController gameGraphicController;
	
	public MainController(Fighter fighterL, Fighter fighterR) {
		
		this.fighterStatusLeft =  new FighterStatusLeft(fighterL);
		this.fighterStatusRight =  new FighterStatusRight(fighterL);
		this.fighterCtrlLeft = new FighterController(fighterStatusLeft);
		this.fighterCtrlRight = new FighterController(fighterStatusRight);
		this.gameGraphicController = new GameGraphicController(this); 
		this.fighterCtrlLeft.moveRunAway();
	}

	public void startFight(){
		
	}
	
	public FighterStatus getFighterStatusLeft(){
		return this.fighterStatusLeft;
	}
	
	public FighterStatus getFighterStatusRight(){
		return this.fighterStatusRight;
	}
}
