package grammar.Evaluators;

public class ConAnd extends Condition {
	final public String fcond;
	final public String scond;
	
	public ConAnd(String fcond, String scond) {
		this.fcond = fcond;
		this.scond = scond;
	}

	@Override
	public String toString() {
		return "ConAnd [fcond=" + fcond + ", scond=" + scond + "]";
	}
	

}
