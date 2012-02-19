package abstractSyntaxTree;

import java.util.Random;

public class Fighter {
	
	private String name;
	private Personality personality;
	private Behavior behavior;
	
	private double weight;
	private double height;
	private double speed;
	
	private String currentAttack=new String();
	private int currentAttackPower;
	private int currentAttackReach;
	
	private String currentMove;
	
	private int health; //100 full life - 0 dead	
	private int location;
	private String powerCondition;
	private String locationCondition;
	
	public Fighter(){
		this.name="";
		this.personality=new Personality();
		this.behavior=new Behavior();
		
		this.weight=0.0;
		this.height=0.0;
		this.speed=0.0;
		this.health=100;
		setLocationCondition("far");
		setPowerCondition("even");
	}
	
	public void addPersonality(Personality personality){
		this.setPersonality(personality);
	}
	
	public void addBehavior(Behavior behavior){
		this.setBehavior(behavior);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the personality
	 */
	public Personality getPersonality() {
		return personality;
	}

	/**
	 * @param personality the personality to set
	 */
	public void setPersonality(Personality personality) {
		this.personality = personality;
	}

	/**
	 * @return the behavior
	 */
	public Behavior getBehavior() {
		return behavior;
	}

	/**
	 * @param behavior the behavior to set
	 */
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
		
	public void calibrateAttributes(){
		this.personality.calibrateAttributes();
		this.weight=(this.personality.getPunchPower()+this.personality.getKickPower())/2;
		this.height=(this.personality.getPunchReach()+this.personality.getKickReach())/2;
		this.speed=Math.abs(0.5 * (height-weight));
	}
	
	public String toString(){
		String temp="Name: "+this.name+"\n" +
				"Personality: "+this.personality+"\n" +
				"Behavior: "+this.behavior+"\n" +
				"Weight: "+this.weight+"\n" +
				"Height: "+this.height+"\n" +
				"Speed: "+this.speed+"\n" +
				"Health: "+this.health+"\n";	
		return temp;
	}

	/**
	 * @return the currentAttack
	 */
	public String getCurrentAttack() {
		return currentAttack;
	}
	
	/**
	 * @param currentAttack the currentAttack to set
	 */
	public void calculateCurrentAttackandMove() {
		Random generator=new Random();
		int max=this.behavior.validAttacks.size();
		int rand=generator.nextInt(max);
		this.currentAttack=new String(this.behavior.validAttacks.get(rand));
		this.setCurrentMove(new String(this.behavior.validMoves.get(rand)));
		
		if(this.currentAttack.equals("punch_low") || this.currentAttack.equals("punch_high")){
			this.setCurrentAttackPower(personality.getPunchPower());
			this.setCurrentAttackReach(personality.getPunchReach());
		}
		else if(this.currentAttack.equals("kick_high") || this.currentAttack.equals("kick_low")){
			this.setCurrentAttackPower(personality.getKickPower());
			this.setCurrentAttackReach(personality.getKickReach());			
		}
		else if(this.currentAttack.equals("block_high") || this.currentAttack.equals("block_low")){
			this.setCurrentAttackPower(0);
			this.setCurrentAttackReach(0);			
		}
	}

	/**
	 * @return the currentAttackPower
	 */
	public int getCurrentAttackPower() {
		return currentAttackPower;
	}

	/**
	 * @param currentAttackPower the currentAttackPower to set
	 */
	public void setCurrentAttackPower(int currentAttackPower) {
		this.currentAttackPower = currentAttackPower;
	}

	/**
	 * @return the currentAttackReach
	 */
	public int getCurrentAttackReach() {
		return currentAttackReach;
	}

	/**
	 * @param currentAttackReach the currentAttackReach to set
	 */
	public void setCurrentAttackReach(int currentAttackReach) {
		this.currentAttackReach = currentAttackReach;
	}


	/**
	 * @return the currentMove
	 */
	public String getCurrentMove() {
		return currentMove;
	}

	/**
	 * @param currentMove the currentMove to set
	 */
	public void setCurrentMove(String currentMove) {
		this.currentMove = currentMove;
	}

	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(int location) {
		this.location = location;
	}

	/**
	 * @return the locationCondition
	 */
	public String getLocationCondition() {
		return locationCondition;
	}

	/**
	 * @param locationCondition the locationCondition to set
	 */
	public void setLocationCondition(String locationCondition) {
		this.locationCondition = locationCondition;
	}

	/**
	 * @return the powerCondition
	 */
	public String getPowerCondition() {
		return powerCondition;
	}

	/**
	 * @param powerCondition the powerCondition to set
	 */
	public void setPowerCondition(String powerCondition) {
		this.powerCondition = powerCondition;
	}
}
