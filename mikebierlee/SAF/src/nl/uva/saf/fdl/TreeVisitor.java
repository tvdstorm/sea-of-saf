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

import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Choice;
import nl.uva.saf.fdl.ast.ConditionAlways;
import nl.uva.saf.fdl.ast.ConditionOr;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.FightChoice;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.ast.MoveAction;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;


public abstract class TreeVisitor implements ITreeVisitor {

	@Override
	public void visit(Fighter node) {	
		for(ITreeNode attribute : node.getAttributes()) {
			attribute.accept(this);
		}
	}

	@Override
	public void visit(Characteristic node) {}

	@Override
	public void visit(Behaviour node) {
		node.getCondition().accept(this);
		node.getRule().accept(this);		
	}

	@Override
	public void visit(ConditionAlways node) {}

	@Override
	public void visit(FightAction node) {}

	@Override
	public void visit(FightChoice node) {
		visit((Choice)node);		
	}

	@Override
	public void visit(MoveAction node) {}

	@Override
	public void visit(MoveChoice node) {
		visit((Choice)node);		
	}
	
	@Override
	public void visit(Choice node) {
		for(ITreeNode action : node.getActions()) {
			action.accept(this);
		}		
	}

	@Override
	public void visit(Rule node) {
		node.getFightChoice().accept(this);
		node.getMoveChoice().accept(this);
	}
	


	@Override
	public void visit(ConditionOr node) {
		for(ITreeNode operand : node.getOperands()) {
			operand.accept(this);
		}
	}
}
