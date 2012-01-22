package nl.uva.saf.test;

import java.util.ArrayList;
import java.util.List;

import nl.uva.saf.fdl.TreeValidator;
import nl.uva.saf.fdl.ValidationReport;
import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;

import org.junit.Before;
import org.junit.Test;

public class TreeValidatorTest {
	private TreeValidator validator;

	private ITreeNode createEmptyFighter() {
		List<ITreeNode> attributes = new ArrayList<ITreeNode>();
		ITreeNode tree = new Fighter("validatorTest", attributes);

		return tree;
	}

	@Before
	public void setUp() throws Exception {
		validator = new TreeValidator();
	}

	@Test
	public void treeLacksAlwaysBehaviourTest() {
		Fighter fighter = (Fighter) createEmptyFighter();
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
		Fighter fighter = (Fighter) createEmptyFighter();
		
		fighter.getAttributes().add(
				new Behaviour(
						new ConditionAlways(), 
						new Rule(
								new MoveChoice(
										new ArrayList<ITreeNode>()
										), 
								new FightAction("")
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
		Fighter fighter = (Fighter) createEmptyFighter();
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
