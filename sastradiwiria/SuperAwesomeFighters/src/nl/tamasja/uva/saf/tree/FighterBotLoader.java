package nl.tamasja.uva.saf.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import nl.tamasja.uva.saf.fighter.BehaviourRule;
import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.Personality;
import nl.tamasja.uva.saf.fighter.SpecificationMapper;
import nl.tamasja.uva.saf.fighter.action.ActionMapper;
import nl.tamasja.uva.saf.fighter.action.BehaviourActionClass;
import nl.tamasja.uva.saf.fighter.action.Choose;
import nl.tamasja.uva.saf.fighter.action.IAction;
import nl.tamasja.uva.saf.fighter.action.IBehaviourAction;
import nl.tamasja.uva.saf.fighter.condition.ConditionMapper;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;
import nl.tamasja.uva.saf.graphics.IFighterGraphics;
import nl.tamasja.uva.saf.tree.ast.ActionAtom;
import nl.tamasja.uva.saf.tree.ast.AndCondition;
import nl.tamasja.uva.saf.tree.ast.Behaviour;
import nl.tamasja.uva.saf.tree.ast.ChooseAction;
import nl.tamasja.uva.saf.tree.ast.ConditionAtom;
import nl.tamasja.uva.saf.tree.ast.Fighter;
import nl.tamasja.uva.saf.tree.ast.ICondition;
import nl.tamasja.uva.saf.tree.ast.IProperty;
import nl.tamasja.uva.saf.tree.ast.OrCondition;
import nl.tamasja.uva.saf.tree.ast.Strength;

public class FighterBotLoader implements IFighterVisitor {
	
	
	private ArrayList<ConditionAtom> conditionAtoms;
	private ConditionMapper conditionMapper;
	private ActionMapper actionMapper;
	private SpecificationMapper specificationMapper;
	
	Queue<IBehaviourCondition> conditions;
	Queue<IBehaviourAction> actions;
	
	
	//FighterBot fighterBot;
	
	private Personality personality;
	private nl.tamasja.uva.saf.fighter.Behaviour behaviour;
	
	public FighterBotLoader() {
		this.conditionAtoms = new ArrayList<ConditionAtom>();
		this.conditionMapper = new ConditionMapper();
		this.specificationMapper = new SpecificationMapper();
		
		this.actionMapper = new ActionMapper();
		
		conditions = new LinkedList<IBehaviourCondition>();
		actions = new LinkedList<IBehaviourAction>();
		
		
	}
	/*
	public IBehaviourCondition getCondition() {
		//TODO:check size? System.out.println(conditions.size());
		return conditions.peek();
	}
	
	public IBehaviourAction getAction() {
		return actions.peek();
	}
	
	public void clearActions() {
		actions.clear();
	}
	*/
	
	public FighterBot traverseFighterAst(Fighter fighterAst, IFighterGraphics graphics) {
		
		//fighterAst.accept(this);
		
		traverseBehaviour(fighterAst.getProperties());
		
		return new FighterBot(fighterAst.getName(), behaviour, personality, graphics);
		
		//return fighterBot; 
	}
	
	public IBehaviourCondition traverseConditions(nl.tamasja.uva.saf.tree.ast.ICondition cNode) {
		conditions.clear();
		cNode.accept(this);
		return conditions.peek();
	}
	
	public IBehaviourAction traverseActions(nl.tamasja.uva.saf.tree.ast.IAction aNode) {
		actions.clear();
		aNode.accept(this);
		return actions.peek();
		
	}
	
	protected void traverseBehaviour(ArrayList<IProperty> properties) {
		behaviour = new nl.tamasja.uva.saf.fighter.Behaviour();
		personality = new Personality();
		for(IProperty p: properties) {
			p.accept(this);
		}
	}
	

	@Override
	public void visit(Fighter fighter) {

	}

	@Override
	public void visit(Strength strength) {
		
		SpecificationMapper.Strength str = specificationMapper.MapStrength(strength.getName());
		
		if(str != null) personality.AddStat(str,strength.getValue());
	}

	@Override
	public void visit(Behaviour behaviour) {
		this.behaviour.AddRule(
				new BehaviourRule(
						traverseConditions(behaviour.getCondition()),
						traverseActions(behaviour.getFightAction()), 
						traverseActions(behaviour.getMoveAction()))
		);
	}

	@Override
	public void visit(ActionAtom actionAtom) {
		// TODO Auto-generated method stub
		String actionString = actionAtom.getAction();
		SpecificationMapper.Attack attack = specificationMapper.MapAttack(actionString);
		SpecificationMapper.Move move = specificationMapper.MapMove(actionString);
		IAction action;
		
		if(attack == null) {
			action = actionMapper.Map(move);
		} else {
			action = actionMapper.Map(attack);
		}
		
		if(action != null) actions.add(new BehaviourActionClass(action));

	}

	@Override
	public void visit(ChooseAction chooseAction) {
		
		Choose choose = new Choose();
		
		while(actions.size() != 0) {
			choose.AddChoice(actions.poll());
		}
		
		actions.add(choose);
	}

	@Override
	public void visit(AndCondition andCondition) {
		conditions.add(new nl.tamasja.uva.saf.fighter.conditions.AndCondition(conditions.poll(), conditions.poll()));
		

	}

	@Override
	public void visit(OrCondition orCondition) {
		conditions.add(new nl.tamasja.uva.saf.fighter.conditions.OrCondition(conditions.poll(), conditions.poll()));
	}

	@Override
	public void visit(ConditionAtom conditionAtom) {
		IBehaviourCondition ruleCondition = conditionMapper.Map(specificationMapper.MapCondition(conditionAtom.getName()));
		System.out.println(conditionAtom.getName()+" -> "+ruleCondition);
		if(ruleCondition != null) conditions.add(ruleCondition);
	}

}
