package grammar.Evaluators;

import java.util.LinkedList;
import java.util.List;

public class ConditionList implements Visitable{
	final private List <Condition> conditionList = new LinkedList<Condition>();
	
	public ConditionList(){
		
	}
	
	public void addCondition (Condition condition) {
		this.conditionList.add(condition);
	}
	
	public List<Condition> getList() {
		return this.conditionList;
	}

	@Override
	public String toString() {
		return "ConditionList [conditionList=" + conditionList + "]";
	}
	
	@Override
	public void accept(BotVisit visitor) {
		  	visitor.visit(this);
	}
}
