package saf.game.play;

import saf.ast.fighter.Fighter;

public class GameState {
	private FighterState fighter1;
	private FighterState fighter2;
	private int positionFighter1 = 30;
	private int positionFighter2 = 70;
	
	public GameState(Fighter fighterOne, Fighter fighterTwo) {
		this.fighter1 = new FighterState(fighterOne, fighterTwo, positionFighter1, true);
		this.fighter2 = new FighterState(fighterTwo, fighterOne, positionFighter2, false);
	}
	
	public FighterState getFighter1() {
		return fighter1;
	}
	
	public FighterState getFighter2() {
		return fighter2;
	}
	
	public void step() {
		checkHit();
		fighter1.updateFighterState(fighter2);
		fighter2.updateFighterState(fighter1);
		
		if (fighter1.calculateDistance(fighter2) > 4) {
			fighter1.updatePosition();
			fighter2.updatePosition();
		}
	}
	
	public void checkHit() {
		if (fighter1.getReach() > fighter1.calculateDistance(fighter2)) {
			if ((fighter1.isStrikingHigh() && !fighter2.isBlockingHigh()) ||
					!fighter1.isStrikingHigh() && !fighter2.isBlockingLow()) {
				if (fighter1.isKicking())
					fighter2.updateHealth(true);
				else
					fighter2.updateHealth(false);
			}
		}
		
		if (fighter2.getReach() > fighter2.calculateDistance(fighter1)) {
			if ((fighter2.isStrikingHigh() && !fighter1.isBlockingHigh()) ||
					!fighter2.isStrikingHigh() && !fighter1.isBlockingLow()) {
				if (fighter2.isKicking())
					fighter1.updateHealth(true);
				else
					fighter1.updateHealth(false);
			}
		}
	}
	
	public boolean fighterDied() {
		if (fighter1.getHealth() <= 0 || fighter2.getHealth() <= 0)
			return true;
		
		return false;
	}
	
	public String getWinner() {
		String winner = "";
		
		if (fighter1.getHealth() <= 0 && fighter2.getHealth() <= 0)
			winner = "None";
		else if (fighter1.getHealth() <= 0)
			winner = fighter2.getName();
		else if (fighter2.getHealth() <= 0)
			winner = fighter1.getName();
		
		return winner;
	}
	
}
