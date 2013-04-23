package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import ast.checker.DelegateVisitor;
import ast.condition.And;
import ast.condition.Condition;
import ast.condition.Connective;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.Behavior;
import ast.fighter.Fighter;

public class Populator extends DelegateVisitor {
	
	private FighterObject fo;
	private Fighter ast;
	private Stack<Connective> stack;
	private String search1;
	private String search2;
	private Behavior behavior;
	private List<Leaf> values;
	private boolean flagAddValue;
	private boolean seperateValue;
	private Set<String> conditions = new HashSet<String>();
	
	public Populator(){
		this.fo = new FighterObject();
		this.stack = new Stack<Connective>();
		this.values = new ArrayList<Leaf>();
	}
	
	public void populate(String search1, String search2){
		this.search1 = search1;
		behavior.accept(this);
	}
	
	@Override
	public void visit(Fighter fighter) {
		fo.name = fighter.getName();
		super.visit(fighter);
	}
	
	public void visit(Behavior behavior){
		behavior.getCondition().accept(this);
		//fo.behaviors.put(key, value);
	}
	
	@Override
	public void visit(And and){
		//yeah baby, siblings in tha house!
		stack.push(and);
		// This is gonna be an option that demands
		// multi-parted conditions.
		//addToMemlist(and.getLhs()); <----- PICK ME! PICK ME!!
		super.visit(and);
	}
	
	@Override
	public void visit(Or or) {
		// Siblings in tha house, next condition should
		// be treated as a new option.
		super.visit(or);
	}
	
	@Override
	public void visit(Leaf leaf){
		String id = leaf.getId();
		if(conditions.contains(id)){
			addToMemList(leaf);
		}
	}
	
	private void addToMemList(Leaf leaf){
		
	}
	
	private void checkForSiblings(){
		if(stack.isEmpty()){
			// I don't have siblings.
		} else {
			// I have a sibling. Let's check them.
			Connective conn = stack.pop();
		}
	}
}
