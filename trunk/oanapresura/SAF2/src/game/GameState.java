package game;

import ast.*;
import java.util.Random;
import constants.CorrectValues;

public class GameState implements CorrectValues{

	private final int NEAR = 10;
			
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
		
		if (b.getCondition().type.equals("always"))
			return true;
		if ((b.getCondition().type.equals("near")) && 
				( Math.abs(fighter2.position - fighter1.position) <= this.NEAR)){			
			return true;
		}	
		else
			
			if ((b.getCondition().type.equals("far")) && 
					(Math.abs(fighter2.position - fighter1.position) > this.NEAR)){				
				return true;
			}	
			else {				
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
				
		/* Make sure conditions are met before making a move */
		
		while(!isValidMove(newMove)){
			newMove = generateMove(fighter);						
		}
				
		return newMove;					
	}
	
	public void updateHealth(int choiceType, int side){
		
		System.out.println("----------updateHealth----------");				
		System.out.println("[CHOICE] " + choiceType);
		System.out.println("[SIDE] " + side);
		switch (choiceType) {
		/* punch low */
		case 0:
			if (side == LEFT) { 
				fighter2.setHealth(fighter1.getHealth() - 2);
				System.out.println("[Health] " + fighter2.getHealth());
			}	
			else {
				fighter1.setHealth(fighter1.getHealth() - 2);
				System.out.println("[Health] " + fighter1.getHealth());
			}	
			break;
		/* punch high */	
		case 1:
			if (side == LEFT) { 
				fighter2.setHealth(fighter1.getHealth() - 4);
				System.out.println("[Health] " + fighter2.getHealth());
			}	
			else {
				fighter1.setHealth(fighter1.getHealth() - 4);
				System.out.println("[Health] " + fighter1.getHealth());
			}	
			break;
		/* kick low */	
		case 2:
			if (side == LEFT) { 
				fighter2.setHealth(fighter1.getHealth() - 3);
				System.out.println("[Health] " + fighter2.getHealth());
			}	
			else {
				fighter1.setHealth(fighter1.getHealth() - 3);
				System.out.println("[Health] " + fighter1.getHealth());
			}	
			break;
		/* kick high */	
		case 3:
			if (side == LEFT) { 
				fighter2.setHealth(fighter1.getHealth() - 6);
				System.out.println("[Health] " + fighter2.getHealth());
			}	
			else {
				fighter1.setHealth(fighter1.getHealth() - 6);
				System.out.println("[Health] " + fighter1.getHealth());
			}	
			break;
		/* block low */	
		case 4:
			if (side == LEFT) {
				fighter1.setHealth(fighter1.getHealth() + 1);
				System.out.println("[Health] " + fighter1.getHealth());
			}
				
			else {
				fighter2.setHealth(fighter1.getHealth() + 1);
				System.out.println("[Health] " + fighter2.getHealth());
			}
				
			break;
		/* block high */	
		case 5:
			if (side == LEFT){
				fighter1.setHealth(fighter1.getHealth() + 2);	
				System.out.println("[Health] " + fighter1.getHealth());
			}	
			else{
				fighter2.setHealth(fighter1.getHealth() + 2);
				System.out.println("[Health] " + fighter2.getHealth());
			}	
			break;
		
		default:
			;				
		}
		
	}
	
	
	public void updatePositionValue(int choiceType, int side){
		
		switch (choiceType) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				if (side == LEFT) { 					
					if (fighter1.position <= 82 ) {
						fighter1.position += 8;
						System.out.println("[" + side + "]" + "[3 updated Position] " + fighter1.getPosition());
					}
				}	
				else {					
					if (fighter2.position >= 23 ){
						fighter2.position -= 8;					
						System.out.println("[" + side + "]" + "[3 updated Position] " + fighter2.getPosition());
					}
				}	
				break;
			case 4:
				if (side == LEFT) {					
					if (fighter1.position >= 23 ) {
						fighter1.position -= 8;
						System.out.println("[" + side + "]" + "[4 updated Position] " + fighter1.getPosition());
					}
				}	
				else {							
					if (fighter2.position <= 82 ){
						fighter2.position += 8;
						System.out.println("[" + side + "]" + "[4 updated Position] " + fighter2.getPosition());
					}
				}	
				break;
			case 5:
				if (side == LEFT){
					if (fighter1.position <= 88){
						fighter1.position += 2;
						System.out.println("[" + side + "]" + "[5 updated Position] " + fighter1.getPosition());
					}	
				}	
				else{
					if (fighter2.position >= 17){
						fighter2.position -= 2;
						System.out.println("[" + side + "]" + "[5 updated Position] " + fighter2.getPosition());
					}
				}	
				break;
			case 6:
				if (side == LEFT){
					if (fighter1.position >= 17){
						fighter1.position -= 2;
						System.out.println("[" + side + "]" + "[6 updated Position] " + fighter1.getPosition());
					}
				}	
				else{
					if (fighter2.position <= 88){
						fighter2.position += 2;
						System.out.println("[" + side + "]" + "[6 updated Position] " + fighter2.getPosition());
					}
				}
				break;
			default:
				;						
		}
	}
	
	
	
	public void updateGameValues(FighterState fighter, Action action, int side){
	
		//Update distance & position according to new move, current distance									
			System.out.println("Player: " + side);
			/* Move type, one choice */
			if (action.type == CorrectValues.SINGLE) {
				
				System.out.println("[SINGLE]");
				updatePositionValue(action.choice1.choiceType,side);
				updatePic(fighter, action.flag, action.choice1.choiceType, side);
				updateHealth(action.choice1.choiceType,side);
			}
			
			/* Move type, 2 choices */
			else {				
				
				System.out.println("[CHOICE]");				
				random01 = generator.nextInt(1);
				switch(random01){
				case 0:
					updatePositionValue(action.choice1.choiceType,side);
					updatePic(fighter, action.flag, action.choice1.choiceType, side);
					updateHealth(action.choice1.choiceType,side);
					System.out.println("[*Move] " + fighter.getCurrentAction().left.choice1.choiceName);
					break;
					
				case 1:					
					updatePositionValue(action.choice2.choiceType,side);
					updatePic(fighter, action.flag, action.choice2.choiceType, side);
					updateHealth(action.choice2.choiceType,side);
					System.out.println("[**Move] " + fighter.getCurrentAction().left.choice2.choiceName);
					break;
					
				default:						
					updatePositionValue(action.choice1.choiceType,side);
					updatePic(fighter, action.flag, action.choice1.choiceType, side);
					updateHealth(action.choice1.choiceType,side);
					System.out.println("[Move] " + fighter.getCurrentAction().left.choice1.choiceName);
					break;
				}
			}
		
	}
	
	public void updatePic(FighterState fighter, int flag, int choiceType, int side) {
		
		/*System.out.println("----------updatePic----------");
		System.out.println("[Fighter(W)] " + fighter.getWeight());
		System.out.println("[FLAG] " + flag);
		System.out.println("[CHOICE] " + choiceType);
		System.out.println("[SIDE] " + side);*/
		
		switch(side){
			case LEFT:
				switch(flag){
				case CorrectValues.MOVE_TYPE:
					fighter.setCurrentPic(CorrectValues.movesPicturesLeft.get(choiceType));					
					System.out.println("[Fighter Left] Changed pic: " + CorrectValues.movesPicturesLeft.get(choiceType));
				case CorrectValues.ATTACK_TYPE:	
					fighter.setCurrentPic(CorrectValues.attacksPicturesLeft.get(choiceType));
					System.out.println("[Fighter Left] Changed pic: " + CorrectValues.attacksPicturesLeft.get(choiceType));
				}				
				break;
				
			case RIGHT:
				switch(flag){
				case CorrectValues.MOVE_TYPE:
					fighter.setCurrentPic(CorrectValues.movesPicturesRight.get(choiceType));
					System.out.println("[Fighter Right] Changed pic: " + CorrectValues.movesPicturesRight.get(choiceType));
				case CorrectValues.ATTACK_TYPE:	
					fighter.setCurrentPic(CorrectValues.attacksPicturesRight.get(choiceType));
					System.out.println("[Fighter Right] Changed pic: " + CorrectValues.attacksPicturesRight.get(choiceType));
				}				
				break;
				
			default:
				;
		}
	}
	
	public void fighterTurn(FighterState fighter, int side) {
						
		fighter.setCurrentAction(this.getNewMove(fighter));		
		if (fighter.getCurrentAction().left.isMove()) {						
			updateGameValues(fighter, fighter.getCurrentAction().left,side);												
		}
		else {								
			updateGameValues(fighter, fighter.getCurrentAction().right, side);			
		}
		
	}
	
	public void makeGameUpdate() {
		
		fighterTurn(fighter1, LEFT);
		System.out.println("*********************************");
		fighterTurn(fighter2, RIGHT);		
		System.out.println("*********************************");		
	}
}
