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
		
		System.out.println("FINAL RESULTS");
		System.out.println("	" + "And the winner is: " + getWinner());
		System.out.println("	" + fighterStatusLeft.getFighter().getName() + " energy is: " + fighterStatusLeft.getEnergy());
		System.out.println("	" + fighterStatusRight.getFighter().getName() + " energy is: " + fighterStatusRight.getEnergy());
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
			
			//do moves
			if(behaviours.get(i).getMoveAction().getName().equals("jump")){move.moveJump(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("crouch")){move.moveCrouch(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("stand")){move.moveStand(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("run_towards")){move.runTowards(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("run_away")){move.runAway(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_towards")){move.walkTowards(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_away")){move.walkAway(attackingFighterStatus, waitingFighterStatus);}	
			
			//do fight
			if(behaviours.get(i).getFightAction().getName().equals("block_low")){attack.blockLow(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("block_high")){attack.blockHigh(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("punch_low")){attack.punchLow(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("punch_high")){attack.punchHigh(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("kick_low")){attack.kickLow(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("kick_high")){attack.kickHigh(attackingFighterStatus, waitingFighterStatus);}			
		}	
	}
}
