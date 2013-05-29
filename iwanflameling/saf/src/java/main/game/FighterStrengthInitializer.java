package game;

import ast.checker.DelegateAstVisitor;
import ast.fighter.Strength;

public class FighterStrengthInitializer extends DelegateAstVisitor {
	
	FighterAI fighter;

	public FighterStrengthInitializer(FighterAI fighter){
		this.fighter = fighter;
	}
	
	public void initStrengths(){
		fighter.getAst().accept(this);
	}
	
	@Override
	public void visit(Strength strength) {
		String fightId = strength.getFightId();
		if(fightId.equals("kickPower")){
			fighter.setKickPower(strength.getFightPower());
		} else if (fightId.equals("kickReach")){
			fighter.setKickReach(strength.getFightPower());
		} else if (fightId.equals("punchPower")){
			fighter.setPunchPower(strength.getFightPower());
		} else if (fightId.equals("punchReach")){
			fighter.setPunchReach(strength.getFightPower());
		}
	}

	
	
}
