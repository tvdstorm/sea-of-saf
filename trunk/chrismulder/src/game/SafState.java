package game;

import java.util.HashMap;
import java.util.Map;

import ast.AtomType;
import ast.Attack;
import ast.AttackAtom;
import ast.Behaviour;
import ast.ConditionAtom;
import ast.Move;
import ast.MoveAtom;
import ast.Saf;
import ast.Strength;


public class SafState {
	public enum Direction {
		LEFT,
		RIGHT
	}

	public enum Level {
		NONE,
		LOW,
		HIGH
	}

	public enum PlayerType {
		P1,
		P2
	}
	
	public enum Posture {
		CROUCHING,
		STANDING,
		JUMPING
	}
	
	public static final int ARENA_SIZE = 18;
	
	private static final int RUN_DISTANCE = 4;
	private static final int WALK_DISTANCE = 2;
	private static final int MAX_HEALTH = 100;
	private static final int MAX_TIME = 10;
	private static final int NEAR_DISTANCE = 2;
	private static final int JUMP_TIME = 3;
	
	private Saf saf;
	
	private PlayerType playerType;
	private int health;
	private int position;
	private Posture posture;
	private Level block;
	private Direction direction;
	
	private int timeToAct;
	private int timeInAir;
	
	private Behaviour nextBehaviour;
	private int actionOrdinal;
	
	public SafState(PlayerType type, Saf saf) {
		this.saf = saf;
		nextBehaviour = null;
		
		playerType = type;
		if (playerType == PlayerType.P1) {
			position = 0;
			direction = Direction.RIGHT;
		} else {
			position = ARENA_SIZE - 1;
			direction = Direction.LEFT;
		}
		
		posture = Posture.STANDING;
		health = MAX_HEALTH;
		timeInAir = 0;
		actionOrdinal = 0;
	}
	
	private void decreaseHealth(int strength) {
		health = Math.max(0, health - strength);
	}
	
	private void decreaseX(int delta) {
		delta = getCorrectedDistance(delta);
		position = Math.max(getPosition() - delta, 0);
	}

	private void executeBehaviour(SafState otherState) {
		if (nextBehaviour != null) {
			executeMove(nextBehaviour.getMove(), otherState);
			executeAttack(nextBehaviour.getAttack(), otherState);
		}
	}

	private void executeMove(Move move, SafState otherState) {
		switch((MoveAtom.Type) move.getType()) {
			case JUMP:
				posture = Posture.JUMPING;
				break;
			case CROUCH:
				posture = Posture.CROUCHING;
				break;
			case STAND:
				posture = Posture.STANDING;
				break;
			case RUN_TOWARDS:
				if (getPosition() < otherState.getPosition()) {
					increaseX(RUN_DISTANCE);
				} else {
					decreaseX(RUN_DISTANCE);
				}
				break;
			case RUN_AWAY:
				if (getPosition() < otherState.getPosition()) {
					decreaseX(RUN_DISTANCE);
				} else {
					increaseX(RUN_DISTANCE);
				}
				break;
			case WALK_TOWARDS:
				if (getPosition() < otherState.getPosition()) {
					increaseX(WALK_DISTANCE);
				} else {
					decreaseX(WALK_DISTANCE);
				}
				break;
			case WALK_AWAY:
				if (getPosition() < otherState.getPosition()) {
					decreaseX(WALK_DISTANCE);
				} else {
					increaseX(WALK_DISTANCE);
				}
				break;
		}
	}
	
	private void executeAttack(Attack attack, SafState otherState) {
		block  = Level.NONE;
		int reach = 0, power = 0;
		Level level = null;
		
		switch((AttackAtom.Type) attack.getType()) {
			case BLOCK_HIGH:
				block  = Level.HIGH;
				break;
			case BLOCK_LOW:
				block  = Level.LOW;
				break;
			case KICK_HIGH:
				reach = saf.getStrength(Strength.Type.KICKREACH);
				power = saf.getStrength(Strength.Type.KICKPOWER);
				level = Level.HIGH;
				break;
			case KICK_LOW:
				reach = saf.getStrength(Strength.Type.KICKREACH);
				power = saf.getStrength(Strength.Type.KICKPOWER);
				level = Level.LOW;
				break;
			case PUNCH_HIGH:
				reach = saf.getStrength(Strength.Type.PUNCHREACH);
				power = saf.getStrength(Strength.Type.PUNCHPOWER);
				level = Level.HIGH;
				break;
			case PUNCH_LOW:
				reach = saf.getStrength(Strength.Type.PUNCHREACH);
				power = saf.getStrength(Strength.Type.PUNCHPOWER);
				level = Level.LOW;
				break;
		}
		if (block  == Level.NONE) {
			if (otherState.isVulnerable(level) && getDistance(otherState) <= reach) {
				otherState.decreaseHealth(power);
			}
		}
		actionOrdinal = attack.getType().ordinal();
	}
	

	public int getActionOrdinal() {
		return actionOrdinal;
	}
	
	private Map<AtomType, Boolean> getConditions(SafState otherState) {
		Map<AtomType, Boolean> conditions = new HashMap<AtomType, Boolean>();
		
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
		
		if (Math.abs(getPosition() - otherState.getPosition()) < NEAR_DISTANCE) {
			conditions.put(ConditionAtom.Type.NEAR, true);
		} else {
			conditions.put(ConditionAtom.Type.FAR, true);
		}
		return conditions;
	}
	
	
	private int getCorrectedDistance(int distance) {
		double factor;
		if (getPosture() == Posture.CROUCHING) {
			factor = 1;
		} else {
			factor = 0.5;
		}
		return (int) Math.round(distance * factor);
	}

	public Direction getDirection() {
		return direction;
	}

	private int getDistance(SafState otherState) {
		return Math.abs(getPosition() - otherState.getPosition());
	}

	public int getHealth() {
		return health;
	}
	
	public PlayerType getPlayerType() {
		return playerType;
	}

	public int getPosition() {
		return position;
	}

	public Posture getPosture() {
		return posture;
	}

	public int getPostureOrdinal() {
		return posture.ordinal();
	}

	private void increaseX(int delta) {
		delta = getCorrectedDistance(delta);
		position = Math.min(getPosition() + delta, ARENA_SIZE - 1);
	}

	public boolean isAlive() {
		return getHealth() > 0;
	}

	private boolean isVulnerable(Level level) {
		if (level == block) {
			return false;
		}
		
		if (getPosture() == Posture.CROUCHING && level == Level.HIGH) {
			return false;
		}

		if (getPosture() == Posture.JUMPING && level == Level.LOW) {
			return false;
		}
		
		return true;
	}
	
	public void nextStep(SafState otherState) {
		if (getPosition() < otherState.getPosition()) {
			direction = Direction.RIGHT;
		} else {
			direction = Direction.LEFT;
		}
		
		if (timeToAct == 0) {
			executeBehaviour(otherState);
			nextBehaviour = saf.getMatchingBehaviour(getConditions(otherState));
			timeToAct = MAX_TIME - saf.getSpeed();
		} 
		if (getPosture() == Posture.JUMPING) {
			timeInAir++;
			if (timeInAir == JUMP_TIME) {
				posture = Posture.STANDING;
				timeInAir = 0;
			}
		}
		timeToAct--;
	}
}
