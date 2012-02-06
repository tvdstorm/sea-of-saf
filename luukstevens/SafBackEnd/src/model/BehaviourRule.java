package model;

import java.util.List;
import java.util.Random;

import javax.xml.bind.annotation.*;

import model.attack.Attack;
import model.condition.Condition;
import model.enums.ConditionType;
import model.move.Move;

@XmlType(name = "BehaviourRule")
public class BehaviourRule {
	private Random random;
	
	public BehaviourRule() {
		random = new Random();
	}
	
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
	
	public Move getMove() {
		int index = random.nextInt(getMoveActions().size());
		return model.move.Factory.create(getMoveActions().get(index).getValue());
	}
	
	public Attack getAttack() {
		int index = random.nextInt(getFightActions().size());
		return model.attack.Factory.create(getFightActions().get(index).getValue());
	}
	
	public boolean evaluate(List<ConditionType> conditions) {
		if(condition == null) return false;
		return condition.evaluate(conditions);
	}
	
	private List<Action> getMoveActions() {
		return moveActions;
	}

	private List<Action> getFightActions() {
		return fightActions;
	}
}
