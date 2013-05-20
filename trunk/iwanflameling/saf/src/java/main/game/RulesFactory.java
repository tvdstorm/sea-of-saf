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

public class RulesFactory extends DelegateVisitor {
	
	private Set<String> conditions;
	private List<Rule> rules;
	private boolean firstParentIsAnd;
	private boolean isRhs;
	private Condition rootNode;
	private Behavior behavior;
	private Rule rule;
	private Stack<And> stack;
	
	public RulesFactory(){
		initMembers();
	}
	
	private void initMembers(){
		this.conditions = new HashSet<String>();
		this.rules = new ArrayList<Rule>();
		this.firstParentIsAnd = false;
		this.isRhs = false;
		this.rootNode = null;
		this.behavior = null;
		this.rule = null;
		this.stack = new Stack<And>();
	}
	
	/**
	 * Convenience method that returns the rules that addresses the
	 * <code>conditions</code> best. It only returns rules that most specifically
	 * match the <code>conditions</code>.
	 * 
	 * @param conditions The conditions that apply to the <code>fighter</code>'s rules.
	 * @param fighter the {@link FighterAI fighter} from who the rules are needed.
	 * @return Rules that are best applicable to the fighter during the given
	 * <code>conditions</code>.
	 * @see RulesFactory#getAllRules(Set, FighterAI)
	 */
	public List<Rule> getRules(Set<String> conditions, FighterAI fighter){
		List<Rule> allRules = getAllRules(conditions, fighter);
		List<Rule> rules = getBestFittingRules(allRules, conditions.size());
		return rules;
	}
	
	/**
	 * 
	 * @param conditions The conditions that apply to the <code>fighter</code>'s rules.
	 * @param fighter the {@link FighterAI fighter} from who the rules are needed.
	 * @return Rules that are applicable to the fighter during the given
	 * <code>conditions</code>.
	 */
	public List<Rule> getAllRules(Set<String> conditions, FighterAI fighter){
		initMembers();
		this.conditions = conditions;
		fighter.ast.accept(this);
		return rules;
	}
	
	private List<Rule> getBestFittingRules(List<Rule> rules, int numberOfDefinedConditions){
		List<Rule> result = null;
		for(;numberOfDefinedConditions > 0; numberOfDefinedConditions--){
			result = getRulesWithExactSize(rules, numberOfDefinedConditions);
			if(!result.isEmpty())
				break;
		}
		return result;
	}
	
	private List<Rule> getRulesWithExactSize(List<Rule> rules, int setSize){
		List<Rule> result = new ArrayList<Rule>();
		for(Rule rule : rules){
			if(rule.size() == setSize){
				result.add(rule);
			}
		}
		return result;
	}
	
	
	@Override
	public void visit(Fighter fighter) {
		super.visit(fighter);
	}
	
	public void visit(Behavior behavior){
		this.behavior = behavior;
		initNewRule();
		firstParentIsAnd = false;
		this.stack = new Stack<And>();
		rootNode = behavior.getCondition();
		behavior.getCondition().accept(this);
	}
	
	@Override
	public void visit(And and){
		firstParentIsAnd = true;
		stack.add(and);
		delegate(and);
	}
	
	@Override
	public void visit(Or or) {
		firstParentIsAnd = false;
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
		if(firstParentIsAnd){
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
	
	private boolean storeRuleIsAllowed(){
		if(stack.size()+1 == rule.size()){
			return true;
		} else{
			return false;
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
		if(storeRuleIsAllowed())
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
