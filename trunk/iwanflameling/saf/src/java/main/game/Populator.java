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
import ast.fighter.FighterProp;

public class Populator extends DelegateVisitor {
	
	private Set<String> conditions = new HashSet<String>();
	private Set<String> memSet = new HashSet<String>();
	private List<Set<String>> memory = new ArrayList<Set<String>>();
	private boolean isAnd = false;
	private boolean isRhs = false;
	private Condition rootNode;
	
	public Populator(){
	}
	
	public List<Set<String>> populate(Set<String> conditions, FighterAI fighter){
		this.conditions = conditions;
		fighter.ast.accept(this);
		return memory;
	}
	
	
	@Override
	public void visit(Fighter fighter) {
		super.visit(fighter);
	}
	
	public void visit(Behavior behavior){
		initEmptyMemSet();
		isAnd = false;
		rootNode = behavior.getCondition();
		behavior.getCondition().accept(this);
		//fo.behaviors.put(key, value);
	}
	
	@Override
	public void visit(And and){
		isAnd = true;
		delegate(and);
	}
	
	@Override
	public void visit(Or or) {
		isAnd = false;
		delegate(or);
	}
	
	private void delegate(Connective conn){
		isRhs = false;
		conn.getLhs().accept(this);
		isRhs = true;
		conn.getRhs().accept(this);
	}
	
	@Override
	public void visit(Leaf leaf){
		String id = leaf.getId();
		if(conditions.contains(id)){
			saveLeaf(leaf);
		}
	}
	
	private void saveLeaf(Leaf leaf){
		addToMemSet(leaf);
		storeToMemory(leaf);
	}
	
	private void storeToMemory(Leaf leaf){
		// if this leaf was proceeded by an and-node, than
		// only store them (and start an new memList)
		// when the number of leafs is the same
		// as the number of current conditions.
		if(isAnd){
			if(memSet.size() == conditions.size() && isRhs){
				storeMemSet();
				initEmptyMemSet();
			}
		}
		// If this leaf is not proceeded by an and-node than store
		// the leaf(s) and start a new memList that is populated
		// with the leafs of all proceeding and-nodes.
		else{
			storeMemSet();
			initPopulatedMemSet(leaf);
		}
	}
	
	/**
	 * Init a new <code>memSet</code> from the <code>rootNode</code> all the way
	 * down to this <code>leaf</code>.
	 * @param leaf
	 */
	private void initPopulatedMemSet(Leaf leaf){
		initEmptyMemSet();
		MemSetPopulator bt = new MemSetPopulator(leaf);
		rootNode.accept(bt);
	}
	
	private void initEmptyMemSet(){
		this.memSet = new HashSet<String>();
	}
	
	private void storeMemSet(){
		memory.add(memSet);
	}
	
	private void addToMemSet(Leaf leaf){
		memSet.add(leaf.getId());
	}
	
	
	private class MemSetPopulator extends DelegateVisitor{
		
		private Leaf endNodeChild;
		private boolean endNode = false;
		
		public MemSetPopulator(Leaf endNodeChild){
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
			else {
				if(conditions.contains(leaf))
					addToMemSet(leaf);
			}
		}

	}
	
}
