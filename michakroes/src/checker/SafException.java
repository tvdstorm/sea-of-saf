package checker;

@SuppressWarnings("serial")
public class SafException extends Exception {
	public SafException(String error) {
		super(error);	
	}
	
	public void printError() {
		System.err.println(this.getMessage());
	}
	
	public void printWarning() {
		System.out.println(this.getMessage());
	}
}
