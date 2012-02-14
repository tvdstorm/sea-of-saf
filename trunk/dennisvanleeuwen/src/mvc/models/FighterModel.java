package mvc.models;

import java.util.ArrayList;
import java.util.List;

import mylib.MyRandomizer;
import mylib.Pair;

import saf.astelements.Characteristic;
import saf.astelements.IAction;
import saf.astelements.Rule;

public class FighterModel {
	public enum Position {
	    LOW, 
	    NORMAL, 
	    HIGH
	}
	
	public enum Block {
	    LOW, 
	    NONE, 
	    HIGH
	}

	private Position frontLeg;
	private Position frontArm;
	private Block block;
	
	private Boolean crouching;
	private Boolean jumping;

	private int x;
	private int health;

	private int kickReach; 
	private int kickPower; 
	private int punchReach; 
	private int punchPower;
	
	private List<Rule> rules;
	
	private int speed;
	private int weight;
	private int height;
	
	public FighterModel(int x, int kickReach, int kickPower, int punchReach, int punchPower, int health, List<Rule> rules){
		this.x = x;
		this.kickReach = kickReach;
		this.kickPower = kickPower;
		this.punchReach = punchReach;
		this.punchPower = punchPower;
		this.health = health;	
		this.rules = rules;
		
		this.weight = (punchPower + kickPower) / 2;
		this.height = (punchReach + kickReach) / 2;
		this.speed = (int) Math.abs(0.5*(height-weight));
		
		this.block = Block.NONE;
		this.frontArm = Position.NORMAL;
		this.frontLeg = Position.NORMAL;
		this.crouching = false;
		this.jumping = false;
	}
	
	public void resetMovements(){
		this.block = Block.NONE;
		this.frontArm = Position.NORMAL;
		this.frontLeg = Position.NORMAL;
		this.crouching = false;
		this.jumping = false;
	}
		
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getSpeed() {
		return this.speed;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getHeight() {
		return this.height;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getKickReach() {
		return kickReach;
	}

	public int getKickPower() {
		return kickPower;
	}

	public int getPunchReach() {
		return punchReach;
	}

	public int getPunchPower() {
		return punchPower;
	}
	
	public Position getFrontLeg() {
		return frontLeg;
	}

	public void setFrontLegHigh() {
		this.frontLeg = Position.HIGH;
	}
	
	public void setFrontLegLow() {
		this.frontLeg = Position.LOW;
	}

	public Position getFrontArm() {
		return frontArm;
	}

	public void setFrontArmHigh() {
		this.frontArm = Position.HIGH;
	}
	
	public void setFrontArmLow() {
		this.frontArm = Position.LOW;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlockHigh() {
		this.block = Block.HIGH;
	}
	
	public void setBlockLow() {
		this.block = Block.LOW;
	}
	
//	public Pair<IAction, IAction> getActionsAgainstEnemy(FighterModel fighterModelEnemy){
//		List<Rule> validRules = new ArrayList<Rule>();
//		for(Rule rule: this.rules){
//			if(rule.getCondition().isTrueInModel(this, fighterModelEnemy))
//				validRules.add(rule);
//		}
//		
//		Rule chosenRule = validRules.get(MyRandomizer.generateRandomNumber(validRules.size()));
//		return new Pair<IAction, IAction>(chosenRule.getMoveAction(), chosenRule.getFightAction());
//	}
	
	//TODO: refactor??? Factory method
	static public FighterModel createFighterModel(String name, List<Characteristic> characteristics, List<Rule> rules, int x){
		int punchReach = 0, punchPower = 0, kickReach = 0, kickPower = 0;
		for(Characteristic characteristic: characteristics){
			if(characteristic.item == "punchReach"){
				punchReach = characteristic.value;
			}else if(characteristic.item == "punchPower"){
				punchPower = characteristic.value;
			}else if(characteristic.item == "kickReach"){
				kickReach = characteristic.value;
			}else if(characteristic.item == "kickPower"){
				kickPower = characteristic.value;
			}
		}
		return new FighterModel(x, kickReach, kickPower, punchReach, punchPower, 100, rules);
	}

	public Boolean getCrouching() {
		return crouching;
	}

	public void setCrouching(){
		this.crouching = true;
	}

	public Boolean getJumping() {
		return jumping;
	}

	public void setJumping(){
		this.jumping = true;
	}
}