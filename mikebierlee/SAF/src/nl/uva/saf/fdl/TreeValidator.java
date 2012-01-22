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

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Choice;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ITreeNode;

public class TreeValidator extends TreeVisitor {
	private ValidationReport report = null;
	boolean alwaysConditionPresent = false;
		
	public ValidationReport validate(ITreeNode tree) {
		report = new ValidationReport();
		alwaysConditionPresent = false;
		
		tree.accept(this);
		
		if (!alwaysConditionPresent) {
			addError("\"always\" behaviour condition not specified.");
		}
		
		return report; 
	}
	
	@Override
	public void visit(Characteristic node) {		
		String type = node.getType();
		
		if (!type.equals("punchReach") &&
			!type.equals("punchPower") &&
			!type.equals("kickReach") &&
			!type.equals("kickPower")) {
			addWarning(type + ": unrecognized characteristic.");
		}
		
		int value = node.getValue();
		if (value < 1 || value > 10) {
			addError(type + ": value " + value + " out of bounds (range: 1-10)");
		}
		
		super.visit(node);
	}
	
	@Override
	public void visit(ConditionAlways node) {
		alwaysConditionPresent = true;		
		super.visit(node);
	}
	
	@Override
	public void visit(Choice node) {
		if (node.getActions().size() == 0) {
			addError("Choice clause contains no choices"); // TODO(mike): Make traceable
		}
		
		super.visit(node);
	}
	
	public void addWarning(String warning) {
		if (report != null) {
			report.addWarning(warning);
		}
	}
	
	public void addError(String error) {
		if (report != null) {
			report.addError(error);
		}
	}
}
