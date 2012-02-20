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
	private final int addedKickCost;
	private final int addedPunchCost;
	private final int baseKickCost;
	private final int basePunchCost;
	private final double powerScale;
	private final int runSpeedScale;
	private final int runTurnCost;
	private int totalTurnCost;
	private final int walkSpeedScale;
	private final int walkTurnCost;

	public ActionExecutor() {
		powerScale = 1;
		walkSpeedScale = 10;
		runSpeedScale = 20;
		runTurnCost = 1;
		walkTurnCost = 2;
		baseKickCost = 1;
		addedKickCost = 1;
		basePunchCost = 1;
		addedPunchCost = 1;
	}

	public ActionExecutor(double powerScale, int walkSpeedScale, int runSpeedScale, int runTurnCost, int walkTurnCost,
			int baseKickCost, int basePunchCost, int addedKickCost, int addedPunchCost) {
		this.powerScale = powerScale;
		this.walkSpeedScale = walkSpeedScale;
		this.runSpeedScale = runSpeedScale;
		this.runTurnCost = runTurnCost;
		this.walkTurnCost = walkTurnCost;
		this.baseKickCost = baseKickCost;
		this.addedKickCost = addedKickCost;
		this.basePunchCost = basePunchCost;
		this.addedPunchCost = addedPunchCost;
	}

	private void executeFightAction(FighterBot fighter, FighterBot enemy, HashMap<ConditionType, Boolean> truthTable) {
		Boolean isNear = truthTable.get(ConditionType.near);
		if (isNear != null && isNear.booleanValue() == true) {
			int punchDamage = (int) Math.round(fighter.getAttribute(CharacteristicType.punchPower) * powerScale);
			int kickDamage = (int) Math.round(fighter.getAttribute(CharacteristicType.kickPower) * powerScale);

			int kickCost = baseKickCost;
			int punchCost = basePunchCost;
			if (kickDamage > punchDamage) {
				kickCost += addedKickCost;
			} else {
				punchCost += addedPunchCost;
			}

			switch (fighter.getFightAction()) {
			case punch_high:
				if ((enemy.getMoveAction() != MoveActionType.crouch && enemy.getFightAction() != FightActionType.block_high)
						|| (enemy.getMoveAction() == MoveActionType.jump && enemy.getFightAction() != FightActionType.block_low)) {
					enemy.deductHealth(punchDamage);
					totalTurnCost += punchCost;
				}
				break;
			case punch_low:
				if ((enemy.getFightAction() != FightActionType.block_low && enemy.getMoveAction() != MoveActionType.jump)
						|| (enemy.getMoveAction() == MoveActionType.crouch && enemy.getFightAction() != FightActionType.block_high)) {
					enemy.deductHealth(punchDamage);
					totalTurnCost += punchCost;
				}
				break;
			case kick_high:
				if (enemy.getFightAction() != FightActionType.block_low
						&& enemy.getMoveAction() != MoveActionType.crouch) {
					enemy.deductHealth(kickDamage);
					totalTurnCost += kickCost;
				}
				break;

			case kick_low:
				if ((enemy.getMoveAction() == MoveActionType.crouch && enemy.getFightAction() != FightActionType.block_high)
						|| (enemy.getMoveAction() != MoveActionType.crouch && enemy.getMoveAction() != MoveActionType.jump)) {
					enemy.deductHealth(kickDamage);
					totalTurnCost += kickCost;
				}
				break;
			}
		}
	}

	@Override
	public void executeFighterActions(FighterBot fighter, List<FighterBot> players,
			HashMap<ConditionType, Boolean> truthTable) {
		totalTurnCost = 0;

		for (FighterBot enemy : players) {
			if (enemy != fighter) {
				executeFightAction(fighter, enemy, truthTable);
				executeMoveAction(fighter, enemy);
				break;
			}
		}
	}

	private void executeMoveAction(FighterBot fighter, FighterBot enemy) {
		Vector2d enemyPosition = enemy.getPosition();
		Vector2d fighterPosition = fighter.getPosition();
		Vector2d enemyDirection = Vector2d.substract(enemyPosition, fighterPosition);
		enemyDirection.normalize();
		int speed = fighter.getSpeed() + 1;

		switch (fighter.getMoveAction()) {
		case walk_away:
			fighterPosition.add(Vector2d.multiply(enemyDirection, -(speed * walkSpeedScale)));
			totalTurnCost += walkTurnCost;
			break;
		case walk_towards:
			fighterPosition.add(Vector2d.multiply(enemyDirection, speed * walkSpeedScale));
			totalTurnCost += walkTurnCost;
			break;
		case run_away:
			fighterPosition.add(Vector2d.multiply(enemyDirection, -(speed * runSpeedScale)));
			totalTurnCost += runTurnCost;
			break;
		case run_towards:
			fighterPosition.add(Vector2d.multiply(enemyDirection, speed * runSpeedScale));
			totalTurnCost += runTurnCost;
			break;
		}
	}

	public double getPowerScale() {
		return powerScale;
	}

	public int getSpeedScale() {
		return walkSpeedScale;
	}

	@Override
	public int getTurnCost() {
		return totalTurnCost;
	}
}
