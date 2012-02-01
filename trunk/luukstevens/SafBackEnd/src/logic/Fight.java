package logic;

import view.Main;
import model.Bot;

public class Fight {
	
	public void start(Bot left, Bot right, Main view) {
		while(left.getHealth() > 0 && right.getHealth() > 0) {
			
			
			view.update();
		}
	}
}
