package grammar.Evaluators;

public class InputRule implements Visitable{
	final private String firstinputrule;
	final private String secondinputrule;

	public InputRule(String finputrule, String sinputrule) {
		this.firstinputrule = finputrule;
		this.secondinputrule = sinputrule;
	}
	
	public String toString () {
		return "Inputrule: " + this.firstinputrule + " " + this.secondinputrule;
	}
	
    public String getInputrule( boolean firstRule){
    	if (firstRule) {
    		return this.firstinputrule;
    	} else {
    		return this.secondinputrule;
    	}
    }

    @Override
	public void accept(BotVisit visitor) {
		visitor.visit(this);
	}

}
