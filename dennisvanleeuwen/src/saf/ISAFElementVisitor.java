package saf;

import ast.*;

public interface ISAFElementVisitor {
	public void visit(ArenaElement element) throws Exception;
	public void visit(BotElement element) throws Exception;
	
	public void visit(CharacteristicElement element) throws Exception;
	public void visit(RuleElement ruleElement) throws Exception;	

	public void visit(IActionElement ruleElement) throws Exception;	
	public void visit(IConditionElement ruleElement) throws Exception;	
	public void visit(IMoveActionElement element) throws Exception;
	public void visit(IFightActionElement element) throws Exception;
}
