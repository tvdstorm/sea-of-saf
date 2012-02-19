/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.test;

import java.util.ArrayList;

import junit.framework.Assert;

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

		Assert.assertTrue(containsAlwaysError);
	}

	@Test
	public void emptyChoiceClauseTest() {
		ArrayList<Action> fightChoices = new ArrayList<Action>();
		fightChoices.add(new FightAction("kick_low"));
		ArrayList<FighterAttribute> fighterAttributes = new ArrayList<FighterAttribute>();
		fighterAttributes.add(new Behaviour(new ConditionAlways(), new Rule(new MoveChoice(new ArrayList<Action>()),
				new FightChoice(fightChoices))));
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

		Assert.assertTrue(containsEmptyChoiceError);
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

		Assert.assertTrue(containsOutOfBoundsError);

		validator = new TreeValidator(fighter);
		report = validator.validate();

		containsOutOfBoundsError = false;
		for (String error : report.getErrors()) {
			if (error.endsWith("out of bounds (range: 1-10)")) {
				containsOutOfBoundsError = true;
				break;
			}
		}

		Assert.assertTrue(containsOutOfBoundsError);
	}

}
