package jsaf.visitor;

import jsaf.astelements.Behaviour;
import jsaf.astelements.Bot;
import jsaf.astelements.Bots;
import jsaf.astelements.Characteristic;
import jsaf.astelements.ConditionGroup;

public class SAFElementPrintVisitor implements SAFElementVisitor {

	@Override
	public void visit(Behaviour behaviour) {
		System.out.println("Visiting behaviour: " + behaviour.toString());
	}

	@Override
	public void visit(Bot bot) {
		System.out.println("Visiting bot: " + bot.toString());
	}

	@Override
	public void visit(Bots bots) {
		System.out.println("Visiting bots: " + bots.toString());
	}

	@Override
	public void visit(Characteristic characteristic) {
		System.out.println("Visiting characteristic: " + characteristic.toString());
	}

	@Override
	public void visit(ConditionGroup conditionGroup) {
		System.out.println("Visiting conditionGroup: " + conditionGroup.toString());
	}

}
