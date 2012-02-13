package game;

import elements.Behaviour;
import elements.Bot;
import elements.Bots;
import elements.Characteristic;
import elements.ConditionChoices;
import elements.ConditionGroup;
import game.fighter.Fighter;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

public class FightEngine extends Observable {
	private Fighter leftFighter;
	private Fighter rightFighter;
	private final int START_HORIZONTAL_DISTANCE = 50;
	private final int MAX_HORIZONTAL_DISTANCE = 200;
	private Random randomInt;
	private int distance;
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public FightEngine(Bots bots) {
		distance = START_HORIZONTAL_DISTANCE;
		
		randomInt = new Random();
		 
		leftFighter = initializeFighter(bots.getFirstBot());
		rightFighter = initializeFighter(bots.getSecondBot());
	}

	private Fighter initializeFighter(Bot bot) {
		
		Fighter fighter = new Fighter(bot.getBotName());
		fighter.setCurrentAttack("stand");
		fighter.setBehaviours(bot.getBehaviours());

		initializeFighterCharacteristics(fighter, bot.getCharacteristics());
		return fighter;
	}

	private void initializeFighterCharacteristics(Fighter safFighter, ArrayList<Characteristic> characteristics) {
		for (Characteristic characteristic : characteristics) {

			switch(characteristic.getName())
			{
			
			case "punchReach" : 
				safFighter.setPunchReach(characteristic.getValue());
				break;
			case "punchPower" : 
				safFighter.setPunchPower(characteristic.getValue());
				break;
			case "kickReach" : 
				safFighter.setKickReach(characteristic.getValue());
				break;
			case "kickPower" : 
				safFighter.setKickPower(characteristic.getValue());
				break;
			}
			
		}
		
		safFighter.setHealth(100);
		safFighter.setWeight((safFighter.getPunchPower() + safFighter.getKickPower()) /2);
		safFighter.setHeight((safFighter.getPunchReach() + safFighter.getKickReach()) /2);
		safFighter.setSpeed((int) (0.5 * (safFighter.getHeight()- safFighter.getWeight())));
	}
	
	public Fighter getLeftFighter() {
		return leftFighter;
	}

	public String getLeftCurrentAttack() {
		return leftFighter.getCurrentAttack();
	}

	public String getRightCurrentAttack() {
		return rightFighter.getCurrentAttack();
	}

	public void setFirstFighter(Fighter firstFighter) {
		this.leftFighter = firstFighter;
	}

	public Fighter getRightFighter() {
		return rightFighter;
	}

	public void setSecondFighter(Fighter secondFighter) {
		this.rightFighter = secondFighter;
	}

	public int getLeftHealth() {
		return getLeftFighter().getHealth();
	}
	
	public int getRightHealth() {
		return getRightFighter().getHealth();
	}

	public void doStep() {
		Behaviour nextLeftBehaviour = getNextBehaviour(getLeftFighter(), getRightFighter().getHealth());
		Behaviour nextRightBehaviour = getNextBehaviour(getRightFighter(), getLeftFighter().getHealth());

		ArrayList<String> leftAttackChoices = nextLeftBehaviour.getAttackChoices();
		ArrayList<String> rightAttackChoices = nextRightBehaviour.getAttackChoices();
		
		ArrayList<String> leftMoveChoices = nextLeftBehaviour.getMoveChoices();
		ArrayList<String> rightMoveChoices = nextRightBehaviour.getMoveChoices();
		

		int leftRandomIndex = randomInt.nextInt(leftAttackChoices.size());
		int rightRandomIndex = randomInt.nextInt(rightAttackChoices.size());
		
		getLeftFighter().setCurrentAttack(leftAttackChoices.get(leftRandomIndex));
		getRightFighter().setCurrentAttack(rightAttackChoices.get(rightRandomIndex));

		getLeftFighter().setCurrentMove(leftMoveChoices.get(0));
		getRightFighter().setCurrentMove(rightMoveChoices.get(0));

		int leftInflictedDamage = inflictAttack(leftFighter, rightFighter);
		int rightInflictedDamage = inflictAttack(rightFighter, leftFighter);

		int currentLeftHealth = getLeftFighter().getHealth() - rightInflictedDamage;
		int currentRightHealth = getRightFighter().getHealth() - leftInflictedDamage;
		
		if(currentLeftHealth <= 0 || currentRightHealth <= 0) {
			System.out.println("stop");
		}

		makeMove(leftFighter);
		makeMove(rightFighter);

		getLeftFighter().setHealth(currentLeftHealth);
		getRightFighter().setHealth(currentRightHealth);
		
		setChanged();
		notifyObservers();
	}
	
	private void makeMove(Fighter movingFighter) {
		switch(movingFighter.getCurrentMove())
		{
		case "jump":
			break;
		case "crouch":
			break;
		case "stand": //do nothing
			break;
		case "run_towards":
			distance = ((distance - 20) < 0) ? 0 : distance - 20;
			break;
		case "run_away":
			distance = ((distance + 20) > MAX_HORIZONTAL_DISTANCE) ? MAX_HORIZONTAL_DISTANCE : distance + 20;
		break;	
		case "walk_towards":
			distance = ((distance - 10) < 0) ? 0 : distance - 10;
			break;
		case "walk_away":
			distance = ((distance + 10) > MAX_HORIZONTAL_DISTANCE) ? MAX_HORIZONTAL_DISTANCE : distance + 10;
			break;
		}
	}

	public int inflictAttack(Fighter attackingFighter, Fighter attackedFighter) {
		int damageAmount = 0;
		String attack = attackingFighter.getCurrentAttack();
		
		switch(attack) {
		case "block_low":
			damageAmount = 0;
			break;
		case "block_high":
			damageAmount = 0;
			break;
		case "punch_low":
			if(!attackedFighter.getCurrentAttack().equals("block_low")) 
			{
				damageAmount = attackingFighter.getPunchPower() +5 ;
			}
			break;
		case "punch_high":
			if(!attackedFighter.getCurrentAttack().equals("block_high"))
			{
				damageAmount = attackingFighter.getPunchPower() +5 ;
			}
			break;
		case "kick_low":
			if(!attackedFighter.getCurrentAttack().equals("block_low"))
			{
				damageAmount = attackingFighter.getKickPower() +5 ;
			}
			break;
		case "kick_high":
			if(!attackedFighter.getCurrentAttack().equals("block_high")) 
			{
				damageAmount = attackingFighter.getKickPower() +5 ;
			}
			break;
		}
		System.out.println(attackingFighter.getCurrentAttack() + damageAmount);
		return damageAmount;
	}

	private Behaviour getNextBehaviour(Fighter currentFighter, int opponentHealth) {
		
		ArrayList<Behaviour> possibleBehaviours = new ArrayList<Behaviour>();
		
		for(Behaviour behaviour : currentFighter.getBehaviours())
		{
			if(conditionChoiceApplies(currentFighter, behaviour.getConditionChoices(), opponentHealth, distance))
			{
				possibleBehaviours.add(behaviour);
			}
		}
		
		int randomIndex = randomInt.nextInt(possibleBehaviours.size());
		
		return possibleBehaviours.get(randomIndex);
	}
	
	private boolean conditionChoiceApplies(Fighter currentFighter, ConditionChoices choices, int opponentHealth, int playerDistance) 
	{
		boolean applicableConditionChoice = false;
		for(ConditionGroup conditionGroup : choices.getConditionGroups()) 
		{
			boolean applicableCondition = true;
			for(String condition : conditionGroup.getConditionTypes())
			{
				conditionApplies(currentFighter, condition, opponentHealth, playerDistance);
			}
			if(applicableCondition) applicableConditionChoice = true;
		}
		return applicableConditionChoice;
	}
	
	private boolean conditionApplies(Fighter currentFighter, String condition, int opponentHealth, int playerDistance) 
	{
		switch(condition) 
		{
		case "stronger":
			if((currentFighter.getHealth() - opponentHealth) < 20) return true;
			break;
		case "weaker":
			if((opponentHealth - currentFighter.getHealth()) < 20) return true;
			break;
		case "much_stronger":
			if((currentFighter.getHealth() - opponentHealth) < 50) return true;
			break;
		case "much_weaker":
			if((opponentHealth - currentFighter.getHealth()) < 50) return true;
			break;
		case "even":
			if(opponentHealth == currentFighter.getHealth()) return true;
			break;
		case "near":
			if(playerDistance > 10) return true;
			break;
		case "far":
			if(playerDistance < 50) return true;
			break;
		case "always":
			return true;
		}
		
		return false;
	}
	
	public void reStart() {
	}
}
