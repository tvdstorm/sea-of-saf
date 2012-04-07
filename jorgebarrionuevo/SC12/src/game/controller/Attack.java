package game.controller;

import game.FighterStatus;

public class Attack {

	public void blockLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){

	}

	public void blockHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){

	}

	public void punchLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (areConditionsForPunchLow(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getPunchPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " punchLow Sucess!");
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
	}

	public void punchHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (areConditionsForPunchHigh(attackingFighterStatus,waitingFighterStatus))
		{

			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getPunchPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " punchHigh Sucess! power " + attackingFighterStatus.getPunchPower());
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
	}

	public void kickLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		if (areConditionsForKickLow(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getKickPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " kickLow Sucess!");
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
	}

	public void kickHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){

		if (areConditionsForKickHigh(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getKickPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " kickHigh Sucess!" );
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
	}

	private boolean areConditionsForPunchHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;
		if(attackingFighterStatus.getDistance()<=attackingFighterStatus.getPunchReach()){
			ret = true;
		}
		if(waitingFighterStatus.isFightActionAvailable("block_high")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked high! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}

		return ret;
	}

	private boolean areConditionsForKickHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;

		if(attackingFighterStatus.getDistance()<=attackingFighterStatus.getKickReach()){
			ret = true;
		}
		if(waitingFighterStatus.isFightActionAvailable("block_high")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked high! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}

		return ret;
	}
	private boolean areConditionsForPunchLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;

		if(attackingFighterStatus.getDistance()<=attackingFighterStatus.getPunchReach()){
			ret = true;
		}
		if(waitingFighterStatus.isFightActionAvailable("block_low")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked low! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}

		return ret;
	}

	private boolean areConditionsForKickLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;

		if(attackingFighterStatus.getDistance()<=attackingFighterStatus.getKickReach()){
			ret = true;
		}
		if(waitingFighterStatus.isFightActionAvailable("block_low")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked low! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}

		return ret;
	}
}
