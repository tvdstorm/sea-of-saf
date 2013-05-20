package game;

import ast.fighter.Fighter;

public class Arena {
	
	public static final int MIN_FLOOR_POSITION = 1;
	public static final int MAX_FLOOR_POSITION = 200;
	public static final int STANDARD_TIMESTEP = 5;
	FighterAI fighterOne;
	FighterAI fighterTwo;
	
	public Arena(Fighter fighterOne, Fighter fighterTwo){
		this.fighterOne = new FighterAI(fighterOne, MIN_FLOOR_POSITION);
		this.fighterTwo = new FighterAI(fighterTwo, MAX_FLOOR_POSITION);
		init();
	}
	
	private void init(){
		this.fighterOne.setOpponent(this.fighterTwo);
		this.fighterTwo.setOpponent(this.fighterOne);
	}
	
	public void startFight(){
		for(int counter = 10000; counter > 0; counter--){
			fighterOne.takeAction();
			fighterTwo.takeAction();
		}
	}
	
	private boolean calculateHit(FighterAI fighter, FighterAI opponent){
		boolean hit = false;
		String fightAction = fighter.getCurrentFightAction();
		int reach = Math.abs(fighter.getPosition()-opponent.getPosition());
		int fightReach = 0;
		if(fightAction.contains("kick")){
			fightReach = fighter.getKickReach();
		} else if(fightAction.contains("punch")){
			fightReach = fighter.getPunchReach();
		}
		if(reach <= fightReach)
			hit = true;
		return hit;
	}

}
