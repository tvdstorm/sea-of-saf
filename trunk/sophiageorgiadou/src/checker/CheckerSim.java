package checker;

import java.util.ArrayList;

import abstractSyntaxTree.*;

public class CheckerSim {
	
	private ArrayList<Fighter> fighters;
	
	public CheckerSim(ArrayList<Fighter> f){
		fighters = f;
	}
	
	public boolean checkerFunction(){
		for (int i=0; i<this.fighters.size();i++){
			for (int j=0; j<this.fighters.get(i).getPersonality().getPersonality().size();j++){
				this.fighters.get(i).getPersonality().getPersonality().get(j).IsAValidWord();
				if(!IsAValidValue(this.fighters.get(i).getPersonality().getPersonality().get(j).getValue())){ return false; }
			}
			for (int j=0; j<this.fighters.get(i).getBehavior().getBehaviorRules().size();j++){
					this.fighters.get(i).getBehavior().getBehaviorRules().get(j).getCondition().IsAValidWord();
					this.fighters.get(i).getBehavior().getBehaviorRules().get(j).getMove().IsAValidWord();
					this.fighters.get(i).getBehavior().getBehaviorRules().get(j).getAttack().IsAValidWord();
			}

		}
		return true;
	}
	
	private boolean IsAValidValue(int value){
		if(value > 10 || value < 1){
			System.out.println("Interpreting FAILED\n");
			System.out.println("ERROR: Strength value must be between 1 and 10 inclusive!");
			return false;
		}
		return true;
	}
}
