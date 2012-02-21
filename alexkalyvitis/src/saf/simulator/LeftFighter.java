package saf.simulator;

import java.util.List;

import saf.ast.Fighter;
import saf.ast.base.BaseCondition;
import saf.simulator.base.BaseSimulationFighter;
import saf.simulator.enums.FighterStatus;

public class LeftFighter extends BaseSimulationFighter{
	public LeftFighter(Fighter f, int x){
		this.fighter = f;
		this.health = FIGHTER_HEALTH;
		this.currentX = x;
		this.status = FighterStatus.READY;
	}
}
