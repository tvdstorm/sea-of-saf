package astChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ast.*;
import ast.conditions.AlwaysConditionElement;
import saf.*;

public class SAFASTElementValidator implements ISAFElementVisitor{
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 10;
	private static final List<String> possibleCharacteristics = Arrays.asList("punchReach", 
																			  "punchPower", 
																			  "kickReach", 
																			  "kickPower");
	
	@Override
	public void visit(ArenaElement arenaElement) throws Exception {
		if(arenaElement.getBots().size() != 2)
			throw new Exception("You have to specify two bots");
	}

	@Override
	public void visit(BotElement botElement) throws Exception {
		if(botElement.getName() == "")
			throw new Exception("You have to specify a name for the bot");
		
		//There must be at least 1 "always" rule
		Boolean alwaysRuleFound = false;
		for(RuleElement rule: botElement.getRules()){
			if(rule.getCondition() instanceof AlwaysConditionElement)/* TODO: recursive */
				alwaysRuleFound = true;
		}
		
		if(!alwaysRuleFound){
			throw new Exception("No always rule specified in " + botElement.getName());
		}
	}

	@Override
	public void visit(CharacteristicElement charateristicElement) throws Exception {
		if(!possibleCharacteristics.contains(charateristicElement.item))
			throw new Exception("Unknown characteristic encountered: " + charateristicElement.item);
		if(charateristicElement.value > MAX_VALUE || charateristicElement.value < MIN_VALUE)
			throw new Exception("Wrong characteristic encountered, it can only be a value of 1 to 10 inclusive: " + charateristicElement.value);
	}
	
	@Override
	public void visit(RuleElement ruleElement) throws Exception {
	}

	@Override
	public void visit(IConditionElement conditionElement) throws Exception {
	}

	@Override
	public void visit(IActionElement actionElement) throws Exception {
	}
	
	@Override
	public void visit(IMoveActionElement moveElement) throws Exception {
	}

	@Override
	public void visit(IFightActionElement fightElement) throws Exception {
	}
}
