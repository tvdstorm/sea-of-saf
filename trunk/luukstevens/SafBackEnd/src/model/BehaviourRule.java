package model;

import java.util.List;
import java.util.Random;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import model.attack.Attack;
import model.condition.Condition;
import model.enums.ConditionType;
import model.move.Move;

@XmlType(name = "BehaviourRule")
public class BehaviourRule {
	private Random randomGenerator;
	
	public BehaviourRule() {
		randomGenerator = new Random();
	}
	
	@XmlElementRef
	private Condition condition;
	
	@XmlElementWrapper(name = "moveActions")
	@XmlElement(name = "action")
	private List<Action> moveActions; 
	
	@XmlElementWrapper(name = "fightActions")
	@XmlElement(name = "action")
	private List<Action> fightActions;

	public List<Action> getMoveActions() {
		return moveActions;
	}

	public List<Action> getFightActions() {
		return fightActions;
	}

	public Condition getCondition() {
		return condition;
	}
	
	public Move getMove() {
		int index = randomGenerator.nextInt(getMoveActions().size());
		return model.move.Factory.create(getMoveActions().get(index).getValue());
	}
	
	public Attack getAttack() {
		int index = randomGenerator.nextInt(getFightActions().size());
		return model.attack.Factory.create(getFightActions().get(index).getValue());
	}
	
	public boolean evaluate(List<ConditionType> conditions) {
		if(condition == null) return false;
		return condition.evaluate(conditions);
	}
}
