package saf;

import saf.astnodes.*;
import saf.astnodes.actions.*;
import saf.astnodes.conditions.AndConnective;
import saf.astnodes.conditions.OrConnective;

public interface ISAFNodeVisitor {
	public void visit(Fighter fighterNode);
	
	public void visit(Characteristic characteristicNode);
	public void visit(Rule ruleNode);	

	public void visit(OrConnective orNode);
	public void visit(AndConnective andNode);
	public void visit(saf.astnodes.conditions.Simple simpleNode);
	
	public void visit(ChooseComposite chooseActionNode);	
	public void visit(saf.astnodes.actions.Simple simpleNode);
}
