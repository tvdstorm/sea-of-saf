package saf.logic;

import java.util.List;

import saf.evaluators.Characteristic;

public class CharacteristicIntelligence {
	private static final int defaultStrength = 5;
	
	public static Integer getValueByCharacteristicsAndName(List<Characteristic> characteristics , String characteristicName) {
		for (Characteristic characteristic : characteristics) {
			if(characteristic.getName().intern() == characteristicName.intern()){
				return characteristic.getValue();
			}
		}
		return defaultStrength;
	}

}
