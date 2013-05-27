package ast.checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ast.TypeValues;
import ast.action.Choose;
import ast.action.SimpleAction;
import ast.condition.And;
import ast.condition.Condition;
import ast.condition.Leaf;
import ast.fighter.Behavior;
import ast.fighter.Fighter;
import ast.fighter.FighterProp;
import ast.fighter.Strength;

public class Checker extends DelegateAstVisitor {
	
	private List<Message> messages;
	
	public static List<Message> Check(List<Fighter> fighters){
		Checker checker = new Checker();
		checker.checkFighterListSize(fighters);
		for(Fighter fighter : fighters){
			fighter.accept(checker);
		}
		return checker.messages;
	}
	
	private void addMessage(Message msg){
		this.messages.add(msg);
	}
	
	private Checker(){
		this.messages = new ArrayList<Message>();
	}
	
	private void checkFighterListSize(List<Fighter> fighters){
		if(fighters.size() != 2){
			addMessage(new Error("Exactly 2 fighters have to be defined"));
		}
	}
	
	@Override
	public void visit(Strength strength) {
		if (!TypeValues.STRENGHTS.contains(strength.getFightId())){
			addMessage(new Error("Not a valid strength-type", strength));
		}
		if(!isWithinBounds(strength)){
			addMessage(new Error("strength not within bounds", strength));
		}
	}
	
	private boolean isWithinBounds(Strength strength){
		int fightPower = strength.getFightPower();
		return TypeValues.MIN_STRENGTH <= fightPower && fightPower <= TypeValues.MAX_STRENGTH;
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
	
	@Override
	public void visit(Fighter fighter) {
		checkForDuplicateFighterProperty(fighter);
		checkForAlways(fighter);
		super.visit(fighter);
		}
	/*
	 * I choose to let this Checker-vistor determine whether a Fighter has an
	 * default condition.
	 */
	private void checkForAlways(Fighter fighter){
		boolean hasAlways = false; 
		List<FighterProp> props = fighter.getFighterProps();
		for(FighterProp prop : props){
			if(prop instanceof Behavior){
				Behavior behavior = (Behavior) prop;
				Condition condition = behavior.getCondition();
				if(condition instanceof Leaf){
					Leaf leaf = (Leaf) condition;
					hasAlways = hasAlways || TypeValues.DEFAULT_CONDITION.equals(leaf.getId());
				}
			}
		}
		if(!hasAlways){
			addMessage(new Error("Default condition '" + TypeValues.DEFAULT_CONDITION + "' is not set", fighter));
		}
	}
	
	private void checkForDuplicateFighterProperty(Fighter fighter){
		List<FighterProp> props = fighter.getFighterProps();
		List<FighterProp> registredProps = new ArrayList<FighterProp>();
		for(FighterProp prop : props){
			if(!registredProps.contains(prop)){
				registredProps.add(prop);
			}
				else{
					addMessage(new Warning("duplicate fighterproperty", prop));
				}
			}
	}
	
	private class ActionChecker extends DelegateAstVisitor{
		private Set<String> legalActions;
		private String type;
		
		private ActionChecker(Set<String> legalActions, String type){
			this.legalActions = legalActions;
			this.type = type;
		}
		
		@Override
		public void visit(Choose choose) {
			checkForDuplicateChoices(choose);
			super.visit(choose);
		}
		
		private void checkForDuplicateChoices(Choose choose){
			List<SimpleAction> choices = choose.getChoices();
			List<SimpleAction> registredChoices = new ArrayList<SimpleAction>();
			for(SimpleAction choice : choices){
				if (!registredChoices.contains(choice)){
					registredChoices.add(choice);
				}
				else{
					addMessage(new Warning("duplicate actions in choose construct", choose));
				}
			}
		}
		
		@Override
		public void visit(SimpleAction action) {
			if (!legalActions.contains(action.getAction())){
				addMessage(new Error("not a valid " + type + "-type", action));
			}
		}
		
	}
}
