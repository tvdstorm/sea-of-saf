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

import nl.uva.saf.fdl.ast.Action;
import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ConditionAnd;
import nl.uva.saf.fdl.ast.ConditionOr;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.FightChoice;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.FighterAttribute;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.ast.MoveAction;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;

public class TreeVisualizer extends TreeVisitor {
	String treeString;
	int level;

	public void printTree(ITreeNode tree) {
		treeString = new String();
		level = 0;
		tree.accept(this);
		System.out.println(treeString);
	}

	public void visit(Fighter node) {
		treeString += getIdentation() + "Fighter(" + node.getName() + ")\n";
		level++;
		for (FighterAttribute attribute : node.getAttributes()) {
			attribute.accept(this);
		}
		level--;
	}

	public void visit(Characteristic node) {
		treeString += getIdentation() + "Characteristic(" + node.getType() + ", " + node.getValue() + ")\n";
	}

	public void visit(Behaviour node) {
		treeString += getIdentation() + "Behaviour()\n";
		level++;
		node.getCondition().accept(this);
		node.getRule().accept(this);
		level--;
	}

	public void visit(ConditionAlways node) {
		treeString += getIdentation() + "Always()\n";
	}

	public void visit(ConditionOr node) {
		treeString += getIdentation() + "Or()\n";
		level++;
		for (ConditionAnd operand : node.getOperands()) {
			operand.accept(this);
		}
		level--;
	}

	public void visit(ConditionAnd node) {
		treeString += getIdentation() + "And()\n";
		level++;
		for (String operand : node.getOperands()) {
			treeString += getIdentation() + operand + "\n";
		}
		level--;
	}

	public void visit(Rule node) {
		treeString += getIdentation() + "Rule()\n";
		level++;
		node.getMoveChoice().accept(this);
		node.getFightChoice().accept(this);
		level--;
	}

	public void visit(MoveChoice node) {
		treeString += getIdentation() + "MoveChoice()\n";
		level++;
		for (Action action : node.getActions()) {
			action.accept(this);
		}
		level--;
	}

	public void visit(FightChoice node) {
		treeString += getIdentation() + "FightChoice()\n";
		level++;
		for (Action action : node.getActions()) {
			action.accept(this);
		}
		level--;
	}

	public void visit(MoveAction node) {
		treeString += getIdentation() + "MoveAction(" + node.getActionType() + ")\n";
	}

	public void visit(FightAction node) {
		treeString += getIdentation() + "FightAction(" + node.getActionType() + ")\n";
	}

	private String getIdentation() {
		String identation = "";

		for (int i = 0; i < level; i++) {
			identation += "\t";
		}

		return identation;
	}
}
