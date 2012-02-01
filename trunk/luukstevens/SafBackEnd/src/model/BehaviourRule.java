package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import model.condition.Condition;
import model.enums.ConditionType;

@XmlType(name = "BehaviourRule")
public class BehaviourRule {
	
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
	
	public boolean evaluate(List<ConditionType> conditions) {
		if(condition == null) return false;
		return condition.evaluate(conditions);
	}
}
