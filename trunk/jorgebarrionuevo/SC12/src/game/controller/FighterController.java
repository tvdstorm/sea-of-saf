package game.controller;

import java.util.ArrayList;

import game.FighterStatus;
import model.Behaviour;
import model.Characteristic;
import model.Condition;
import model.Fighter;



public class FighterController {
//responsibility: run a fighter and updates its status

	FighterStatus fighterStatus;
	FighterStatus oponentStatus;
	ConditionController conditionCtrl;
	ActionController actionCtrl;

	public FighterController(FighterStatus fighterStatus, FighterStatus oponentStatus) {
		System.out.println("Creating fighterController");
		this.fighterStatus = fighterStatus;
		this.conditionCtrl = new ConditionController(fighterStatus, oponentStatus);
		this.actionCtrl = new ActionController(fighterStatus, oponentStatus);
	}
	
	public void fight(){
		//check actual valid conditions
		//System.out.println("Fight!");
		ArrayList<Behaviour> behaviours = conditionCtrl.getActualBehaviours();
		actionCtrl.doActions(behaviours);
		//do all the relatd actions and modify the status of both fighters
		
		
	}
	
	public boolean life(){
		return fighterStatus.imAlive(); 
	}
	
	public FighterStatus getFighterStatus() {
		return fighterStatus;
	}

	public ConditionController getConditionCtrl() {
		return conditionCtrl;
	}

	public ActionController getActionCtrl() {
		return actionCtrl;
	}
	
	public String getFighterName() {
		return fighterStatus.getFighter().getName();
	}
	
}
