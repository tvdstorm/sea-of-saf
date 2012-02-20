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
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import nl.uva.saf.fdl.types.CharacteristicType;
import nl.uva.saf.fdl.types.ConditionType;
import nl.uva.saf.fdl.types.FightActionType;
import nl.uva.saf.fdl.types.MoveActionType;
import nl.uva.saf.simulation.ActionExecutor;
import nl.uva.saf.simulation.FighterBot;
import nl.uva.saf.simulation.IActionExecutor;
import nl.uva.saf.simulation.Vector2d;

public class ActionExecutorTest {
	FighterBot bot;
	FighterBot enemy;
	List<FighterBot> players;
	IActionExecutor actionExecutor;
	HashMap<ConditionType, Boolean> truthTable;

	@Before
	public void setup() {
		actionExecutor = new ActionExecutor();
		truthTable = new HashMap<ConditionType, Boolean>();

		bot = new FighterBot(null);
		enemy = new FighterBot(null);

		players = new ArrayList<FighterBot>();
		players.add(bot);
		players.add(enemy);

		bot.setPosition(new Vector2d(20, 0));
		enemy.setPosition(new Vector2d(21, 0));
	}

	@Test
	public void walkAwayFromEnemyTest() {
		bot.setMoveAction(MoveActionType.walk_away);
		actionExecutor.executeFighterActions(bot, players, truthTable);

		int speedScale = ((ActionExecutor) actionExecutor).getSpeedScale();

		Vector2d expectedPosition = new Vector2d(20 - ((bot.getSpeed() + 1) * speedScale), 0);
		Vector2d botPosition = bot.getPosition();

		Assert.assertTrue(botPosition.equals(expectedPosition));
	}

	@Test
	public void runTowardsEnemyTest() {
		bot.setMoveAction(MoveActionType.run_towards);
		actionExecutor.executeFighterActions(bot, players, truthTable);

		int speedScale = ((ActionExecutor) actionExecutor).getSpeedScale();

		Vector2d expectedPosition = new Vector2d(20 + ((bot.getSpeed() + 1) * speedScale) * 2, 0);
		Vector2d botPosition = bot.getPosition();

		Assert.assertTrue(botPosition.equals(expectedPosition));
	}

	@Test
	public void punchEnemyTest() {
		truthTable.put(ConditionType.near, true);

		bot.setFightAction(FightActionType.punch_low);
		bot.setAttribute(CharacteristicType.punchReach, 10);
		bot.setAttribute(CharacteristicType.punchPower, 10);
		actionExecutor.executeFighterActions(bot, players, truthTable);

		Assert.assertEquals(90, enemy.getHealth());
	}
}
