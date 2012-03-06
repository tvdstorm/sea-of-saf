package saf.compiler.types;

public class IntValue extends Value{
	private int m_Value;
	public IntValue(int var){
		m_Value=var;
	}
	public int getValue(){
		return m_Value;
	}
	@Override
	public String toJavaCode(){
		return ""+m_Value;
	}
}