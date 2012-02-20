package compiler.types;

public class Statements extends SafObject{
	private Statement m_Statement;
	private Statements m_Next;
	public Statements(SafObject statement,SafObject next)
	{	
		m_Statement=(Statement)statement;
		m_Next=(Statements)next;
	}
	public Statements(SafObject statement)
	{	
		m_Statement=(Statement)statement;
		m_Next=null;
	}
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
