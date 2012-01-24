package astChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ast.*;
import ast.actions.IFightActionElement;
import ast.actions.IMoveActionElement;
import ast.actions.fightActions.DefaultFightActionElement;
import ast.actions.fightActions.PunchLowFightActionElement;
import ast.actions.moveActions.CrouchMoveActionElement;
import ast.actions.moveActions.DefaultMoveActionElement;
import ast.conditions.ANDConditionElement;
import ast.conditions.AlwaysConditionElement;
import ast.conditions.DefaultConditionElement;
import ast.conditions.ORConditionElement;
import saf.*;

public class SAFASTElementValidator implements ISAFElementVisitor{
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 10;
	private static final List<String> possibleCharacteristics = Arrays.asList("punchReach", 
																			  "punchPower", 
																			  "kickReach", 
																			  "kickPower");
	
	private List<String> astErrors;
	
	public SAFASTElementValidator(){
		this.astErrors = new ArrayList<String>();
	}
	
	public List<String> getASTErrors(){
		return this.astErrors;
	}
	
	public Boolean hasFoundErrors(){
		return !this.astErrors.isEmpty();
	}
	
	@Override
	public void visit(ArenaElement arenaElement) {
		if(arenaElement.getBots().size() != 2)
			this.astErrors.add("You have to specify two bots.");
	}
	
	private Boolean isAlwaysCondition(IConditionElement condition){
		if(condition instanceof AlwaysConditionElement)
			return true;
		else if(condition instanceof ANDConditionElement){
			ANDConditionElement andElement = (ANDConditionElement)condition;
			return (this.isAlwaysCondition(andElement.getFirstCondition()) && 
					this.isAlwaysCondition(andElement.getSecondCondition()));
		} else if(condition instanceof ORConditionElement){
			ORConditionElement orElement = (ORConditionElement)condition;
			return (this.isAlwaysCondition(orElement.getFirstCondition()) || 
					this.isAlwaysCondition(orElement.getSecondCondition()));
		}
		return false;		
	}

	@Override
	public void visit(BotElement botElement) {
		if(botElement.getName() == "")
			this.astErrors.add("You have to specify a name for the bot");
		
		//There must be at least 1 "always" rule
		Boolean alwaysRuleFound = false;
		for(RuleElement rule: botElement.getRules()){
			if(this.isAlwaysCondition(rule.getCondition()))
				alwaysRuleFound = true;
		}
		
		if(!alwaysRuleFound){
			this.astErrors.add("No always rule specified in " + botElement.getName());
		}
	}

	@Override
	public void visit(CharacteristicElement charateristicElement) {
		if(!possibleCharacteristics.contains(charateristicElement.item))
			this.astErrors.add("Unknown characteristic encountered: " + charateristicElement.item);
		if(charateristicElement.value > MAX_VALUE || charateristicElement.value < MIN_VALUE)
			this.astErrors.add("Wrong characteristic encountered, it can only be a value of 1 to 10 inclusive: " + charateristicElement.value);
	}
	
	@Override
	public void visit(RuleElement ruleElement) {
		if(ruleElement.getCondition() == null)
			this.astErrors.add("Empty condition in rules");
		if(ruleElement.getMoveAction() == null)
			this.astErrors.add("Empty move action in rules");
		if(ruleElement.getFightAction() == null)
			this.astErrors.add("Empty fight action in rules");
	}

	@Override
	public void visit(IConditionElement conditionElement) {
		if(conditionElement instanceof DefaultConditionElement)
			this.astErrors.add("Unknown condition " + ((DefaultConditionElement)conditionElement).getElementName() + " in rule.");
	}

	@Override
	public void visit(IActionElement actionElement) {
	}
	
	@Override
	public void visit(IMoveActionElement moveElement) {
		if(moveElement instanceof DefaultMoveActionElement)
			this.astErrors.add("Unknown moveaction " + ((DefaultMoveActionElement)moveElement).getElementName() + " in rule.");
	}

	@Override
	public void visit(IFightActionElement fightElement){
		if(fightElement instanceof DefaultFightActionElement)
			this.astErrors.add("Unknown fightaction " + ((DefaultFightActionElement)fightElement).getElementName() + " in rule.");
	}
}
