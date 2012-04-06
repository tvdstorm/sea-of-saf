package game.controller;

import game.FighterStatus;

import java.util.ArrayList;

import model.Behaviour;
import model.Fighter;

public class FightController {
	private FighterStatus fighterStatusLeft;
	private FighterStatus fighterStatusRight;
	private ConditionController conditionCtrl;
	private Attack attack;
	private Move move;
	
	public FightController(Fighter fighterL, Fighter fighterR) {
		System.out.println("Creating mainController");
		fighterStatusLeft =  new FighterStatus(fighterL, "LEFT");
		fighterStatusRight =  new FighterStatus(fighterR, "RIGHT");
		conditionCtrl = new ConditionController();
		attack = new Attack();
		move = new Move();
	}

	public void startFight() throws InterruptedException{

		while(this.fighterStatusLeft.imAlive() && fighterStatusRight.imAlive()){
			//attack left
 			this.fight(fighterStatusLeft, fighterStatusRight);
 			//attack right
 			this.fight(fighterStatusRight, fighterStatusLeft);
		}
	
		//define winner
		System.out.println("And the winner is: " + getWinner());
	}	
	
	private void fight(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		//check actual valid conditions
		//System.out.println("Fight!");
		ArrayList<Behaviour> behaviours = conditionCtrl.getActualBehaviours(attackingFighterStatus, waitingFighterStatus);
		this.doActions(attackingFighterStatus, waitingFighterStatus, behaviours);
		//do all the relatd actions and modify the status of both fighters
		
		
	}
	
	private String getWinner(){
		if (fighterStatusRight.imAlive()){return fighterStatusRight.getFighter().getName();}
		else{return fighterStatusLeft.getFighter().getName();}
	}
	
	private void doActions(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, ArrayList<Behaviour> behaviours){
		//returns a list of actions related with a set of behaviours
		
		for (int i=0; i<behaviours.size(); i++){ 
//			System.out.println("Filtered: " + behaviours.get(i).getCondition().getName());
//			System.out.println("Move: " + behaviours.get(i).getMoveAction().getName());
//			System.out.println("Fight: " + behaviours.get(i).getFightAction().getName());
			
			//do moves
			if(behaviours.get(i).getMoveAction().getName().equals("jump")){move.moveJump(attackingFighterStatus, waitingFighterStatus, behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("crouch")){move.moveCrouch(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("stand")){move.moveStand(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("run_towards")){move.runTowards(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("run_away")){move.runAway(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_towards")){move.walkTowards(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_away")){move.walkAway(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getMoveAction());}	
			
			//do fight
			if(behaviours.get(i).getFightAction().getName().equals("block_low")){attack.blockLow(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("block_high")){attack.blockHigh(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("punch_low")){attack.punchLow(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("punch_high")){attack.punchHigh(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("kick_low")){attack.kickLow(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("kick_high")){attack.kickHigh(attackingFighterStatus, waitingFighterStatus,behaviours.get(i).getFightAction());}			
		}	
	}
}
