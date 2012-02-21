package saf.checker;

public class CheckException extends Exception {
	private static final long serialVersionUID = 7957113003733875788L;
	private String message;
	
	public CheckException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
