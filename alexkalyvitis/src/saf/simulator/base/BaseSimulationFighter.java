package saf.simulator.base;

import java.util.List;

import saf.ast.Attack;
import saf.ast.Behavior;
import saf.ast.Fighter;
import saf.ast.Strength;
import saf.ast.base.BaseCondition;
import saf.ast.identifiers.Attacks;
import saf.ast.identifiers.Moves;
import saf.simulator.enums.FighterStatus;

public abstract class BaseSimulationFighter {
	protected static int FIGHTER_MAX_HEALTH = 100;
	protected static int WALK_MULTIPLIER = 3;
	protected static int RUN_MULTIPLIER = 6;
	
	protected Fighter fighter;
	protected int health;
	protected int minX;
	protected int maxX;
	protected int currentX;
	protected int minY;
	protected int maxY;
	protected int currentY;
	protected FighterStatus status;
	
	protected List<BaseCondition> applicableConditions;
	protected Behavior move;
	
	public String getName(){
		return this.fighter.getName();
	}
	public int getHealth(){
		return this.health;
	}
	public int getCurrentX(){
		return this.currentX;
	}
	public int getCurrentY(){
		return this.currentY;
	}
	public Moves getMove(){
		assert this.move != null : "No move to get.";
		return Moves.valueOf(move.getMove().getName().toUpperCase());
	}
	public boolean moveIsNull(){
		return this.move == null;
	}
	public Attacks getAttack(){
		assert this.move != null : "No attack to get.";
		return Attacks.valueOf(move.getAttack().getName().toUpperCase());
	}
	public void clearConditions(){
		applicableConditions.clear();
	}
	public void addCondition(BaseCondition c){
		applicableConditions.add(c);
	}
	public int getTotalStrength(){
		int sumStrengths = 0;
		for(Strength strength : this.fighter.getStrengths()){
			sumStrengths += strength.getValue();
		}
		return sumStrengths;
	}
	public void reduceHealth(Attack attack){
		this.health -= this.fighter.getAttackDamage(attack);
	}
	public int getReach(Attacks attack) {
		return this.fighter.getAttackReach(new Attack(attack));
	}
	public void calculateNextMove(){
		this.move = null;
		for(Behavior behavior : this.fighter.getBehaviors()){
			if (behavior.getCondition().eval(this.applicableConditions)) {
				this.move = behavior;
				break;
			}
		}
		assert this.move != null : "No rules matched.";
	}
	public int[][] getAttackCoords(){
		return new int[0][0];
	}
	public int[][] getStandCoords(){
		return new int[0][0];
	}
	public void setStatus(FighterStatus status){
		this.status = status;
	}
	public FighterStatus getStatus(){
		return this.status;
	}
	public int getX() {
		return this.currentX;
	}
	public int getMaxX() {
		return this.maxX;
	}
	public boolean canMoveForward() {
		return false;
	}
	public boolean canMoveBackward() {
		return false;
	}
	public void walkForward() { }
	public void walkBackward() { }
	public void runForward() { }
	public void runBackward() { }
}
