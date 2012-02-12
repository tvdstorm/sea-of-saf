package saf.structure.intelligence;

import saf.structure.Bot;
import saf.structure.Characteristic;

public class BotIntelligence {
	public static Characteristic getCharacteristic(Bot bot, String CharacteristicName)
	{
		for (Characteristic characteristic : bot.getCharacteristics()) {
			if(characteristic.getName().equalsIgnoreCase(CharacteristicName))
				return characteristic;
		}
		
		//no characteristic found in the AST, return the default value.
		return new Characteristic(CharacteristicName, 5);
	}
}
