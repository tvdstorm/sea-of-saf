package game;

import ast.*;
import ast.Action.Choice;

import java.util.Random;
import constants.CorrectValues;

public class GameState implements CorrectValues {

	private FighterState fighter1;
	private FighterState fighter2;

	private final String initialPicLeft = "pics/baronesse/HIP1.png";
	private final String initialPicRight = "pics/bred/JUMP01.png";

	private Random generator;
	private int randomChoice, random01;

	public GameState(Bot bot1, Bot bot2) {

		this.fighter1 = new FighterState(bot1, START_LEFT);
		fighter1.setSide(START_LEFT);
		fighter1.setCurrentPic(initialPicLeft);
		this.fighter2 = new FighterState(bot2, START_RIGHT);
		fighter2.setSide(START_RIGHT);
		fighter2.setCurrentPic(initialPicRight);
		this.generator = new Random();
	}

	public FighterState getFighter1() {
		return fighter1;
	}

	public void setFighter1(FighterState fighter1) {
		this.fighter1 = fighter1;
	}

	public FighterState getFighter2() {
		return fighter2;
	}

	public void setFighter2(FighterState fighter2) {
		this.fighter2 = fighter2;
	}

	public boolean isValidMove(BehaviourItem b) {

		if (b.getCondition().getType().equals("always")
				|| b.getCondition().getType().equals("weaker")
				|| b.getCondition().getType().equals("stronger")
				|| b.getCondition().getType().equals("muchWeaker")
				|| b.getCondition().getType().equals("muchStronger"))
			return true;

		if ((b.getCondition().getType().equals("near"))
				&& (Math.abs(fighter2.getPosition() - fighter1.getPosition()) <= NEAR)) {
			return true;
		} else if ((b.getCondition().getType().equals("far"))
				&& (Math.abs(fighter2.getPosition() - fighter1.getPosition()) > NEAR)) {
			return true;
		} else {
			return false;
		}

	}

	private BehaviourItem generateMove(Fighter fighter) {

		randomChoice = this.generator.nextInt(fighter.getB()
				.getBehaviourItems().size());
		BehaviourItem newMove = fighter.getB().getBehaviourItems()
				.get(randomChoice);
		return newMove;

	}

	public BehaviourItem getNewMove(Fighter fighter) {

		/* Check move */
		BehaviourItem newMove = generateMove(fighter);

		/* Make sure conditions are met before making a move */

		while (!isValidMove(newMove)) {
			newMove = generateMove(fighter);
		}

		return newMove;
	}

	public void updateHealth(int choiceType, int side) {

		if (Math.abs(fighter1.getPosition() - fighter2.getPosition()) <= NEAR) {
			if (side == LEFT) {
				fighter2.setHealth(fighter2.getHealth()
						- fighter1.getDamageLevels().getStrengths()
								.get(choiceType).getStrengthValue());

			} else {
				fighter1.setHealth(fighter1.getHealth()
						- fighter2.getDamageLevels().getStrengths()
								.get(choiceType).getStrengthValue());

			}
		}
	}

	public void updatePositionValue(int choiceType, int side) {

		switch (choiceType) {
		case JUMP:
			break;
		case CROUCH:
			break;
		case STAND:
			break;
		case RUN_TOWARDS:
			if (side == LEFT) {
				if (fighter1.getPosition() <= RIGHT_SAFETY_BORDER_RUN) {
					if (fighter1.getPosition() + RUN_INC <= fighter2
							.getPosition())
						fighter1.setPosition(fighter1.getPosition() + RUN_INC);
				}
			} else {
				if (fighter2.getPosition() >= LEFT_SAFETY_BORDER_RUN) {
					if (fighter2.getPosition() - RUN_INC >= fighter1
							.getPosition())
						fighter2.setPosition(fighter2.getPosition() - RUN_INC);

				}
			}
			break;
		case RUN_AWAY:
			if (side == LEFT) {
				if (fighter1.getPosition() >= LEFT_SAFETY_BORDER_RUN) {
					fighter1.setPosition(fighter1.getPosition() - RUN_INC);

				}
			} else {
				if (fighter2.getPosition() <= RIGHT_SAFETY_BORDER_RUN) {
					fighter2.setPosition(fighter2.getPosition() + RUN_INC);

				}
			}
			break;
		case WALK_TOWARDS:
			if (side == LEFT) {
				if (fighter1.getPosition() <= RIGHT_SAFETY_BORDER_WALK) {
					if (fighter1.getPosition() + WALK_INC <= fighter2
							.getPosition())
						fighter1.setPosition(fighter1.getPosition() + WALK_INC);

				}
			} else {
				if (fighter2.getPosition() >= LEFT_SAFETY_BORDER_WALK) {
					if (fighter2.getPosition() - WALK_INC >= fighter1
							.getPosition())
						fighter2.setPosition(fighter2.getPosition() - WALK_INC);

				}
			}
			break;
		case WALK_AWAY:
			if (side == LEFT) {
				if (fighter1.getPosition() >= LEFT_SAFETY_BORDER_WALK) {
					fighter1.setPosition(fighter1.getPosition() - WALK_INC);

				}
			} else {
				if (fighter2.getPosition() <= RIGHT_SAFETY_BORDER_WALK) {
					fighter2.setPosition(fighter2.getPosition() + WALK_INC);

				}
			}
			break;

		}
	}

	public void updateFighterValues(FighterState fighter, Choice choice,
			int flag, int side) {

		updatePositionValue(choice.getChoiceType(), side);
		updatePic(fighter, flag, choice.getChoiceType(), side);
		if (flag == ATTACK_TYPE)
			updateHealth(choice.getChoiceType(), side);

	}

	public void updateGameValues(FighterState fighter, Action action, int side) {

		/* Update distance & position according to new move, current distance */
		/* Move type, one choice */
		if (action.getType() == CorrectValues.SINGLE) {

			updateFighterValues(fighter, action.getChoice1(), action.getFlag(),
					side);

		}

		/* Move type, 2 choices */
		else {

			random01 = generator.nextInt(1);
			switch (random01) {
			case 0:

				updateFighterValues(fighter, action.getChoice1(),
						action.getFlag(), side);
				break;

			case 1:

				updateFighterValues(fighter, action.getChoice2(),
						action.getFlag(), side);

				break;

			}
		}

	}

	public void updatePic(FighterState fighter, int flag, int choiceType,
			int side) {

		switch (side) {
		case LEFT:
			switch (flag) {
			case CorrectValues.MOVE_TYPE:
				fighter.setCurrentPic(CorrectValues.movesPicturesLeft
						.get(choiceType));

			case CorrectValues.ATTACK_TYPE:
				fighter.setCurrentPic(CorrectValues.attacksPicturesLeft
						.get(choiceType));

			}
			break;

		case RIGHT:
			switch (flag) {
			case CorrectValues.MOVE_TYPE:
				fighter.setCurrentPic(CorrectValues.movesPicturesRight
						.get(choiceType));

			case CorrectValues.ATTACK_TYPE:
				fighter.setCurrentPic(CorrectValues.attacksPicturesRight
						.get(choiceType));

			}
			break;

		}
	}

	public void fighterTurn(FighterState fighter, int side) {

		fighter.setCurrentAction(this.getNewMove(fighter));
		updateGameValues(fighter, fighter.getCurrentAction().getLeft(), side);
		updateGameValues(fighter, fighter.getCurrentAction().getRight(), side);

	}

	public void makeGameUpdate() {

		fighterTurn(fighter1, LEFT);
		fighterTurn(fighter2, RIGHT);
	}
}
