package nl.uva.saf.test;

import java.util.ArrayList;

import nl.uva.saf.fdl.TreeValidator;
import nl.uva.saf.fdl.ValidationReport;
import nl.uva.saf.fdl.ast.Action;
import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.FightChoice;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.FighterAttribute;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;

import org.junit.Before;
import org.junit.Test;

public class TreeValidatorTest {
	private TreeValidator validator;
	private Fighter fighter;

	private ITreeNode createEmptyFighter() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		ITreeNode tree = new Fighter("validatorTest", attributes);

		return tree;
	}

	@Before
	public void setUp() throws Exception {
		validator = new TreeValidator();
		fighter = (Fighter) createEmptyFighter();
	}

	@Test
	public void treeLacksAlwaysBehaviourTest() {		
		ValidationReport report = validator.validate(fighter);

		boolean containsAlwaysError = false;
		for (String error : report.getErrors()) {
			if (error.equals("\"always\" behaviour condition not specified.")) {
				containsAlwaysError = true;
				break;
			}
		}

		assert (containsAlwaysError);
	}

	@Test
	public void emptyChoiceClauseTest() {
		ArrayList<Action> fightChoice = new ArrayList<Action>();
		fightChoice.add(new FightAction("kick_low"));
		
		fighter.getAttributes().add(
				new Behaviour(
						new ConditionAlways(), 
						new Rule(
								new MoveChoice(
										new ArrayList<Action>()
										), 
								new FightChoice(
										fightChoice
										)
								)
						)
				);
		
		ValidationReport report = validator.validate(fighter);

		boolean containsEmptyChoiceError = false;
		for (String error : report.getErrors()) {
			if (error.equals("Choice clause contains no choices")) {
				containsEmptyChoiceError = true;
				break;
			}
		}

		assert (containsEmptyChoiceError);
	}
	
	@Test
	public void characteristicValueOutOfBoundsTest() {
		Characteristic testCharacteristic = new Characteristic("kickPower", 11);
		fighter.getAttributes().add(testCharacteristic);
		
		ValidationReport report = validator.validate(fighter);
		
		boolean containsOutOfBoundsError = false;
		for (String error : report.getErrors()) {
			if (error.endsWith("out of bounds (range: 1-10)")) {
				containsOutOfBoundsError = true;
				break;
			}
		}
		
		assert(containsOutOfBoundsError);
		
		testCharacteristic.setValue(0);
		report = validator.validate(fighter);
		
		containsOutOfBoundsError = false;
		for (String error : report.getErrors()) {
			if (error.endsWith("out of bounds (range: 1-10)")) {
				containsOutOfBoundsError = true;
				break;
			}
		}	
		
		assert(containsOutOfBoundsError);
	}
	
}
