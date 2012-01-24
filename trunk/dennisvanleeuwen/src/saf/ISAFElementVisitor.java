package saf;

import ast.*;
import ast.actions.IFightActionElement;
import ast.actions.IMoveActionElement;
import ast.actions.fightActions.*;
import ast.actions.moveActions.*;
import ast.conditions.*;

public interface ISAFElementVisitor {
	public void visit(ArenaElement element);
	public void visit(BotElement element);
	
	public void visit(CharacteristicElement element);
	public void visit(RuleElement ruleElement);	

	public void visit(IActionElement ruleElement);	
	public void visit(IConditionElement ruleElement);	
	public void visit(IMoveActionElement element);
	public void visit(IFightActionElement element);
	
}
