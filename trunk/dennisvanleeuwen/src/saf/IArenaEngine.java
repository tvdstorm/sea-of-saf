package saf;

import saf.mvc.FighterModel;

public interface IArenaEngine {
	public FighterModel getCurrentFighter();
	
	/* The turn is to the next fighter in the arena, can be the same as current*/
	public void nextTurn();
	
	/* Get the winning fighter if there's one, else return null! */
	public FighterModel getFightWinner();
	
	/* Checks if the condition is true in the current state of the engine */
	public Boolean isTheCase(String condition);
	
	public void doMoveAction(String action);
	public void doFightAction(String action);
}