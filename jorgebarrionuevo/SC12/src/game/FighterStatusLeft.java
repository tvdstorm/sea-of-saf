package game;

import model.Fighter;


public class FighterStatusLeft extends FighterStatus{

	public FighterStatusLeft(Fighter fighter){
		super(fighter);
		energy = 100.0;
		xPosition = 200;
		yPosition = 200;
		speed = 10;
		direction = "left";
		lifeStatus = true;	
	}
	
}
