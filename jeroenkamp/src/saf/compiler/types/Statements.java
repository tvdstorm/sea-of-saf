package saf.compiler.types;

public class Statements extends SafObject{
	private Statement m_Statement;
	private Statements m_Next;
	public Statements(Statement statement,Statements next)
	{	
		m_Statement=statement;
		m_Next=next;
	}
	public Statements(Statement statement)
	{	
		m_Statement=statement;
		m_Next=null;
	}
	@Override
	public String toJavaCode(){
		return "";
	}
	Statements getNext(){
		return m_Next;
	}
	Statement getStatement(){
		return m_Statement;
	}
}
