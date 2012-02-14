package saf.ast;

import java.util.List;
import java.util.Random;

import javax.xml.bind.annotation.*;

import saf.ast.condition.Condition;

@XmlType(name = "BehaviourRule")
public class BehaviourRule {
	
	@XmlElementRef
	private Condition condition;
	
	@XmlElementWrapper(name = "moveActions")
	@XmlElement(name = "action")
	private List<MoveAction> moveActions; 
	
	@XmlElementWrapper(name = "fightActions")
	@XmlElement(name = "action")
	private List<FightAction> fightActions;

	public Condition getCondition() {
		return condition;
	}
	
	public List<MoveAction> getMoveActions() {
		return moveActions;
	}

	public List<FightAction> getFightActions() {
		return fightActions;
	}
	
	public <T extends Action> T chooseAction(List<T> actions) {
		
		Random random = new Random();
		int index = random.nextInt(actions.size());
		return actions.get(index);
	}
}
