package saf.evaluators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Bot {
	private static final int MAX_PASSIVICITY = 5;
	private String name;
	private int health;
	private int position;
	private int fightActionDuration;
	private int speed;
	private int recoveryTime = 1;
	private int moveDirectionCorrection;
	
	private HashMap<String, Integer> fightActionCharacteristicCache;
	
	private BehaviourActionType currentMoveActionType;
	private BehaviourActionType currentFightActionType;
	
	private final List<Characteristic> characteristics;
	private final List<Behaviour> behaviours;
	private String color;
	private Integer rightWallPosition;
	private Integer leftWallPosition;
	private int passivityCount;
	
	@SuppressWarnings("serial")
	public Bot() {
		this.characteristics = new ArrayList<Characteristic>();
		this.behaviours = new ArrayList<Behaviour>();
		fightActionCharacteristicCache = new HashMap<String, Integer>(){};
		currentMoveActionType = MoveActionIntelligence.getDefaultActionType();
		currentFightActionType = FightActionIntelligence.getDefaultActionType();
		passivityCount = 0;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		this.characteristics.add(characteristic);
	}
	
	public void addBehaviour(Behaviour behaviour) {
		this.behaviours.add(behaviour);
	}

	public void init(){
		invokeFightActionCharacteristicCache();
		calculateSpeed();
	}
	
	public void setHealth(Integer value){
		health = value;
	}
	
	public void setMoveDirectionCorrection(Integer moveDirectionCorrection){
		this.moveDirectionCorrection = moveDirectionCorrection;
	}
	
	public boolean hasHealth() {
		return health > 0;
	}

	public boolean lost() {
		return !hasHealth();
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return position;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	public BehaviourActionType getCurrentMoveActionType(){
		return currentMoveActionType;
	}
	
	public BehaviourActionType getCurrentFightActionType(){
		return currentFightActionType;
	}

	public List<Behaviour> getBehaviours() {
		return this.behaviours;
	}

	public Attack attack(Bot opponent) {
		if(this.inFightAction() || lost()){
			setFightActionDuration(this.fightActionDuration - recoveryTime);
			return new Attack();
		}
		
		setCurrentActionTypes(opponent);
		doMoveAction(opponent);
		
		Attack attack = new Attack(this);
		
		doPassivityCheck(attack);
		if(isToPassive()){
			attack.beOffensive();
		}
		setFightActionDuration(speed);
		return attack;
	}

	private boolean isToPassive() {
		return passivityCount >= MAX_PASSIVICITY;
	}

	private void doPassivityCheck(Attack attack){
		passivityCount = attack.isDefensive() ? passivityCount + 1 : 0;
	}
	
	private void calculateSpeed() {
		speed = FightActionIntelligence.calculateSpeed(fightActionCharacteristicCache);
	}
	
	private boolean inFightAction(){
		return fightActionDuration > 0;
	}
	
	private void setFightActionDuration(int fightActionDuration){
		this.fightActionDuration = fightActionDuration;
	}
	
	public void changePosition(Integer positionChange) {
		positionChange *= moveDirectionCorrection;
		this.setPosition(this.getPosition() + positionChange);		
	}
	
	public void defend(Attack attack) {
		if(!attack.isAttacking() || attack.isDefensive()){
			return;
		}
		
		FightActionIntelligence fightActionIntelligence = new FightActionIntelligence(this.getCurrentFightActionType());
		if(attack.blocked(fightActionIntelligence)){
			return;
		}

		Integer hitPoints = attack.getStrength();
		
		takeHitPoints(hitPoints);
	}
	
	private void takeHitPoints(Integer hitPoints){
		health -= hitPoints;
	}
	
	private void setCurrentActionTypes(Bot opponent){
		Behaviour behaviour = this.getBehaviour(opponent);
		currentMoveActionType = behaviour.getMoveActionType();
		currentFightActionType = behaviour.getFigthActionType();
	}
	
	private void doMoveAction(Bot opponent){
		MoveActionIntelligence moveActionIntelligence = new MoveActionIntelligence(currentMoveActionType);
		FightActionIntelligence fightActionIntelligence = new FightActionIntelligence(currentFightActionType);
		if(positionChangeAllowed(moveActionIntelligence) && shouldExecuteMove(opponent, moveActionIntelligence, fightActionIntelligence)){
			this.changePosition(moveActionIntelligence.getPositionChange());
		}
	}
	
	private boolean shouldExecuteMove(Bot opponent, MoveActionIntelligence moveActionIntelligence, FightActionIntelligence fightActionIntelligence) {
		int distanceToOpponent = getDistanceToOpponent(opponent);
		if(fightActionIntelligence.isDefensive()){
			return moveActionIntelligence.isMovingAway(distanceToOpponent) && !moveActionIntelligence.isOutOfRange(distanceToOpponent);
		}else{
			return moveActionIntelligence.isTowardsAway(distanceToOpponent) && moveActionIntelligence.isOutOfRange(distanceToOpponent);
		}
	}

	private boolean positionChangeAllowed(MoveActionIntelligence moveActionIntelligence) {
		int positionChange = moveActionIntelligence.getPositionChange();
		int newPosition = position + positionChange;
		return  !(newPosition <= leftWallPosition) || !(newPosition >= rightWallPosition);
	}
	
	public void setRightWallPosition(Integer rightWallPosition){
		this.rightWallPosition = rightWallPosition;
	}

	public void setLeftWallPosition(Integer leftWallPosition){
		this.leftWallPosition = leftWallPosition;
	}
	
	public Behaviour getBehaviour(Bot opponent) {
		Random randomIndex= new Random();
		List<Behaviour> validBehaviours = getValidBehaviours(opponent);
		
		int validBehavioursSize = validBehaviours.size();
		
		int behaviourIndex = randomIndex.nextInt(validBehavioursSize);
		return validBehaviours.get(behaviourIndex);
	}
	
	private List<Behaviour> getValidBehaviours(Bot opponent) {
		BehaviourConditionIntelligence behaviourConditionMap = this.getBehaviourConditionMap(opponent);
		List<Behaviour> validBehaviours=  new ArrayList<Behaviour>();
		
		for (Behaviour behaviour : behaviours) {
			BehaviourCondition behaviorCondition = behaviour.getBehaviourCondition();
			if(behaviourConditionMap.IsValidFor(behaviorCondition)){
				validBehaviours.add(behaviour);
			}
		}
		
		return validBehaviours;
	}
	
	private BehaviourConditionIntelligence getBehaviourConditionMap(Bot opponent) {
		int strengthDifference = getHealthDifference(opponent);
		int distance = getDistanceToOpponent(opponent);
		
		return new BehaviourConditionIntelligence(strengthDifference, distance);
	}

	private Integer getDistanceToOpponent(Bot opponent){
		return Math.abs(this.getPosition() - opponent.getPosition());
	}
	
	private int getHealthDifference(Bot opponent) {
		return this.health - opponent.getHealth();
	}
	
	public int getHealth() {
		return this.health;
	}

	private List<Characteristic> getCharacteristics() {
		return this.characteristics;
	}

	public Integer getFightActionStrength(FightActionIntelligence fightActionIntelligence) {
		String fightActionCharacteristicName = fightActionIntelligence.getFightActionAggressionPowerType();
		return fightActionCharacteristicCache.get(fightActionCharacteristicName);
	}

	private void invokeFightActionCharacteristicCache(){
		List<String> attackPropertyNames = FightActionIntelligence.getAttackPropertyNames();
		for(String attackPropertyName : attackPropertyNames){
			resolveFightActionCharacteristicCache(attackPropertyName);
		}
	}

	private Integer resolveFightActionCharacteristicCache(String fightActionCharacteristicName) {
		Integer fightActionCharacteristic = CharacteristicIntelligence.getValueByCharacteristicsAndName(this.getCharacteristics(), fightActionCharacteristicName);
		fightActionCharacteristicCache.put(fightActionCharacteristicName, fightActionCharacteristic);
		return fightActionCharacteristic;
	}
}
