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
import nl.uva.saf.fdl.types.FightActionType;
import nl.uva.saf.fdl.types.MoveActionType;

public class ActionExecutor implements IActionExecutor {
	private final double powerScale;
	private final int speedScale;
	private int turnCost;

	public ActionExecutor() {
		powerScale = 1;
		speedScale = 10;
	}

	public ActionExecutor(double powerScale, int speedScale) {
		this.powerScale = powerScale;
		this.speedScale = speedScale;
	}

	@Override
	public void executeFighterActions(FighterBot fighter, List<FighterBot> players,
			HashMap<ConditionType, Boolean> truthTable) {
		turnCost = 0;

		for (FighterBot enemy : players) {
			if (enemy != fighter) {
				executeFightAction(fighter, enemy, truthTable);
				executeMoveAction(fighter, enemy);
				break;
			}
		}
	}

	@Override
	public int getTurnCost() {
		return turnCost;
	}

	private void executeMoveAction(FighterBot fighter, FighterBot enemy) {
		Vector2d enemyPosition = enemy.getPosition();
		Vector2d fighterPosition = fighter.getPosition();
		Vector2d enemyDirection = Vector2d.substract(enemyPosition, fighterPosition);
		enemyDirection.normalize();
		int speed = fighter.getSpeed() + 1;

		switch (fighter.getMoveAction()) {
		case walk_away:
			fighterPosition.add(Vector2d.multiply(enemyDirection, -(speed * speedScale)));
			turnCost += 1;
			break;
		case walk_towards:
			fighterPosition.add(Vector2d.multiply(enemyDirection, speed * speedScale));
			turnCost += 1;
			break;
		case run_away:
			fighterPosition.add(Vector2d.multiply(enemyDirection, -(speed * speedScale) * 2));
			turnCost += 2;
			break;
		case run_towards:
			fighterPosition.add(Vector2d.multiply(enemyDirection, (speed * speedScale) * 2));
			turnCost += 2;
			break;
		}
	}

	private void executeFightAction(FighterBot fighter, FighterBot enemy, HashMap<ConditionType, Boolean> truthTable) {
		Boolean isNear = truthTable.get(ConditionType.near);
		if (isNear != null && isNear.booleanValue() == true) {
			int punchDamage = (int) Math.round(fighter.getAttribute(CharacteristicType.punchPower) * powerScale);
			int kickDamage = (int) Math.round(fighter.getAttribute(CharacteristicType.kickPower) * powerScale);

			int kickCost = 1;
			int punchCost = 1;
			if (kickDamage > punchDamage) {
				kickCost += 1;
			} else {
				punchCost += 1;
			}

			switch (fighter.getFightAction()) {
			case punch_high:
				if ((enemy.getMoveAction() != MoveActionType.crouch && enemy.getFightAction() != FightActionType.block_high)
						|| (enemy.getMoveAction() == MoveActionType.jump && enemy.getFightAction() != FightActionType.block_low)) {
					enemy.deductHealth(punchDamage);
					turnCost += punchCost;
				}
				break;
			case punch_low:
				if ((enemy.getFightAction() != FightActionType.block_low && enemy.getMoveAction() != MoveActionType.jump)
						|| (enemy.getMoveAction() == MoveActionType.crouch && enemy.getFightAction() != FightActionType.block_high)) {
					enemy.deductHealth(punchDamage);
					turnCost += punchCost;
				}
				break;
			case kick_high:
				if (enemy.getFightAction() != FightActionType.block_low
						&& enemy.getMoveAction() != MoveActionType.crouch) {
					enemy.deductHealth(kickDamage);
					turnCost += kickCost;
				}
				break;

			case kick_low:
				if ((enemy.getMoveAction() == MoveActionType.crouch && enemy.getFightAction() != FightActionType.block_high)
						|| (enemy.getMoveAction() != MoveActionType.crouch && enemy.getMoveAction() != MoveActionType.jump)) {
					enemy.deductHealth(kickDamage);
					turnCost += kickCost;
				}
				break;
			}
		}
	}
}
