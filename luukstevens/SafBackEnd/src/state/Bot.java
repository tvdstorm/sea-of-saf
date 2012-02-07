package state;

import java.util.List;
import java.util.Random;

import enums.Condition;

import ast.Action;
import ast.BehaviourRule;

public class Bot {
	private static final int DEFAULT_HEALTH = 100;
	
	public enum Position { LEFT, RIGHT };
	
	private Action currentMove;
	private Action currentAttack;
	private int health;
	private boolean walkedOrRunnedAway;
	private Position position;
	
	public Bot(Position position) {
		this.position = position;

		setHealth(DEFAULT_HEALTH);
		setWalkedOrRunnedAway(false);
	}

	public Action getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(Action currentMove) {
		if(currentMove.isMove(enums.Move.WALK_TOWARDS) || currentMove.isMove(enums.Move.RUN_TOWARDS)) {
			setWalkedOrRunnedAway(false);
		}
		
		if(currentMove.isMove(enums.Move.WALK_AWAY) || currentMove.isMove(enums.Move.RUN_AWAY)) {
			setWalkedOrRunnedAway(true);
		}
		
		this.currentMove = currentMove;
	}

	public Action getCurrentAttack() {
		return currentAttack;
	}

	public void setCurrentAttack(Action currentAttack) {
		this.currentAttack = currentAttack;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public boolean getWalkedOrRunnedAway() {
		return walkedOrRunnedAway;
	}

	public void setWalkedOrRunnedAway(boolean walkedOrRunnedAway) {
		this.walkedOrRunnedAway = walkedOrRunnedAway;
	}

	public Position getPosition() {
		return position;
	}
	
	public void update(List<BehaviourRule> behaviourRules, List<Condition> conditions) {
		for(BehaviourRule behaviourRule : behaviourRules) {
			if(behaviourRule.getCondition().evaluate(conditions)) {
				setCurrentMove(getRandom(behaviourRule.getMoveActions()));
				setCurrentAttack(getRandom(behaviourRule.getFightActions()));
				break;
			}
		}
	}
	
	public void reduceHealth(int health) {
		this.health -= health;
	}
	
	private Action getRandom(List<Action> actions) {
		Random random = new Random();
		int index = random.nextInt(actions.size());
		return actions.get(index);
	}
}
