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
	private Rule rule;
	private List<Rule> rules = new ArrayList<Rule>();
	private boolean perceededByAnd = false;
	private boolean isRhs = false;
	private Condition rootNode;
	private Behavior behavior;
	
	public Populator(){
	}
	
	public List<Rule> populate(Set<String> conditions, FighterAI fighter){
		this.conditions = conditions;
		fighter.ast.accept(this);
		return rules;
	}
	
	
	@Override
	public void visit(Fighter fighter) {
		super.visit(fighter);
	}
	
	public void visit(Behavior behavior){
		this.behavior = behavior;
		initNewRule();
		perceededByAnd = false;
		rootNode = behavior.getCondition();
		behavior.getCondition().accept(this);
	}
	
	@Override
	public void visit(And and){
		perceededByAnd = true;
		delegate(and);
	}
	
	@Override
	public void visit(Or or) {
		perceededByAnd = false;
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
		addToRuleConditions(leaf);
		attemptRuleStore(leaf);
	}
	
	private void attemptRuleStore(Leaf leaf){
		// if this leaf was proceeded by an and-node, than
		// only store them (and start an new rule)
		// when the number of leafs is the same
		// as the number of current conditions.
		if(perceededByAnd){
			if(rule.size() == conditions.size() && isRhs){
				storeRule();
				initNewRule();
			}
		}
		// If this leaf is not proceeded by an and-node than store
		// the leaf(s) and start a new rule that is populated
		// with the leafs of all proceeding and-nodes.
		else{
			storeRule();
			initConditionedRule(leaf);
		}
	}
	
	/**
	 * Init a new <code>rule</code> with conditions from the <code>rootNode</code> all the way
	 * down to this <code>leaf</code>.
	 * @param leaf
	 */
	private void initConditionedRule(Leaf leaf){
		initNewRule();
		RuleConditionsPopulator bt = new RuleConditionsPopulator(leaf);
		rootNode.accept(bt);
	}
	
	private void initNewRule(){
		Set<String> ruleConditions = new HashSet<String>();
		this.rule = new Rule(ruleConditions, this.behavior);
	}
	
	private void storeRule(){
		rules.add(rule);
	}
	
	private void addToRuleConditions(Leaf leaf){
		rule.addCondition(leaf.getId());
	}
	
	
	private class RuleConditionsPopulator extends DelegateVisitor{
		
		private Leaf endNodeChild;
		private boolean endNode = false;
		
		public RuleConditionsPopulator(Leaf endNodeChild){
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
					addToRuleConditions(leaf);
			}
		}

	}
	
}
