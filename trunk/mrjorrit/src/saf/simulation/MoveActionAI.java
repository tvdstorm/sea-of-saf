package saf.simulation;

import java.util.ArrayList;
import java.util.Random;

import saf.structure.MoveAction;


public class MoveActionAI 
{
	
	public static void setMoveAction(FighterState fighterState)
	{
		if(fighterState.getCurrentRule() == null)
			return;
		
		ArrayList<MoveAction> moveActions = fighterState.getCurrentRule().getMoveActions();
		Random randomGenerator = new Random();
		
		fighterState.setCurrentMoveActionType(moveActions.get(randomGenerator.nextInt(moveActions.size())).getMoveActionType());
	}
	
	
	public static void doMoveAction(FighterState fighterState, FighterState otherFighterState)
	{
		if(fighterState.getCurrentMoveActionType() == null)
			return;
		
		switch(fighterState.getCurrentMoveActionType())
		{
			case walk_towards:
				if(Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) > 0)
				{
					if(fighterState.getStartingPosition() == StartingPosition.left)
					{
						fighterState.moveFighterX(1);
						break;
					}
					else
					{
						fighterState.moveFighterX(-1);
					}
				}
				break;
			case walk_away:
				if(Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) >= 0)
				{
					if(fighterState.getStartingPosition() == StartingPosition.left)
					{
						fighterState.moveFighterX(-1);
						break;
					}
					else
					{
						fighterState.moveFighterX(1);
					}
				}
				break;
			case run_towards:
				if(Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) > 1)
				{
					if(fighterState.getStartingPosition() == StartingPosition.left)
					{
						fighterState.moveFighterX(2);
						break;
					}
					else
					{
						fighterState.moveFighterX(-2);
					}
				}
				break;
			case run_away:
				if(Math.abs(fighterState.getFighterX() - otherFighterState.getFighterX()) >= 1)
				{
					if(fighterState.getStartingPosition() == StartingPosition.left)
					{
						fighterState.moveFighterX(-2);
						break;
					}
					else
					{
						fighterState.moveFighterX(2);
					}
				}
				break;
			case jump:
				//
				break;
			case crouch:
				//
				break;
			case stand:
				// do nothing
				break;
		}
	}
}
