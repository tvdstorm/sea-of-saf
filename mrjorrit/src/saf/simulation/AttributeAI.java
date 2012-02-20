package saf.simulation;

import saf.structure.Attribute;
import saf.structure.Characteristic;
import saf.structure.Fighter;

public class AttributeAI {

	
	public static int getAttributePower(Fighter fighter, Attribute attribute)
	{
		for(Characteristic characteristic : fighter.getPersonality().getCharacteristics())
		{
			if(characteristic.getAttribute() == attribute)
				return characteristic.getPower();
		}
		return 5;
	}
}
