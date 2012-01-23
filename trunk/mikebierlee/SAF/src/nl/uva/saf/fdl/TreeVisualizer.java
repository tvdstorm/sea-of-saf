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
		for(FighterAttribute attribute : node.getAttributes()) {
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
			for(String operand : node.getOperands()) {
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
			for(Action action : node.getActions()) {
				action.accept(this);
			}
		level--;
	}
	
	public void visit(FightChoice node) {
		treeString += getIdentation() + "FightChoice()\n";
		level++;
			for(Action action : node.getActions()) {
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
		
		for (int i = 0; i < level; i ++) {
			identation += "\t";
		}
		
		return identation;
	}
}
