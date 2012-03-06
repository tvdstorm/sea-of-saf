package saf.compiler;

public class JavaCode {
	private String m_Class;
	private String m_Java;
	public JavaCode(String classname,String code){
		m_Class=classname;
		m_Java=code;
	}
	public String getClassName(){
		return m_Class;
	}
	public String getCode(){
		return m_Java;
	}
}
