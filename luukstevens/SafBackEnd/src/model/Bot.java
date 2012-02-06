package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.*;
import javax.xml.bind.annotation.*;

import model.attack.*;
import model.condition.*;
import model.enums.*;
import model.move.*;

@XmlRootElement(name = "bot")
public class Bot {
	private static final int DEFAULT_CHARACTERISTIC_VALUE = 5;
	private static final int DEFAULT_HEALTH = 100;
	
	public enum Position { LEFT, RIGHT };
	
	@XmlAttribute
	private String name;
	
	@XmlElementWrapper(name = "characteristics")
	@XmlElement(name = "characteristic")
	private List<Characteristic> characteristics;
	
	@XmlElementWrapper(name = "behaviourRules")
	@XmlElement(name = "behaviourRule")
	private List<BehaviourRule> behaviourRules;
	
	private Move currentMove;
	private Attack currentAttack;
	private int health;
	private boolean walkedOrRunnedAway;
	private Position position;
	
	private Bot() {
		currentMove = new Stand();
		currentAttack = new BlockHigh();
		health = DEFAULT_HEALTH;
		setWalkedOrRunnedAway(false);
	}

	public String getName() {
		return name;
	}

	public List<BehaviourRule> getBehaviourRules() {
		return behaviourRules;
	}
	
	public Move getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(Move currentMove) {
		if(currentMove.isMove(WalkTowards.class) || currentMove.isMove(RunTowards.class)) {
			setWalkedOrRunnedAway(false);
		}
		
		if(currentMove.isMove(WalkAway.class) || currentMove.isMove(RunAway.class)) {
			setWalkedOrRunnedAway(true);
		}
		
		this.currentMove = currentMove;
	}

	public Attack getCurrentAttack() {
		return currentAttack;
	}

	public void setCurrentAttack(Attack currentAttack) {
		this.currentAttack = currentAttack;
	}

	public int getHealth() {
		return health;
	}
	
	public boolean getWalkedOrRunnedAway() {
		return walkedOrRunnedAway;
	}

	public void setWalkedOrRunnedAway(boolean walkedOrRunnedAway) {
		this.walkedOrRunnedAway = walkedOrRunnedAway;
	}
	
	public Position getPosition() {
		return position;
	}

	public void reduceHealth(int health) {
		this.health -= health;
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
	
	public void update(List<ConditionType> conditions) {
		for(BehaviourRule behaviourRule : getBehaviourRules()) {
			if(behaviourRule.evaluate(conditions)) {
				setCurrentMove(behaviourRule.getMove());
				setCurrentAttack(behaviourRule.getAttack());
				break;
			}
		}
	}
	
	public static Bot deserialize(String fileLocation, Position position) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(Bot.class, And.class, Or.class, Simple.class);
		Unmarshaller um = context.createUnmarshaller();
		
		Bot bot = (Bot) um.unmarshal(new FileReader(fileLocation));
		bot.setPosition(position);
		
		return bot;
	}
	
	private void setPosition(Position position) {
		this.position = position;
	}
	
	private double getWeight() {
		return 	(getCharacteristicValue(CharacteristicType.PUNCH_POWER) + 
				getCharacteristicValue(CharacteristicType.KICK_POWER)) / 2;
	}
	
	private double getHeight() {
		return 	(getCharacteristicValue(CharacteristicType.PUNCH_REACH) + 
				getCharacteristicValue(CharacteristicType.KICK_REACH)) / 2;
	}
}
