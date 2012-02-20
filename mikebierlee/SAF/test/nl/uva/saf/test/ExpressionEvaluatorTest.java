/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.test;

import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.Assert;

import nl.uva.saf.fdl.ExpressionEvaluator;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ConditionAnd;
import nl.uva.saf.fdl.ast.ConditionOr;
import nl.uva.saf.fdl.types.ConditionType;

import org.junit.Test;

public class ExpressionEvaluatorTest {

	@Test
	public void evaluateAlwaysCondition() {
		ConditionAlways expression = new ConditionAlways();
		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.far, true);
		truthTable.put(ConditionType.stronger, true);

		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate());
	}

	@Test
	public void evaluateAndConditionSuccessfullyTest() {
		ArrayList<String> operands = new ArrayList<String>();
		operands.add("near");
		operands.add("weaker");
		ConditionAnd expression = new ConditionAnd(operands);

		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.near, true);
		truthTable.put(ConditionType.weaker, true);

		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == true);
	}

	@Test
	public void evaluateAndConditionUnsuccessfullyTest() {
		ArrayList<String> operands = new ArrayList<String>();
		operands.add("near");
		operands.add("weaker");
		ConditionAnd expression = new ConditionAnd(operands);

		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.near, true);
		truthTable.put(ConditionType.weaker, false);

		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == false);
	}

	@Test
	public void evaluateAndConditionWithUnrelatedTruthsTest() {
		ArrayList<String> operands = new ArrayList<String>();
		operands.add("near");
		operands.add("weaker");
		ConditionAnd expression = new ConditionAnd(operands);

		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.far, true);
		truthTable.put(ConditionType.stronger, true);

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

		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.near, true);
		truthTable.put(ConditionType.weaker, false);

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

		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.near, false);
		truthTable.put(ConditionType.weaker, false);

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

		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.far, true);
		truthTable.put(ConditionType.stronger, true);

		ExpressionEvaluator evaluator = new ExpressionEvaluator(expression, truthTable);
		Assert.assertTrue(evaluator.evaluate() == false);
	}
}
