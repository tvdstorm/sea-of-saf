package saf;

import saf.astelements.*;
import saf.astelements.actions.*;
import saf.astelements.conditions.ANDConditionComposite;
import saf.astelements.conditions.ORConditionComposite;

public interface ISAFElementVisitor {
	public void visit(Arena element);
	public void visit(Fighter element);
	
	public void visit(Characteristic element);
	public void visit(Rule ruleElement);	

	public void visit(ICondition ruleElement);
	public void visit(ORConditionComposite element);
	public void visit(ANDConditionComposite element);

	public void visit(IAction ruleElement);	
	public void visit(ChooseActionComposite ruleElement);	
	public void visit(IMove element);
	public void visit(IFight element);
	
}
