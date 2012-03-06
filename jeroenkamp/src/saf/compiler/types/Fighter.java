package saf.compiler.types;

import java.util.ArrayList;
import java.util.List;

public class Fighter extends SafObject{
	private StringValue m_Name;
	private Statements m_Statement;
	public Fighter(StringValue name,Statements st){
		m_Name=name; 
		m_Statement=st;
	}
	public Fighter(StringValue name){
		m_Name=name;
	}
	@Override
	public String toJavaCode(){
		final String importstr="import saf.common.*;\r\n import java.util.*;\r\n import saf.game.*;\r\n";	
		StringBuffer response=new StringBuffer(importstr+ "public class "+m_Name.toJavaCode()+" extends Fighter{\r\npublic "+m_Name.toJavaCode()+"(){\r\nm_Name=\""+m_Name.toJavaCode()+"\";");
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
			response.append("} public List<ActionPair> doSomething(){\r\nList<ActionPair> list=new ArrayList<ActionPair>();\r\n");
			for (Statement s : actions) {
				response.append( s.toJavaCode());
			}
		}
		response.append("return list;}}");
		return response.toString();
	}
	public String getName(){
		return m_Name.toJavaCode();
	}

}