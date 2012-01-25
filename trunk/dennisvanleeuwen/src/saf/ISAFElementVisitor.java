package saf;

import saf.astelements.*;
import saf.astelements.actions.*;

public interface ISAFElementVisitor {
	public void visit(Arena element);
	public void visit(Fighter element);
	
	public void visit(Characteristic element);
	public void visit(Rule ruleElement);	

	public void visit(IAction ruleElement);	
	public void visit(ICondition ruleElement);	
	public void visit(IMove element);
	public void visit(IFight element);
	
}
