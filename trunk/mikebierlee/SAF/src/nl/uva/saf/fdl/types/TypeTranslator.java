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

package nl.uva.saf.fdl.types;

public class TypeTranslator {
	public static FightActionType getFightActionType(String typeString) {
		FightActionType type = FightActionType.unknown;

		if (typeString == "block_low") {
			type = FightActionType.block_low;
		} else if (typeString.equals("block_high")) {
			type = FightActionType.block_high;
		} else if (typeString.equals("punch_low")) {
			type = FightActionType.punch_low;
		} else if (typeString.equals("punch_high")) {
			type = FightActionType.punch_high;
		} else if (typeString.equals("kick_low")) {
			type = FightActionType.kick_low;
		} else if (typeString.equals("kick_high")) {
			type = FightActionType.kick_high;
		}

		return type;
	}

	public static MoveActionType getMoveActionType(String typeString) {
		MoveActionType type = MoveActionType.unknown;

		if (typeString.equals("walk_towards")) {
			type = MoveActionType.walk_towards;
		} else if (typeString.equals("walk_away")) {
			type = MoveActionType.walk_away;
		} else if (typeString.equals("run_towards")) {
			type = MoveActionType.run_towards;
		} else if (typeString.equals("run_away")) {
			type = MoveActionType.run_away;
		} else if (typeString.equals("jump")) {
			type = MoveActionType.jump;
		} else if (typeString.equals("crouch")) {
			type = MoveActionType.crouch;
		} else if (typeString.equals("stand")) {
			type = MoveActionType.stand;
		}

		return type;
	}

	public static CharacteristicType getCharacteristicType(String typeString) {
		CharacteristicType type = CharacteristicType.unknown;

		if (typeString.equals("punchReach")) {
			type = CharacteristicType.punchReach;
		} else if (typeString.equals("punchPower")) {
			type = CharacteristicType.punchPower;
		} else if (typeString.equals("kickReach")) {
			type = CharacteristicType.kickReach;
		} else if (typeString.equals("kickPower")) {
			type = CharacteristicType.kickPower;
		}

		return type;
	}

	public static ConditionType getConditionType(String typeString) {
		ConditionType type = ConditionType.unknown;

		if (typeString.equals("always")) {
			type = ConditionType.always;
		} else if (typeString.equals("near")) {
			type = ConditionType.near;
		} else if (typeString.equals("far")) {
			type = ConditionType.far;
		} else if (typeString.equals("much_stronger")) {
			type = ConditionType.much_stronger;
		} else if (typeString.equals("stronger")) {
			type = ConditionType.stronger;
		} else if (typeString.equals("even")) {
			type = ConditionType.even;
		} else if (typeString.equals("weaker")) {
			type = ConditionType.weaker;
		} else if (typeString.equals("much_weaker")) {
			type = ConditionType.much_weaker;
		}

		return type;
	}
}
