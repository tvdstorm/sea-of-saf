/**
 * 
 */
package ast;

import java.util.List;

import ast.action.Choose;
import ast.action.SimpleAction;
import ast.condition.And;
import ast.condition.Condition;
import ast.condition.Leaf;
import ast.condition.Or;
import ast.fighter.Behavior;
import ast.fighter.FighterProp;
import ast.fighter.Strength;
import ast.fighter.prop.Id;
import ast.object.Fighter;

/**
 * @author iwan
 *
 */
public class Printer implements Visitor {
	
	public static String print(ASTNode node){
		Printer printer = new Printer();
		node.accept(printer);
		return printer.sb.toString();
	}
	
	private StringBuilder sb = new StringBuilder();
	
	private void append(String append){
		sb.append(append);
	}
	
	public void visit(And and){
		append("[");
		and.getLhs().accept(this);
		append(" -and- ");
		and.getRhs().accept(this);
		append("]");
	}
	
	public void visit(Object obj){
		append(obj.toString() + "-obj");
	}

	@Override
	public void visit(Leaf leaf) {
		append("[Leaf: ");
		append(leaf.getId());
		append("]");
		
	}

	@Override
	public void visit(Or or) {
		Condition lhs = or.getLhs();
		Condition rhs = or.getRhs();
		append("[");
		lhs.accept(this);
		append(" -or- ");
		rhs.accept(this);
		append("]");
		
	}
	
	@Override
	public void visit(SimpleAction action) {
		append("[");
		append(action.getAction());
		append("]");
	};
	
	public void visit(Choose choose) {
		append("[choose: ");
		List<SimpleAction> choices = choose.getChoices();
		int counter = 1;
		for(SimpleAction action: choices){
			action.accept(this);
			if(counter != choices.size()){
				append(", ");
			}
			counter++;
		}
		append("]");
	};
	
	@Override
	public void visit(Strength strength) {
		append("[Strength: ");
		append(strength.getFightId());
		append("=");
		append(Integer.toString(strength.getFightPower()));
		append("]");
		
	}
	
	@Override
	public void visit(Behavior behavior) {
		append("[Behavior: ");
		behavior.getCondition().accept(this);
		append(", ");
		behavior.getMoveAction().accept(this);
		append(",");
		behavior.getFightAction().accept(this);
		append("]");
		
	}
	
	@Override
	public void visit(Fighter fighter) {
		append("[Fighter: ");
		append("name = ");
		append(fighter.getName());
		append(", ");
		
		List<FighterProp> fighterProps = fighter.getFighterProps();
		int counter = 1;
		for(FighterProp fighterProp : fighterProps){
			append("\n");
			fighterProp.accept(this);
			if(counter != fighterProps.size()){
				append(", ");
			}
			counter++;
		}
		
		append("]");
	}

}
