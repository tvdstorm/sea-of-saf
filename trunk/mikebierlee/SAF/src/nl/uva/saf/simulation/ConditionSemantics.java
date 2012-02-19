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

package nl.uva.saf.simulation;

import java.util.HashMap;
import java.util.List;

import nl.uva.saf.fdl.types.CharacteristicType;
import nl.uva.saf.fdl.types.ConditionType;

public class ConditionSemantics implements IConditionSemantics {
	final int distanceScale;
	final int muchWeakerDifference;

	public ConditionSemantics() {
		distanceScale = 4;
		muchWeakerDifference = 5;
	}

	public ConditionSemantics(int distanceScale, int muchWeakerDifference) {
		this.distanceScale = distanceScale;
		this.muchWeakerDifference = muchWeakerDifference;
	}

	@Override
	public HashMap<ConditionType, Boolean> getConditionStates(FighterBot fighter, List<FighterBot> players) {
		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();

		for (FighterBot enemy : players) {
			if (enemy != fighter) {

				evaluateDistance(fighter, enemy, truthTable);
				evaluateStrength(fighter, enemy, truthTable);

				break;
			}
		}

		return truthTable;
	}

	private void evaluateStrength(FighterBot fighter, FighterBot enemy, HashMap<ConditionType, Boolean> truthTable) {
		int fighterAveragePower = Math.round((fighter.getAttribute(CharacteristicType.punchPower) + fighter
				.getAttribute(CharacteristicType.kickPower)) / 2);
		int enemyAveragePower = Math.round((enemy.getAttribute(CharacteristicType.punchPower) + enemy
				.getAttribute(CharacteristicType.kickPower)) / 2);

		int powerDifference = fighterAveragePower - enemyAveragePower;
		int absoluteDifference = Math.abs(powerDifference);

		boolean weaker = false;
		boolean much_weaker = false;
		boolean even = false;
		boolean stronger = false;
		boolean much_stronger = false;

		if (powerDifference == 0) {
			even = true;
		} else if (powerDifference < 0) {
			if (absoluteDifference > muchWeakerDifference) {
				much_weaker = true;
			} else {
				weaker = true;
			}
		} else if (powerDifference > 0) {
			if (absoluteDifference > muchWeakerDifference) {
				much_stronger = true;
			} else {
				stronger = true;
			}
		}

		truthTable.put(ConditionType.weaker, weaker);
		truthTable.put(ConditionType.much_weaker, much_weaker);
		truthTable.put(ConditionType.even, even);
		truthTable.put(ConditionType.stronger, stronger);
		truthTable.put(ConditionType.much_stronger, much_stronger);
	}

	private void evaluateDistance(FighterBot fighter, FighterBot enemy, HashMap<ConditionType, Boolean> truthTable) {
		Vector2d enemyPosition = enemy.getPosition();
		Vector2d fighterPosition = fighter.getPosition();

		int distance = (int) Math.round(Math.abs(Vector2d.substract(enemyPosition, fighterPosition).x));
		int punchReach = fighter.getAttribute(CharacteristicType.punchReach);
		int kickReach = fighter.getAttribute(CharacteristicType.kickReach);

		boolean near = false;
		boolean far = false;

		if (distance <= punchReach * distanceScale || distance <= kickReach * distanceScale) {
			near = true;
		} else {
			far = true;
		}

		truthTable.put(ConditionType.near, near);
		truthTable.put(ConditionType.far, far);
	}

}
