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
	private List<String> memList = new ArrayList<String>();
	private List<List<String>> memory = new ArrayList<List<String>>();
	private boolean isAnd = false;
	private Condition rootNode;
	
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
		rootNode = behavior.getCondition();
		behavior.getCondition().accept(this);
		//fo.behaviors.put(key, value);
	}
	
	@Override
	public void visit(And and){
		isAnd = true;
		super.visit(and);
	}
	
	@Override
	public void visit(Or or) {
		isAnd = false;
		super.visit(or);
	}
	
	@Override
	public void visit(Leaf leaf){
		String id = leaf.getId();
		if(conditions.contains(id)){
			addToMemList(leaf);
			if(!isAnd){
				memory.add(memList);
				memList = new ArrayList<String>();
				Backtripper bt = new Backtripper(leaf);
				rootNode.accept(bt);
			}
			conditions.remove(leaf.getId());
		}
	}
	
	private void addToMemList(Leaf leaf){
		memList.add(leaf.getId());
	}
	
	
	private class Backtripper extends DelegateVisitor{
		
		private Leaf endNodeChild;
		private boolean endNode = false;
		
		public Backtripper(Leaf endNodeChild){
			this.endNodeChild = endNodeChild;
		}
		
		@Override
		public void visit(Or or) {
			or.getLhs().accept(this);
			// if this is not the end node, we happily continue visiting.
			if(!endNode)
				or.getRhs().accept(this);
		}
		
		@Override
		public void visit(And and) {
			and.getLhs().accept(this);
			and.getRhs().accept(this);
			//super.visit(and);
		}
		
		@Override
		public void visit(Leaf leaf) {
			if(leaf.equals(endNodeChild))
				endNode = true;
			else
				addToMemList(leaf);
		}

	}
	
}
