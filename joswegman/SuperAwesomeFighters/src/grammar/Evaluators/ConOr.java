package grammar.Evaluators;

public class ConOr extends Condition {
	final public String fcond;
	final public String scond;
	
	public ConOr(String fcond, String scond) {
		this.fcond = fcond;
		this.scond = scond;
	}

	@Override
	public String toString() {
		return "ConOr [fcond=" + fcond + ", scond=" + scond + "]";
	}
	
	

}
