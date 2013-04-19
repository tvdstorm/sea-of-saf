package game;

import ast.fighter.Fighter;

/**
 * The artificial Intelligence of a Fighter. Idea is that this class holds
 * all the methods for detecting events and taking actions (the eyes and decisionmaking
 * of hte fighter).
 * @author iwan
 *
 */
public class FighterAI implements Runnable {

	private Fighter fighter;
	private volatile Arena arena;
	int reactionNumber = 0;
	private volatile boolean isFinished = false;
	
	public FighterAI(Fighter fighter, Arena arena){
		this.fighter = fighter;
		this.arena = arena;
	}
	
	public void stopMe(){
		isFinished = true;
	}

	@Override
	public void run() {
		while(!isFinished){
			arena.doWait();
			fight();
		}
	}
	
	private void fight(){
		int hop = arena.getHop();
		if (hop > reactionNumber){
			// I'm allowed to take action!
			System.out.println(Thread.currentThread().getName() + ": Tsjak" + (reactionNumber+1) + " on" + " Hop" + hop + "!");
			reactionNumber = arena.getHop();
		}
		else {
			reactionNumber = arena.getHop();
		}
	}
}
