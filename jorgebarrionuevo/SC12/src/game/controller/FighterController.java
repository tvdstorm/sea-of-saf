package game.controller;

import game.FighterStatus;
import model.Fighter;



public class FighterController {
//responsibility: run a fighter and updates its status

	Fighter fighter;
	FighterStatus fighterStatus;
	ConditionController conditionCtrl;
	ActionController actionCtrl;

	public FighterController(Fighter fighter) {
		this.fighter = fighter;
	}

	public Fighter getFighter() {
		return fighter;
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

	public void setFighter(Fighter fighter) {
		this.fighter = fighter;
	}
	
	
	
}
