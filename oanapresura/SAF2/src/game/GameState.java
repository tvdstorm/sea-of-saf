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
	
	public final int LEFT = 1000;
	public final int RIGHT = 1001;
	
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
		if ((b.getCondition().type.equals("near")) && ( Math.abs(fighter2.position - fighter1.position) <= this.NEAR)){			
			return true;
		}	
		else
			if ((b.getCondition().type.equals("far")) && (Math.abs(fighter2.position - fighter1.position) > this.NEAR)){				
				return true;
			}	
			else {				
				return false;				
			}
		//return true;
	}
	
	private BehaviourItem generateMove(Fighter fighter){
		
		randomChoice = this.generator.nextInt(fighter.b.getBehaviourItems().size());		
		BehaviourItem newMove = fighter.b.getBehaviourItems().get(randomChoice);
		
		//Test
		/*System.out.println("[MOVE_GENERATOR (Move)] " + newMove.left.choice1.choiceName);
		if (newMove.left.choice2 != null)
			System.out.println("[MOVE_GENERATOR (Move)] " + newMove.left.choice2.choiceName);
		System.out.println("[MOVE_GENERATOR (Action)] " + newMove.right.choice1.choiceName);
		if (newMove.right.choice2 != null)
			System.out.println("[MOVE_GENERATOR (Action)] " + newMove.right.choice2.choiceName);
		System.out.println("--------------------------------------------------");*/
				
		
		return newMove;
		
	}
	
	public BehaviourItem getNewMove(Fighter fighter){
				
		//Check move
		BehaviourItem newMove = generateMove(fighter); 
		

		//Test
		System.out.println("[MOVE_GENERATOR (Move)] " + newMove.left.choice1.choiceName);
		if (newMove.left.choice2 != null)
			System.out.println("[MOVE_GENERATOR (Move)] " + newMove.left.choice2.choiceName);
		System.out.println("[MOVE_GENERATOR (Action)] " + newMove.right.choice1.choiceName);
		if (newMove.right.choice2 != null)
			System.out.println("[MOVE_GENERATOR (Action)] " + newMove.right.choice2.choiceName);
		System.out.println("--------------------------------------------------");
		
		/* Make sure conditions are met before making a move */
		
		while(!isValidMove(newMove)){
			newMove = generateMove(fighter);						
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
				System.out.println("updateDistance " + choiceType);
			case 4:
				distance += 10;
				System.out.println("updateDistance " + choiceType);
			case 5:
				distance -= 3;
				System.out.println("updateDistance " + choiceType);
			case 6:
				distance += 3;
				System.out.println("updateDistance " + choiceType);
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
				if (side == LEFT) { 
					//distance -= 10;
					if (fighter1.position <= 80 ) {
						fighter1.position += 10;
						System.out.println("updated Position " + fighter1.position);
					}
				}	
				else {
					//distance += 10;
					if (fighter2.position >= 25 ){
						fighter2.position -= 10;					
						System.out.println("updated Position " + fighter2.position);
					}
				}	
				
			case 4:
				if (side == LEFT) {
					//distance += 10;
					if (fighter1.position >= 25 ) {
						fighter1.position -= 10;
						System.out.println("updated Position " + fighter1.position);
					}
				}	
				else {
					//distance -= 10;			
					if (fighter2.position <= 80 ){
						fighter2.position += 10;
						System.out.println("updated Position " + fighter2.position);
					}
				}	
			/* TO DO: Update here, check limits of fight ring */	
			case 5:
				if (side == LEFT){									
					fighter1.position += 3;
					System.out.println("updated Position " + fighter1.position);
				}	
				else{
					//distance += 3;
					fighter2.position -= 3;
					System.out.println("updated Position " + fighter2.position);
				}	
				
			case 6:
				if (side == LEFT){
					//distance += 3;
					fighter1.position -= 3;
					System.out.println("updated Position " + fighter1.position);
				}	
				else{
					//distance -= 3;
					fighter2.position += 3;
					System.out.println("updated Position " + fighter2.position);
				}
			default:
				;						
		}
	}
	
	
	
	public void updateDistances(FighterState fighter, Action action, int side){
	
		//Update distance & position according to new move, current distance									
			System.out.println("Player: " + side);
			/* Move type, one choice */
			if (action.type == CorrectValues.SINGLE) {
				
				System.out.println("[SINGLE]");
				System.out.println("[Move] " + fighter.getCurrentAction().left.choice1.choiceName);
				updateDistanceValue(action.choice1.choiceType);	
				updatePositionValue(action.choice1.choiceType,side);
				updatePic(fighter, action.flag, action.choice1.choiceType, side);
				
			}
			
			/* Move type, 2 choices */
			else {				
				
				System.out.println("[CHOICE]");				
				random01 = generator.nextInt(1);
				switch(random01){
				case 0:
					updateDistanceValue(action.choice1.choiceType);
					updatePositionValue(action.choice1.choiceType,side);
					updatePic(fighter, action.flag, action.choice1.choiceType, side);
					System.out.println("[Move] " + fighter.getCurrentAction().left.choice1.choiceName);
					
				case 1:
					updateDistanceValue(action.choice2.choiceType);
					updatePositionValue(action.choice2.choiceType,side);
					updatePic(fighter, action.flag, action.choice2.choiceType, side);
					System.out.println("[Move] " + fighter.getCurrentAction().left.choice2.choiceName);
					
				default:	
					updateDistanceValue(action.choice1.choiceType);
					updatePositionValue(action.choice1.choiceType,side);
					updatePic(fighter, action.flag, action.choice1.choiceType, side);
					System.out.println("[Move] " + fighter.getCurrentAction().left.choice1.choiceName);
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
				System.out.println("[Left fighter PIC]:" + fighter.getCurrentPic());
			case RIGHT:
				switch(flag){
				case CorrectValues.MOVE_TYPE:
					fighter.setCurrentPic(CorrectValues.movesPicturesRight.get(choiceType));
				case CorrectValues.ATTACK_TYPE:	
					fighter.setCurrentPic(CorrectValues.attacksPicturesRight.get(choiceType));
				}
				System.out.println("[Right fighter PIC]:" + fighter.getCurrentPic());
			default:
				;
		}
	}
	
	public void fighterTurn(FighterState fighter, int side) {
						
		fighter.setCurrentAction(this.getNewMove(fighter));		
		if (fighter.getCurrentAction().left.isMove()) {						
			updateDistances(fighter, fighter.getCurrentAction().left,side);			
			updateHealth(fighter.getCurrentAction().right);						
		}
		else {					
			updateHealth(fighter.getCurrentAction().left);
			updateDistances(fighter, fighter.getCurrentAction().right, side);			
		}
		
	}
	
	public void makeGameUpdate() {
		
		fighterTurn(fighter1, LEFT);
		System.out.println("&&&& Updated left");
		fighterTurn(fighter2, RIGHT);
		System.out.println("&&&& Updated right");
				
	}
}
