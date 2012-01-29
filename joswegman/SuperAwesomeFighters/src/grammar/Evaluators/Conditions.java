package grammar.Evaluators;

import java.util.LinkedList;
import java.util.List;

public class Conditions {
	final private List <Condition> conditionList = new LinkedList<Condition>();
	
	public Conditions() {
		
	}
	public void addCondition (Condition condition) {
		this.conditionList.add(condition);
	}
	@Override
	public String toString() {
		return "Conditions [conditionList=" + conditionList + "]";
	}
 
}
