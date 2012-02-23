package saf.simulator;

import java.util.List;

import saf.ast.Attack;
import saf.ast.Condition;
import saf.ast.Fighter;
import saf.ast.identifiers.Conditions;
import saf.simulator.base.BaseSimulationFighter;
import saf.simulator.helpers.FighterStatus;

public class Fight {
	private LeftFighter left;
	private RightFighter right;
	private long endTime;
	private boolean end;
	private String winnersName;
	
	private static final int FIGHT_TIME = 60;
	private static final int MUCH_THRESHOLD = 5;
	private static final int EFFECTIVE_ATTACKING_DISTANCE = 50;
	
	public Fight(List<Fighter> fighters, int windowWidth, int fighterOffsetX, int windowHeight, int fighterOffsetY){
		this.left = new LeftFighter(flushRandomFighter(fighters), windowWidth, fighterOffsetX, windowHeight, fighterOffsetY);
		this.right = new RightFighter(flushRandomFighter(fighters), windowWidth, fighterOffsetX, windowHeight, fighterOffsetY);
		this.endTime = getTimeInSecs() + FIGHT_TIME;
		this.end = false;
		this.winnersName = "Draw";
	}
	
	public void assess(){
		this.left.clearConditions();
		this.right.clearConditions();
		
		// Always
		this.left.addCondition(new Condition(Conditions.ALWAYS));
		this.right.addCondition(new Condition(Conditions.ALWAYS));
		
		// Distance
		int distance = Math.abs(this.left.getX() - this.right.getX());
		if(distance < 200){
			this.left.addCondition(new Condition(Conditions.NEAR));
			this.right.addCondition(new Condition(Conditions.NEAR));
		} else {
			this.left.addCondition(new Condition(Conditions.FAR));
			this.right.addCondition(new Condition(Conditions.FAR));
		}
		
		// Strength
		int leftStrength = this.left.getTotalStrength();
		int rightStrength = this.right.getTotalStrength();
		if (leftStrength > rightStrength){
			if (leftStrength > rightStrength + MUCH_THRESHOLD){
				this.left.addCondition(new Condition(Conditions.MUCH_STRONGER));
				this.right.addCondition(new Condition(Conditions.MUCH_WEAKER));
			} else {
				this.left.addCondition(new Condition(Conditions.STRONGER));
				this.right.addCondition(new Condition(Conditions.WEAKER));
			}
		} else if (leftStrength < rightStrength){
			if (leftStrength < rightStrength - MUCH_THRESHOLD){
				this.left.addCondition(new Condition(Conditions.MUCH_WEAKER));
				this.right.addCondition(new Condition(Conditions.MUCH_STRONGER));
			} else {
				this.left.addCondition(new Condition(Conditions.WEAKER));
				this.right.addCondition(new Condition(Conditions.STRONGER));
			}
		} else {
			this.left.addCondition(new Condition(Conditions.EVEN));
			this.right.addCondition(new Condition(Conditions.EVEN));
		}
		
		// Health
		if(this.left.getHealth() <= 0){
			winnersName = this.right.getName();
			end = true;
		} 
		else if(this.right.getHealth() <= 0){
			winnersName = this.left.getName();
			end = true;
		}
		else if(endTime <= getTimeInSecs()){
			winnersName = "Draw";
			end = true;
		}
		
		if(this.left.getStatus().equals(FighterStatus.READY)){
			if(!this.left.moveIsNull()) 
				reduceHealth(this.left,this.right);
			this.left.calculateNextMove();
			this.left.setStatus(FighterStatus.OCCUPIED);
		}
		if(this.right.getStatus().equals(FighterStatus.READY)){
			if(!this.right.moveIsNull()) 
				reduceHealth(this.right,this.left);
			this.right.calculateNextMove();
			this.right.setStatus(FighterStatus.OCCUPIED);
		}
	}
	public BaseSimulationFighter getLeft(){
		return this.left;
	}
	public BaseSimulationFighter getRight(){
		return this.right;
	}
	public long getCountDown(){
		return endTime - getTimeInSecs(); 
	}
	public boolean hasEnded(){
		return end;
	}
	public String getWinnersName(){
		return this.winnersName;
	}
	private Fighter flushRandomFighter(List<Fighter> fighterList){
		int position = (int)((Math.random() * 10) % fighterList.size() -1);
		Fighter fighter = fighterList.get(position);
		fighterList.remove(position);
		return fighter;
	}
	private long getTimeInSecs() { 
		return System.currentTimeMillis() / 1000; 
	}
	private void reduceHealth(BaseSimulationFighter attacker, BaseSimulationFighter victim){
		if(Math.abs(attacker.getX() - victim.getX()) < attacker.getReach(attacker.getAttack()) * EFFECTIVE_ATTACKING_DISTANCE)
			victim.reduceHealth(new Attack(attacker.getAttack()));
	}
}
