package saf;

import saf.astelements.*;
import saf.astelements.actions.*;
import saf.astelements.conditions.ANDConditionComposite;
import saf.astelements.conditions.ORConditionComposite;

public interface ISAFNodeVisitor {
	public void visit(Arena arenaNode);
	public void visit(Fighter fighterNode);
	
	public void visit(Characteristic characteristicNode);
	public void visit(Rule ruleNode);	

	public void visit(ORConditionComposite orNode);
	public void visit(ANDConditionComposite andNode);
	public void visit(saf.astelements.conditions.StringLeaf stringLeafConditionNode);
	
	public void visit(ChooseActionComposite chooseActionNode);	
	public void visit(saf.astelements.actions.StringLeaf stringLeafActionNode);
}
