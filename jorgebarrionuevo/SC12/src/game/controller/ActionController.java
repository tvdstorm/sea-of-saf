package game.controller;

import game.FighterStatus;

import java.util.ArrayList;

import model.Action;
import model.Behaviour;

public class ActionController {
//responsibility: generate an action for a fighter
	FighterStatus fighterStatus;
	FighterStatus oponentStatus;
	
	public ActionController (FighterStatus fighterStatus,  FighterStatus oponentStatus){
		this.fighterStatus= fighterStatus;
		this.oponentStatus= oponentStatus;
	}
	
	public void doActions(ArrayList<Behaviour> behaviours){
		//returns a list of actions related with a set of behaviours
		for (int i=0; i<behaviours.size(); i++){
			
			System.out.println("Filtered: " + behaviours.get(i).getCondition().getName());
			System.out.println("Move: " + behaviours.get(i).getMoveAction().getName());
			System.out.println("Fight: " + behaviours.get(i).getFightAction().getName());
			//do moves
			if(behaviours.get(i).getMoveAction().getName().equals("jump")){moveJump(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("crouch")){moveCrouch(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("stand")){moveStand(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("run_towards")){moveRunTowards(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("run_away")){moveRunAway(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_towards")){moveWalkTowards(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_away")){moveWalkAway(behaviours.get(i).getMoveAction());}	
			
			//do fights
			if(behaviours.get(i).getFightAction().getName().equals("block_low")){fightBlockLow(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("block_high")){fightBlockHigh(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("punch_low")){fightPunchLow(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("punch_high")){fightPunchHigh(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("kick_low")){fightKickLow(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("kick_high")){fightKickHigh(behaviours.get(i).getFightAction());}
			
			
		}
		
	}
	
	public void moveWalkTowards(Action ma){
		fighterStatus.setXPosition(fighterStatus.getXPosition()+2);
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void moveWalkAway(Action ma){
		fighterStatus.setXPosition(fighterStatus.getXPosition()-2);
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void moveRunTowards(Action ma){
		fighterStatus.setXPosition(fighterStatus.getXPosition()+10);
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void moveRunAway(Action ma){
		fighterStatus.setXPosition(fighterStatus.getXPosition()-10);
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void moveJump(Action ma){
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void moveCrouch(Action ma){
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void moveStand(Action ma){
		fighterStatus.setLastMoveAction(ma);
	}
	
	public void fightBlockLow(Action fa){
		fighterStatus.setLastFightAction(fa);
	}
	
	public void fightBlockHigh(Action fa){
		fighterStatus.setLastFightAction(fa);
	}
	
	public void fightPunchLow(Action fa){
		fighterStatus.setLastFightAction(fa);
	}
	
	public void fightPunchHigh(Action fa){
		//if fighterStatus.
		fighterStatus.setLastFightAction(fa);
	}
	
	public void fightKickLow(Action fa){
		fighterStatus.setLastFightAction(fa);
	}
	
	public void fightKickHigh(Action fa){
		fighterStatus.setLastFightAction(fa);
	}
}
