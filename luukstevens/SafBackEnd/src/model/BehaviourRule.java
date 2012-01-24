package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import model.condition.Checkable;
import model.condition.Condition;

@XmlRootElement(name = "BehaviourRule")
public class BehaviourRule {
	
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
}
