package visitor;

import astelements.Behaviour;
import astelements.Bot;
import astelements.Bots;
import astelements.Characteristic;
import astelements.ConditionGroup;

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
