package nl.uva.saf.fdl.types;

public class TypeTranslator {
	public static FightActionType getActionType(String typeString) {
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
