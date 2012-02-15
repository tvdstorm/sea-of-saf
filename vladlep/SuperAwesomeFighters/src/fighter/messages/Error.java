package fighter.messages;

public class Error extends Message {

	public Error(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "ERROR: " + super.toString();
	}

}
