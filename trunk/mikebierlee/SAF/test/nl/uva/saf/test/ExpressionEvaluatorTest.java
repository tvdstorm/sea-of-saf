package nl.uva.saf.test;

import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.Assert;

import nl.uva.saf.fdl.ExpressionEvaluator;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ConditionAnd;
import nl.uva.saf.fdl.ast.ConditionOr;

import org.junit.Test;

public class ExpressionEvaluatorTest {
	
	@Test
	public void evaluateAndConditionSuccessfullyTest() {
		ArrayList<String> operands = new ArrayList<String>();
		operands.add("near");
		operands.add("weaker");		
		ConditionAnd expression = new ConditionAnd(operands);
		
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("near", true);
		truthTable.put("weaker", true);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == true);
	}
	
	@Test
	public void evaluateAndConditionUnsuccessfullyTest() {
		ArrayList<String> operands = new ArrayList<String>();
		operands.add("near");
		operands.add("weaker");		
		ConditionAnd expression = new ConditionAnd(operands);
		
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("near", true);
		truthTable.put("weaker", false);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == false);
	}
	
	@Test
	public void evaluateAndConditionWithUnrelatedTruthsTest() {
		ArrayList<String> operands = new ArrayList<String>();
		operands.add("near");
		operands.add("weaker");		
		ConditionAnd expression = new ConditionAnd(operands);
		
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("far", true);
		truthTable.put("stronger", true);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == false);
	}
	
	@Test
	public void evaluateOrConditionSuccessfullyTest() {
		ArrayList<String> andOneOperands = new ArrayList<String>();
		andOneOperands.add("near");		
		ConditionAnd expressionOne = new ConditionAnd(andOneOperands);
		
		ArrayList<String> andTwoOperands = new ArrayList<String>();
		andTwoOperands.add("weaker");		
		ConditionAnd expressionTwo = new ConditionAnd(andTwoOperands);
		
		ArrayList<ConditionAnd> operands = new ArrayList<ConditionAnd>();
		operands.add(expressionOne);
		operands.add(expressionTwo);
		ConditionOr expression = new ConditionOr(operands);
		
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("near", true);
		truthTable.put("weaker", false);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == true);
	}
	
	@Test
	public void evaluateOrConditionUnsuccessfullyTest() {
		ArrayList<String> andOneOperands = new ArrayList<String>();
		andOneOperands.add("near");		
		ConditionAnd expressionOne = new ConditionAnd(andOneOperands);
		
		ArrayList<String> andTwoOperands = new ArrayList<String>();
		andTwoOperands.add("weaker");		
		ConditionAnd expressionTwo = new ConditionAnd(andTwoOperands);
		
		ArrayList<ConditionAnd> operands = new ArrayList<ConditionAnd>();
		operands.add(expressionOne);
		operands.add(expressionTwo);
		ConditionOr expression = new ConditionOr(operands);
		
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("near", false);
		truthTable.put("weaker", false);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == false);
	}
	
	@Test
	public void evaluateOrConditionWithUnrelatedTruthsTest() {
		ArrayList<String> andOneOperands = new ArrayList<String>();
		andOneOperands.add("near");		
		ConditionAnd expressionOne = new ConditionAnd(andOneOperands);
		
		ArrayList<String> andTwoOperands = new ArrayList<String>();
		andTwoOperands.add("weaker");		
		ConditionAnd expressionTwo = new ConditionAnd(andTwoOperands);
		
		ArrayList<ConditionAnd> operands = new ArrayList<ConditionAnd>();
		operands.add(expressionOne);
		operands.add(expressionTwo);
		ConditionOr expression = new ConditionOr(operands);
		
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("far", true);
		truthTable.put("stronger", true);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == false);
	}
	
	@Test
	public void evaluateAlwaysCondition() {
		ConditionAlways expression = new ConditionAlways();
		HashMap<String, Boolean> truthTable = new HashMap<String, Boolean>();
		truthTable.put("far", true);
		truthTable.put("stronger", true);
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate());
	}
}
