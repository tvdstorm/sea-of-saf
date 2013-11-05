package saf.ast.util;

import java.util.ArrayList;
import java.util.List;

import saf.Config;
import saf.ast.action.FightAction;
import saf.ast.action.MoveAction;
import saf.ast.condition.And;
import saf.ast.condition.Atom;
import saf.ast.condition.Or;
import saf.ast.fighter.Behaviour;
import saf.ast.fighter.Fighter;
import saf.ast.fighter.Personality;
import saf.ast.fighter.Rule;
import saf.check.Error;
import saf.check.Message;

public class SemanticCheckVisitor implements Visitor {
	
	private static List<Message> messages = null;
	
	public SemanticCheckVisitor() {
		if (messages == null)
			messages = new ArrayList<Message>();
	}
	
	public static List<Message> checkFighter(Fighter fighter) {
		fighter.accept(new SemanticCheckVisitor());
		return messages;
	}

	@Override
	public void visit(Fighter fighter) {
		fighter.getBehaviour().accept(this);
		fighter.getPersonality().accept(this);
	}

	@Override
	public void visit(Personality personality) {
		if (personality.getPunchPower() > Config.MAX_STRENGTH
			|| personality.getPunchPower() < Config.MIN_STRENGTH)
			messages.add(new Error("Puchpower outside valid range"));

		if (personality.getPunchReach() > Config.MAX_STRENGTH
			|| personality.getPunchReach() < Config.MIN_STRENGTH)
			messages.add(new Error("Puchreach outside valid range"));

		if (personality.getKickPower() > Config.MAX_STRENGTH
			|| personality.getKickPower() < Config.MIN_STRENGTH)
			messages.add(new Error("Kickpower outside valid range"));

		if (personality.getKickReach() > Config.MAX_STRENGTH
			|| personality.getKickReach() < Config.MIN_STRENGTH)
			messages.add(new Error("Kickreach outside valid range"));
	}

	@Override
	public void visit(Behaviour behaviour) {
		for (Rule rule : behaviour.getRules())
			rule.accept(this);
	}

	@Override
	public void visit(Rule rule) {
		rule.getCondition().accept(this);
		rule.getFightAction().accept(this);
		rule.getMoveAction().accept(this);
	}

	@Override
	public void visit(Atom atom) {
	}

	@Override
	public void visit(And and) {
		and.getLhs().accept(this);
		and.getRhs().accept(this);
	}

	@Override
	public void visit(Or or) {
		or.getLhs().accept(this);
		or.getRhs().accept(this);
	}

	@Override
	public void visit(MoveAction move) {
		List<String> moves = move.getActions();
		
		for (String a : moves) {
			if (!Config.MOVES.contains(a))
				messages.add(new Error("invalid move action: "+ a));
		}		
	}

	@Override
	public void visit(FightAction fight) {
		List<String> actions = fight.getActions();
		
		for (String a : actions) {
			if (!Config.STRIKES.contains(a))
				messages.add(new Error("invalid fight action: " + a));
		}
	}

}
