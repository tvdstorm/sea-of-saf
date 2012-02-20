package grammar.Evaluators;

public class InputRule implements Visitable {
	final private String firstInputRule;
	final private String secondInputRule;

	public InputRule(String finputrule, String sinputrule) {
		this.firstInputRule = finputrule;
		this.secondInputRule = sinputrule;
	}

	public String toString() {
		return "Inputrule: " + this.firstInputRule + " " + this.secondInputRule;
	}

	public String getInputrule(boolean firstRule) {
		return (firstRule) ? this.firstInputRule : this.secondInputRule;
	}

	@Override
	public void accept(BotVisit visitor) {
		visitor.visit(this);
	}

}
