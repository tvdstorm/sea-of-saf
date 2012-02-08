package mvc.controllers;

import java.util.ArrayList;
import java.util.List;
import saf.astelements.*;
import mvc.IController;
import mvc.models.FighterModel;
import mvc.models.Pair;
import mvc.views.SimpleFightView;

public class SimpleFightController implements IController{
	List<FighterModel> curFighterModels;
	private SimpleFightView curFightView;
	
	public SimpleFightController(FighterModel model1, FighterModel model2, SimpleFightView fightView){
		this.curFighterModels = new ArrayList<FighterModel>();
		this.curFighterModels.add(model1);
		this.curFighterModels.add(model2);
		this.curFightView = fightView;	
	}
	
	public void run(){
		while(!this.isAnyFighterDeath()){
			this.resetFighterModels();
			
			int i = 0;
			for(FighterModel curFighterModel: this.curFighterModels){
				//Fighter1 is gonna do something, now determine what it will do.
				Pair<IAction, IAction> pairOfActions = curFighterModel.getActionsAgainstEnemy(curFighterModels.get((i+1)%2));
				if(pairOfActions != null){
					pairOfActions.getFirst().applyActionOn(curFighterModel, curFighterModels.get((i+1)%2));
					pairOfActions.getSecond().applyActionOn(curFighterModel, curFighterModels.get((i+1)%2));	
				}
				i = (i+1)%2;
			}
			
//			for(FighterModel curFighterModel: curFighterModels){
//				if(curFighterModel.getFrontArm() == Position.NORMAL)
//					System.out.println("error..");
//			}
			
			curFightView.render();
		}
	}
	
	private void resetFighterModels(){
		for(FighterModel curFighterModel: this.curFighterModels){
			curFighterModel.resetMovements();
		}
	}
	
	private Boolean isAnyFighterDeath(){
		for(FighterModel curFighterModel: this.curFighterModels){
			if(curFighterModel.getHealth() <= 0)
				return true;
		}
		return false;
	}
}