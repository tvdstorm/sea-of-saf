package compiler;

import java.util.List;

class ErrorModule {
	private List<Error> m_Errorlist;
	private boolean m_Continue;
	
	private ErrorModule(){
		
	}
	
	
	public void addError(ErrorType type, String message, int line, int column){
		m_Errorlist.add(new Error(type,message,line,column));
	}
	public void clear(){
		m_Errorlist.clear();
		m_Continue=true;
	}
	public boolean canContinue(){
		return m_Continue;
	}
	public List<Error> getErrors(){
		return m_Errorlist;
	}
}
enum ErrorType{
	Message,
	Warning,//processing continues
	Error,// process is stopped after the task
	FatalError,//process is aborted
}
final class Error{
	ErrorType type;
	String message;
	int line;
	int column;
	Error(ErrorType type,String message, int line , int column){
		this.type=type;
		this.message=message;
		this.line=line;
		this.column=column;
	}
}
