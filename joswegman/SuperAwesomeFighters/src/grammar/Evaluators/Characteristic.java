package grammar.Evaluators;

public class Characteristic {
	String inputtem1;
	int inputvalue1;
	
	public Characteristic(String inputtem1, int inputvalue1) {
		super();
		this.inputtem1 = inputtem1;
		this.inputvalue1 = inputvalue1;
	}
	
	public String toString () {
		//System.out.println("Charact: " + this.inputtem1 + " " + String.valueOf(this.inputvalue1));
		return "Charact: " + this.inputtem1 + "  " + String.valueOf(this.inputvalue1);
	}
	
	
}
