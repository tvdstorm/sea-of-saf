package saf.simulation;

public class FighterAI 
{	
	public static void determineAction(FighterState fighterState, FighterState otherFighterState)
	{
		if(fighterState.getStep() >= 100)
		{
			RuleAI.setPossibleRule(fighterState, otherFighterState);
			MoveActionAI.setMoveAction(fighterState);
			FightActionAI.setFightAction(fighterState);
			fighterState.setStep(0);
		}
	}
	
	public static void performAction(FighterState fighterState, FighterState otherFighterState)
	{
		MoveActionAI.doMoveAction(fighterState, otherFighterState);
		FightActionAI.doFightAction(fighterState, otherFighterState);
	}
}
