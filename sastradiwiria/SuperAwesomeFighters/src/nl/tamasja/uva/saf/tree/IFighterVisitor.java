package nl.tamasja.uva.saf.tree;
import nl.tamasja.uva.saf.tree.ast.*;

public interface IFighterVisitor {
	public void visit(Fighter fighter);
	
	public void visit(Strength strength);
	public void visit(Behaviour behaviour);
	
	public void visit(ActionAtom actionAtom);
	public void visit(ChooseAction chooseAction);
	
	public void visit(AndCondition andCondition);
	public void visit(OrCondition orCondition);
	public void visit(ConditionAtom conditionAtom);
}
