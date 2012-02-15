package saf.controllers;

//import saf.Controller;
import saf.astelements.*;
import saf.astvisitors.ActionExecutor;
import saf.astvisitors.ConditionChecker;
import saf.astvisitors.FightActionExecutor;
import saf.astvisitors.MoveActionExecutor;

public class SimpleFightController {// implements Controller{
	private ArenaEngine arenaEngine;
	
	public SimpleFightController(ArenaEngine arena){
		this.arenaEngine = arena;
	}
	
	public void run(){
		while(!this.arenaEngine.isAnyFighterDeath()){	
			
			for(Rule rule: arenaEngine.getCurrentFighter().getFighterNode().getRules()){
				if(ConditionChecker.isConditionTrueFor(rule.getCondition(), arenaEngine)){
					MoveActionExecutor.executeActionOn(rule.getMoveAction(), arenaEngine);
					FightActionExecutor.executeActionOn(rule.getFightAction(), arenaEngine);
				}
			}

			//curFightView.render();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			this.arenaEngine.swapFighters();			
		}
	}
	
//	private void resetFighterModels(){
//		for(Pair<Fighter, FighterModel> curFighterAndFighterModel: this.fighterModels){
//			curFighterAndFighterModel.getSecond().setState(new Stand());
//		}
//	}
//	

}