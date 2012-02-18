package saf.evaluators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import saf.Arena;

public class Bot {
	private String name;
	private int health;
	private int position;
	private Arena arena;
	private Behaviour alwaysBehaviour;
	private BehaviourActionType currentMoveActionType;
	private BehaviourActionType currentFightActionType;
	
	private final List<Characteristic> characteristics;
	private final List<Behaviour> behaviours;
	
	public Bot() {
		this.characteristics = new ArrayList<Characteristic>();
		this.behaviours = new ArrayList<Behaviour>();
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
		BehaviourCondition behaviourCondition = behaviour.getBehaviourCondition();
		
		if(behaviourCondition.isAlways()){
			alwaysBehaviour = behaviour;
		}else{
			this.behaviours.add(behaviour);
		};
	}

	public boolean hasHealth() {
		return health > 0;
	}

	public boolean lost() {
		return !hasHealth();
	}

	public void setArena(Arena iArena){
		arena = iArena;
	}
	
	public void setPosition(int iPosition) {
		position = iPosition;
	}
	
	public int getPosition() {
		return position;
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
		
		
		setCurrentActionTypes(opponent);
		doMoveAction();
		
		return new Attack(this);
	}
	
	public void changePosition(Integer positionChange) {
		this.setPosition(this.getPosition() + positionChange);		
	}
	
	public void defend(Attack attack) {
		if(attack.isDefensive()){
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
		this.health -= hitPoints;
	}
	
	private void setCurrentActionTypes(Bot opponent){
		Behaviour behaviour = this.getBehaviour(opponent);
		currentMoveActionType = behaviour.getMoveActionType();
		currentFightActionType = behaviour.getFigthActionType();
	}
	
	private void doMoveAction(){
		MoveActionIntelligence moveActionIntelligence = new MoveActionIntelligence(currentMoveActionType);
		if(arena.positionChangeAllowed(this, moveActionIntelligence)){
			this.changePosition(moveActionIntelligence.getPositionChange());
		}
	}
	
	public Behaviour getBehaviour(Bot opponent) {
		Random randomIndex= new Random();
		List<Behaviour> validBehaviours = getValidBehaviours(opponent);
		
		int validBehavioursSize = validBehaviours.size();
		
		if(validBehavioursSize == 0){
			return alwaysBehaviour;
		}
		
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
		
		return null;
	}
	
	private BehaviourConditionIntelligence getBehaviourConditionMap(Bot opponent) {
		int strengthDifference = this.getHealthDifference(opponent);
		int distance = this.getDistanceToOpponent(opponent);
		
		return new BehaviourConditionIntelligence(strengthDifference, distance);
	}

	private Integer getDistanceToOpponent(Bot opponent){
		return Math.abs(this.getPosition() - opponent.getPosition());
	}
	
	private int getHealthDifference(Bot opponent) {
		return this.health - opponent.getHealth();
	}
	
	private int getHealth() {
		return this.health;
	}

	private List<Characteristic> getCharacteristics() {
		return this.characteristics;
	}

	public Integer getFightActionStrength(FightActionIntelligence fightActionIntelligence) {
		String fightActionCharacteristicName = fightActionIntelligence.getFightActionAggressionPowerType();
		return CharacteristicIntelligence.getValueByCharacteristicsAndName(this.getCharacteristics(), fightActionCharacteristicName);
	}

}
