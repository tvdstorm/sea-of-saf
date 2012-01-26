package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import model.condition.And;
import model.condition.Or;
import model.condition.Simple;

@XmlRootElement(name = "bot")
public class Bot {
	private static final int DEFAULT_CHARACTERISTIC_VALUE = 5;
	
	@XmlAttribute
	private String name;
	
	@XmlElementWrapper(name = "characteristics")
	@XmlElement(name = "characteristic")
	private List<Characteristic> characteristics;
	
	@XmlElementWrapper(name = "behaviourRules")
	@XmlElement(name = "behaviourRule")
	private List<BehaviourRule> behaviourRules;

	public String getName() {
		return name;
	}

	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
	
	public int getCharacteristicValue(CharacteristicType characteristicType) {
		for(Characteristic characteristic : characteristics) {
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
}
