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

		for (String operand : node.getOperands()) {
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
