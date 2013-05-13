package game;

import ast.checker.DelegateVisitor;
import ast.fighter.Strength;

public class FighterStrengthInitializer extends DelegateVisitor {
	
	FighterAI fighter;

	public FighterStrengthInitializer(FighterAI fighter){
		this.fighter = fighter;
	}
	/* (non-Javadoc)
	 * @see ast.checker.DelegateVisitor#visit(ast.fighter.Strength)
	 */
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
