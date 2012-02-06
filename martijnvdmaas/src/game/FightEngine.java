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
	private final int START_DISTANCE = 50;
	private Random randomInt;
	private int distance;
	
	public FightEngine(Bots bots) {
		distance = START_DISTANCE;
		
		randomInt = new Random();
		 
		leftFighter = initializeFighter(bots.getFirstBot());
		rightFighter = initializeFighter(bots.getSecondBot());
	}

	private Fighter initializeFighter(Bot bot) {
		
		Fighter fighter = new Fighter(bot.getBotName());
		fighter.setCurrentAttack("punch_low");
		fighter.setBehaviours(bot.getBehaviours());

		//initializeFighterCharacteristics(leftFighter, bot.getCharacteristics());
		return leftFighter;
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
		Behaviour nextBehaviour = getNextBehaviour(getLeftFighter(), getRightFighter().getHealth());
		
		getRightFighter().setHealth(90);
		getLeftFighter().setHealth(50);
		setChanged();
		notifyObservers();
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
