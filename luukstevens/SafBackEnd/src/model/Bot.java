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

import view.Arena;

import model.condition.And;
import model.condition.Or;
import model.condition.Simple;
import model.enums.AttackType;
import model.enums.CharacteristicType;
import model.enums.MoveType;

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
	
	private MoveType currentMove;
	private AttackType currentAttack;
	private Arena arena;
	
	public Bot() {
		currentMove = MoveType.STAND;
		currentAttack = AttackType.BLOCK_HIGH;
	}

	public String getName() {
		return name;
	}

	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
	
	public MoveType getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(MoveType currentMove) {
		this.currentMove = currentMove;
		if(arena != null) arena.update();
	}

	public AttackType getCurrentAttack() {
		return currentAttack;
	}

	public void setCurrentAttack(AttackType currentAttack) {
		this.currentAttack = currentAttack;
		if(arena != null) arena.update();
	}
	
	public void setArena(Arena arena) {
		this.arena = arena;
	}
	
	public double getWeight() {
		return 	(getCharacteristicValue(CharacteristicType.PUNCH_POWER) + 
				getCharacteristicValue(CharacteristicType.KICK_POWER)) / 2;
	}
	
	public double getHeight() {
		return 	(getCharacteristicValue(CharacteristicType.PUNCH_REACH) + 
				getCharacteristicValue(CharacteristicType.KICK_REACH)) / 2;
	}
	
	public double getSpeed() {
		return 	Math.abs((0.5 * (getHeight() - getWeight())));	
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
