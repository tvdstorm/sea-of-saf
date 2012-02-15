package fighter.messages;


public class Warning extends Message {
	public Warning(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return "WARNING: " + super.toString();
	}
}
