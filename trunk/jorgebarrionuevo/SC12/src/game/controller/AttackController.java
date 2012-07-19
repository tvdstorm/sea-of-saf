package game.controller;

public class AttackController {
	public void blockLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		attackingFighterStatus.setActualAction("block_low");
	}
	public void blockHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		attackingFighterStatus.setActualAction("block_high");
	}
	public void punchLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (areConditionsForPunchLow(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getPunchPower());
			attackingFighterStatus.setActualAction("punch_low");
		}
	}
	public void punchHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (areConditionsForPunchHigh(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getPunchPower());
			attackingFighterStatus.setActualAction("punch_high");
		}
	}
	public void kickLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (areConditionsForKickLow(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getKickPower());
			attackingFighterStatus.setActualAction("kick_low");
		}
	}
	public void kickHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){

		if (areConditionsForKickHigh(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getKickPower());
			attackingFighterStatus.setActualAction("kick_high");
		}
	}
	private boolean areConditionsForPunchHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		return (attackingFighterStatus.getDistance()<=attackingFighterStatus.getPunchReach()) 
				&& (!waitingFighterStatus.isFightActionAvailable("block_high")) 
				&& (!waitingFighterStatus.isMoveActionAvailable("crouch"));
	}
	private boolean areConditionsForKickHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		return (attackingFighterStatus.getDistance()<=attackingFighterStatus.getKickReach()) 
				&& (!waitingFighterStatus.isFightActionAvailable("block_high")) 
				&& (!waitingFighterStatus.isMoveActionAvailable("crouch"));

	}
	private boolean areConditionsForPunchLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		return (attackingFighterStatus.getDistance()<=attackingFighterStatus.getPunchReach()) 
				&& (!waitingFighterStatus.isFightActionAvailable("block_low"));
	}
	private boolean areConditionsForKickLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		return (attackingFighterStatus.getDistance()<=attackingFighterStatus.getKickReach()) 
				&& (!waitingFighterStatus.isFightActionAvailable("block_low")) 
				&& (!waitingFighterStatus.isMoveActionAvailable("crouch"));
	}
}
