package saf.simulator;

public class SimulationException extends Exception {
	private static final long serialVersionUID = -8870481989305276702L;
	private String message;
	
	public SimulationException(String message){
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
