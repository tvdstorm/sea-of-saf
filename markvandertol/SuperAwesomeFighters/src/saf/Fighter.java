package saf;

import java.util.List;
import java.util.Set;

import saf.ast.BehaviourRule;
import saf.ast.FightAction;
import saf.ast.FighterDefinition;
import saf.ast.MoveAction;
import saf.ast.State;

/**
 * Stores the state for a fighter
 */
public class Fighter {
	private boolean wonRound;
	private final FighterDefinition definition;
	private final int START_HEALTH = 100;
	private int health = START_HEALTH;
	
	private FightAction lastFightAction;
	private MoveAction lastMoveAction;
	
	private Stance currentStance = Stance.standing;
	
	public Fighter(FighterDefinition definition) {
		this.definition = definition;
	}

	public int getHealth() {
		return health;
	}
	
	public boolean hasWonRound() {
		return wonRound;
	}
	
	public float getWeight() {
		return (definition.getKickPower() + definition.getPunchPower()) / 2.0f;
	}
	
	private float getHeight() {
		return (definition.getKickReach() + definition.getPunchReach()) / 2.0f;
	}
	
	/**
	 * Returns speed. Can be negative!
	 */
	public float getSpeed() {
		return getHeight() - getWeight() / 2.0f;
	}
	
	public void setWonRound(boolean wonRound) {
		this.wonRound = wonRound;
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
		return definition.findBehaviourRulesForStates(filter);
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
	
	public Stance getStance() {
		return currentStance;
	}
	
	public void setStance(Stance currentStance) {
		this.currentStance = currentStance;
	}
}
