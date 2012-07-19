package game.controller;

import graphic.GameGraphicController;
import java.util.ArrayList;
import model.Behaviour;
import model.Fighter;
import util.MainConfiguration;

public class FightController {
	private FighterStatus fighterStatusLeft;
	private FighterStatus fighterStatusRight;
	private ConditionController conditionCtrl;
	private AttackController attack;
	private MoveController move;
	private GameGraphicController graphicController;

	public FightController(Fighter fighterL, Fighter fighterR) {
		graphicController = new GameGraphicController(fighterL.getName(), fighterR.getName());
		fighterStatusLeft =  new FighterStatus(fighterL, "LEFT", graphicController);
		fighterStatusRight =  new FighterStatus(fighterR, "RIGHT", graphicController);
		conditionCtrl = new ConditionController();
		attack = new AttackController();
		move = new MoveController();
	}
	public void startFight(long fightStartTime) throws InterruptedException{
		while(this.fighterStatusLeft.imAlive() && fighterStatusRight.imAlive() && isBattleOn(fightStartTime)){
			//attack left
			this.fight(fighterStatusLeft, fighterStatusRight);
			Thread.sleep(10);
			//attack right
			if (fighterStatusRight.imAlive()){this.fight(fighterStatusRight, fighterStatusLeft);}
			Thread.sleep(5); 
		}		
		getWinner();
	}	
	private void fight(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		ArrayList<Behaviour> behaviours = conditionCtrl.getActualBehaviours(attackingFighterStatus, waitingFighterStatus);
		this.doActions(attackingFighterStatus, waitingFighterStatus, behaviours);	
	}
	private String getWinner(){
		String winner;
		if (fighterStatusRight.getEnergy()==fighterStatusLeft.getEnergy()){
			fighterStatusLeft.setActualAction("win");
			fighterStatusRight.setActualAction("win");
			winner = fighterStatusRight.getFighter().getName() +" and "+ fighterStatusLeft.getFighter().getName();	
		}
		else{
			if (fighterStatusRight.getEnergy()>fighterStatusLeft.getEnergy()){
				fighterStatusLeft.setActualAction("death");
				fighterStatusRight.setActualAction("win");
				winner = fighterStatusRight.getFighter().getName();	
			}
			else{
				fighterStatusRight.setActualAction("death");
				fighterStatusLeft.setActualAction("win");
				winner=fighterStatusLeft.getFighter().getName();
			}
		}
		return winner;
	}
	private void doActions(FighterStatus attackingFighterStatus,FighterStatus waitingFighterStatus, ArrayList<Behaviour> behaviours){
		for (int i=0; i<behaviours.size(); i++){ 
			//Move
			if(behaviours.get(i).getMoveAction().getName().equals("jump")){move.moveJump(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("crouch")){move.moveCrouch(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("stand")){move.moveStand(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("run_towards")){move.runTowards(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("run_away")){move.runAway(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_towards")){move.walkTowards(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getMoveAction().getName().equals("walk_away")){move.walkAway(attackingFighterStatus, waitingFighterStatus);}	
			//Attack
			if(behaviours.get(i).getFightAction().getName().equals("block_low")){attack.blockLow(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("block_high")){attack.blockHigh(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("punch_low")){attack.punchLow(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("punch_high")){attack.punchHigh(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("kick_low")){attack.kickLow(attackingFighterStatus, waitingFighterStatus);}
			if(behaviours.get(i).getFightAction().getName().equals("kick_high")){attack.kickHigh(attackingFighterStatus, waitingFighterStatus);}
		}	
	}
	private boolean isBattleOn(long timeBattleStarted){
		boolean ret= false;
		long elapsedTime = (System.nanoTime()-timeBattleStarted)/1000000000;
		if (elapsedTime<=MainConfiguration.BATTLE_DURATION){
			ret=true;
		}
		return ret;
	}
}
