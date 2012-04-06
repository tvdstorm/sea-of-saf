package game.controller;

import model.Action;
import game.FighterStatus;

public class Attack {
	
	public void blockLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus,Action fa){
		attackingFighterStatus.setLastFightAction(fa);
	}
	
	public void blockHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action fa){
		attackingFighterStatus.setLastFightAction(fa);
	}
	
	public void punchLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus,Action fa){
		if (areConditionsForPunchLow(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getPunchPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " punchLow Sucess!");
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
		attackingFighterStatus.setLastFightAction(fa);
	}
	
	public void punchHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus,Action fa){
		if (areConditionsForPunchHigh(attackingFighterStatus,waitingFighterStatus))
		{
			
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getPunchPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " punchHigh Sucess! power " + attackingFighterStatus.getPunchPower());
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
		attackingFighterStatus.setLastFightAction(fa);
	}
	
	public void kickLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action fa){
		if (areConditionsForKickLow(attackingFighterStatus,waitingFighterStatus))
		{
			waitingFighterStatus.reduceEnergy(attackingFighterStatus.getKickPower());
			System.out.println(attackingFighterStatus.getFighter().getName() + " kickLow Sucess!");
			System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
		}
		attackingFighterStatus.setLastFightAction(fa);
	}
	
	public void kickHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, Action fa){
			
			if (areConditionsForKickHigh(attackingFighterStatus,waitingFighterStatus))
			{
				waitingFighterStatus.reduceEnergy(attackingFighterStatus.getKickPower());
				System.out.println(attackingFighterStatus.getFighter().getName() + " kickHigh Sucess!" );
				System.out.println(waitingFighterStatus.getFighter().getName() + " energy is now " + waitingFighterStatus.getEnergy() );
			}
			attackingFighterStatus.setLastFightAction(fa);
	}
	
	private boolean areConditionsForPunchHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;
		if(Math.abs(attackingFighterStatus.getXPosition())- Math.abs(waitingFighterStatus.getXPosition()) <= attackingFighterStatus.getPunchReach()){
			ret = true;
		}
		if(waitingFighterStatus.getLastFightAction().getName().equals("block_high")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked high! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}
		
		return ret;
	}
	
	private boolean areConditionsForKickHigh(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;
		if(attackingFighterStatus.getXPosition()-waitingFighterStatus.getXPosition() <= attackingFighterStatus.getKickReach()){
			ret = true;
		}
		if(waitingFighterStatus.getLastFightAction().getName().equals("block_high")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked high! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}
		
		return ret;
	}
	private boolean areConditionsForPunchLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;
		if(attackingFighterStatus.getXPosition()-waitingFighterStatus.getXPosition() <= attackingFighterStatus.getPunchReach()){
			ret = true;
		}
		if(waitingFighterStatus.getLastFightAction().getName().equals("block_low")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked low! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}
		
		return ret;
	}
	
	private boolean areConditionsForKickLow(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus){
		boolean ret=false;
		if(attackingFighterStatus.getXPosition()-waitingFighterStatus.getXPosition() <= attackingFighterStatus.getKickReach()){
			ret = true;
		}
		if(waitingFighterStatus.getLastFightAction().getName().equals("block_low")){
			System.out.println(waitingFighterStatus.getFighter().getName() + " blocked low! his energy is " + waitingFighterStatus.getEnergy() );
			ret = false;
		}
		
		return ret;
	}
}
