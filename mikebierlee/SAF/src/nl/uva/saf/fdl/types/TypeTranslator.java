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
}
