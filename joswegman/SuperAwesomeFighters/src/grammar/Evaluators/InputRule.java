package grammar.Evaluators;

public class InputRule {
	String inputstring1;
	String inputstring2;
	public InputRule(String inputstring1, String inputstring2) {
		super();
		this.inputstring1 = inputstring1;
		this.inputstring2 = inputstring2;
	}
	
	public String toString () {
		return "Inputrule: " + this.inputstring1 + " " + this.inputstring2;
	}

}
