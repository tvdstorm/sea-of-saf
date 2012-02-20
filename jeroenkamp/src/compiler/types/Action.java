package compiler.types;

import common.ActionType;
import compiler.SafCompiler;


public class Action extends IFightAction{
	private ActionType m_Type;
	public Action(SafObject o ){
		StringValue val=(StringValue)o;
		try{
			m_Type=ActionType.valueOf(val.getValue());
		}
		catch(IllegalArgumentException iae){
			SafCompiler.error("Invalid Action keyword");
		}
	}
	public String toJavaCode(){
		return "ActionType."+m_Type.toString();
	}
}
