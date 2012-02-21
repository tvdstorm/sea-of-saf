package saf.simulation;

public class FighterAI 
{	
	public static void determineAction(FighterState fighterState, FighterState otherFighterState)
	{
		if(fighterState.getStep() <= 0)
		{
			RuleAI.setPossibleRule(fighterState, otherFighterState);
			MoveActionAI.setMoveAction(fighterState);
			FightActionAI.setFightAction(fighterState);
			fighterState.setStep(100);
		}
	}
	
	public static void performAction(FighterState fighterState, FighterState otherFighterState)
	{
		MoveActionAI.doMoveAction(fighterState, otherFighterState);
		FightActionAI.doFightAction(fighterState, otherFighterState);
	}
}
