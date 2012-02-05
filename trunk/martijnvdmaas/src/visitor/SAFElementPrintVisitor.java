package visitor;

import elements.Behaviour;
import elements.Bot;
import elements.Bots;
import elements.Characteristic;
import elements.ConditionChoices;
import elements.ConditionGroup;

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
	public void visit(ConditionChoices conditionChoices) {
		System.out.println("Visiting conditionChoices: " + conditionChoices.toString());
	}

	@Override
	public void visit(ConditionGroup conditionGroup) {
		System.out.println("Visiting conditionGroup: " + conditionGroup.toString());
	}

}
