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
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;

import org.junit.Test;

public class TreeValidatorTest {
	private TreeValidator validator;

	@Test
	public void treeLacksAlwaysBehaviourTest() {	
		Fighter fighter = new Fighter("fighter", new ArrayList<FighterAttribute>());
		
		validator = new TreeValidator(fighter);
		ValidationReport report = validator.validate();

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
		ArrayList<Action> fightChoices = new ArrayList<Action>();
		fightChoices.add(new FightAction("kick_low"));		
		ArrayList<FighterAttribute> fighterAttributes = new ArrayList<FighterAttribute>();
		fighterAttributes.add(new Behaviour(new ConditionAlways(), new Rule(new MoveChoice(new ArrayList<Action>()), new FightChoice(fightChoices))));
		Fighter fighter = new Fighter("emptyChoiceClauseTest", fighterAttributes);
				
		validator = new TreeValidator(fighter);
		ValidationReport report = validator.validate();

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
		ArrayList<FighterAttribute> fighterAttributes = new ArrayList<FighterAttribute>();
		fighterAttributes.add(testCharacteristic);		
		Fighter fighter = new Fighter("characteristicValueOutOfBoundsTest", fighterAttributes);
		
		validator = new TreeValidator(fighter);
		ValidationReport report = validator.validate();
		
		boolean containsOutOfBoundsError = false;
		for (String error : report.getErrors()) {
			if (error.endsWith("out of bounds (range: 1-10)")) {
				containsOutOfBoundsError = true;
				break;
			}
		}
		
		assert(containsOutOfBoundsError);
		
		validator = new TreeValidator(fighter);
		report = validator.validate();
		
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
