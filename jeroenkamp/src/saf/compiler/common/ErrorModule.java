package saf.compiler.common;

import java.util.ArrayList;
import java.util.List;

public class ErrorModule {
	private List<Error> m_Errorlist;
	private boolean m_Continue;
	
	private static ErrorModule m_Instance;
	
	private ErrorModule(){
		m_Errorlist=new ArrayList<Error>();
		m_Continue=true;
	}
	public static ErrorModule getErrorModule(){
		if(m_Instance==null){
			m_Instance=new ErrorModule();
		}
		return m_Instance;
	}
	
	public static void addError(ErrorType type, String message){
		ErrorModule module=getErrorModule();
		module.addMessage(type, message);
	}
	
	private void addMessage(ErrorType type, String message){
		m_Errorlist.add(new Error(type,message));
		if(type==ErrorType.Error){
			m_Continue=false;
		}
		else if(type==ErrorType.FatalError){
			printErrors();
			System.exit(1);
		}
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
	public void printErrors(){
		for( Error e : m_Errorlist){
			System.err.println(e.type+"\t"+e.message);
		}
	}
}

final class Error{
	ErrorType type;
	String message;
	Error(ErrorType type,String message ){
		this.type=type;
		this.message=message;
	}
}
