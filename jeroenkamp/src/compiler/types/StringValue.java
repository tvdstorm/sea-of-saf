package compiler.types;

public class StringValue extends Value{
	private String m_Value;
	public StringValue(String var){
		m_Value=var;
	}
	public String getValue(){
		return m_Value;
	}
	public String toJavaCode(){
		return m_Value;
	}
}