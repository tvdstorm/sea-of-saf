package saf.game.play;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import saf.Config;
import saf.ast.condition.And;
import saf.ast.condition.Atom;
import saf.ast.condition.Condition;
import saf.ast.condition.Or;
import saf.ast.fighter.Fighter;
import saf.ast.fighter.Rule;

public class FighterState implements Config {

	private Fighter fighter;
	private Fighter opponent;
	private String currentMoveAction = Moves.stand.name();
	private String currentFightAction = Moves.stand.name();
	private int position;
	private int health = HEALTH;
	private boolean stillMoving = false;
	private boolean isSlow = false;
	private boolean leftSide = false;
	private List<Rule> rules;
	
	public FighterState(Fighter fighter, Fighter opponent, int position, boolean leftSide) {
		this.fighter = fighter;
		this.opponent = opponent;
		this.position = position;
		this.leftSide = leftSide;
		this.rules = this.fighter.getBehaviour().getRules();
		this.isSlow = this.fighter.getPersonality().getSpeed() > SPEED_THRESHOLD;
	}

	public String getName() {
		return this.fighter.getName();
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int calculateDistance(FighterState opponent) {
		return Math.abs(this.position - opponent.position);
	}
	
	public String getDistanceCondition(FighterState opponent) {
		String distanceCondition = Atoms.near.name();
		if (this.calculateDistance(opponent) > DISTANCE_THRESHOLD)
			distanceCondition = Atoms.far.name();
		
		return distanceCondition;
	}
	
	public String getStrengthCondition(FighterState opponent) {
		int fighterPower = this.fighter.getPersonality().getPower();
		int opponentPower = opponent.fighter.getPersonality().getPower();
		String strengthCondition = Atoms.even.name();
		
		if (fighterPower > opponentPower)
			strengthCondition = Atoms.stronger.name();
		if (fighterPower < opponentPower)
			strengthCondition = Atoms.weaker.name();
		if ((opponentPower / fighterPower) < POWER_THRESHOLD)
			strengthCondition = Atoms.much_stronger.name();
		if ((fighterPower / opponentPower) < POWER_THRESHOLD)
			strengthCondition = Atoms.much_weaker.name();
		
		return strengthCondition;
	}
	
	public String getMoveAction() {
		return this.currentMoveAction;
	}
	
	public String getFightAction() {
		return this.currentFightAction;
	}
	
	public int getReach() {
		int reach = 0;
		
		if (Strikes.punch_low.name().equals(currentFightAction) || Strikes.punch_high.name().equals(currentFightAction))
			reach = this.fighter.getPersonality().getPunchReach();
		else if (Strikes.kick_low.name().equals(currentFightAction) || Strikes.kick_high.name().equals(currentFightAction))
			reach = this.fighter.getPersonality().getKickReach();
		
		return reach;
	}

	public int getPosition() {
		return this.position;
	}
	
	public boolean isKicking() {
		return Strikes.kick_high.name().equals(currentFightAction) || 
				Strikes.kick_low.name().equals(currentFightAction);
	}
	
	public boolean isPunching() {
		return Strikes.punch_high.name().equals(currentFightAction) ||
				Strikes.punch_low.name().equals(currentFightAction);
	}
	
	public boolean isBlockingHigh() {
		return Strikes.block_high.name().equals(currentFightAction);
	}
	
	public boolean isBlockingLow() {
		return Strikes.block_low.name().equals(currentFightAction);
	}
	
	public boolean isStrikingHigh() {
		return Strikes.kick_high.name().equals(currentFightAction) ||
				Strikes.punch_high.name().equals(currentFightAction);
	}
	
	public void updateHealth(boolean isKicking) {
		if (isKicking)
			this.health -= this.opponent.getPersonality().getKickPower();
		else
			this.health -= this.opponent.getPersonality().getPunchPower();
	}
	
	public void updatePosition() {
		if (Moves.walk_towards.name().equals(currentMoveAction))
			this.position = leftSide ? this.position + WALK_DISTANCE : this.position - WALK_DISTANCE;
		else if (Moves.walk_away.name().equals(currentMoveAction))
			this.position = leftSide ? this.position - WALK_DISTANCE : this.position + WALK_DISTANCE;
		else if (Moves.run_towards.name().equals(currentMoveAction)) {
			if (!isSlow) {
				this.position = leftSide ? this.position + RUN_DISTANCE : this.position - RUN_DISTANCE;
			} else {
				this.stillMoving = true;
				this.position = leftSide ? this.position + WALK_DISTANCE : this.position - WALK_DISTANCE;
			}
		}
		else if (Moves.run_away.name().equals(currentMoveAction)) {
			if (!isSlow) {
				this.position = leftSide ? this.position - RUN_DISTANCE : this.position + RUN_DISTANCE;
			} else {
				this.stillMoving = true;
				this.position = leftSide ? this.position - WALK_DISTANCE : this.position + WALK_DISTANCE;
			}
		}
	}
	
	public boolean updateFighterState(FighterState opponent) {
		ListIterator<Rule> itr = rules.listIterator();
		
		if (!stillMoving) {
			while(itr.hasNext()) {
				Rule rule = itr.next();
				Condition condition = rule.getCondition();
				
				if (isValidCondition(condition, opponent)) {
					updateCurrentMoveAction(rule);
					updateCurrentFightAction(rule);
					return true;
				}	
			}
			
			for (Rule r : rules) {
				if (r.getCondition().isAlways()) {
					updateCurrentMoveAction(r);
					updateCurrentFightAction(r);
					return true;
				}
			}
		} else {
			this.stillMoving = false;
		}
		
		return false;
	}
	
	public boolean isValidCondition(Condition condition, FighterState opponent) {
		if (condition instanceof Atom) {
			String name = ((Atom) condition).getName();
			if (name.equals(this.getDistanceCondition(opponent)) || 
					name.equals(this.getStrengthCondition(opponent)))
				return true;
		}
		
		if (condition instanceof And) {
			if (isValidCondition(((And) condition).getLhs(), opponent) && 
					isValidCondition(((And) condition).getRhs(), opponent))
				return true;
		}
		
		if (condition instanceof Or) {
			if (isValidCondition(((Or) condition).getLhs(), opponent) || 
					isValidCondition(((Or) condition).getRhs(), opponent))
				return true;
		}
		
		return false;
	}
	
	public void updateCurrentMoveAction(Rule rule) {
		List<String> moves = rule.getMoveAction().getActions();
		
		if (moves.size() > 1)
			this.currentMoveAction = moves.get(randomGenerator(moves.size()));
		else
			this.currentMoveAction = moves.get(0);
	}
	
	public void updateCurrentFightAction(Rule rule) {
		List<String> strikes = rule.getFightAction().getActions();
		
		if (strikes.size() > 1)
			this.currentFightAction = strikes.get(randomGenerator(strikes.size()));
		else
			this.currentFightAction = strikes.get(0);
		
		if (Moves.crouch.name().equals(currentMoveAction) && isStrikingHigh()) {
			if (isKicking())
				this.currentFightAction = Strikes.kick_low.name();
			else
				this.currentFightAction = Strikes.punch_low.name();
		}
		
		if (Moves.jump.name().equals(currentMoveAction) && !isStrikingHigh()) {
			if (isKicking())
				this.currentFightAction = Strikes.kick_high.name();
			else
				this.currentFightAction = Strikes.punch_high.name();
		}
		
	}
	
	public int randomGenerator(int max) {
		Random r = new Random();
		return r.nextInt(max);
	}
	
}
