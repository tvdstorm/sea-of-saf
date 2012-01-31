import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import ast.Behaviour;
import ast.Condition;
import ast.ConditionAtom;
import ast.Move;
import ast.MoveAtom;
import ast.ConditionAtom.Type;
import ast.Saf;


public class SafState {
	public enum PlayerType {
		P1,
		P2
	}

	public enum Position {
		CROUCHING,
		STANDING,
		JUMPING
	}

	private static final int RUN_DISTANCE = 10;
	private static final int WALK_DISTANCE = 5;
	private static final int MAX_HEALTH = 100;
	private static final int MAX_TIME = 10;
	private static final int NEAR_DISTANCE = 5;
	private static final int ARENA_SIZE = 40;
	
	
	private Saf saf;
	private int health;
	private int x;
	private Position y;
	private int countdown;
	private int jumpTime;
	private Behaviour behaviour;
	
	public SafState(PlayerType type, Saf saf) {
		this.saf = saf;
		behaviour = null;
		
		if (type == PlayerType.P1) {
			setX(0);
		} else {
			setX(ARENA_SIZE - 1);
		}
		
		setY(Position.STANDING);
		setHealth(MAX_HEALTH);
		resetJumpTime();
		
	}
	
	public void resetCountdown() {
		countdown = MAX_TIME - saf.getSpeed();
	}
	
	public boolean isAlive() {
		return getHealth() > 0;
	}
	
	public HashMap<ConditionAtom.Type, Boolean> getConditions(SafState otherState) {
		HashMap<ConditionAtom.Type, Boolean> conditions = new HashMap<ConditionAtom.Type, Boolean>();
		
		conditions.put(ConditionAtom.Type.STRONGER, false);
		conditions.put(ConditionAtom.Type.WEAKER, false);
		conditions.put(ConditionAtom.Type.MUCH_STRONGER, false);
		conditions.put(ConditionAtom.Type.MUCH_WEAKER, false);
		conditions.put(ConditionAtom.Type.EVEN, false);

		conditions.put(ConditionAtom.Type.NEAR, false);
		conditions.put(ConditionAtom.Type.FAR, false);
		
		conditions.put(ConditionAtom.Type.ALWAYS, true);
		
		if (getHealth() > otherState.getHealth()) {
			if (getHealth() - otherState.getHealth() > MAX_HEALTH / 2) {
				conditions.put(ConditionAtom.Type.MUCH_STRONGER, true);
			} else {
				conditions.put(ConditionAtom.Type.STRONGER, true);
			}
		} else if (getHealth() < otherState.getHealth()) {
			if (otherState.getHealth() - getHealth() > MAX_HEALTH / 2) {
				conditions.put(ConditionAtom.Type.MUCH_WEAKER, true);
			} else {
				conditions.put(ConditionAtom.Type.WEAKER, true);
			}			
		} else {
			conditions.put(ConditionAtom.Type.EVEN, true);
		}
		
		if (Math.abs(getX() - otherState.getX()) < NEAR_DISTANCE) {
			conditions.put(ConditionAtom.Type.NEAR, true);
		} else {
			conditions.put(ConditionAtom.Type.FAR, true);
		}
		return conditions;
	}
	
	public void nextStep(SafState otherState) {
//		System.out.println("countdown:" + countdown);
		if (countdown == 0) {
			System.out.println("executeBehaviour");
			executeBehaviour(otherState);
			setNextBehaviour(getConditions(otherState));
			
			printState();
			resetCountdown();
		} 
		if (getY() == Position.JUMPING) {
			jumpTime--;
			if (jumpTime == 0) {
				setY(Position.STANDING);
				
				System.out.println("landing");
				printState();
				
				resetJumpTime();
			}
		}
		countdown--;
	}

	private void resetJumpTime() {
		jumpTime = 3;
	}

	private void setNextBehaviour(HashMap<Type, Boolean> conditions) {
		ArrayList<Behaviour> behaviours = saf.getBehaviours();
		Iterator<Behaviour> it = behaviours.iterator();
		while (it.hasNext()) {
		    Behaviour b = it.next();
		   	Condition condition = b.getCondition();
		   	
		    if (!condition.evaluate(conditions)) {
			    it.remove();
		    }
		}
		System.out.println("behaviour size: " + behaviours.size());
		int random = new Random().nextInt(behaviours.size());
		behaviour = behaviours.get(random);
	}

	private void executeBehaviour(SafState otherState) {
		if (behaviour != null) {
			Type type = behaviour.getCondition().getType();
			System.out.println(type);
			executeMove(behaviour.getMove(), otherState);
		}
	}

	private void executeMove(Move move, SafState otherState) {
		switch((MoveAtom.Type) move.getType()) {
			case JUMP:
				setY(Position.JUMPING);
				break;
			case CROUCH:
				setY(Position.CROUCHING);
				break;
			case STAND:
				setY(Position.STANDING);
				break;
			case RUN_TOWARDS:
				if (getX() < otherState.getX()) {
					increaseX(RUN_DISTANCE);
				} else {
					decreaseX(RUN_DISTANCE);
				}
				break;
			case RUN_AWAY:
				if (getX() < otherState.getX()) {
					decreaseX(RUN_DISTANCE);
				} else {
					increaseX(RUN_DISTANCE);
				}
				break;
			case WALK_TOWARDS:
				if (getX() < otherState.getX()) {
					increaseX(WALK_DISTANCE);
				} else {
					decreaseX(WALK_DISTANCE);
				}
				break;
			case WALK_AWAY:
				if (getX() < otherState.getX()) {
					decreaseX(WALK_DISTANCE);
				} else {
					increaseX(WALK_DISTANCE);
				}
				break;
		}
	}
	
	private int getCorrectedDistance(int distance) {
		double factor;
		if (getY() == Position.CROUCHING) {
			factor = 1;
		} else {
			factor = 0.5;
		}
		return (int) Math.round(distance * factor);
	}
	
	private void increaseX(int delta) {
		delta = getCorrectedDistance(delta);
		setX(Math.min(getX() + delta, ARENA_SIZE));
	}

	private void decreaseX(int delta) {
		delta = getCorrectedDistance(delta);
		setX(Math.max(getX() - delta, 0));
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Position getY() {
		return y;
	}

	public void setY(Position y) {
		this.y = y;
	}
	
	public void printState() {
		if (getY() == Position.JUMPING) { 
			printLine('.', '|', getX());
		} else { 
			printLine('.', '|', -1);
		}
		if (getY() == Position.STANDING) { 
			printLine('.', '|', getX());
		} else { 
			printLine('.', '|', -1);
		}
		if (getY() == Position.CROUCHING) { 
			printLine('-', '+', getX());
		} else { 
			printLine('-', '+', -1);
		}
		
	}
	
	public void printLine(char c, char border, int pos) {
		System.out.print(border);
		for (int i = 0; i < ARENA_SIZE; i++) {
			if (i == pos) {
				System.out.print("x");
			} else {
				System.out.print(c);
			}
		}
		System.out.println(border);
		
	}
}
