package ast.checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ast.TypeValues;
import ast.action.SimpleAction;
import ast.condition.And;
import ast.condition.Leaf;
import ast.fighter.Behavior;
import ast.fighter.Strength;
import ast.object.Fighter;

public class Checker extends DelegateVisitor {
	
	private List<Message> messages;
	
	public static List<Message> Check(Fighter fighter){
		Checker checker = new Checker();
		fighter.accept(checker);
		return checker.messages;
	}
	
	private void addMessage(Message msg){
		this.messages.add(msg);
	}
	
	private Checker(){
		this.messages = new ArrayList<Message>();
	}

	@Override
	public void visit(Strength strength) {
		if (!TypeValues.STRENGHTS.contains(strength.getFightId())){
			addMessage(new Error("Not a valid strength-type", strength));
		}
	}
	
	@Override
	public void visit(Behavior behavior) {
		behavior.getFightAction().accept(new ActionChecker(TypeValues.ATTACKS, "fight"));
		behavior.getMoveAction().accept(new ActionChecker(TypeValues.MOVES, "move"));
		behavior.getCondition().accept(this);
	}
	
	@Override
	public void visit(Leaf leaf) {
		if(!TypeValues.CONDITIONS.contains(leaf.getId())){
			addMessage(new Error("not a valid condition-type", leaf));
		}
	}
	
	private class ActionChecker extends DelegateVisitor{
		private Set<String> legalActions;
		private String type;
		
		private ActionChecker(Set<String> legalActions, String type){
			this.legalActions = legalActions;
			this.type = type;
		}
		
		@Override
		public void visit(SimpleAction action) {
			if (!legalActions.contains(action.getAction())){
				addMessage(new Error("not a valid " + type + "-type", action));
			}
		}
		
	}
}
