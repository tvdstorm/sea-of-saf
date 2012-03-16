package game;

import model.Fighter;


public class FighterStatusRight extends FighterStatus{

	public FighterStatusRight(Fighter fighter){
		super(fighter);
		energy = 100.0;
		xPosition = 500;
		yPosition = 200;
		speed = 10;
		direction = "right";
		lifeStatus = true;	
	}
	
}