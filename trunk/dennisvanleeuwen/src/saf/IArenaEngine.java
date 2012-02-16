package saf;

import saf.astelements.IAction;
import saf.astelements.ICondition;
import saf.mvc.FighterModel;

public interface IArenaEngine {
	public FighterModel getCurrentFighter();
	
	/* The turn is to the next fighter in the arena*/
	public void switchToNextFighter();
	
	/* Get the winning fighter if there's one. else return null! */
	public FighterModel getFightWinner();
	
	/* Checks if the condition is true in the current state of the engine */
	public Boolean isTheCase(ICondition condition);
	
	
	public void doMoveAction(IAction action);
	public void doFightAction(IAction action);
}