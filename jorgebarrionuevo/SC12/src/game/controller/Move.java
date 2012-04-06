package game.controller;

import game.FighterStatus;
import model.Action;

public class Move {
	
	public Move(){
	}
	
	public void walkTowards(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		if (attackingFighterStatus.getDistance()>2){
			attackingFighterStatus.moveForward(1);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setLastMoveAction(ma);
			System.out.println(attackingFighterStatus.getFighter().getName() + " walked to " + attackingFighterStatus.getXPosition());
		}
	}
	
	public void walkAway(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		if (attackingFighterStatus.getDistance()<200){
			attackingFighterStatus.moveBackwards(1);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setLastMoveAction(ma);
			System.out.println(attackingFighterStatus.getFighter().getName() + " walked away to " + attackingFighterStatus.getXPosition());
		}
	}
	
	public void runTowards(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		if (attackingFighterStatus.getDistance()>10){
			attackingFighterStatus.moveForward(10);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setLastMoveAction(ma);
			System.out.println(attackingFighterStatus.getFighter().getName() + " has run to " + attackingFighterStatus.getXPosition());
		}
		
	}
	
	public void runAway(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		if (attackingFighterStatus.getDistance()<191){
			attackingFighterStatus.moveBackwards(10);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setLastMoveAction(ma);
			System.out.println(attackingFighterStatus.getFighter().getName() + " has run away to " + attackingFighterStatus.getXPosition());
		}
	}
	
	public void moveJump(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		System.out.println(attackingFighterStatus.getFighter().getName() + " just jumped " );
		attackingFighterStatus.setLastMoveAction(ma);
	}
	
	public void moveCrouch(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		System.out.println(attackingFighterStatus.getFighter().getName() + " just crouched " );
		attackingFighterStatus.setLastMoveAction(ma);
	}
	
	public void moveStand(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action ma){
		attackingFighterStatus.setLastMoveAction(ma);
	}
	
	private void setDistance(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		int positionDelta = Math.abs(attackingFighterStatus.getXPosition() - waitingFighterStatus.getXPosition());
		attackingFighterStatus.setDistance(positionDelta);
	}
}
