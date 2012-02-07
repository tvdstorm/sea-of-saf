package saf.ast;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

import saf.ast.condition.*;
import saf.variable.IEnums;
import saf.variable.ISettings;

@XmlRootElement(name = "bot")
public class Bot implements ISettings, IEnums {
	
	@XmlAttribute
	private String name;
	
	@XmlElementWrapper(name = "characteristics")
	@XmlElement(name = "characteristic")
	private List<saf.ast.Characteristic> characteristics;
	
	@XmlElementWrapper(name = "behaviourRules")
	@XmlElement(name = "behaviourRule")
	private List<BehaviourRule> behaviourRules;

	public String getName() {
		return name;
	}
	
	public List<saf.ast.Characteristic> getCharacteristics() {
		return characteristics;
	}

	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
	
	public double getSpeed() {
		return 	Math.abs((0.5 * (getHeight() - getWeight())));	
	}
	
	public int getCharacteristicValue(IEnums.Characteristic characteristicType) {
		for(saf.ast.Characteristic characteristic : getCharacteristics()) {
			if(characteristicType.getText().equals(characteristic.getName())) {
				return characteristic.getValue();
			}
		}
	
		return DEFAULT_CHARACTERISTIC_VALUE;
	}
	
	public static Bot deserialize(String fileLocation) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(Bot.class, And.class, Or.class, Simple.class);
		Unmarshaller um = context.createUnmarshaller();
	
		return (Bot) um.unmarshal(new FileReader(fileLocation));
	}
	
	private double getWeight() {
		return 	(getCharacteristicValue(IEnums.Characteristic.PUNCH_POWER) + 
			getCharacteristicValue(IEnums.Characteristic.KICK_POWER)) / 2;
	}
	
	private double getHeight() {
		return 	(getCharacteristicValue(IEnums.Characteristic.PUNCH_REACH) + 
			getCharacteristicValue(IEnums.Characteristic.KICK_REACH)) / 2;
	}
}
