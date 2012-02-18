package game;

import game.fighter.Fighter;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

import constants.SAFConstants;

import astelements.Behaviour;
import astelements.Bot;
import astelements.Bots;
import astelements.Characteristic;
import astelements.ConditionChoices;
import astelements.ConditionGroup;

public class FightEngine extends Observable implements SAFConstants
{
	private final int START_HORIZONTAL_DISTANCE = 50;
	private final int MAX_HORIZONTAL_DISTANCE = 200;
	private final int MAX_HEALTH = 100;

	private Fighter leftFighter;
	private Fighter rightFighter;

	private Random randomInt;
	private int distance;
	private boolean isPlaying;
	private String winner;

	public FightEngine(Bots bots)
	{
		distance = START_HORIZONTAL_DISTANCE;
		isPlaying = true;
		randomInt = new Random();

		leftFighter = initializeFighter(bots.getFirstBot());
		rightFighter = initializeFighter(bots.getSecondBot());
	}

	private Fighter initializeFighter(Bot bot)
	{

		Fighter fighter = new Fighter(bot.getBotName());
		fighter.setCurrentAttack(ATTACK_TYPE_STAND);
		fighter.setBehaviours(bot.getBehaviours());

		initializeFighterCharacteristics(fighter, bot.getCharacteristics());
		return fighter;
	}

	private void initializeFighterCharacteristics(Fighter safFighter, ArrayList<Characteristic> characteristics)
	{
		for (Characteristic characteristic : characteristics)
		{

			switch (characteristic.getName())
			{

			case CHARACTERISTIC_TYPE_PUNCH_REACH:
				safFighter.setPunchReach(characteristic.getValue());
				break;
			case CHARACTERISTIC_TYPE_PUNCH_POWER:
				safFighter.setPunchPower(characteristic.getValue());
				break;
			case CHARACTERISTIC_TYPE_KICK_REACH:
				safFighter.setKickReach(characteristic.getValue());
				break;
			case CHARACTERISTIC_TYPE_KICK_POWER:
				safFighter.setKickPower(characteristic.getValue());
				break;
			}

		}

		safFighter.setHealth(MAX_HEALTH);
		safFighter.setWeight((safFighter.getPunchPower() + safFighter.getKickPower()) / 2);
		safFighter.setHeight((safFighter.getPunchReach() + safFighter.getKickReach()) / 2);
		safFighter.setSpeed((int) (0.5 * (safFighter.getHeight() - safFighter.getWeight())));
	}

	public void doStep()
	{
		if (isPlaying)
		{
			Behaviour nextLeftBehaviour = getNextBehaviour(getLeftFighter(), getRightFighter().getHealth());
			Behaviour nextRightBehaviour = getNextBehaviour(getRightFighter(), getLeftFighter().getHealth());
			
			setNextBehaviour(leftFighter, nextLeftBehaviour);
			setNextBehaviour(rightFighter, nextRightBehaviour);

			int leftInflictedDamage = inflictAttack(leftFighter, rightFighter);
			int rightInflictedDamage = inflictAttack(rightFighter, leftFighter);

			int currentLeftHealth 	= getLeftFighter().getHealth() 	- rightInflictedDamage;
			int currentRightHealth 	= getRightFighter().getHealth() - leftInflictedDamage;

			if (currentLeftHealth <= 0 || currentRightHealth <= 0)
			{
				setPlaying(false);
				if (currentLeftHealth < currentRightHealth)
				{
					setWinner(getRightFighter().getFighterName());
				}
				else
				{
					setWinner(getLeftFighter().getFighterName());
				}
			}
			
			makeMove(leftFighter);
			makeMove(rightFighter);

			getLeftFighter().setHealth(currentLeftHealth);
			getRightFighter().setHealth(currentRightHealth);

			setChanged();
			notifyObservers();
		}
	}

	private void setNextBehaviour(Fighter fighter, Behaviour inflictedBehaviour)
	{
		ArrayList<String> attackChoices = inflictedBehaviour.getAttackChoices();
		ArrayList<String> moveChoices 	= inflictedBehaviour.getMoveChoices();

		int randomAttackIndex 	= randomInt.nextInt(attackChoices.size());
		int randomMoveIndex 	= randomInt.nextInt(moveChoices.size());

		fighter.setCurrentAttack(attackChoices.get(randomAttackIndex));
		fighter.setCurrentMove(moveChoices.get(randomMoveIndex));
	}

	private void makeMove(Fighter movingFighter)
	{
		switch (movingFighter.getCurrentMove())
		{
		case MOVE_TYPE_JUMP:
			break;
		case MOVE_TYPE_CROUCH:
			break;
		case MOVE_TYPE_STAND: // do nothing
			break;
		case MOVE_TYPE_RUN_TOWARDS:
			distance = ((distance - 20) < 0) ? 0 : distance - 20;
			break;
		case MOVE_TYPE_RUN_AWAY:
			distance = ((distance + 20) > MAX_HORIZONTAL_DISTANCE) ? MAX_HORIZONTAL_DISTANCE : distance + 20;
			break;
		case MOVE_TYPE_WALK_TOWARDS:
			distance = ((distance - 10) < 0) ? 0 : distance - 10;
			break;
		case MOVE_TYPE_WALK_AWAY:
			distance = ((distance + 10) > MAX_HORIZONTAL_DISTANCE) ? MAX_HORIZONTAL_DISTANCE : distance + 10;
			break;
		}
	}

	public int inflictAttack(Fighter attackingFighter, Fighter attackedFighter)
	{
		int damageAmount = 0;
		String attack = attackingFighter.getCurrentAttack();

		switch (attack)
		{
		case ATTACK_TYPE_BLOCK_LOW:
			damageAmount = 0;
			break;
		case ATTACK_TYPE_BLOCK_HIGH:
			damageAmount = 0;
			break;
		case ATTACK_TYPE_PUNCH_LOW:
			if (!attackedFighter.getCurrentAttack().equals(ATTACK_TYPE_BLOCK_LOW))
			{
				damageAmount = attackingFighter.getPunchPower();
			}
			break;
		case ATTACK_TYPE_PUNCH_HIGH:
			if (!attackedFighter.getCurrentAttack().equals(ATTACK_TYPE_BLOCK_HIGH))
			{
				damageAmount = attackingFighter.getPunchPower();
			}
			break;
		case ATTACK_TYPE_KICK_LOW:
			if (!attackedFighter.getCurrentAttack().equals(ATTACK_TYPE_BLOCK_LOW))
			{
				damageAmount = attackingFighter.getKickPower();
			}
			break;
		case ATTACK_TYPE_KICK_HIGH:
			if (!attackedFighter.getCurrentAttack().equals(ATTACK_TYPE_BLOCK_HIGH))
			{
				damageAmount = attackingFighter.getKickPower();
			}
			break;
		}
		
		return damageAmount;
	}

	private Behaviour getNextBehaviour(Fighter currentFighter, int opponentHealth)
	{
		ArrayList<Behaviour> possibleBehaviours = new ArrayList<Behaviour>();

		for (Behaviour behaviour : currentFighter.getBehaviours())
		{
			if (conditionChoiceApplies(currentFighter, behaviour.getConditionChoices(), opponentHealth, distance))
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
		for (ConditionGroup conditionGroup : choices.getConditionGroups())
		{
			boolean applicableCondition = true;
			for (String condition : conditionGroup.getConditionTypes())
			{
				conditionApplies(currentFighter, condition, opponentHealth, playerDistance);
			}
			if (applicableCondition) applicableConditionChoice = true;
		}
		return applicableConditionChoice;
	}

	private boolean conditionApplies(Fighter currentFighter, String condition, int opponentHealth, int playerDistance)
	{
		switch (condition)
		{
		case CONDITION_TYPE_STRONGER:
			if ((currentFighter.getHealth() - opponentHealth) < 20) return true;
			break;
		case CONDITION_TYPE_WEAKER:
			if ((opponentHealth - currentFighter.getHealth()) < 20) return true;
			break;
		case CONDITION_TYPE_MUCHSTRONGER:
			if ((currentFighter.getHealth() - opponentHealth) < 50) return true;
			break;
		case CONDITION_TYPE_MUCHWEAKER:
			if ((opponentHealth - currentFighter.getHealth()) < 50) return true;
			break;
		case CONDITION_TYPE_EVEN:
			if (opponentHealth == currentFighter.getHealth()) return true;
			break;
		case CONDITION_TYPE_NEAR:
			if (playerDistance > 10) return true;
			break;
		case CONDITION_TYPE_FAR:
			if (playerDistance < 50) return true;
			break;
		case CONDITION_TYPE_ALWAYS:
			return true;
		}

		return false;
	}

	/* Reinitializes the game: */
	public void reStart()
	{
		setLeftHealth(MAX_HEALTH);
		setRightHealth(MAX_HEALTH);
		setPlaying(true);

		setChanged();
		notifyObservers();
	}
	
	/* Getters and Setters: */

	public Fighter getLeftFighter()
	{
		return leftFighter;
	}

	public String getLeftCurrentAttack()
	{
		return leftFighter.getCurrentAttack();
	}

	public String getRightCurrentAttack()
	{
		return rightFighter.getCurrentAttack();
	}

	public void setFirstFighter(Fighter firstFighter)
	{
		this.leftFighter = firstFighter;
	}

	public Fighter getRightFighter()
	{
		return rightFighter;
	}

	public void setSecondFighter(Fighter secondFighter)
	{
		this.rightFighter = secondFighter;
	}

	public int getLeftHealth()
	{
		return getLeftFighter().getHealth();
	}

	public void setLeftHealth(int health)
	{
		getLeftFighter().setHealth(health);
	}

	public int getRightHealth()
	{
		return getRightFighter().getHealth();
	}

	public void setRightHealth(int health)
	{
		getRightFighter().setHealth(health);
	}

	public String getLeftPlayerName()
	{
		return getLeftFighter().getFighterName();
	}

	public String getRightPlayerName()
	{
		return getRightFighter().getFighterName();
	}

	public int getDistance()
	{
		return distance;
	}

	public void setDistance(int distance)
	{
		this.distance = distance;
	}

	public boolean isPlaying()
	{
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying)
	{
		this.isPlaying = isPlaying;
	}

	public String getWinner()
	{
		return winner;
	}

	public void setWinner(String winner)
	{
		this.winner = winner;
	}
}
