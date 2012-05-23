package game;

import ast.*;
import java.util.Random;
import constants.CorrectValues;

public class GameState implements CorrectValues{

	private final int NEAR = 5;
	private final int FAR = 25;
	private int distance = 75;
	
	private final int START_LEFT = 15;
	private final int START_RIGHT = 90;
	
	private final int LEFT = 1000;
	private final int RIGHT = 1001;
	
	public FighterState fighter1;
	public FighterState fighter2;
	
	private final String initialPicLeft = "pics/baronesse/HIP1.png";
	private final String initialPicRight = "pics/bred/JUMP01.png";
	
	private Random generator;
	private int randomChoice, random01;
	
	
	public GameState(Bot bot1, Bot bot2){
		
		this.fighter1 = new FighterState(bot1,this.START_LEFT);
		fighter1.side = START_LEFT;
		fighter1.setCurrentPic(initialPicLeft);
		this.fighter2 = new FighterState(bot2,this.START_RIGHT);		
		fighter2.side = START_RIGHT;
		fighter2.setCurrentPic(initialPicRight);
		this.generator = new Random();
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

	public boolean isValidMove(BehaviourItem b){
		if ((b.getCondition().type.equals("near")) && (this.distance <= this.NEAR)){
			//System.out.println("near and near");
			return true;
		}	
		else
			if ((b.getCondition().type.equals("far")) && (this.distance > this.NEAR)){
				//System.out.println("far and far");
				return true;
			}	
			else {
				//System.out.println("condition not met");
				return false;				
			}	
	}
	
	private BehaviourItem generateMove(Fighter fighter){
		
		randomChoice = this.generator.nextInt(fighter.b.getBehaviourItems().size());		
		BehaviourItem newMove = fighter.b.getBehaviourItems().get(randomChoice);
		return newMove;
		
	}
	
	public BehaviourItem getNewMove(Fighter fighter){
				
		//Check move
		BehaviourItem newMove = generateMove(fighter); 
		while(!isValidMove(newMove)){
			newMove = generateMove(fighter);
			//System.out.println("* " + newMove.left.choice1.choiceType);			
		}
		return newMove;					
	}
	
	public void updateHealth(Action action){
		//TO DO 
		//Update oponent health according to new attack, strength, distance
		
	}
	
	public void updateDistanceValue(int choiceType){
		
		switch (choiceType) {
			case 0:
				;
			case 1:
				;
			case 2:
				;
			case 3:
				distance -= 10;				
			case 4:
				distance += 10;
			case 5:
				distance -= 3;
			case 6:
				distance += 3;
			default:
				;						
		}
		
	}
	
	public void updatePositionValue(int choiceType, int side){
		
		switch (choiceType) {
			case 0:
				;
			case 1:
				;
			case 2:
				;
			case 3:
				if (side == LEFT) 
					distance -= 10;
				else
					distance += 10;
			case 4:
				if (side == LEFT)
					distance += 10;
				else
					distance -= 10;
			case 5:
				if (side == LEFT)
					distance -= 3;
				else
					distance += 3;
			case 6:
				if (side == LEFT)
					distance += 3;
				else
					distance -= 3;
			default:
				;						
		}
	}
	
	
	
	public void updateDistances(FighterState fighter, Action action, int side){
	
		//Update distance & position according to new move, current distance									
			
			/* Move type, one choice */
			if (action.type == CorrectValues.SINGLE) {
				updateDistanceValue(action.choice1.choiceType);	
				updatePositionValue(action.choice1.choiceType,side);
				updatePic(fighter, action.flag, action.choice1.choiceType, side);
				
			}
			
			/* Move type, 2 choices */
			else {				
				random01 = generator.nextInt(1);
				switch(random01){
				case 0:
					updateDistanceValue(action.choice1.choiceType);
					updatePositionValue(action.choice1.choiceType,side);
					updatePic(fighter, action.flag, action.choice1.choiceType, side);
					
				case 1:
					updateDistanceValue(action.choice2.choiceType);
					updatePositionValue(action.choice2.choiceType,side);
					updatePic(fighter, action.flag, action.choice2.choiceType, side);
					
				default:	
					updateDistanceValue(action.choice1.choiceType);
					updatePositionValue(action.choice1.choiceType,side);
					updatePic(fighter, action.flag, action.choice1.choiceType, side);
				}
			}
		
	}
	
	public void updatePic(FighterState fighter, int flag, int choiceType, int side) {
		
		switch(side){
			case LEFT:
				switch(flag){
				case CorrectValues.MOVE_TYPE:
					fighter.setCurrentPic(CorrectValues.movesPicturesLeft.get(choiceType));
				case CorrectValues.ATTACK_TYPE:	
					fighter.setCurrentPic(CorrectValues.attacksPicturesLeft.get(choiceType));
				}
			case RIGHT:
				switch(flag){
				case CorrectValues.MOVE_TYPE:
					fighter.setCurrentPic(CorrectValues.movesPicturesRight.get(choiceType));
				case CorrectValues.ATTACK_TYPE:	
					fighter.setCurrentPic(CorrectValues.attacksPicturesRight.get(choiceType));
				}
				
		}
	}
	
	public void fighterTurn(FighterState fighter, int side) {
				
		fighter.setCurrentMove(this.getNewMove(fighter));		
		if (fighter.getCurrentMove().left.isMove()) {
						
			updateDistances(fighter, fighter.getCurrentMove().left,side);			
			updateHealth(fighter.getCurrentMove().right);
			
		}
		else {
					
			updateHealth(fighter.getCurrentMove().left);
			updateDistances(fighter, fighter.getCurrentMove().right, side);
		}
		
	}
	
	public void makeGameUpdate() {
		
		fighterTurn(fighter1, LEFT);
		fighterTurn(fighter2, RIGHT);
				
	}
}
