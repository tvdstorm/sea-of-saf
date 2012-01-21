package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.TreeWalker;

public class FighterValidator extends TreeWalker {
	private ValidationReport report;
	
	public FighterValidator() {
		report = new ValidationReport();
	}
	
	public ValidationReport getReport() {
		return report;
	}
	
	public boolean validate(Fighter fighterNode) {
		walk(fighterNode);
		
		return true;
	}

	@Override
	public void walk(Characteristic characteristicNode) {
		String type = characteristicNode.getType();
		
		if (type != "punchReach" ||
			type != "punchPower" ||
			type != "kickReach" ||
			type != "kickPower") {
			report.addWarning("Characteristic type not recognized: " + type);
		}
		
		if (characteristicNode.getValue() < 1 || characteristicNode.getValue() > 10) {
			report.addError("Value " + characteristicNode.getValue() + " out of bounds for characteristic " + type);
		}
	}
}
