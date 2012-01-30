package compiler;

import java.util.List;

public class ErrorModule {
	private List<Error> errorlist;
	private boolean canContinue;
	public void addError(ErrorType type, String message, int line, int column){
		
	}
}
enum ErrorType{
	Message,
	Warning,//processing continues
	Error,// process is stopped after the task
	FatalError,//process is aborted
}
final class Error{
	ErrorType error;
	String message;
	int line;
	int coloumn;
}
