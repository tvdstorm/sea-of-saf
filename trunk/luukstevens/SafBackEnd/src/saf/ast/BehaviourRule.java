package saf.ast;

import java.util.List;

import javax.xml.bind.annotation.*;

import saf.ast.condition.Condition;



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

	public Condition getCondition() {
		return condition;
	}
	
	public List<Action> getMoveActions() {
		return moveActions;
	}

	public List<Action> getFightActions() {
		return fightActions;
	}
}
