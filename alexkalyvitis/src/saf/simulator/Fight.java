package saf.simulator;

import java.util.ArrayList;
import java.util.List;

import saf.ast.Fighter;
import saf.ast.identifiers.Conditions;
import saf.simulator.enums.FighterStatus;

public class Fight {
	private LeftFighter left;
	private RightFighter right;
	private long endTime;
	private boolean end;
	
	private static final int FIGHT_TIME = 60;
	private static final int ATTACK_EFFECTIVE_DISTANCE = 200;
	
	public Fight(List<Fighter> fighters, int firstFighterX, int secondFighterX){
		left = new LeftFighter(flushRandomFighter(fighters), firstFighterX);
		right = new RightFighter(flushRandomFighter(fighters), secondFighterX);
		
		endTime = getTimeInSecs() + FIGHT_TIME;
	}
	
	private Fighter flushRandomFighter(List<Fighter> fighterList){
		int position = (int)((Math.random() * 10) % fighterList.size() -1);
		Fighter fighter = fighterList.get(position);
		fighterList.remove(position);
		return fighter;
	}
	
	private long getTimeInSecs() { 
		return System.currentTimeMillis() / 1000; 
	}
}
