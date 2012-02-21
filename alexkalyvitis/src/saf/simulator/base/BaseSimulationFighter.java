package saf.simulator.base;

import java.util.List;

import saf.ast.Behavior;
import saf.ast.Fighter;
import saf.ast.base.BaseCondition;
import saf.simulator.enums.FighterStatus;

public abstract class BaseSimulationFighter {
	protected static int FIGHTER_HEALTH = 100;
	
	protected Fighter fighter;
	protected int health;
	protected int currentX;
	protected FighterStatus status;
	
	protected List<BaseCondition> applicableConditions;
	protected Behavior move;
}
