package saf;

import java.util.List;
import java.util.Set;

import saf.entities.BehaviourRule;
import saf.entities.BotDefinition;
import saf.entities.FightAction;
import saf.entities.MoveAction;
import saf.entities.State;

public class Bot {
	private boolean winner;
	private final BotDefinition definition;
	private final int START_HEALTH = 100;
	private int health = START_HEALTH;
	
	private FightAction lastFightAction;
	private MoveAction lastMoveAction;

	public Bot(BotDefinition definition) {
		this.definition = definition;
	}

	public int getHealth() {
		return health;
	}
	
	public boolean isWinner() {
		return winner;
	}
	
	public float getWeight() {
		return (definition.getKickPower() + definition.getPunchPower()) / 2.0f;
	}
	
	private float getHeight() {
		return (definition.getKickReach() + definition.getPunchReach()) / 2.0f;
	}
	
	public float getSpeed() {
		return Math.max(getHeight() - getWeight() / 2.0f, 0.2f);
	}
	
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	public void subtractHealth(int ammount) {
		health = Math.max(health - ammount, 0);
	}
	
	public FightAction getLastFightAction() {
		return lastFightAction;
	}
	
	public MoveAction getLastMoveAction() {
		return lastMoveAction;
	}
	
	protected void setLastFightAction(FightAction action) {
		this.lastFightAction = action;
	}
	
	protected void setLastMoveAction(MoveAction action) {
		this.lastMoveAction = action;
	}
	
	public List<BehaviourRule> getBeheaviourRules(Set<State> filter) {
		return definition.getBehaviourRules(filter);
	}
	
	public int getPuchReach() {
		return definition.getPunchReach();
	}
	
	public int getPunchPower() {
		return definition.getPunchPower();
	}
	
	public int getKickReach() {
		return definition.getKickReach();
	}
	
	public int getKickPower() {
		return definition.getKickPower();
	}
	
	public String getName() {
		return definition.getName();
	}
}
