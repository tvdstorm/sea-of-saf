package saf.compiler.types;

public class VariableStatement extends Statement{
	private NamesValue m_Varname;
	private IntValue m_Value;
	
	public VariableStatement(NamesValue name,IntValue value){
		m_Varname=name;
		m_Value=value;
	}
	public IntValue getValue(){
		return m_Value;
	}
	public NamesValue getVarName(){
		return m_Varname;
	}
	@Override
	public String toJavaCode(){
		return m_Varname.toJavaCode()+"="+m_Value.toJavaCode()+";";
	}
}