package SAF.Checker;

@SuppressWarnings("serial")
public class SAFValidationException extends Exception {
	public SAFValidationException()
	{
		super("Unknown error in SAF.");
	}
	public SAFValidationException(String errorMessage)
	{
		super(errorMessage);
	}
	
	
	private String errorMessage;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
