package saf;

import saf.astelements.*;
import saf.astelements.actions.*;
import saf.astelements.conditions.ANDConnective;
import saf.astelements.conditions.ORConnective;

public interface ISAFNodeVisitor {
	public void visit(Fighter fighterNode);
	
	public void visit(Characteristic characteristicNode);
	public void visit(Rule ruleNode);	

	public void visit(ORConnective orNode);
	public void visit(ANDConnective andNode);
	public void visit(saf.astelements.conditions.Simple simpleNode);
	
	public void visit(ChooseComposite chooseActionNode);	
	public void visit(saf.astelements.actions.Simple simpleNode);
}
