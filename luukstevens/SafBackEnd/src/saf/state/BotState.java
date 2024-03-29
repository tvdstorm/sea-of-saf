package saf.state;

import java.util.LinkedList;
import java.util.List;

import saf.ast.Action;
import saf.ast.FightAction;
import saf.ast.BehaviourRule;
import saf.ast.MoveAction;
import saf.variable.Options;
import saf.variable.Settings;

public class BotState implements Settings, Options {
	public enum Position { LEFT, RIGHT };
	
	private Action currentMove;
	private Action currentAttack;
	private int health;
	private boolean walkedOrRanAway;
	private Position position;
	private List<BehaviourRule> behaviourRules;
	private List<Condition> currentFightConditions;
	
	public BotState(Position position, List<BehaviourRule> behaviourRules) {
		this.position = position;
		this.behaviourRules = behaviourRules;
		
		setHealth(DEFAULT_HEALTH);
		walkedOrRanAway = false;
		
		update();
	}

	public MoveAction getCurrentMove() {
		return (MoveAction) currentMove;
	}

	public void setCurrentMove(MoveAction currentMove) {
		
		if(currentMove.isMove(Options.Move.WALK_TOWARDS) || currentMove.isMove(Options.Move.RUN_TOWARDS)) {
			walkedOrRanAway = false;
		}
		
		if(currentMove.isMove(Options.Move.WALK_AWAY) || currentMove.isMove(Options.Move.RUN_AWAY)) {
			walkedOrRanAway = true;
		}
		
		this.currentMove = currentMove;
	}

	public FightAction getCurrentAttack() {
		return (FightAction)currentAttack;
	}

	public void setCurrentAttack(FightAction currentAttack) {
		this.currentAttack = currentAttack;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public boolean getWalkedOrRanAway() {
		return walkedOrRanAway;
	}

	public Position getPosition() {
		return position;
	}
	
	public List<Condition> getCurrentFightConditions() {
		return currentFightConditions;
	}
	
	public void update() {
		update(new LinkedList<Condition>());
	}
	
	public void update(List<Condition> newFightConditions) {
		currentFightConditions = newFightConditions;
		
		for(BehaviourRule behaviourRule : behaviourRules) {
			if(behaviourRule.getCondition().evaluate(this)) {
				setCurrentMove(behaviourRule.chooseAction(behaviourRule.getMoveActions()));
				setCurrentAttack(behaviourRule.chooseAction(behaviourRule.getFightActions()));
				break;
			}
		}
	}
	
	public void reduceHealth(int health) {
		this.health -= health;
	}
}
