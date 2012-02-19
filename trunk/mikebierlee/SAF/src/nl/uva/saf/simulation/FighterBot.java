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

import nl.uva.saf.fdl.CharacteristicExtractor;
import nl.uva.saf.fdl.NameExtractor;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.types.CharacteristicType;
import nl.uva.saf.fdl.types.FightActionType;
import nl.uva.saf.fdl.types.MoveActionType;

public class FighterBot {
	private HashMap<CharacteristicType, Integer> characteristics;
	protected final int default_value = 5;
	private String name;
	private final ITreeNode fighterNode;
	private Vector2d spawnPosition;

	private volatile int health;
	private volatile Vector2d position;
	private volatile Vector2d origin;

	private int speed;

	private int nextTurn;

	private volatile FightActionType fightAction = FightActionType.unknown;
	private volatile MoveActionType moveAction = MoveActionType.unknown;

	public FighterBot(ITreeNode fighter) {
		fighterNode = fighter;
		nextTurn = 0;

		position = new Vector2d();
		spawnPosition = new Vector2d();
		origin = new Vector2d(100, 150);
		health = 100;		

		if (fighterNode != null) {
			name = NameExtractor.getName(fighterNode);
			characteristics = CharacteristicExtractor.getCharacteristics(fighterNode);
		} else {
			name = "";
			characteristics =  new HashMap<CharacteristicType, Integer>();
		}

		calculateSpeed();
	}

	private void calculateSpeed() {
		int punchPower = getAttribute(CharacteristicType.punchPower);
		int kickPower = getAttribute(CharacteristicType.kickPower);
		int punchReach = getAttribute(CharacteristicType.punchReach);
		int kickReach = getAttribute(CharacteristicType.kickReach);

		double weight = (punchPower + kickPower) / 2;
		double height = (punchReach + kickReach) / 2;
		speed = (int) Math.abs(0.5 * (height - weight));
	}

	public int getSpeed() {
		return speed;
	}

	public void setAttribute(CharacteristicType name, int value) {
		characteristics.put(name, value);
		calculateSpeed();
	}

	public int getAttribute(CharacteristicType name) {
		Integer value = characteristics.get(name);
		return value == null ? default_value : value;
	}

	public String getName() {
		return name;
	}

	public Vector2d getPosition() {
		return position;
	}

	public void resetHealth() {
		health = 100;
	}

	public int getNextTurn() {
		return nextTurn;
	}

	public void setNextTurn(int turns) {
		if (turns >= 0) {
			this.nextTurn = turns;
		}
	}

	public void setPosition(Vector2d position) {
		this.position = position;
	}

	/**
	 * Deducts an amount of hitpoints from the bot. A bots health cannot get
	 * lower than 0;
	 * 
	 * @param hitpoints
	 *            The amount of hitpoints to deduct. If this value is zero or
	 *            lower, no health will be deducted.
	 */
	public void deductHealth(int hitpoints) {
		if (hitpoints > 0) {
			health -= hitpoints;
		}

		if (health < 0) {
			health = 0;
		}
	}

	public int getHealth() {
		return health;
	}

	public boolean isCrouching() {
		return moveAction == MoveActionType.crouch;
	}

	public Vector2d getOrigin() {
		return origin;
	}

	public void setOrigin(Vector2d origin) {
		this.origin = origin;
	}

	public boolean isJumping() {
		return moveAction == MoveActionType.jump;
	}

	public ITreeNode getFighterNode() {
		return fighterNode;
	}

	public FightActionType getFightAction() {
		return fightAction;
	}

	public void setFightAction(FightActionType fightAction) {
		this.fightAction = fightAction;
	}

	public MoveActionType getMoveAction() {
		return moveAction;
	}

	public void setMoveAction(MoveActionType moveAction) {
		this.moveAction = moveAction;
	}

	public Vector2d getSpawnPosition() {
		return spawnPosition;
	}

	public void setSpawnPosition(Vector2d spawnPosition) {
		this.spawnPosition = spawnPosition;
	}
}