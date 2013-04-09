package game;

import ast.fighter.Fighter;

/**
 * The artificial Intelligence of a Fighter. Idea is that this class holds
 * all the methods for detecting events and taking actions (the eyes and decisionmaking
 * of hte fighter).
 * @author iwan
 *
 */
public class FighterAI {

	private Fighter fighter;
	
	public FighterAI(Fighter fighter){
		this.fighter = fighter;
	}
}
