package game.controller;


public class MoveController {

	public MoveController(){
	}
	public void walkTowards(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()>2){
			attackingFighterStatus.moveForward(3);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("walk_towards");
			System.out.println(attackingFighterStatus.getFighter().getName() + " walked to " + attackingFighterStatus.getXPosition());
		}
	}
	public void walkAway(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()<2){
			attackingFighterStatus.moveBackwards(3);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("walk_away");
			System.out.println(attackingFighterStatus.getFighter().getName() + " walked away to " + attackingFighterStatus.getXPosition());
		}
	}
	public void runTowards(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()>10){
			attackingFighterStatus.moveForward(10);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("run_towards");
			System.out.println(attackingFighterStatus.getFighter().getName() + " has run to " + attackingFighterStatus.getXPosition());
		}

	}
	public void runAway(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()<10){
			attackingFighterStatus.moveBackwards(10);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("run_away");
			System.out.println(attackingFighterStatus.getFighter().getName() + " has run away to " + attackingFighterStatus.getXPosition());
		}
	}
	public void moveJump(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		System.out.println(attackingFighterStatus.getFighter().getName() + " just jumped " );
		attackingFighterStatus.setActualAction("jump");
	}
	public void moveCrouch(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		System.out.println(attackingFighterStatus.getFighter().getName() + " just crouched " );
		attackingFighterStatus.setActualAction("crouch");
	}
	public void moveStand(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		attackingFighterStatus.setActualAction("stand");
	}
	private void setDistance(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		int positionDelta = Math.abs(attackingFighterStatus.getXPosition() - waitingFighterStatus.getXPosition());
		attackingFighterStatus.setDistance(positionDelta);
		waitingFighterStatus.setDistance(positionDelta);
	}
}
