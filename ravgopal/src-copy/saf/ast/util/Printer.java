package saf.ast.util;

import saf.Config;
import saf.ast.ASTNode;
import saf.ast.action.FightAction;
import saf.ast.action.MoveAction;
import saf.ast.condition.And;
import saf.ast.condition.Atom;
import saf.ast.condition.Condition;
import saf.ast.condition.Or;
import saf.ast.fighter.Behaviour;
import saf.ast.fighter.Fighter;
import saf.ast.fighter.Personality;
import saf.ast.fighter.Rule;

public class Printer implements Visitor {
	
	public static <Node extends ASTNode> String print(Node node) {
		Printer printer = new Printer();
		String builtString;
		
		node.accept(printer);
		builtString = printer.builder.toString();
		System.out.println(builtString);
		return builtString;
	}
	
	private StringBuilder builder;
	
	private Printer() {
		builder = new StringBuilder();
	}

	@Override
	public void visit(Fighter fighter) {
		builder.append(fighter.getName());
		builder.append(" {\n");
		fighter.getPersonality().accept(this);
		builder.append("\n");
		fighter.getBehaviour().accept(this);
		builder.append("}\n");
	}

	@Override
	public void visit(Personality personality) {
		builder.append("\t" + Config.PUNCH_POWER + "=" + personality.getPunchPower() + "\n");
		builder.append("\t" + Config.KICK_POWER + "=" + personality.getKickPower() + "\n");
		builder.append("\t" + Config.PUNCH_REACH + "=" + personality.getPunchReach() + "\n");
		builder.append("\t" + Config.KICK_REACH + "=" + personality.getKickReach() + "\n");
	}

	@Override
	public void visit(Behaviour behaviour) {
		for (Rule r : behaviour.getRules()) {
			builder.append("\t");
			r.accept(this);
			builder.append("\n");
		}
	}

	@Override
	public void visit(Rule rule) {
		rule.getCondition().accept(this);
		rule.getMoveAction().accept(this);
		rule.getFightAction().accept(this);
	}

	@Override
	public void visit(Atom atom) {
		builder.append(atom.getName());
	}

	@Override
	public void visit(And and) {
		bracket(and.getLhs(), and);
		builder.append(" and ");
		bracket(and.getRhs(), and);
	}

	@Override
	public void visit(Or or) {
		bracket(or.getLhs(), or);
		builder.append(" or ");
		bracket(or.getRhs(), or);
	}
	
	private void bracket(Condition c, And parent) {
		if (c.needBracket(parent))
			builder.append("(");
		c.accept(this);
		if (c.needBracket(parent))
			builder.append(")");
	}
	
	private void bracket(Condition c, Or parent) {
		if (c.needBracket(parent))
			builder.append("(");
		c.accept(this);
		if (c.needBracket(parent))
			builder.append(")");
	}

	@Override
	public void visit(MoveAction move) {
		builder.append(" " + move.getActions().toString());
	}

	@Override
	public void visit(FightAction fight) {
		builder.append(" " + fight.getActions().toString());
	}

}
