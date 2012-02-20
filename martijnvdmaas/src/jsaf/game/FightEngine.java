package jsaf.game;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import jsaf.astelements.Behaviour;
import jsaf.astelements.Bot;
import jsaf.astelements.Bots;
import jsaf.astelements.Characteristic;
import jsaf.astelements.ConditionChoices;
import jsaf.astelements.ConditionGroup;
import jsaf.constants.SAFConstants;
import jsaf.game.fighter.Fighter;
import jsaf.logger.ErrorLog;


import sun.applet.Main;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class FightEngine extends Observable implements SAFConstants
{
	private Fighter leftFighter;
	private Fighter rightFighter;

	private Random randomInt;
	private int distance;
	private boolean isPlaying;
	private String winner = "";

	public FightEngine(Bots bots)
	{
		distance = START_HORIZONTAL_DISTANCE;
		isPlaying = true;
		randomInt = new Random();

		leftFighter = initializeFighter(bots.getLeftBot());
		rightFighter = initializeFighter(bots.getRightBot());
	}

	private Fighter initializeFighter(Bot bot)
	{

		Fighter fighter = new Fighter(bot.getBotName());
		fighter.setCurrentAttack(ATTACK_TYPE_STAND);
		fighter.setBehaviours(bot.getBehaviours());

		initializeFighterCharacteristics(fighter, bot.getCharacteristics());
		return fighter;
	}

	private void initializeFighterCharacteristics(Fighter safFighter, List<Characteristic> characteristics)
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
			Behaviour nextLeftBehaviour = getNextRandomApplicableBehaviour(getLeftFighter(), getRightFighter().getHealth());
			Behaviour nextRightBehaviour = getNextRandomApplicableBehaviour(getRightFighter(), getLeftFighter().getHealth());

			setNextBehaviour(leftFighter, nextLeftBehaviour);
			setNextBehaviour(rightFighter, nextRightBehaviour);

			int leftInflictedDamage = calculateDamageBasedOnCurrentAttacks(leftFighter, rightFighter);
			int rightInflictedDamage = calculateDamageBasedOnCurrentAttacks(rightFighter, leftFighter);

			int currentLeftHealth = getLeftFighter().getHealth() - rightInflictedDamage;
			int currentRightHealth = getRightFighter().getHealth() - leftInflictedDamage;

			if (currentLeftHealth <= 0 || currentRightHealth <= 0)
			{
				setPlaying(false);
				if (currentLeftHealth < currentRightHealth)
				{
					getRightFighter().setCurrentAttack(ATTACK_TYPE_WINNER);
					getLeftFighter().setCurrentAttack(ATTACK_TYPE_DEAD);
					setWinner(getRightFighter().getFighterName());
				}
				else
				{

					getRightFighter().setCurrentAttack(ATTACK_TYPE_DEAD);
					getLeftFighter().setCurrentAttack(ATTACK_TYPE_WINNER);
					setWinner(getLeftFighter().getFighterName());
				}
			}

			calculatePlayerDistanceBasedOnMove(leftFighter);
			calculatePlayerDistanceBasedOnMove(rightFighter);

			getLeftFighter().setHealth(currentLeftHealth);
			getRightFighter().setHealth(currentRightHealth);

			setChanged();
			notifyObservers();
		}
	}

	public void playFightSound()
	{
		File soundDirectory = new File(jsaf.main.Main.getRelativeProjectPath() + "sounds");
		File[] soundFiles = soundDirectory.listFiles();

		int randomSoundIndex = (int) (Math.random() * soundFiles.length);

		playSound(soundFiles[randomSoundIndex].getAbsolutePath());
	}

	private void setNextBehaviour(Fighter fighter, Behaviour inflictedBehaviour)
	{
		ArrayList<String> attackChoices = new ArrayList<>(inflictedBehaviour.getAttackChoices());
		ArrayList<String> moveChoices = new ArrayList<>(inflictedBehaviour.getMoveChoices());

		int randomAttackIndex = randomInt.nextInt(attackChoices.size());
		int randomMoveIndex = randomInt.nextInt(moveChoices.size());

		fighter.setCurrentAttack(attackChoices.get(randomAttackIndex));
		fighter.setCurrentMove(moveChoices.get(randomMoveIndex));
	}

	private void calculatePlayerDistanceBasedOnMove(Fighter movingFighter)
	{
		switch (movingFighter.getCurrentMove())
		{
		case MOVE_TYPE_CROUCH:
			distance = ((distance - CROUCH_STEP_DISTANCE) < 0) ? 0 : distance - CROUCH_STEP_DISTANCE;
			break;
		case MOVE_TYPE_RUN_TOWARDS:
			distance = ((distance - RUN_STEP_DISTANCE) < 0) ? 0 : distance - RUN_STEP_DISTANCE;
			break;
		case MOVE_TYPE_RUN_AWAY:
			distance = ((distance + RUN_STEP_DISTANCE) > MAX_HORIZONTAL_DISTANCE) ? MAX_HORIZONTAL_DISTANCE : distance + RUN_STEP_DISTANCE;
			break;
		case MOVE_TYPE_WALK_TOWARDS:
			distance = ((distance - WALK_STEP_DISTANCE) < 0) ? 0 : distance - WALK_STEP_DISTANCE;
			break;
		case MOVE_TYPE_WALK_AWAY:
			distance = ((distance + WALK_STEP_DISTANCE) > MAX_HORIZONTAL_DISTANCE) ? MAX_HORIZONTAL_DISTANCE : distance + WALK_STEP_DISTANCE;
			break;
		}
	}

	public int calculateDamageBasedOnCurrentAttacks(Fighter attackingFighter, Fighter attackedFighter)
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

	private Behaviour getNextRandomApplicableBehaviour(Fighter currentFighter, int opponentHealth)
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
			boolean isApplicableCondition = true;
			for (String condition : conditionGroup.getConditionTypes())
			{
				if (!conditionApplies(currentFighter, condition, opponentHealth, playerDistance))
				{
					isApplicableCondition = false;
				}
			}

			if (isApplicableCondition) applicableConditionChoice = true;
		}
		return applicableConditionChoice;
	}

	private boolean conditionApplies(Fighter currentFighter, String condition, int opponentHealth, int playerDistance)
	{
		switch (condition)
		{
		case CONDITION_TYPE_STRONGER:
			if (currentFighter.getHealth() > opponentHealth) return true;
			break;
		case CONDITION_TYPE_WEAKER:
			if (opponentHealth < currentFighter.getHealth()) return true;
			break;
		case CONDITION_TYPE_MUCHSTRONGER:
			if (currentFighter.getHealth() > (opponentHealth + MUCH_WEAKER_AMOUNT)) return true;
			break;
		case CONDITION_TYPE_MUCHWEAKER:
			if (opponentHealth > (currentFighter.getHealth() + MUCH_WEAKER_AMOUNT)) return true;
			break;
		case CONDITION_TYPE_EVEN:
			if (opponentHealth == currentFighter.getHealth()) return true;
			break;
		case CONDITION_TYPE_NEAR:
			if (playerDistance >= SHORT_DISTANCE) return true;
			break;
		case CONDITION_TYPE_FAR:
			if (playerDistance < LONG_DISTANCE) return true;
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
		getLeftFighter().setCurrentAttack(ATTACK_TYPE_STAND);
		getRightFighter().setCurrentAttack(ATTACK_TYPE_STAND);
		setPlaying(true);

		setChanged();
		notifyObservers();
	}

	public static synchronized void playSound(final String url)
	{
		InputStream in;
		try
		{
			in = new FileInputStream(url);
			AudioStream as = new AudioStream(in);

			AudioPlayer.player.start(as);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			new ErrorLog(e.getMessage());
		}
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
