package saf.arena;

import saf.fighter.SuperAwesomeFighter;

public class Arena implements Runnable{
	
	ArenaGUI gui;
	SuperAwesomeFighter fighter1;
	SuperAwesomeFighter fighter2;
	
	
	public Arena(SuperAwesomeFighter fighter1, SuperAwesomeFighter fighter2) {
		this.gui = new ArenaGUI();
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}


	@Override
	public void run() {
		//TODO
	}
	
}
