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

	public void visit(ORConditionComposite orElement);
	public void visit(ANDConditionComposite andElement);
	public void visit(saf.astelements.conditions.Simple simpleConditionElement);
	
	public void visit(ChooseActionComposite chooseActionElement);	
	public void visit(saf.astelements.actions.Simple simpleActionElement);

	
}
