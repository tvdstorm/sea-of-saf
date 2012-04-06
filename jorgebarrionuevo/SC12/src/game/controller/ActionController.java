package game.controller;

import game.FighterStatus;

import java.util.ArrayList;

import model.Action;
import model.Behaviour;

public class ActionController {
//responsibility: generate an action for a fighter
	FighterStatus fighterStatus;
	FighterStatus oponentStatus;
	Attack attack;
	Move move;
	
	public ActionController (FighterStatus fighterStatus,  FighterStatus oponentStatus){
		this.fighterStatus= fighterStatus;
		this.oponentStatus= oponentStatus;
		this.attack = new Attack(this.fighterStatus, this.oponentStatus);
		this.move = new Move(this.fighterStatus);
	}
	
	public void doActions(ArrayList<Behaviour> behaviours){
		//returns a list of actions related with a set of behaviours
		boolean near;
		
		for (int i=0; i<behaviours.size(); i++){ 
//			System.out.println("Filtered: " + behaviours.get(i).getCondition().getName());
//			System.out.println("Move: " + behaviours.get(i).getMoveAction().getName());
//			System.out.println("Fight: " + behaviours.get(i).getFightAction().getName());
			
			//do moves
			if(behaviours.get(i).getMoveAction().getName().equals("jump")){move.moveJump(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("crouch")){move.moveCrouch(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("stand")){move.moveStand(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("run_towards")){move.runTowards(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("run_away")){move.runAway(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_towards")){move.walkTowards(behaviours.get(i).getMoveAction());}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_away")){move.walkAway(behaviours.get(i).getMoveAction());}	
			
			//do fight
			if(behaviours.get(i).getFightAction().getName().equals("block_low")){attack.blockLow(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("block_high")){attack.blockHigh(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("punch_low")){attack.punchLow(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("punch_high")){attack.punchHigh(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("kick_low")){attack.kickLow(behaviours.get(i).getFightAction());}
			if(behaviours.get(i).getFightAction().getName().equals("kick_high")){attack.kickHigh(behaviours.get(i).getFightAction());}			
		}	
	}
}
