package compiler.types;

import java.util.ArrayList;
import java.util.List;

public class Fighter extends SafObject{
	private StringValue m_Name;
	private Statements m_Statement;
	public Fighter(SafObject name, SafObject st){
		m_Name=(StringValue)name; 
		m_Statement=(Statements)st;
	}
	public Fighter(SafObject name){
		m_Name=(StringValue)name;
	}
	public String toJavaCode(){
		StringBuffer response=new StringBuffer( " class "+m_Name.toJavaCode()+" extends game.Fighter{\r\npublic "+m_Name.toJavaCode()+"(){\r\n");
		if(m_Statement!=null){
			List<Statement> actions=new ArrayList<Statement>();
			List<Statement> declarations=new ArrayList<Statement>();;
			Statements st=m_Statement;
			do{
				Statement s=st.getStatement();
				if(s instanceof ActionStatement){
					actions.add(s);
				}
				else{
					declarations.add(s);
				}
				
			}while((st=st.getNext())!=null);
			for (Statement s : declarations) {
				response.append( s.toJavaCode());
			}
			response.append("} public List<ActionPair> doSomething(){\r\nList<ActionPair> list=new List<ActionPair>();\r\n");
			for (Statement s : actions) {
				response.append( s.toJavaCode());
			}
		}
		response.append("}}");
		return response.toString();
	}

}