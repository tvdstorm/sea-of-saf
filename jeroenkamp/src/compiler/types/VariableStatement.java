package compiler.types;

public class VariableStatement extends Statement{
	private NamesValue m_Varname;
	private IntValue m_Value;
	
	public VariableStatement(SafObject name, SafObject value){
		m_Varname=(NamesValue)name;
		m_Value=(IntValue)value;
	}
	public IntValue getValue(){
		return m_Value;
	}
	public NamesValue getVarName(){
		return m_Varname;
	}
	public String toJavaCode(){
		return m_Varname.toJavaCode()+"="+m_Value.toJavaCode()+";";
	}
}