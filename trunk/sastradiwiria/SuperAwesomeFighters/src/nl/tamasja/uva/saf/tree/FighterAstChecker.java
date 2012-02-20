package nl.tamasja.uva.saf.tree;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import nl.tamasja.uva.saf.fighter.SpecificationMapper;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.*;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Condition;
import nl.tamasja.uva.saf.tree.ast.*;
import nl.tamasja.uva.saf.tree.ast.Strength;

public class FighterAstChecker implements IFighterVisitor {

	
	SpecificationMapper specificationMapper;
	private ArrayList<ErrorMessage> errors;
	private boolean hasAlwaysCondition = false;
	
	public FighterAstChecker() {
		this.specificationMapper = new SpecificationMapper();
		this.errors = new ArrayList<ErrorMessage>();
	}
	
	public ArrayList<ErrorMessage> checkAst(Fighter fighter) {
		errors.clear();
		fighter.accept(this);
		return errors;
	}
	
	public ArrayList<ErrorMessage> getErrors() {
		return errors;
	}
	
	@Override
	public void visit(Fighter fighter) {
		System.out.println(fighter.getName());
		
		if(!hasAlwaysCondition) 
			errors.add(new ErrorMessage("There must be an always rule"));
	}

	@Override
	public void visit(Strength strength) {
		String name = strength.getName();
		int value = strength.getValue();
		System.out.println(name+"="+value);
		
		if(specificationMapper.MapStrength(name) == null)
			 errors.add(new ErrorMessage("Invalid strength statistic: "+name));
		
		if(value < 1 || value > 10)
			 errors.add(new ErrorMessage("Invalid strength value for "+name+": "+value));

	}

	@Override
	public void visit(Behaviour behaviour) {
		if(behaviour.getCondition() == null)
			errors.add(new ErrorMessage("Behaviour rule has empty condition"));
		if(behaviour.getMoveAction() == null)
			errors.add(new ErrorMessage("Behaviour rule has empty move action"));
		if(behaviour.getFightAction() == null)
			errors.add(new ErrorMessage("Behaviour rule has empty fight action"));
	}

	@Override
	public void visit(ActionAtom actionAtom) {
		
		String action = actionAtom.getAction();

		SpecificationMapper.Attack attack = specificationMapper.MapAttack(action);
		SpecificationMapper.Move move = specificationMapper.MapMove(action);
		
		if(attack == null && move == null) {
			errors.add(new ErrorMessage("Invalid action: "+action));
		}
		
	}

	@Override
	public void visit(ChooseAction chooseAction) {

	}

	@Override
	public void visit(AndCondition andCondition) {

	}

	@Override
	public void visit(OrCondition orCondition) {

	}

	@Override
	public void visit(ConditionAtom conditionAtom) {
		String conditionString = conditionAtom.getName();
		SpecificationMapper.Condition condition = specificationMapper.MapCondition(conditionString);
		if(condition == null) {
			errors.add(new ErrorMessage("Invalid condition: "+conditionString));
		}
		if(condition == Condition.ALWAYS) hasAlwaysCondition = true;
	}

}
