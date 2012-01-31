package mvc.controllers;

import java.util.ArrayList;
import java.util.List;
import saf.astelements.*;
import mvc.FightController;
import mvc.models.FighterModel;
import mvc.models.Pair;
import mvc.views.SimpleFightView;

public class SimpleFightController implements FightController{
	private FighterModel fighter1;
	private FighterModel fighter2; 
	private SimpleFightView curFightView;
	
	public SimpleFightController(FighterModel model1, FighterModel model2, SimpleFightView fightView){
		this.fighter1 = model1;
		this.fighter2 = model2;
		this.curFightView = fightView;	
	}
	
	public void run(){
		List<FighterModel> curFighterModels = new ArrayList<FighterModel>();
		curFighterModels.add(this.fighter1);
		curFighterModels.add(this.fighter2);
		
		int i = 0;
		
		while(!this.isFighterDeath()){
			//Fighter1 is gonna do something, now determine what it will do.
			Pair<IAction, IAction> pairOfActions = curFighterModels.get(i).getActionsAgainstEnemy(fighter2);
			if(pairOfActions != null){
				pairOfActions.getFirst().applyActionOn(curFighterModels.get((i+1)%2));
				pairOfActions.getSecond().applyActionOn(curFighterModels.get((i+1)%2));	
			}
			
			i = (i+1)%2;
			curFightView.render();
			
			for(FighterModel model: curFighterModels)
				model.resetMovements();
		}
	}
	
	private Boolean isFighterDeath(){
		return !(fighter1.getHealth() > 0 && fighter2.getHealth() > 0);
	}
}