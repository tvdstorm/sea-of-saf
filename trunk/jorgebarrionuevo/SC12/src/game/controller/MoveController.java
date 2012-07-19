package game.controller;

public class MoveController {

	public MoveController(){
	}
	public void walkTowards(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()>2){
			attackingFighterStatus.moveForward(1);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("walk_towards");
		}
	}
	public void walkAway(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()<1 && attackingFighterStatus.isBetweenArenaLimits() && waitingFighterStatus.isBetweenArenaLimits()){
			attackingFighterStatus.moveBackwards(1);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("walk_away");
		}
	}
	public void runTowards(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()>10){
			attackingFighterStatus.moveForward(10);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("run_towards");
		}

	}
	public void runAway(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (attackingFighterStatus.getDistance()<10 && attackingFighterStatus.isBetweenArenaLimits()){
			attackingFighterStatus.moveBackwards(10);
			setDistance(attackingFighterStatus, waitingFighterStatus);
			attackingFighterStatus.setActualAction("run_away");
		}
	}
	public void moveJump(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		attackingFighterStatus.setActualAction("jump");
	}
	public void moveCrouch(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
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