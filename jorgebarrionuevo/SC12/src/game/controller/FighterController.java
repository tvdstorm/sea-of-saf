package game.controller;

import game.FighterStatus;
import model.Fighter;



public class FighterController {
//responsibility: run a fighter and updates its status

	FighterStatus fighterStatus;
	ConditionController conditionCtrl;
	ActionController actionCtrl;

	public FighterController(FighterStatus fighterStatus) {
		this.fighterStatus = fighterStatus;
	}

	public FighterStatus getFighterStatus1() {
		return fighterStatus;
	}

	public FighterStatus getFighterStatus() {
		return fighterStatus;
	}

	public void setFighterStatus(FighterStatus fighterStatus) {
		this.fighterStatus = fighterStatus;
	}

	public ConditionController getConditionCtrl() {
		return conditionCtrl;
	}

	public void setConditionCtrl(ConditionController conditionCtrl) {
		this.conditionCtrl = conditionCtrl;
	}

	public ActionController getActionCtrl() {
		return actionCtrl;
	}

	public void setActionCtrl(ActionController actionCtrl) {
		this.actionCtrl = actionCtrl;
	}
	
	public void moveRunAway(){
		fighterStatus.setSpeed(10);
		fighterStatus.setXPosition(fighterStatus.getXPosition() - 1);
	}
	
	public void moveRunTowards(){
		fighterStatus.setSpeed(10);
		fighterStatus.setXPosition(fighterStatus.getXPosition() + 1);
	}
	
	public void moveWalkAway(){
		fighterStatus.setSpeed(2);
		fighterStatus.setXPosition(fighterStatus.getXPosition() - 1);
	}
	
	public void moveWakTowards(){
		fighterStatus.setSpeed(2);
		fighterStatus.setXPosition(fighterStatus.getXPosition() + 1);
	}
	
	public void fightBlockLow(){
		fighterStatus.setSpeed(2);
		fighterStatus.setXPosition(fighterStatus.getXPosition() + 1);
	}
	
}
