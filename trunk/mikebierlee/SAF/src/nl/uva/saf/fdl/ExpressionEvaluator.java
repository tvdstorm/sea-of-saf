package nl.uva.saf.fdl;

import java.util.HashMap;

import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ConditionAnd;
import nl.uva.saf.fdl.ast.ConditionOr;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.types.ConditionType;
import nl.uva.saf.fdl.types.TypeTranslator;

public class ExpressionEvaluator extends TreeVisitor {
	private final ITreeNode expression;
	private HashMap<ConditionType, Boolean> truthTable;
	private boolean evaluation;
	
	public ExpressionEvaluator(ITreeNode expression, HashMap<ConditionType, Boolean> truthTable) {
		if (expression == null) {
			throw new IllegalArgumentException("expression");
		}
		
		if (truthTable == null) {
			throw new IllegalArgumentException("truthTable");
		}
		
		this.expression = expression;
		this.truthTable = truthTable;
		evaluation = false;
	}
	
	public boolean evaluate() {
		expression.accept(this);		
		return evaluation;
	}
	
	@Override
	public void visit(ConditionAnd node) {
		evaluation = true;
		
		for(String operand : node.getOperands()) {
			Boolean truth = truthTable.get(TypeTranslator.getConditionType(operand));
			if (truth == null || truth.booleanValue() == false) {
				evaluation = false;
				break;
			}
		}
	}
	
	@Override
	public void visit(ConditionOr node) {
		evaluation = false;
		
		for (ConditionAnd childCondition : node.getOperands()) {
			ExpressionEvaluator childEvaluator = new ExpressionEvaluator(childCondition, truthTable);
			
			if (childEvaluator.evaluate() == true) {
				evaluation = true;
				break;
			}
		}		
	}
	
	@Override
	public void visit(ConditionAlways node) {
		evaluation = true;
	}
}
